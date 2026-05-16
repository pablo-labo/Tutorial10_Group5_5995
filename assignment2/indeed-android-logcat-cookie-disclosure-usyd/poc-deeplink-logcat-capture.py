#!/usr/bin/env python3
"""
Deep link capture helper for Android security validation.

Default mode uses adb reverse + mitmproxy TLS passthrough, so it can confirm
deep link handling and destination domains without requiring a trusted CA.

Use --intercept-tls only on a test device/emulator that trusts the mitmproxy CA.
"""

from __future__ import annotations

import argparse
import datetime as dt
import pathlib
import re
import subprocess
import sys
import time
from typing import Iterable


def run(args: list[str], *, check: bool = False) -> subprocess.CompletedProcess[str]:
    return subprocess.run(args, text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, check=check)


def require_command(name: str) -> None:
    try:
        run([name, "--version"])
    except FileNotFoundError:
        raise SystemExit(f"Missing required command: {name}")


def adb(args: Iterable[str], adb_log: pathlib.Path) -> subprocess.CompletedProcess[str]:
    cmd = ["adb", *args]
    result = run(cmd)
    with adb_log.open("a", encoding="utf-8", errors="replace") as fh:
        fh.write(f"$ {' '.join(cmd)}\n")
        fh.write(result.stdout)
        if result.stdout and not result.stdout.endswith("\n"):
            fh.write("\n")
    return result


def start_process(args: list[str], stdout_path: pathlib.Path, stderr_path: pathlib.Path) -> subprocess.Popen:
    stdout = stdout_path.open("wb")
    stderr = stderr_path.open("wb")
    try:
        return subprocess.Popen(args, stdout=stdout, stderr=stderr)
    except Exception:
        stdout.close()
        stderr.close()
        raise


def grep(path: pathlib.Path, pattern: str) -> list[str]:
    if not path.exists():
        return []
    rx = re.compile(pattern, re.IGNORECASE)
    hits: list[str] = []
    with path.open("r", encoding="utf-8", errors="replace") as fh:
        for line in fh:
            if rx.search(line):
                hits.append(line.rstrip("\n"))
    return hits


def redact(line: str) -> str:
    secret_keys = [
        "CSRF",
        "INDEED_CSRF_TOKEN",
        "ENC_CSRF",
        "SURF",
        "CTK",
        "JSESSIONID",
        "Device-ID",
        "__Secure-PassportAuthProxy-BearerToken",
        "__Secure-PassportAuthProxy-RefreshToken",
        "__Secure-PassportAuthProxy-OauthHMAC",
        "__Secure-PassportAuthProxy-OauthExpires",
        "PPID",
        "LV",
        "PP",
        "ROJC",
        "CLK",
        "RQ",
        "RJAS",
        "SOCK",
        "SHOE",
        "jsopfc",
        "gopfc",
        "indeed_rcc",
        "Indeed-App-Proctor-Groups",
        "__cf_bm",
        "__cflb",
        "sp",
        "_sp_id.27f6",
        "_sp_ses.27f6",
        "form_tk",
        "surftok",
        "google_n",
    ]
    cookie_match = re.search(r"(cookies:\s*)(.+)", line, flags=re.IGNORECASE)
    if cookie_match:
        prefix = line[: cookie_match.start(2)]
        cookie_part = cookie_match.group(2)
        keys = []
        for segment in cookie_part.split(";"):
            segment = segment.strip()
            if "=" not in segment:
                continue
            key = segment.split("=", 1)[0].strip()
            if re.fullmatch(r"[A-Za-z0-9_.-]{1,80}", key) and key not in keys:
                keys.append(key)
        if keys:
            return prefix + "; ".join(f"{key}=<redacted>" for key in keys)
        return cookie_match.group(1) + "<redacted cookie header>"

    redacted = line
    for key in secret_keys:
        redacted = re.sub(rf"({re.escape(key)}=)([^;&\s]+)", rf"\1<redacted>", redacted, flags=re.IGNORECASE)
    return redacted


