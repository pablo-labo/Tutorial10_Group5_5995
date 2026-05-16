# Supplemental Evidence: Diagnostic Report and Telemetry-Adjacent Exposure Paths

## Summary

This supplement adds impact context to the primary finding:

> Indeed Android app logs cookie/session/CSRF/authentication-token-like values to Android logcat via `D/IndeedCookieHelper: cookies: ...`.

The original evidence proves sensitive values are written to logcat. This supplement reviews whether the exposure is limited to local ADB/logcat access or whether app-level diagnostic and telemetry-adjacent workflows can broaden exposure.

The strongest additional evidence is an Indeed support-report code path, `ReportEmailHelper`, that creates a diagnostic report file containing both WebView cookies and `logcat -d` output. This materially reduces the concern that the issue is only a local ADB observation.

## Updated Severity Position

Suggested priority remains:

```text
P3 / Medium
```

Rationale:

```text
The primary issue is confirmed sensitive information exposure in production logs.
The leaked field names include session/authentication/CSRF material such as JSESSIONID, CSRF, INDEED_CSRF_TOKEN, ENC_CSRF, __Secure-PassportAuthProxy-BearerToken, and __Secure-PassportAuthProxy-RefreshToken.
Static analysis shows a diagnostic report path that collects WebView cookies and logcat output into a support report file.
This is no longer only an ADB-observed risk; app-level diagnostic workflows may package the same sensitive values.
```

This report still does not claim P2/High because:

```text
Token replay was not tested or confirmed.
Account takeover was not tested or confirmed.
Crashlytics/Datadog payload contents were not decrypted or proven to contain the sensitive cookie lines.
The diagnostic report flow appears user-mediated unless Indeed confirms automatic upload or additional runtime testing proves silent transmission.
```

Refresh-token sensitivity note:

```text
The redacted evidence includes cookie names that appear to represent refresh-token material, such as __Secure-PassportAuthProxy-RefreshToken.
OAuth refresh tokens are generally more sensitive than short-lived access/session tokens because they are used to obtain new access tokens when an access token expires.
This report does not claim that Indeed's refresh-token cookie is replayable or long-lived in practice, but the presence of a refresh-token-like cookie name materially increases the sensitivity of the logged cookie header and the diagnostic report contents.
```

## Evidence 1: Support Report Helper Collects Cookies

Static analysis found a support/error report helper:

```text
sources/defpackage/l2d.java
Class metadata: com.indeed.android.jobsearch.error.ReportEmailHelperKt$getErrorReportFile$2
```

Relevant code locations:

```text
sources/defpackage/l2d.java:153
indeed.com cookies: CookieManager.getCookie("https://indeed.com")

sources/defpackage/l2d.java:155
www.indeed.com cookies: CookieManager.getCookie("https://www.indeed.com")

sources/defpackage/l2d.java:164
Creates a "--- Cookies Dump ---" section
```

The cookie filtering helper only excludes three cookie names:

```text
sources/defpackage/p2d.java:10
public static final String[] a = {"SHOE", "SOCK", "PPID"};
```

This filter does not cover the higher-sensitivity names observed in the redacted runtime evidence:

```text
JSESSIONID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
```

Security implication:

```text
If the report helper is triggered by a user support or crash-report flow, the generated report may include sensitive WebView cookie material that is not adequately filtered.
```

## Evidence 2: Support Report Helper Collects Logcat

The same helper includes logcat output in the diagnostic file:

```text
sources/defpackage/l2d.java:251
Creates a "--- Logcat Logs ---" section

sources/defpackage/l2d.java:253
Runtime.getRuntime().exec("logcat -d").getInputStream()
```

Security implication:

```text
Because the primary vulnerability writes sensitive cookies to logcat, this diagnostic report path can collect the vulnerable log lines after they are produced.
```

This matters because the primary runtime evidence already confirms authenticated logcat lines such as:

```text
D/IndeedCookieHelper: cookies: Device-ID=<redacted>; CSRF=<redacted>; INDEED_CSRF_TOKEN=<redacted>; ENC_CSRF=<redacted>; JSESSIONID=<redacted>; __Secure-PassportAuthProxy-BearerToken=<redacted>; __Secure-PassportAuthProxy-RefreshToken=<redacted>; CTK=<redacted>; ...
```

## Evidence 3: Diagnostic Flow Appears User-Mediated

The classes around the helper indicate a report-email/support flow:

```text
sources/defpackage/j2d.java
ReportEmailHelperKt$createReportEmailIntent$2

sources/defpackage/o2d.java
ReportEmailHelperKt$startReportEmailFlow$3
```

Conservative interpretation:

