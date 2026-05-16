#!/usr/bin/env python3
"""
Extract the latest IndeedCookieHelper Cookie header from adb logcat and run a
read-only replay validation against tester-controlled Indeed account pages.

Safety defaults:
- Requires --i-own-this-account acknowledgement.
- Reads Cookie material from local adb/logcat only.
- Does not print, save, or attach raw Cookie values.
- Allows only HTTPS Indeed hosts for replay validation.
- Uses GET/HEAD only.
- Optional account marker is checked without printing the raw marker.

Use this only with your own tester-controlled account.
"""

from __future__ import annotations

import argparse
import hashlib
import re
import subprocess
import sys
import time
import urllib.error
import urllib.parse
import urllib.request


PACKAGE = "com.indeed.android.jobsearch"
DEFAULT_DEEPLINK = "http://www.indeed.com/jobs?q=test"
COOKIE_LOG_RE = re.compile(r"IndeedCookieHelper.*?cookies:\s*(.+)$", re.IGNORECASE)

ALLOWED_HOSTS = {
    "www.indeed.com",
    "secure.indeed.com",
    "profile.indeed.com",
    "my.indeed.com",
    "myjobs.indeed.com",
    "indeed.com",
}

AUTH_HINTS = [
    rb"profile",
    rb"account",
    rb"resume",
    rb"saved",
    rb"application",
    rb"jobseeker",
]

LOGIN_HINTS = [
    rb"signin",
    rb"login",
    rb"passport",
    rb"Sign in",
    rb"Log in",
]


