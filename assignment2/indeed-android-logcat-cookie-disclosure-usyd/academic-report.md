# Bugcrowd Submission Draft: Indeed Android App Logs Cookie, CSRF, Session, and Device Identifiers to logcat

## Title

Indeed Android App Logs Cookie, CSRF, Session, and Device Identifiers to Android logcat

## Target

```text
Android application: com.indeed.android.jobsearch
Tested deep link used as trigger: http://www.indeed.com/jobs?q=test
```

## Suggested Bugcrowd Priority

Suggested initial priority:

```text
P3 - Medium
```

Rationale:

```text
The application logs cookie/session/CSRF/device-related values to Android logcat during a normal app flow. This creates a sensitive information exposure risk through ADB/logcat access, diagnostic log collection, crash/support log collection, privileged log access, or compromised testing/support devices.
```

Supplemental diagnostic-pipeline finding:

```text
Static analysis identified an Indeed ReportEmailHelper path that creates a diagnostic report file containing WebView cookies and logcat -d output. This strengthens the P3 / Medium position because the exposure can plausibly enter normal support-report workflows, not only manual ADB collection.
```

Conservative boundaries:

```text
The current evidence does not prove silent remote upload, Crashlytics/Datadog payload leakage, public external-storage file exposure, token replay, or account takeover. The ReportEmailHelper path appears user-mediated unless further runtime testing proves otherwise.
```

Potential upgrade:

```text
P2 - High if the leaked JSESSIONID, CSRF token, Cookie, or related values are confirmed to be authenticated, valid, and reusable to access user data or perform authenticated actions.
```

Not currently claimed:

```text
No account takeover is claimed.
No session replay is claimed.
No sensitive account action execution is claimed.
No decrypted HTTPS payload leakage is claimed.
The deep link itself is not claimed as a standalone vulnerability.
```

Suggested VRT / weakness mapping:

```text
Sensitive Data Exposure: Varies
Mobile log information disclosure: Varies
CWE-532: Insertion of Sensitive Information into Log File
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
Android Log Info Disclosure
```

## External References and Comparable Cases

The references below support the vulnerability class and the conservative severity approach used in this report:

```text
Android official guidance: Log Info Disclosure
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
MITRE CWE-532: Insertion of Sensitive Information into Log File
Bugcrowd VRT: Sensitive Data Exposure severity is context-dependent
CVE-2024-6294: Android app storing user session in logcat
CVE-2020-6653: Android app storing login credentials in logcat
CVE-2025-4090: Firefox/Thunderbird for Android logging potentially sensitive library locations via Logcat
```

Reference links:

```text
Android Log Info Disclosure:
https://developer.android.com/privacy-and-security/risks/log-info-disclosure

OAuth 2.0 RFC 6749, Refresh Tokens:
https://www.rfc-editor.org/rfc/rfc6749#section-1.5
https://www.rfc-editor.org/rfc/rfc6749#section-6

AndroidX FileProvider:
https://developer.android.com/reference/androidx/core/content/FileProvider

Java File.createTempFile:
https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/io/File.html#createTempFile(java.lang.String,java.lang.String)

OWASP MASWE-0001:
https://mas.owasp.org/MASWE/MASVS-STORAGE/MASWE-0001/

OWASP MASTG-TEST-0203:
https://mas.owasp.org/MASTG/tests/android/MASVS-STORAGE/MASTG-TEST-0203/

MITRE CWE-532:
https://cwe.mitre.org/data/definitions/532.html

Bugcrowd VRT:
https://bugcrowd.com/vulnerability-rating-taxonomy

CVE-2024-6294:
https://nvd.nist.gov/vuln/detail/CVE-2024-6294

CVE-2020-6653:
https://nvd.nist.gov/vuln/detail/CVE-2020-6653

CVE-2025-4090:
https://nvd.nist.gov/vuln/detail/CVE-2025-4090
```

These references are used carefully:

```text
They support that sensitive data in Android logcat is a recognized vulnerability class.
They do not automatically justify P2/P1 severity for this report.
They show that severity depends on access prerequisites, replayability, data sensitivity, and whether authenticated access can be demonstrated.
```

## Summary

The Indeed Android app logs cookie/session-related material to Android logcat while processing a normal app flow triggered by an external Indeed deep link.

The sensitive log source is:

```text
D/IndeedCookieHelper: cookies: ...
```

The logged cookie line contains field names including:

```text
Device-ID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
SURF
CTK
JSESSIONID
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
__cf_bm
__cflb
_cfuvid
form_tk
surftok
appSignIn
PPID
Indeed-App-Proctor-Groups
```