```text
This is not currently claimed as silent background exfiltration.
It is a user-mediated diagnostic/support report exposure path unless further runtime evidence proves automatic upload.
```

Why it still affects severity:

```text
A normal app feature can package sensitive authentication/session material into a report file or sharing/email workflow.
This broadens the exposure model beyond a researcher manually reading logcat with ADB.
Users may not understand that a support report contains session cookies, CSRF values, and authentication-token-like cookies.
```

Attachment-sharing nuance:

```text
The app declares a FileProvider with android:grantUriPermissions="true" and file paths that include app cache-path entries.
Android FileProvider is designed to share app files through content:// URIs with temporary read/write permissions granted through an Intent.
If the diagnostic report is attached through such a report-email/share flow, the chosen recipient app receives temporary access to a file that may contain cookies and logcat output.
```

Conservative limitation:

```text
The current static evidence does not prove that the error report file is written to public external storage.
It should not be claimed that any app with READ_EXTERNAL_STORAGE can automatically read the diagnostic file unless a runtime test confirms the exact file path and permissions.
The better supported claim is that the app can package sensitive cookies/logcat into a user-mediated diagnostic attachment and grant access to the selected receiving app.
```

## File Location Check

Static review of the report file creation path:

```text
sources/defpackage/l2d.java:71
File.createTempFile("errorReport", ".txt")

sources/defpackage/n2d.java:44
File.createTempFile("eventLogFiles_", ".zip")
```

No external-storage directory argument was observed in the `ReportEmailHelper` report-file creation path:

```text
No context.getExternalCacheDir() call was found in l2d.java / j2d.java / n2d.java for the error report file.
No context.getExternalFilesDir() call was found in l2d.java / j2d.java / n2d.java for the error report file.
No context.getCacheDir() argument was explicitly passed to File.createTempFile(...) in this helper.
```

Interpretation:

```text
The error report file is created through Java's default temporary-file directory because File.createTempFile(prefix, suffix) is called without an explicit directory argument.
The exact runtime path depends on the app/runtime value of java.io.tmpdir and should be confirmed dynamically before claiming external-storage exposure.
```

Conservative conclusion:

```text
Current static evidence does not support a claim that the diagnostic report is stored in context.getExternalCacheDir(), external shared storage, or a user-visible public directory.
Therefore, this supplement should not claim passive access by arbitrary apps with storage permissions.
```

Suggested optional runtime check:

```text
Trigger the report-email/support flow on a test account.
Before sending the report, inspect the generated attachment URI/path in the receiving email/share app if visible.
If the URI is content://, identify the FileProvider authority and mapped path.
If the file path resolves to external cache or public external storage, document the path and permissions with redacted evidence.
Do not send or upload raw diagnostic attachments containing live cookies.
```

## Evidence 4: Crashlytics and Datadog Are Present, But Payload Leakage Is Not Claimed

Firebase Crashlytics / Firebase Sessions evidence:

```text
resources/AndroidManifest.xml:676
FirebaseCrashlyticsKtxRegistrar

resources/AndroidManifest.xml:679
CrashlyticsRegistrar

resources/AndroidManifest.xml:685
FirebaseSessionsRegistrar

capture-output/logcat-20260509-002214.out.log:1196
Making request to: https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog

capture-output/logcat-20260509-002214.out.log:2222
Status Code: 200
```

Datadog evidence:

```text
sources/defpackage/bg3.java:39
new Logger.Builder(Datadog.getInstance("dd-jsma"))
  .setNetworkInfoEnabled(true)
  .setLogcatLogsEnabled(true)
  .setBundleWithTraceEnabled(true)
  .setBundleWithRumEnabled(true)

sources/defpackage/j7.java:56
new Logger.Builder(Datadog.getInstance("dd-jsma"))
  .setNetworkInfoEnabled(false)
  .setLogcatLogsEnabled(true)

capture-output/logcat-20260509-002214.out.log:936
DatadogBackgroundUpload/dd-jsma

capture-output/mitm-20260509-002214.out.log:11
server connect browser-intake-datadoghq.com:443
```

Conservative interpretation:

```text
These findings prove that telemetry/logging SDKs are integrated and active.
They do not prove that Crashlytics or Datadog received the specific IndeedCookieHelper cookie lines.
```

Important nuance:

```text
Datadog's Android documentation says setLogcatLogsEnabled(true) uses Logcat as a logger for Datadog logger instances. This should not be overstated as proof that Datadog automatically ingests the entire Android system logcat buffer.
Firebase Crashlytics documentation supports custom Crashlytics logs and crash reports, but current evidence does not prove automatic inclusion of arbitrary Android Log.d output.
```

## Attack Scenario: Beyond Local ADB