class NoRedirect(urllib.request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        return None


def die(message: str) -> None:
    print(f"[!] {message}", file=sys.stderr)
    raise SystemExit(2)


def run_adb(args: list[str], timeout: int = 30, check: bool = True) -> subprocess.CompletedProcess[str]:
    cmd = ["adb", *args]
    try:
        proc = subprocess.run(
            cmd,
            text=True,
            encoding="utf-8",
            errors="replace",
            capture_output=True,
            timeout=timeout,
            check=False,
        )
    except FileNotFoundError:
        die("adb was not found in PATH.")
    except subprocess.TimeoutExpired:
        die(f"adb command timed out: {' '.join(cmd)}")

    if check and proc.returncode != 0:
        stderr = proc.stderr.strip() or proc.stdout.strip()
        die(f"adb command failed: {' '.join(cmd)}\n{stderr}")
    return proc


def validate_url(url: str) -> str:
    parsed = urllib.parse.urlparse(url)
    if parsed.scheme != "https":
        die(f"Refusing non-HTTPS URL: {url}")
    if parsed.hostname not in ALLOWED_HOSTS:
        die(f"Refusing non-allowlisted host: {parsed.hostname}")
    if parsed.query:
        die(f"Refusing URL with query string: {url}")
    return url


def redact_location(location: str | None) -> str:
    if not location:
        return ""
    parsed = urllib.parse.urlparse(location)
    return urllib.parse.urlunparse(
        (parsed.scheme, parsed.netloc, parsed.path, "", "<redacted-query>" if parsed.query else "", "")
    )


def summarize_body(body: bytes, account_marker: str | None) -> dict[str, object]:
    lower = body[:200_000].lower()
    summary: dict[str, object] = {
        "body_bytes": len(body),
        "body_sha256_12": hashlib.sha256(body).hexdigest()[:12],
        "auth_hint_hits": sum(1 for hint in AUTH_HINTS if hint.lower() in lower),
        "login_hint_hits": sum(1 for hint in LOGIN_HINTS if hint.lower() in lower),
    }

    if account_marker:
        marker_bytes = account_marker.encode("utf-8")
        summary["account_marker_present"] = "yes" if marker_bytes in body else "no"
        summary["redacted_marker_input_sha256_12"] = hashlib.sha256(marker_bytes).hexdigest()[:12]
    else:
        summary["account_marker_present"] = ""
        summary["redacted_marker_input_sha256_12"] = ""

    return summary


def request_once(
    url: str,
    cookie: str,
    method: str,
    user_agent: str,
    timeout: int,
    account_marker: str | None,
) -> dict[str, object]:
    opener = urllib.request.build_opener(NoRedirect)
    req = urllib.request.Request(url, method=method)
    req.add_header("User-Agent", user_agent)
    req.add_header("Accept", "text/html,application/xhtml+xml,application/json;q=0.9,*/*;q=0.8")
    req.add_header("Cache-Control", "no-store")
    if cookie:
        req.add_header("Cookie", cookie)

    started = time.time()
    try:
        with opener.open(req, timeout=timeout) as resp:
            body = resp.read(500_000) if method == "GET" else b""
            result = {
                "url": url,
                "method": method,
                "status": resp.status,
                "location": "",
                "content_type": resp.headers.get("content-type", ""),
                "elapsed_ms": int((time.time() - started) * 1000),
            }
            result.update(summarize_body(body, account_marker))
            return result
    except urllib.error.HTTPError as exc:
        body = exc.read(500_000) if method == "GET" else b""
        result = {
            "url": url,
            "method": method,
            "status": exc.code,
            "location": redact_location(exc.headers.get("location")),
            "content_type": exc.headers.get("content-type", ""),
            "elapsed_ms": int((time.time() - started) * 1000),
        }
        result.update(summarize_body(body, account_marker))
        return result


def classify(result: dict[str, object]) -> str:
    status = int(result["status"])
    location = str(result.get("location", "")).lower()
    auth_hits = int(result.get("auth_hint_hits", 0))
    login_hits = int(result.get("login_hint_hits", 0))
    marker_present = str(result.get("account_marker_present", ""))

    if status in (301, 302, 303, 307, 308) and re.search(r"login|signin|passport", location):
        return "likely-not-authenticated"
    if status in (401, 403):
        return "not-authenticated-or-forbidden"
    if 200 <= status < 300 and marker_present == "yes":
        return "authenticated-readonly-access-indicated"
    if 200 <= status < 300 and auth_hits > login_hits:
        return "likely-authenticated-readonly-access"
    if 200 <= status < 300:
        return "inconclusive-200"
    return "inconclusive"


def print_result(result: dict[str, object], label: str) -> None:
    print("")
    print(f"[*] {label}: {result['method']} {result['url']}")
    print(f"    status: {result['status']}")
    if result.get("location"):
        print(f"    redirect_location: {result['location']}")
    print(f"    content_type: {result.get('content_type', '')}")
    print(f"    body_bytes_read: {result.get('body_bytes', 0)}")
    print(f"    body_sha256_12: {result.get('body_sha256_12', '')}")
    print(f"    auth_hint_hits: {result.get('auth_hint_hits', 0)}")
    print(f"    login_hint_hits: {result.get('login_hint_hits', 0)}")
    if result.get("account_marker_present"):
        print(f"    account_marker_present: {result.get('account_marker_present')}")
        print(f"    redacted_marker_input_sha256_12: {result.get('redacted_marker_input_sha256_12')}")
    print(f"    elapsed_ms: {result.get('elapsed_ms', 0)}")
    print(f"    classification: {classify(result)}")


def trigger_deeplink(deeplink: str, wait_seconds: int) -> None:
    print("[*] Clearing logcat")
    run_adb(["logcat", "-c"])

    print("[*] Force-stopping app")
    run_adb(["shell", "am", "force-stop", PACKAGE], check=False)

    print(f"[*] Triggering deeplink: {deeplink}")
    run_adb(
        [
            "shell",
            "am",
            "start",
            "-a",
            "android.intent.action.VIEW",
            "-d",
            deeplink,
            PACKAGE,
        ],
        check=False,
    )

    print(f"[*] Waiting {wait_seconds}s for app logs")
    time.sleep(wait_seconds)


def extract_latest_cookie_from_logcat() -> tuple[str, int]:
    print("[*] Reading adb logcat")
    proc = run_adb(["logcat", "-d"], timeout=60)
    matches: list[str] = []
    for line in proc.stdout.splitlines():
        match = COOKIE_LOG_RE.search(line)
        if match:
            cookie = match.group(1).strip()
            if cookie:
                matches.append(cookie)

    if not matches:
        die("No IndeedCookieHelper cookies line found in adb logcat.")

    cookie = matches[-1]
    if len(cookie) < 20:
        die("Extracted Cookie header is unexpectedly short.")

    return cookie, len(matches)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Extract latest IndeedCookieHelper cookies from adb logcat and run read-only replay validation."
    )
    parser.add_argument("--url", action="append", default=[], help="HTTPS Indeed URL to test. Can be repeated.")
    parser.add_argument("--deeplink", default=DEFAULT_DEEPLINK, help="Deep link used to trigger app logging.")
    parser.add_argument("--skip-trigger", action="store_true", help="Do not clear logcat or trigger the app.")
    parser.add_argument("--wait-seconds", type=int, default=10)
    parser.add_argument("--method", choices=["GET", "HEAD"], default="GET")
    parser.add_argument("--timeout", type=int, default=20)
    parser.add_argument(
        "--user-agent",
        default="Mozilla/5.0 replay-validation-readonly",
        help="User-Agent to use. Avoid adding personal device details.",
    )
    parser.add_argument(
        "--account-marker",
        help="Optional tester-account-specific response marker. Raw marker is not printed.",
    )
    parser.add_argument(
        "--i-own-this-account",
        action="store_true",
        help="Required acknowledgement that the logcat Cookie belongs to your own tester-controlled account.",
    )
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    if not args.i_own_this_account:
        die("Refusing to run without --i-own-this-account.")

    urls = args.url or ["https://profile.indeed.com/"]
    urls = [validate_url(url) for url in urls]

    print("[*] ADB logcat replay validation")
    print("[*] Raw Cookie values will not be printed or saved.")
    if args.account_marker:
        print("[*] Account marker mode enabled. Raw marker will not be printed.")

    if not args.skip_trigger:
        trigger_deeplink(args.deeplink, args.wait_seconds)
    else:
        print("[*] Skipping app trigger; using existing adb logcat buffer")

    cookie, match_count = extract_latest_cookie_from_logcat()
    print(f"[*] Cookie log lines found: {match_count}")
    print("[*] Using latest Cookie header from logcat in memory only")

    classifications: list[str] = []
    for url in urls:
        baseline = request_once(url, "", args.method, args.user_agent, args.timeout, args.account_marker)
        replay = request_once(url, cookie, args.method, args.user_agent, args.timeout, args.account_marker)

        print_result(baseline, "No-cookie baseline")
        print_result(replay, "Replay with logcat Cookie")

        classifications.append(classify(replay))

    print("")
    print("[*] Overall interpretation:")
    if "authenticated-readonly-access-indicated" in classifications:
        print("    Replay is indicated by a 2xx response and a tester-account-specific marker.")
        print("    Do not include raw cookies, tokens, raw marker values, or full response bodies in the report.")
        return 0
    if "likely-authenticated-readonly-access" in classifications:
        print("    Replay may be confirmed, but account-specific proof is recommended.")
        print("    Re-run with --account-marker using a non-sensitive string visible only in your own account.")
        return 0

    print("    Replay was not confirmed or remains inconclusive.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