The issue was reproduced on a real non-root Android device using ADB/logcat. HTTPS interception was not required. The proxy was used in TLS passthrough mode only to confirm destination domains and general network activity. The sensitive data was observed directly in logcat, written by the app itself.

Important limitation:

```text
This report confirms that sensitive authentication/session-related values are logged. It does not prove that these values can be replayed, used for account access, or used to perform sensitive operations.
```

Raw values are intentionally omitted from this report draft. They exist in local raw evidence files and should only be shared through Bugcrowd's private report attachment workflow if requested, preferably redacted.

## Environment

```text
Host OS: Windows
Tools: adb, mitmproxy/mitmdump, Python 3, PowerShell, JADX output
Device: Real Android device, non-root
Device model: Xiaomi 15 Pro / 2410DPN6CC
Android version: 15
Android SDK: 35
OS version details provided by tester: Kernel Version 6.6.30-android15-8-geae86f166c48-abofki36756932-4k; OS VERSION: 2.0.215.0.VOBCNXM
Target package: com.indeed.android.jobsearch
App versionName: 277.1
App versionCode: 99968
Install source: Google Play
Test date: 2026-05-08 to 2026-05-09
Proxy mode: adb reverse + Android manual Wi-Fi proxy
TLS mode: passthrough, no HTTPS decryption
```

## Scope and Severity Notes

The public Indeed Bugcrowd engagement page was reviewed, but the full engagement brief content was not visible without an authenticated Bugcrowd session in this environment. This report follows Bugcrowd's standard report structure and VRT-style severity language.

The proposed severity is intentionally conservative:

```text
P3 - Medium as the initial submission priority.
P2 - High only if replay or authenticated account access is confirmed by further testing or by Indeed triage.
P1 / Critical is not supported by the current evidence.
```

### Severity Rationale Based on Public References

Android's official guidance describes Log Info Disclosure as a vulnerability class where apps print sensitive data into device logs. The same guidance notes that Android `Log.*` statements write to the shared `logcat` buffer, that direct logging to logcat is discouraged, and that non-debug production logging should be sanitized or removed. It also recommends mitigations such as redaction and R8-based log stripping.

OWASP MASWE-0001 similarly treats insertion of sensitive data into logs as a mobile weakness, and OWASP MASTG-TEST-0203 describes runtime testing of Android logging APIs and considers a test failed when sensitive data is found in logs.

MITRE CWE-532 directly maps to this issue because the app writes sensitive information to a log. CWE-200 is also relevant as an impact classification.

Comparable public CVEs support the vulnerability class but also support conservative severity:

```text
CVE-2024-6294 describes an Android app storing user session data in logcat, where a malicious app or attacker with physical access could retrieve the session. Its CVSS v3.1 score is 3.9 Low.

CVE-2020-6653 describes a mobile application storing login credentials in logcat and maps to the same weakness class. It is cited only as a comparable vulnerability class, not as a direct severity benchmark.

CVE-2025-4090 shows that Logcat exposure in Firefox/Thunderbird for Android is recognized as a valid issue class, though the exposed data type was less sensitive than session/cookie material.
```

Because this report does not yet prove replay, authenticated account access, or sensitive action execution, the recommended initial priority remains:

```text
P3 - Medium
```

The appropriate upgrade condition remains:

```text
P2 - High if Indeed confirms or further testing proves that the leaked cookie/session/CSRF material is authenticated, valid, and reusable to access user data or perform authenticated actions.
```

## Steps to Reproduce

### 1. Prepare the Android Device

Connect an Android device with ADB enabled:

```powershell
adb devices
```

Confirm the target app is installed:

```powershell
adb shell pm list packages | Select-String "com.indeed.android.jobsearch"
```

### 2. Run the Capture Script

From the repository root:

```powershell
python .\security-tests\deeplink_capture.py
```

The script performs:

```text
Starts mitmdump
Configures adb reverse
Clears logcat
Triggers the app flow with the deep link
Captures mitm/logcat output
Generates a summary file
Detects sensitive log entries
```

### 3. Configure Android Manual Proxy When Prompted

When the script prompts:

```text
host: 127.0.0.1
port: 8080
```

Set the current Android Wi-Fi proxy to:

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

Then press Enter in the terminal.

### 4. Deep Link Used Only as Trigger

The script triggers:

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

This deep link is used only as a reliable trigger for the affected app code path. This report does not claim that accepting this Indeed deep link is a standalone vulnerability.

### 5. Observe Script Output

Representative output from the earlier unauthenticated/baseline run:

```text
[+] summary: capture-output\summary-20260508-235036.txt
[+] mitm log: capture-output\mitm-20260508-235036.out.log
[+] logcat: capture-output\logcat-20260508-235036.out.log
[*] mitm keyword hits: 114
[*] mitm server connect hits: 51
[*] TLS trust failure hits: 0
[*] logcat URL hits: 20
[*] sensitive log hits: 68
```

Representative output from the latest authenticated run, performed after logging into the app:

```text
[+] summary: capture-output\summary-20260509-002214.txt
[+] mitm log: capture-output\mitm-20260509-002214.out.log
[+] logcat: capture-output\logcat-20260509-002214.out.log
[*] mitm keyword hits: 121
[*] mitm server connect hits: 47
[*] TLS trust failure hits: 0
[*] logcat URL hits: 15
[*] sensitive log hits: 10
```

The authenticated run is important because it confirms that the same `IndeedCookieHelper` cookie logging behavior is still reachable after the app is logged in. The lower hit count reflects a cleaner capture window after clearing logcat; the primary evidence remains the `D/IndeedCookieHelper: cookies: ...` log entries.

### 6. Confirm Deep Link Reaches the App Flow

Command:

```powershell
Select-String -Path ".\capture-output\logcat-20260508-235036.out.log" -Pattern "DeeplinkStore|LaunchActivity|http://www\.indeed\.com|jobs\?q="
```

Representative evidence:

```text
START ... act=android.intent.action.VIEW dat=http://www.indeed.com/... cmp=com.indeed.android.jobsearch/.LaunchActivity
DeeplinkStore: Emitting LinkClick(uri=http://www.indeed.com/jobs?q=test&utm_eao_tk=<uuid>, referrer=null)
```

### 7. Confirm Network Activity, Not Payload Leakage

Command:

```powershell
Select-String -Path ".\capture-output\mitm-20260508-235036.out.log" -Pattern "server connect|indeed.com|secure.indeed.com|mobile-app-backend.indeed.com|collector"
```

Observed destination domains:

```text
apis.indeed.com
mobile-app-backend.indeed.com
www.indeed.com
secure.indeed.com
profile.indeed.com
au.indeed.com
encserv.indeed.com
autocomplete.indeed.com
t.indeed.com
s.indeed.com
c03.s3.indeed.com
prod.statics.indeed.com
com-indeed-prod1.collector.snplow.net
```

Note:

```text
The proxy was used in TLS passthrough mode. This confirms destination domains only. It does not prove HTTPS payload leakage.
```

### 8. Confirm Sensitive logcat Disclosure

Command:

```powershell
Select-String -Path ".\capture-output\logcat-20260508-235036.out.log" -Pattern "IndeedCookieHelper|cookies:|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

Representative redacted evidence:

```text
D/IndeedCookieHelper: cookies: Device-ID=<redacted>; CSRF=<redacted>; INDEED_CSRF_TOKEN=<redacted>; ENC_CSRF=<redacted>; JSESSIONID=<redacted>; __Secure-PassportAuthProxy-BearerToken=<redacted>; __Secure-PassportAuthProxy-RefreshToken=<redacted>; CTK=<redacted>; ...
```

The earlier baseline run reported:

```text
sensitive log hits: 68
```

The latest authenticated run reported:

```text
sensitive log hits: 10
```

Within the authenticated run, the report should focus on the `D/IndeedCookieHelper: cookies: ...` entries as the primary vulnerability evidence. Other keyword hits may include non-primary diagnostic logs and should not be used to inflate impact.

## Proof of Concept

### PoC Script

Helper script:

```text
security-tests/deeplink_capture.py
```

Minimal reproduction:

```powershell
python .\security-tests\deeplink_capture.py
```

Expected indicators:

```text
logcat URL hits: greater than 0
sensitive log hits: greater than 0
```

Expected vulnerable evidence:

```text
Logcat contains D/IndeedCookieHelper: cookies: ...
The cookies line contains session/CSRF/device/login-flow related values.
```

The PoC does not require:

```text
root access to the test device
HTTPS decryption
mitmproxy CA installation
modifying the APK
```

Clarification:

```text
The issue does not require rooting the test device to reproduce via ADB/logcat, but exploitation by a third party depends on access to affected logs.
```

## Impact

Confirmed impact:

```text
Sensitive cookie/session/CSRF/device/login-flow related values are written to Android logcat.
The issue is reproducible during a normal app flow.
The issue does not require HTTPS interception to observe.
```

Potential impact if additional server-side conditions are met:

```text
May assist session replay if server-side protections are insufficient.
May assist CSRF bypass if leaked CSRF values are accepted with leaked cookies.
The redacted logcat evidence also shows authentication-token-like cookie names such as __Secure-PassportAuthProxy-BearerToken and __Secure-PassportAuthProxy-RefreshToken. This report does not claim that these values are replayable, but their presence increases the sensitivity of the logged cookie header.
May expose tracking or device identifiers to parties with access to affected logs.
May expose login or registration flow parameters to parties with access to affected logs.
```

Not confirmed:

```text
The report does not confirm that the leaked values belong to an authenticated user.
The report does not confirm replay from another device or client.
The report does not confirm access to user data.
The report does not confirm execution of sensitive actions.
```

## Access Model

Modern Android restricts ordinary third-party apps from reading other apps' logcat output. Therefore, this report does not claim that any arbitrary installed app can read these logs.

Realistic exposure paths include:

```text
ADB/debugging sessions
Developer or support log collection
Privileged/OEM/system applications with log access
Crash or telemetry pipelines that include logcat
Shared bug reports or device logs
Compromised development, test, or support devices
```

## Additional Observation, Not Part of the Primary Impact Claim

During static review, multiple debug/test surfaces were identified in the decompiled application:

```text
com.wlappdebug.DebugActivity
com.wlappdebug.DebugFlagsActivity
com.wlappdebug.DebugProctorActivity
androidx.compose.ui.tooling.PreviewActivity
androidx.fragment.app.testing.EmptyFragmentActivity
androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity
androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity
androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity
```

Debug menu functionality identified in code includes:

```text
Preferences
Remote Config
Last Crash
Debug Flags
App Proctor / experiment overrides
App and Device info
```

This report does not claim impact from these debug components. They may support a separate report only if a separate reproduction demonstrates concrete impact, such as:

```text
Opening exported debug components in the production app
Reading sensitive SharedPreferences values
Modifying debug flags
Modifying proctor/experiment overrides
Changing backend endpoints or environment
Exporting crash dumps or internal configuration
```

## Recommended Remediation

### Remove Sensitive Logging

Remove logging of full cookie strings from:

```text
IndeedCookieHelper
```

Do not log:

```text
Cookie headers
JSESSIONID
CSRF / INDEED_CSRF_TOKEN
ENC_CSRF
Device-ID
CTK
SURF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
PPID
Cloudflare/security cookies
form_tk
surftok
preExtAuthParams
authentication state
experiment/proctor group values
```

### Add Centralized Redaction

If diagnostic logging is required, redact values before logging:

```text
cookies: [Device-ID=<redacted>, CSRF=<redacted>, CTK=<redacted>]
```

Prefer logging only:

```text
cookie key names
cookie count
boolean presence flags
non-sensitive status codes
```

### Harden Production Builds

Recommended:

```text
Disable debug/info logs in release builds.
Use R8/ProGuard rules to strip verbose/debug log calls.
Block sensitive values from crash/telemetry pipelines.
Review support-log and diagnostic-log collection for sensitive fields.
```

### Server-Side Validation

To determine whether the issue should be upgraded:

```text
Confirm whether leaked session cookies are authenticated.
Confirm whether leaked values can be replayed from another client.
Confirm whether sessions are bound to device/IP/User-Agent/app signals.
Confirm whether CSRF values can be reused outside the intended context.
Confirm whether sensitive account actions require re-authentication.
```

## Suggested Report Attachments

Recommended private attachments:

```text
summary-clean-20260509-002214.txt
redacted-logcat-indeed-cookiehelper-20260509-002214.txt
capture-output\summary-20260508-235036.txt
security-tests\deeplink_capture.py
```

Optional, only if requested by triage:

```text
capture-output\logcat-20260509-002214.out.log
capture-output\mitm-20260509-002214.out.log
capture-output\logcat-20260508-235036.out.log
capture-output\mitm-20260508-235036.out.log
```

Important:

```text
Raw logcat contains live sensitive values. Redact before sharing outside the private Bugcrowd report.
```

## Final Assessment

Recommended initial severity:

```text
P3 - Medium
```

Why:

```text
The app logs cookie/session/CSRF/device/login-flow related values.
The issue was reproduced on a real non-root Android device via ADB/logcat.
No HTTPS decryption or APK modification was required.
Third-party exploitation depends on access to affected logs.
Replay/account access was not tested or confirmed.
```

Potential upgrade:

```text
P2 - High if the leaked values are confirmed valid, authenticated, and reusable to access user data or perform authenticated actions.
```

Not supported by current evidence:

```text
P1 / Critical
Account takeover
Confirmed session replay
Confirmed sensitive action execution
Decrypted HTTPS payload leakage
Standalone deep link vulnerability
```