def main() -> int:
    parser = argparse.ArgumentParser(description="Capture Android deep link traffic and logs.")
    parser.add_argument("--package", default="com.indeed.android.jobsearch")
    parser.add_argument("--url", default="http://www.indeed.com/jobs?q=test")
    parser.add_argument("--proxy-port", type=int, default=8080)
    parser.add_argument("--capture-seconds", type=int, default=25)
    parser.add_argument("--out-dir", default="capture-output")
    parser.add_argument("--intercept-tls", action="store_true", help="Decrypt HTTPS. Requires mitm CA trusted by the device/app.")
    parser.add_argument("--no-adb-reverse", action="store_true", help="Use Wi-Fi proxy instead of adb reverse.")
    parser.add_argument("--skip-proxy-setup", action="store_true", help="Do not attempt adb settings put global http_proxy.")
    parser.add_argument("--no-manual-prompt", action="store_true", help="Do not pause when adb cannot set the proxy.")
    args = parser.parse_args()

    require_command("adb")
    require_command("mitmdump")

    out_dir = pathlib.Path(args.out_dir)
    out_dir.mkdir(parents=True, exist_ok=True)
    timestamp = dt.datetime.now().strftime("%Y%m%d-%H%M%S")

    mitm_log = out_dir / f"mitm-{timestamp}.out.log"
    mitm_err = out_dir / f"mitm-{timestamp}.err.log"
    flow_file = out_dir / f"flows-{timestamp}.mitm"
    adb_log = out_dir / f"adb-{timestamp}.log"
    logcat_file = out_dir / f"logcat-{timestamp}.out.log"
    logcat_err = out_dir / f"logcat-{timestamp}.err.log"
    summary_file = out_dir / f"summary-{timestamp}.txt"

    use_reverse = not args.no_adb_reverse
    listen_host = "127.0.0.1" if use_reverse else "0.0.0.0"
    device_proxy_host = "127.0.0.1" if use_reverse else "<PC_WIFI_IP>"

    print(f"[*] mitm listen: {listen_host}:{args.proxy_port}")
    print(f"[*] device proxy: {device_proxy_host}:{args.proxy_port}")
    print(f"[*] proxy mode: {'USB adb reverse' if use_reverse else 'Wi-Fi'}")
    print(f"[*] package: {args.package}")
    print(f"[*] deep link URL: {args.url}")
    print(f"[*] TLS mode: {'intercept/decrypt' if args.intercept_tls else 'passthrough'}")

    devices = run(["adb", "devices"]).stdout
    if not re.search(r"\tdevice\b", devices):
        raise SystemExit("No authorized adb device found.")

    mitm_args = [
        "mitmdump",
        "--listen-host",
        listen_host,
        "--listen-port",
        str(args.proxy_port),
        "--save-stream-file",
        str(flow_file),
        "--set",
        "console_eventlog_verbosity=debug",
    ]
    if not args.intercept_tls:
        mitm_args += ["--ignore-hosts", ".*"]

    mitm = start_process(mitm_args, mitm_log, mitm_err)
    logcat: subprocess.Popen | None = None
    proxy_set_by_script = False
    manual_proxy = False

    try:
        time.sleep(2)
        if mitm.poll() is not None:
            err_text = mitm_err.read_text(encoding="utf-8", errors="replace") if mitm_err.exists() else ""
            raise RuntimeError(f"mitmdump exited early. Check port {args.proxy_port}.\n{err_text}")

        if use_reverse:
            print(f"[*] adb reverse tcp:{args.proxy_port} -> tcp:{args.proxy_port}")
            adb(["reverse", f"tcp:{args.proxy_port}", f"tcp:{args.proxy_port}"], adb_log)

        if args.skip_proxy_setup:
            print("[*] skipping Android proxy setup")
        else:
            print("[*] setting Android global proxy")
            result = adb(["shell", "settings", "put", "global", "http_proxy", f"{device_proxy_host}:{args.proxy_port}"], adb_log)
            if result.returncode == 0 and not re.search(r"SecurityException|Permission denial|WRITE_SECURE_SETTINGS", result.stdout):
                proxy_set_by_script = True
            else:
                manual_proxy = True
                print("[!] adb could not set proxy. Set it manually on the device:")
                print(f"    host: {device_proxy_host}")
                print(f"    port: {args.proxy_port}")
                if use_reverse:
                    print("    use 127.0.0.1 because adb reverse is enabled")
                if args.intercept_tls:
                    print("    HTTPS decryption requires trusting the mitmproxy CA")
                if not args.no_manual_prompt:
                    input("Press Enter after setting the device proxy manually...")

        print("[*] force-stopping app")
        adb(["shell", "am", "force-stop", args.package], adb_log)
        print("[*] clearing logcat")
        adb(["logcat", "-c"], adb_log)

        print("[*] starting logcat capture")
        logcat = start_process(["adb", "logcat", "-v", "time"], logcat_file, logcat_err)
        time.sleep(1)

        print("[*] triggering deep link")
        adb(["shell", "am", "start", "-a", "android.intent.action.VIEW", "-d", args.url, args.package], adb_log)
        print(f"[*] capturing for {args.capture_seconds}s")
        time.sleep(args.capture_seconds)
    finally:
        if proxy_set_by_script:
            print("[*] clearing Android proxy")
            adb(["shell", "settings", "put", "global", "http_proxy", ":0"], adb_log)
            adb(["shell", "settings", "delete", "global", "http_proxy"], adb_log)
        elif manual_proxy or args.skip_proxy_setup:
            print("[!] clear the device Wi-Fi proxy manually when finished")

        if use_reverse:
            print(f"[*] removing adb reverse tcp:{args.proxy_port}")
            adb(["reverse", "--remove", f"tcp:{args.proxy_port}"], adb_log)

        if logcat and logcat.poll() is None:
            logcat.terminate()
            time.sleep(1)
            if logcat.poll() is None:
                logcat.kill()

        if mitm.poll() is None:
            mitm.terminate()
            time.sleep(1)
            if mitm.poll() is None:
                mitm.kill()

    mitm_hits = grep(mitm_log, r"indeed\.com|GET|POST|CONNECT|jobs")
    server_hits = grep(mitm_log, r"server connect")
    tls_failures = grep(mitm_log, r"does not trust the proxy|certificate unknown|TLS handshake failed")
    logcat_hits = grep(logcat_file, r"DeeplinkStore|IndeedWebViewClient|BaseWebViewClient|http://www\.indeed\.com|https://www\.indeed\.com|jobs\?q=")
    sensitive_log_hits = grep(
        logcat_file,
        r"IndeedCookieHelper|cookies:|Cookie:|Authorization|Bearer|RefreshToken|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|ENC_CSRF|SURF=|CTK=|Device-ID=|PPID=|form_tk|surftok",
    )

    flow_size = flow_file.stat().st_size if flow_file.exists() else 0
    summary_lines = [
        "Deep link capture summary",
        f"Timestamp: {timestamp}",
        f"Package: {args.package}",
        f"URL: {args.url}",
        f"Device proxy: {device_proxy_host}:{args.proxy_port}",
        f"TLS mode: {'intercept' if args.intercept_tls else 'passthrough'}",
        f"mitm flow size: {flow_size}",
        f"mitm keyword hits: {len(mitm_hits)}",
        f"mitm server connect hits: {len(server_hits)}",
        f"TLS trust failure hits: {len(tls_failures)}",
        f"logcat URL hits: {len(logcat_hits)}",
        f"sensitive log hits: {len(sensitive_log_hits)}",
        "",
        "mitm evidence:",
        *(mitm_hits[:80] or ["No mitm Indeed evidence found."]),
        "",
        "logcat URL evidence:",
        *(logcat_hits[:80] or ["No logcat URL evidence found."]),
        "",
        "Sensitive log evidence, redacted:",
        *([redact(line) for line in sensitive_log_hits[:80]] or ["No sensitive log evidence found."]),
    ]
    summary_file.write_text("\n".join(summary_lines) + "\n", encoding="utf-8")

    print("[+] done")
    print(f"[+] summary: {summary_file}")
    print(f"[+] mitm log: {mitm_log}")
    print(f"[+] logcat: {logcat_file}")
    print(f"[*] mitm keyword hits: {len(mitm_hits)}")
    print(f"[*] mitm server connect hits: {len(server_hits)}")
    print(f"[*] TLS trust failure hits: {len(tls_failures)}")
    print(f"[*] logcat URL hits: {len(logcat_hits)}")
    print(f"[*] sensitive log hits: {len(sensitive_log_hits)}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
