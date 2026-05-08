# Supplemental Evidence 2: Controlled Cookie Replay Validation

## Purpose

This supplement provides follow-up evidence for the previously submitted report:

> Indeed Android App Logs Cookie, CSRF, Session, and Device Identifiers to Android logcat

The original report conservatively treated replay as unconfirmed. After submission, I performed a controlled, read-only replay validation using only my own tester-controlled Indeed account.

This supplement does not replace the original report. It adds impact validation evidence.

ADB/logcat access was used here as a controlled research method to extract the vulnerable value and validate replayability. It should not be interpreted as the only relevant exposure path. As described in the earlier diagnostic-pipeline supplement, static analysis identified an app-level support/error-report flow that collects cookies and `logcat -d` output into a diagnostic report. That makes the replay result relevant to user-mediated support-report scenarios as well, not only to researcher-controlled ADB testing.

## High-Level Result

Controlled replay validation produced a positive authentication-state difference:

```text
No-cookie baseline: unauthenticated, redirected to Indeed login.
With Cookie header extracted from Android logcat: HTTP 200 on https://profile.indeed.com/.
With Cookie header extracted from Android logcat and a redacted account marker: marker present in replay response.
```

Conservative conclusion:

```text
Logged cookie/session material appears reusable for read-only authenticated access to the tester-controlled account.
The replay response contained a tester-account-specific marker that was absent from the no-cookie baseline response.
The raw marker value is omitted; only a short SHA-256 prefix of the input marker is provided.
```

This supports upgrading the impact from:

```text
Potential sensitive information exposure
```

to:

```text
Read-only authenticated data exposure indicated in a tester-controlled replay scenario
```

## Safety and Scope Controls

The replay validation was designed to minimize risk:

```text
Only a tester-controlled Indeed account was used.
Only values from that same tester-controlled account were used.
Only read-only GET requests were performed.
No third-party account was accessed.
No profile, resume, saved job, application, account setting, or other user data was modified.
Raw Cookie, JSESSIONID, CSRF, BearerToken, and RefreshToken values are omitted.
No full response body was saved.
```

## Source of Replayed Material

The Cookie header was extracted locally from the Android logcat line:

```text
D/IndeedCookieHelper: cookies: ...
```

The logged cookie header contained sensitive key names including:

```text
Device-ID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
JSESSIONID
CTK
SURF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
Indeed-App-Proctor-Groups
```

Raw values are intentionally excluded from this supplement.

## ADB Is the Validation Method, Not the Only Exposure Scenario

This replay test used adb logcat because it is a controlled and auditable way to extract the exact value that the app logs.

The broader risk is that the same logged material may be packaged by legitimate app workflows. In the previous diagnostic-pipeline supplement, static analysis showed that the app contains a support/error-report helper that:

```text
Collects WebView cookies.
Collects logcat output using logcat -d.
Builds a diagnostic report intended for a support/email flow.
```

Impact implication:

```text
If a normal user follows support guidance and sends an error report, the user may unintentionally include high-sensitivity session material such as JSESSIONID, CSRF values, BearerToken-like cookies, and RefreshToken-like cookies in the report.
The replay validation in this supplement shows why that matters: the logged cookie/session material was sufficient to obtain a read-only authenticated profile response for the same tester-controlled account.
```

Conservative boundary:

```text
This supplement does not claim that the diagnostic report was silently uploaded.
This supplement does not claim that a third party actually intercepted a support-report attachment.
This supplement does claim that ADB was only the controlled validation method, while app-level diagnostic/support flows broaden the realistic exposure model beyond local manual logcat inspection.
```

## Validation Environment

```text
Replay client: clean Python urllib client, not a browser profile.
Request method: GET only.
Target URL: https://profile.indeed.com/
Redirect handling: redirects were not followed for both baseline and replay requests.
Account scope: tester-controlled Indeed account only.
Response handling: full response bodies were not saved or attached.
Marker handling: the marker value was used only for matching and was not printed or attached.
```

Important marker-hash note:

```text
redacted_marker_input_sha256_12 identifies the redacted tester-controlled marker used for matching.
It is not a hash of the response body and does not mean the marker was present in the baseline response.
Presence is represented only by account_marker_present: yes/no.
```

## Experiment Design

The experiment used two controlled requests to the same read-only profile URL.

Target:

```text
https://profile.indeed.com/
```

Test A: no-cookie baseline

```text
Purpose: verify that the clean client is not already authenticated.
Cookie header: none
Expected result: redirect to login or unauthenticated response
```

Test B: replay request

```text
Purpose: verify whether cookie material from Android logcat grants authenticated access.
Cookie header: extracted from D/IndeedCookieHelper logcat line
Expected result if replay works: HTTP 200 / authenticated profile page response
```

No write methods were used:

```text
No POST
No PUT
No PATCH
No DELETE
```

## PoC Tool

I used a small read-only helper script that extracts the latest cookie line from adb logcat and immediately runs baseline and replay checks:

```text
replay_from_adb_logcat.py
```

Script safety controls:

```text
Allows only HTTPS Indeed hosts.
Uses GET or HEAD only.
Does not print raw cookies.
Does not save response bodies.
Prints only status code, content type, response size, a short SHA-256 prefix, redirect location with query redacted, and coarse authentication/login hints.
Requires --i-own-this-account acknowledgement before running.
Optionally accepts --account-marker to check for a tester-account-specific response marker without printing the raw marker.
Keeps the raw Cookie header in memory only; it is not written to a temporary file.
```

## Commands Used

Automated adb logcat extraction and replay validation:

```powershell
python .\indeed-android-logcat-cookie-disclosure-poc\replay_from_adb_logcat.py `
  --i-own-this-account `
  --url "https://profile.indeed.com/" `
  --account-marker "<redacted tester-account-specific marker>"
```

The script performed these steps automatically:

```text
1. Clear adb logcat.
2. Force-stop the Indeed Android app.
3. Trigger the deeplink http://www.indeed.com/jobs?q=test.
4. Read adb logcat.
5. Extract the latest D/IndeedCookieHelper: cookies: ... line.
6. Run a no-cookie baseline request.
7. Run a replay request with the extracted Cookie header.
8. Check for a redacted tester-account-specific marker in both responses.
```

The marker value is not included in this report because it contains tester-account-specific personal information. Only its presence/absence and SHA-256 prefix are reported.

## Observed Results

### Test A: No-Cookie Baseline

```text
status: 302
redirect_location: https://secure.indeed.com/account/login?<redacted-query>
content_type:
body_bytes_read: 0
body_sha256_12: e3b0c44298fc
auth_hint_hits: 0
login_hint_hits: 0
account_marker_present: no
redacted_marker_input_sha256_12: 30ee45c80520
elapsed_ms: 215
classification: likely-not-authenticated
```

Interpretation:

```text
The clean client was not authenticated without the logged cookie material.
```

### Test B: Replay With Logged Cookie Header and Redacted Account Marker

```text
status: 200
content_type: text/html;charset=utf-8
body_bytes_read: 82761
body_sha256_12: b63e1e4876e0
auth_hint_hits: 5
login_hint_hits: 2
account_marker_present: yes
redacted_marker_input_sha256_12: 30ee45c80520
elapsed_ms: 452
classification: authenticated-readonly-access-indicated
```

Interpretation:

```text
The same clean client received an HTTP 200 response from a read-only authenticated profile URL after the Cookie header from Android logcat was supplied.
The replay response contained the redacted tester-account-specific marker, while the no-cookie baseline did not.
The matching marker is represented by redacted_marker_input_sha256_12 only; the raw marker is omitted.
```

## Conservative Impact Statement

This supplement supports the following impact statement:

```text
Using a tester-controlled account, cookie/session material logged by the Android app could be reused in a clean client to obtain a read-only authenticated profile response for the same account. The response contained a redacted tester-account-specific marker that was absent in the no-cookie baseline.
```

Suggested severity effect:

```text
This finding is a P2 / High candidate because replay was demonstrated against a read-only authenticated profile page for a tester-controlled account.
The ADB step was used to validate the replayability of logged material; it is not the only plausible exposure scenario because the app's diagnostic/support-report flow can collect both cookies and logcat output.
```

Conservative caveat:

```text
If Indeed determines that the replayed profile page does not expose meaningful account data, or that affected cookies are short-lived, strongly bound, or otherwise constrained, P3 may still be appropriate.
```

## What Is Not Claimed

To avoid overstating the impact:

```text
No account takeover is claimed.
No cross-user access is claimed.
No sensitive write action is claimed.
No profile edit was performed.
No resume edit/upload/download was performed.
No saved job or application state was modified.
No job application was submitted.
No standalone replay of BearerToken or RefreshToken was tested.
No raw tokens or cookies are attached.
```

## Recommended Triage Interpretation

The original report showed:

```text
Sensitive cookie/session/CSRF/authentication-token-like material is logged to Android logcat.
```

This supplement adds:

```text
The logged Cookie header was accepted by a clean client for read-only authenticated access to the same tester-controlled account.
The replay response contained a tester-account-specific marker, represented only by redacted_marker_input_sha256_12: 30ee45c80520.
```

Recommended classification:

```text
Sensitive information in logs with read-only authenticated session replay indicated by baseline-vs-cookie response differences and a redacted tester-account-specific marker.
ADB/logcat was used as the validation channel, while the previously documented diagnostic-report flow broadens exposure to user-mediated support reports.
CWE-532: Insertion of Sensitive Information into Log File.
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor.
```

## Related Public Cases

The cases below are cited to show that Android/mobile sensitive logging of sessions, credentials, or other sensitive data is a recognized vulnerability class. They are not used as direct severity benchmarks because each case has different access requirements, affected data, and exploitability.

### CVE-2024-6294: Android session stored in logcat

NVD describes an Android application storing user session data in logcat when the user logs in. The description states that a malicious app or an attacker with physical device access could retrieve the session and use it to log into the app and related services.

Relevance to this report:

```text
This is the closest public analogue because it involves Android logcat, user session material, and reuse of the session to access services.
The Indeed validation similarly shows that logged cookie/session material can be replayed for read-only authenticated access to the tester-controlled account.
```

Important distinction:

```text
CVE-2024-6294 is scored with local/physical-style prerequisites and does not automatically imply a specific Bugcrowd priority for this report.
The current Indeed supplement does not claim cross-user access or full account takeover.
```

Reference:

```text
https://nvd.nist.gov/vuln/detail/CVE-2024-6294
```

### CVE-2020-6653: Android login credentials stored in logcat

NVD describes Eaton Secure Connect Android app versions storing user login credentials in logcat during account creation or registration. The record maps to CWE-200 and CWE-532 and states that a malicious app or unauthorized user could harvest the information and later use it to monitor and control the user's account and associated devices.

Relevance to this report:

```text
This supports the core weakness mapping: authentication material should not be written to Android logcat.
It also supports the impact path where logged authentication material can enable account access beyond mere local information disclosure.
```

Important distinction:

```text
CVE-2020-6653 involved login credentials, while the Indeed case involves cookie/session/authentication-token-like material.
The Indeed replay validation was limited to read-only authenticated access and did not test sensitive write actions.
```

References:

```text
https://nvd.nist.gov/vuln/detail/CVE-2020-6653
https://www.eaton.com/content/dam/eaton/company/news-insights/cybersecurity/security-bulletins/Eaton-vulnerability-advisory-secure-connect-mobile-app.pdf
```

### CVE-2019-5634: Android app sensitive debug logs stored on device storage

Public CVE databases describe Hickory Smart for Android logging internet API and BLE communication data to debug logs stored on Android device storage paths, accessible without rooting the device.

Relevance to this report:

```text
This supports the broader mobile risk model: sensitive diagnostic/debug logs can become accessible outside the intended trust boundary.
This aligns with the ReportEmailHelper/diagnostic-report concern in the original supplemental evidence.
```

Important distinction:

```text
The current Indeed file-location review did not prove that the ReportEmailHelper diagnostic file is written to public external storage.
Therefore, this case is cited only as a related sensitive-log exposure pattern, not as a claim that Indeed stores the diagnostic file in the same way.
```

Reference:

```text
https://app.opencve.io/cve/CVE-2019-5634
```

### CVE-2015-2714 / Mozilla MFSA 2015-52: Sensitive Android logcat data

Mozilla's advisory describes Firefox for Android writing potentially sensitive URL-encoded information to Android logcat. Mozilla rated the advisory impact as Moderate and noted Android-version-dependent logcat access constraints.

Relevance to this report:

```text
This supports the Android-specific principle that sensitive data in logcat is a recognized privacy/security issue.
It also supports the conservative discussion of Android logcat access constraints.
```

Important distinction:

```text
The Mozilla case involved sensitive URL data, while the Indeed case involves cookie/session/authentication-token-like material and a positive read-only replay validation.
```

Reference:

```text
https://www.mozilla.org/en-US/security/advisories/mfsa2015-52/
```

### CVE-2016-6799: Cordova Android sensitive log output

Apache Cordova Android had a sensitive logging issue where app data passed to Android `Log` APIs could be read through logcat on older Android versions. Public advisory databases map it to CWE-532.

Relevance to this report:

```text
This supports the weakness class: sensitive information inserted into Android logs can be a CVE-level issue.
```

Important distinction:

```text
This is a framework-level issue and older Android logcat access model, while the Indeed report concerns a specific production app logging cookie/session material.
```

Reference:

```text
https://advisories.gitlab.com/npm/cordova-android/CVE-2016-6799/
```

## Severity Rationale From Comparable Cases

The comparable cases support three points:

```text
1. Android logcat/session/credential leakage is a recognized vulnerability class.
2. Session or credential material in logs can create account-access impact, not merely theoretical data leakage.
3. Final severity is context-dependent and depends on access prerequisites, token replayability, exposed data sensitivity, and server-side controls.
```

The Indeed follow-up evidence is stronger than a purely potential log exposure because replay produced a clear baseline-vs-cookie authentication-state difference in a clean client for a tester-controlled account. It is also stronger than an ADB-only finding because the previously documented diagnostic report path can collect cookies and logcat output during a normal support/error-report workflow. It is still framed conservatively because the test was read-only and did not prove full account takeover, sensitive write actions, silent upload, or third-party interception of support-report attachments.

## Recommended Fix Additions

In addition to removing the original cookie log:

```text
Immediately stop logging full Cookie headers and authentication/session material.
Review historical diagnostic/support logs for exposure.
Invalidate or rotate affected sessions if production logs collected these values.
Ensure support-report, crash-report, telemetry, and diagnostic pipelines redact these fields.
Reduce session replay risk through server-side binding, short lifetimes, replay detection, and session revocation controls.
```

## Suggested Attachments for This Supplement

Recommended:

```text
bugcrowd-supplement-2-replay-validation.md
replay_from_adb_logcat.py
```

Do not attach:

```text
tmp-cookie-header.txt
raw Cookie header
raw logcat with live values
full HTTP response body
unredacted screenshots
```