An impact scenario that is supported by current evidence:

```text
1. User is logged into the Indeed Android app.
2. The app logs cookie/session/CSRF/authentication-token-like values to Android logcat through IndeedCookieHelper.
3. The user encounters an app issue and triggers a support/error report flow.
4. ReportEmailHelper creates a diagnostic file.
5. The diagnostic file includes WebView cookies and logcat -d output.
6. The report may therefore contain sensitive cookie/session material that the user did not intend to disclose.
```

Potential recipients or access paths:

```text
Indeed support/report handling systems
Email client or sharing target selected by the user
Local diagnostic report attachment before sending, depending on the generated file path and URI grant behavior
Any downstream crash/support/diagnostic handling workflow that stores report attachments
```

This is a stronger scenario than local physical access because:

```text
The app itself constructs the sensitive report.
The report path is part of normal diagnostic/support behavior.
The user may voluntarily send the report without knowing it contains authentication/session material.
If shared through Android Intent/FileProvider, the selected receiver obtains temporary read access to the generated attachment.
```

## What Is Not Claimed

To avoid overstating the issue:

```text
No account takeover is claimed.
No session replay is claimed.
No decrypted HTTPS payload leakage is claimed.
No proof is provided that Datadog or Crashlytics received the specific cookie values.
No proof is provided that the diagnostic report is uploaded silently without user action.
No proof is provided that the diagnostic file is stored in public external storage or readable by arbitrary third-party apps.
No proof is provided that File.createTempFile(...) resolves to an external-cache or public external-storage location on the tested device.
```

## Why P3 Is Reasonable

P3 / Medium is reasonable because:

```text
The sensitive values are authentication/session/CSRF related, not merely analytics identifiers.
The issue is reproducible in an authenticated session.
The app contains a diagnostic report path that collects both cookies and logcat output.
The current filtering is incomplete and misses the highest-sensitivity cookie names observed in runtime evidence.
Exposure can occur through support/diagnostic workflows, not only through direct ADB access.
The evidence includes a refresh-token-like cookie name, which is more sensitive than ordinary analytics or tracking cookies even though replayability is not claimed.
```

P4 / Low may underestimate the issue because:

```text
It treats the issue as only local logcat access.
It does not account for the app's own diagnostic report generation behavior.
It does not account for authentication-token-like cookie names appearing in the vulnerable log line.
```

P2 / High is not currently supported because:

```text
Replayability of the leaked tokens was not confirmed.
Cross-device account access was not confirmed.
Sensitive authenticated actions were not performed with leaked values.
Automatic remote telemetry exfiltration of the cookie values was not proven.
Long-term account access through the refresh-token-like cookie was not proven.
```

## Recommended Remediation Additions

In addition to removing the `IndeedCookieHelper` cookie log:

```text
Do not include raw WebView cookies in support/error report files.
Do not include raw logcat output in diagnostic reports, or apply strict redaction before attachment.
Redact cookie values by default and allowlist only non-sensitive diagnostic keys.
Treat names containing session, csrf, token, auth, bearer, refresh, passport, jsession, hmac, surf, ctk, device, and appSignIn as sensitive.
Review Datadog/Firebase/custom telemetry instrumentation so authentication/session material cannot be logged as custom logs, breadcrumbs, attributes, or diagnostic attachments.
Add regression tests that scan generated support reports for sensitive cookie key names and values.
```

## External References

These references support the vulnerability class and conservative severity framing:

```text
Android Log Info Disclosure:
https://developer.android.com/privacy-and-security/risks/log-info-disclosure

Firebase Crashlytics custom crash reports:
https://firebase.google.com/docs/crashlytics/customize-crash-reports

FirebaseCrashlytics Android API reference:
https://firebase.google.com/docs/reference/android/com/google/firebase/crashlytics/FirebaseCrashlytics

Datadog Android Log Collection:
https://docs.datadoghq.com/logs/log_collection/android/

OAuth 2.0 RFC 6749, Refresh Tokens:
https://www.rfc-editor.org/rfc/rfc6749#section-1.5
https://www.rfc-editor.org/rfc/rfc6749#section-6

Java File.createTempFile:
https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/io/File.html#createTempFile(java.lang.String,java.lang.String)

AndroidX FileProvider:
https://developer.android.com/reference/androidx/core/content/FileProvider
```

## Suggested Attachment Set

Upload this supplement together with:

```text
bugcrowd.md
redacted-logcat-indeed-cookiehelper-20260509-002214.txt
summary-clean-20260509-002214.txt
deeplink_capture.py
```

Do not upload raw unredacted logcat or raw cookies unless explicitly requested by triage through a private channel.
