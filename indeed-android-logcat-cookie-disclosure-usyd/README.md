# USYD Submission Package: Android logcat Sensitive Information Disclosure

## Topic

This package documents a mobile application security issue where the Indeed Android app writes cookie/session/CSRF/device-related material to Android logcat during a normal app flow.

Primary weakness class:

```text
CWE-532: Insertion of Sensitive Information into Log File
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
```

## Package Contents

```text
academic-report.md
  Long-form academic/security report with background, references, severity reasoning, reproduction steps, impact, limitations, and remediation.

technical-risk-report.md
  Technical risk report in English, including static review notes, dynamic testing methodology, observed impact, and PoC notes.

technical-risk-report.zh.md
  Chinese version of the technical risk report.

diagnostic-pipeline-supplement.md
  Supplemental evidence and boundary analysis for ReportEmailHelper, Firebase/Datadog telemetry-adjacent paths, refresh-token sensitivity, FileProvider sharing, and diagnostic file location.

diagnostic-pipeline-supplement.zh.md
  Chinese version of the diagnostic/support pipeline supplement.

replay-validation-supplement.md
  Supplemental controlled replay validation. It treats adb/logcat as the research validation method, not the only exposure scenario, and documents a tester-controlled read-only authenticated replay result with a redacted account marker hash.

bugcrowd-report-draft.zh.md
  Chinese Bugcrowd-style report draft kept as supporting material.

poc-deeplink-logcat-capture.py
  Python PoC helper used to trigger the deep link, collect mitm/logcat evidence, and generate summary output.

poc-replay-from-adb-logcat.py
  Python PoC helper that extracts the latest `D/IndeedCookieHelper: cookies: ...` line from adb logcat in memory and runs no-cookie baseline versus read-only replay checks. Raw cookie values are not printed or saved.

evidence-summary-clean-authenticated-run.txt
  Clean summary from the authenticated test run. It keeps key evidence and removes unrelated system/operator logs.

evidence-redacted-logcat-cookiehelper.txt
  Redacted logcat evidence preserving cookie key names while removing live cookie/session/token values.
```

## Reproduction Summary

The PoC was run on a real non-root Android device:

```powershell
python .\poc-deeplink-logcat-capture.py
```

The script triggers:

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

Representative authenticated-run output:

```text
summary: evidence-summary-clean-authenticated-run.txt
mitm keyword hits: 121
mitm server connect hits: 47
TLS trust failure hits: 0
logcat URL hits: 15
sensitive log hits: 10
```

Primary redacted evidence:

```text
D/IndeedCookieHelper: cookies: Device-ID=<redacted>; CSRF=<redacted>; INDEED_CSRF_TOKEN=<redacted>; ENC_CSRF=<redacted>; JSESSIONID=<redacted>; __Secure-PassportAuthProxy-BearerToken=<redacted>; __Secure-PassportAuthProxy-RefreshToken=<redacted>; CTK=<redacted>; ...
```

## Replay Validation Update

A follow-up read-only replay validation was performed with a tester-controlled account:

```text
No-cookie baseline: HTTP 302 redirect to Indeed login.
Replay with Cookie header from logcat: HTTP 200 on https://profile.indeed.com/.
Redacted account marker: absent in baseline, present in replay response.
```

This supports a conservative conclusion that logged cookie/session material can be reused for read-only authenticated access to the same tester-controlled account. It does not claim account takeover, cross-user access, or sensitive write actions.

## Scope and Ethics

The evidence is redacted. Raw logcat output may contain live sensitive values and should not be shared publicly. The report does not claim account takeover, confirmed session replay, sensitive action execution, or decrypted HTTPS payload leakage.

The replay validation uses adb/logcat as a controlled research method. The broader exposure scenario is the `ReportEmailHelper` diagnostic/support-report path. Static analysis shows it collects WebView cookies and `logcat -d` output, but current evidence does not prove silent remote upload, third-party interception, or public external-storage file exposure.

## Suggested Reading Order

1. `academic-report.md`
2. `diagnostic-pipeline-supplement.md`
3. `replay-validation-supplement.md`
4. `diagnostic-pipeline-supplement.zh.md`
5. `evidence-redacted-logcat-cookiehelper.txt`
6. `evidence-summary-clean-authenticated-run.txt`
7. `poc-deeplink-logcat-capture.py`
8. `poc-replay-from-adb-logcat.py`
9. `technical-risk-report.md`
