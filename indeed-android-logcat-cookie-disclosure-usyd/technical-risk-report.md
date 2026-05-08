# Android App Security Risk Report

## 1. Scope

Target application:

```text
com.indeed.android.jobsearch
```

Test focus:

```text
Deep link handling
Network impact after external URL launch
Runtime log exposure
Exported debug/test components
Debug settings and experiment override surfaces
```

Primary tested deep link:

```text
http://www.indeed.com/jobs?q=test
```

Test environment:

```text
Windows PC
PowerShell
ADB
mitmproxy / mitmdump
Python 3
JADX-decompiled source tree
Real Android device, non-root
```

Because the real device was not rooted, HTTPS interception was tested in TLS passthrough mode. This means HTTPS payloads were not decrypted, but destination domains and logcat output were still verified.

## 2. Test Methodology

### 2.1 Static Review

The decompiled APK was reviewed from the JADX output under this workspace. The review focused on:

```text
AndroidManifest.xml
network_security_config.xml
exported Activity declarations
debug UI classes
SharedPreferences/debug flag/proctor related code
runtime logging behavior
```

Important files and classes reviewed:

```text
resources/AndroidManifest.xml
resources/res/xml/network_security_config.xml
sources/com/wlappdebug/DebugActivity.java
sources/com/wlappdebug/DebugFlagsActivity.java
sources/com/wlappdebug/DebugProctorActivity.java
sources/com/wlappdebug/o.java
sources/com/wlappdebug/q.java
sources/com/wlappdebug/l.java
sources/defpackage/ai3.java
sources/defpackage/ed4.java
sources/defpackage/om0.java
sources/defpackage/q87.java
sources/androidx/compose/ui/tooling/PreviewActivity.java
```

### 2.2 Exported Component and Debug Surface Review

The manifest showed several debug/test-related components exposed or present in the production package, including:

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

Runtime testing confirmed that debugger/debug UI surfaces could be opened successfully.

### 2.3 Deep Link Test

The following ADB command was used to trigger the target deep link:

```powershell
adb shell am start -a android.intent.action.VIEW `
  -d "http://www.indeed.com/jobs?q=test" `
  com.indeed.android.jobsearch
```

This was later automated with PowerShell and Python scripts.

### 2.4 Initial PowerShell Capture Test

A PowerShell helper was created:

```text
security-tests/deeplink_http_capture.ps1
```

It performed:

```text
start mitmdump
configure Android proxy when possible
fallback to manual proxy setup
trigger the deep link
capture logcat
write mitm/logcat outputs to capture-output
```

Initial issues encountered:

```text
Start-Process could not redirect stdout/stderr to the same file.
ADB could not set global http_proxy due to WRITE_SECURE_SETTINGS.
Wi-Fi proxy to PC IP caused device connectivity failure.
HTTPS interception failed without trusted mitmproxy CA.
```

Fixes applied:

```text
Separate stdout/stderr log files
Manual proxy prompt
ADB reverse mode
TLS passthrough mode by default
Clean logcat before each run
Summary output generation
```

### 2.5 Python Capture Test

A Python helper was created:

```text
security-tests/deeplink_capture.py
```

Default command:

```powershell
python .\security-tests\deeplink_capture.py
```

Default behavior:

```text
Start mitmdump on 127.0.0.1:8080
Use adb reverse tcp:8080 tcp:8080
Ask user to set Android Wi-Fi proxy to 127.0.0.1:8080
Clear logcat
Trigger the deep link
Capture mitm text logs and logcat
Generate summary-*.txt
Detect sensitive log entries
Redact known sensitive values in summary output
```

Manual Android proxy setting used during testing:

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

TLS passthrough was used by default:

```text
HTTPS contents were not decrypted.
No mitmproxy CA certificate was required.
Destination domains and logcat data were still captured.
```

Optional HTTPS interception mode:

```powershell
python .\security-tests\deeplink_capture.py --intercept-tls
```

This mode requires the test device or emulator to trust the mitmproxy CA. It is better suited for a rooted emulator or a test build configured to trust user CAs.

## 3. Commands Used

### 3.1 Trigger Deep Link Directly

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

### 3.2 Run PowerShell Capture Helper

```powershell
powershell -ExecutionPolicy Bypass -File .\security-tests\deeplink_http_capture.ps1
```

### 3.3 Run Python Capture Helper

```powershell
python .\security-tests\deeplink_capture.py
```

### 3.4 Check mitm Evidence

```powershell
Select-String -Path ".\capture-output\mitm-*.out.log" -Pattern "indeed.com|GET|POST|CONNECT|jobs|server connect"
```

### 3.5 Check logcat URL Evidence

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "DeeplinkStore|IndeedWebViewClient|BaseWebViewClient|http://www\.indeed\.com|https://www\.indeed\.com|jobs\?q="
```

### 3.6 Check Sensitive logcat Evidence

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "IndeedCookieHelper|cookies:|Cookie:|Authorization|Bearer|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

## 4. Test Results

### 4.1 Deep Link Was Accepted by the App

The app accepted the external deep link and launched:

```text
START ... act=android.intent.action.VIEW dat=http://www.indeed.com/... cmp=com.indeed.android.jobsearch/.LaunchActivity
```

The app also emitted a link click event:

```text
DeeplinkStore: Emitting LinkClick(uri=http://www.indeed.com/jobs?q=test&utm_eao_tk=<uuid>, referrer=null)
```

Result:

```text
Confirmed. External deeplink input reaches the app's LaunchActivity and internal deeplink handling flow.
```

### 4.2 Network Impact Was Observed

The Python capture script produced the following earlier baseline output:

```text
mitm keyword hits: 114
mitm server connect hits: 51
TLS trust failure hits: 0
logcat URL hits: 20
sensitive log hits: 68
```

After logging into the app, the test was repeated and produced:

```text
summary: capture-output\summary-20260509-002214.txt
mitm log: capture-output\mitm-20260509-002214.out.log
logcat: capture-output\logcat-20260509-002214.out.log
mitm keyword hits: 121
mitm server connect hits: 47
TLS trust failure hits: 0
logcat URL hits: 15
sensitive log hits: 10
```

This authenticated run confirms that the sensitive logging behavior still occurs after the app is logged in.

Observed network destinations included:

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
browser-intake-datadoghq.com
crashlyticsreports-pa.googleapis.com
firebaseremoteconfig.googleapis.com
app-measurement.com
```

Result:

```text
Confirmed. The external deeplink triggers network activity to Indeed business, web, static asset, telemetry, and backend domains.
```

### 4.3 HTTPS Payload Was Not Decrypted

TLS passthrough mode was used on the non-root device.

Result:

```text
No HTTPS payload-level leakage was claimed from mitmproxy.
mitmproxy was used to confirm destination domains and connectivity only.
```

### 4.4 Sensitive Data Was Logged to logcat

The most important finding is that the app logged sensitive Cookie/session material to logcat.

Sensitive log source:

```text
D/IndeedCookieHelper: cookies: ...
```

Representative leaked field names:

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

The earlier baseline Python run reported:

```text
sensitive log hits: 68
```

The latest authenticated Python run reported:

```text
sensitive log hits: 10
```

The most relevant entries in the authenticated run are the `D/IndeedCookieHelper: cookies: ...` lines. Other keyword matches may include diagnostic or framework logs and should be treated as secondary context rather than primary impact evidence.

Result:

```text
Confirmed. Sensitive session, CSRF, tracking, device, and login-flow values are written to Android logcat, including during an authenticated app session.
```

The raw logcat files contain real sensitive values and should not be shared without redaction.

### 4.5 Debug Components and Debug Functions Are Present

Static review and runtime testing showed debug surfaces in the application.

Debug menu sections identified in code:

```text
App
Device
Preferences
Remote Config
Last Crash
Debug Flags
App Proctor
```

Potential risks from these debug functions:

```text
Preferences page reads SharedPreferences.getAll()
Remote Config page displays Firebase Remote Config key/value/source
Last Crash reads debug_last_exception_dump.txt
Debug Flags stores and modifies debug flags
Proctor page allows experiment override values and payloads
Endpoint resolver can be influenced by debug flag values
```

Result:

```text
Confirmed by static review. Runtime access to debug UI was also observed.
```

## 5. Proof of Concept

### 5.1 PoC A: Deep Link Trigger and Runtime Evidence Collection

Run:

```powershell
python .\security-tests\deeplink_capture.py
```

When prompted, set the Android Wi-Fi proxy manually:

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

Press Enter in the terminal.

Expected output:

```text
mitm server connect hits: > 0
logcat URL hits: > 0
sensitive log hits: > 0
```

Generated evidence:

```text
capture-output\summary-*.txt
capture-output\mitm-*.out.log
capture-output\logcat-*.out.log
```

### 5.2 PoC B: Confirm Deep Link Handling

Run:

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

Then verify:

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "DeeplinkStore|LaunchActivity|http://www\.indeed\.com|jobs\?q="
```

Expected evidence:

```text
LaunchActivity receives the VIEW intent.
DeeplinkStore emits a LinkClick event containing the deeplink URL.
```

### 5.3 PoC C: Confirm Sensitive Logging

Run:

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "IndeedCookieHelper|cookies:|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

Expected evidence:

```text
Logcat contains an IndeedCookieHelper entry that prints cookie material.
```

Do not publish raw values. Use redacted output in reports.

### 5.4 PoC D: Confirm Network Impact Without HTTPS Decryption

Run:

```powershell
Select-String -Path ".\capture-output\mitm-*.out.log" -Pattern "server connect|indeed.com|secure.indeed.com|mobile-app-backend.indeed.com|collector"
```

Expected evidence:

```text
mitmproxy logs CONNECT/server connect events to Indeed domains.
```

This proves network impact and destination domains, not decrypted request contents.

## 6. Risk Analysis

### 6.1 Primary Risk: Sensitive Data Exposure Through Logs

Risk rating:

```text
Medium / P3-equivalent / S2
```

Reason:

```text
Cookie/session material is logged.
CSRF values are logged.
Device and tracking identifiers are logged.
Login-flow parameters are logged.
The issue is reproducible.
The issue does not require HTTPS decryption.
```

Potential impact:

```text
Session material disclosure
CSRF token disclosure
Device/user tracking identifier disclosure
Login or registration flow token disclosure
Authentication-token-like cookie names such as __Secure-PassportAuthProxy-BearerToken and __Secure-PassportAuthProxy-RefreshToken are present in the redacted evidence; replayability is not claimed, but their presence increases the sensitivity of the logged cookie header.
Potential session replay or unauthorized access if server-side protections are insufficient
Exposure through diagnostic logs, support-report attachments, crash/logging telemetry-adjacent workflows, vendor logs, or authorized ADB collection
```

Supplemental diagnostic-pipeline note:

```text
Static analysis found a ReportEmailHelper path that collects WebView cookies and logcat -d output into a diagnostic report file. This strengthens the Medium/P3 argument because the exposure is not limited to a researcher manually reading logcat with ADB.

However, current evidence does not prove silent remote upload, Crashlytics/Datadog payload leakage, public external-storage file exposure, or token replay.
```

### 6.2 Potential Unauthorized Access Risk

The leaked values may enable unauthorized access if they are accepted outside their original client context.

The following server-side controls determine exploitability:

```text
Cookie lifetime
Session binding to device, IP, region, User-Agent, app signature, or device attestation
CSRF validation model
Re-authentication for sensitive operations
HttpOnly/Secure/SameSite cookie handling
Anomaly detection and session revocation
```

Current status:

```text
Sensitive session/authentication-related material leakage is confirmed.
Direct account takeover or unauthorized access is not yet confirmed.
```

Recommended severity:

```text
Medium / P3-equivalent / S2
```

Escalation condition:

```text
If leaked cookies or refresh-token-like values can be replayed to access user data or perform account actions, severity should be upgraded to High. Critical is not supported unless cross-device account takeover or highly sensitive account actions are proven.
```

### 6.3 Debug and Test Component Exposure

Risk rating:

```text
Additional observation; severity not independently established
```

Reason:

```text
Debug components and AndroidX test/preview components are present.
DebugActivity exposes internal diagnostic menus.
Preferences, Remote Config, Debug Flags, and Proctor pages may expose or modify runtime state.
```

Potential impact:

```text
Internal configuration disclosure
Feature flag manipulation
Experiment/proctor override
Endpoint/environment switching
Crash/internal stack exposure
Local sensitive preference exposure
Attack surface expansion
```

### 6.4 Deep Link Handling Risk

Risk rating:

```text
Medium by itself
Supports Medium/P3 when combined with sensitive logging
```

Reason:

```text
External input is accepted and reaches app/web/backend flows.
The deeplink triggers log and network behavior.
The query value and generated tracking parameter appear in logs.
```

## 7. CWE / OWASP Mapping

Relevant mappings:

```text
CWE-532: Insertion of Sensitive Information into Log File
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor
CWE-359: Exposure of Private Personal Information to an Unauthorized Actor
CWE-489: Active Debug Code
CWE-926: Improper Export of Android Application Components
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
Android Log Info Disclosure
```

Related public vulnerability examples of the same class:

```text
CVE-2017-9615: verbose logging stores admin credentials
CVE-2018-1999036: SSH private key password stored in build log
```

These CVEs are reference examples for sensitive data in logs. They are not CVEs for this app.

## 8. Recommendations

### 8.1 Logging

Remove or sanitize all logging of:

```text
Cookie headers
Session identifiers
CSRF tokens
Device IDs
Tracking IDs
Cloudflare/security cookies
Login/authentication parameters
Experiment/proctor assignments
```

Specific recommendation:

```text
Remove the IndeedCookieHelper full cookie log.
```

If logging is required, log only metadata:

```text
cookie count
cookie key names
boolean presence flags
redacted values
```

Example safe pattern:

```text
cookies: [Device-ID=<redacted>, CSRF=<redacted>, CTK=<redacted>]
```

### 8.2 Release Build Hardening

Recommended changes:

```text
Disable debug/info logs in production.
Use R8/ProGuard to remove logging calls.
Ensure debug logging cannot be enabled remotely in production.
Filter sensitive values before crash or telemetry upload.
```

### 8.3 Component Exposure

Recommended changes:

```text
Remove com.wlappdebug.* from production builds.
Remove AndroidX testing and preview activities from production builds.
Set debug/test components to android:exported="false".
Protect any unavoidable internal component with signature-level permissions.
```

### 8.4 Debug Features

Recommended changes:

```text
Disable Preferences/Remote Config/Last Crash/Debug Flags/Proctor pages in production.
Prevent endpoint override in production.
Prevent experiment override in production.
Do not display SharedPreferences values in production builds.
```

### 8.5 Server-Side Compensating Controls

Recommended validation:

```text
Confirm leaked cookies cannot be replayed from a different client.
Bind sensitive sessions to appropriate risk signals.
Use short token lifetimes where possible.
Require re-authentication for sensitive actions.
Rotate/revoke sessions after suspected log exposure.
Monitor for replay/anomaly behavior.
```

## 9. Final Assessment

Final severity:

```text
Medium / P3-equivalent / S2
```

Rationale:

```text
The app logs sensitive Cookie/session/CSRF/device/login-flow values.
The issue is reproducible on a non-root real device.
The issue does not require HTTPS interception.
The external deeplink triggers app and network flows.
Static analysis shows a ReportEmailHelper diagnostic path that collects WebView cookies and logcat output.
Refresh-token-like cookie names increase sensitivity, but replayability is not proven.
Debug and test surfaces are present as additional observations but are not used to independently justify High severity.
```

Potential escalation:

```text
High if leaked cookies or refresh-token-like values can be replayed to access user data or perform account actions.
Critical is not supported unless cross-device account takeover or highly sensitive account actions are proven.
```

Evidence files:

```text
capture-output\summary-*.txt
capture-output\mitm-*.out.log
capture-output\logcat-*.out.log
security-tests\deeplink_capture.py
security-tests\deeplink_http_capture.ps1
```

Important handling note:

```text
Raw logcat files contain real sensitive values. Do not share them externally without redaction.
```
