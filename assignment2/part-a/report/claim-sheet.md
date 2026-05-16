# Part A Claim Sheet - Rongbang Cheng

## Role

Rongbang Cheng is responsible for the Part A vulnerability claim, report narrative, and final integration control. This file is the source of truth for the claim that the report and recorded Part A presentation should use.

## Final Vulnerability Claim

The provided APK `a2_case1.apk` contains an insecure network transport configuration and request path: the manifest permits cleartext traffic and `MainActivity` loads `http://www.example.com` into an in-app `WebView`. This enables a realistic on-path attacker to observe and modify WebView traffic, creating a man-in-the-middle risk for content integrity and, secondarily, HTTP request/response confidentiality.

## Why This Is the Correct Part A Scope

The Assignment 2 Part A spec says the intended and graded vulnerability class is an insecure network transport/configuration issue that enables MITM-style attacks, such as cleartext traffic or broken certificate/hostname validation. The selected claim stays within that class and avoids unrelated Android vulnerability classes.

## Evidence Anchors

| ID | Evidence | Use in report |
|---|---|---|
| E1 | `export/resources/AndroidManifest.xml:13` declares `android.permission.INTERNET`. | Shows the app is permitted to use the network. |
| E2 | `export/resources/AndroidManifest.xml:26` sets `android:usesCleartextTraffic="true"`. | Shows Android is configured to allow cleartext traffic. |
| E3 | `export/resources/AndroidManifest.xml:30-36` marks `MainActivity` as the launcher activity. | Links the vulnerable path to normal app startup. |
| E4 | `export/sources/com/example/mastg_test0019/MainActivity.java:31-38` initializes a `WebView` and loads a remote URL. | Shows the network-loading component and execution path. |
| E5 | `export/sources/com/example/mastg_test0019/MainActivity.java:38` calls `webView.loadUrl("http://www.example.com")`. | Primary proof of cleartext HTTP use. |
| E6 | `export/sources/com/example/mastg_test0019/MainActivity.java:34-35` calls `sslErrorHandler.proceed()`. | Supporting evidence of unsafe TLS error handling if HTTPS is later used. |
| E7 | `export/sources/com/example/mastg_test0019/MainActivity.java:39-43` contains a `HostnameVerifier` returning `true`. | Weak supporting evidence only; do not treat as attached to a real client unless further evidence appears. |

## System/Threat Model Integration

Use Sienna's model as the report model:

- Protected asset AS1: integrity and authenticity of WebView-rendered content.
- Protected asset AS2: confidentiality and integrity of HTTP request/response data in transit.
- Protected asset AS3: user decision context when content is presented inside the app.
- Attacker: realistic on-path network attacker, such as same Wi-Fi, rogue hotspot, compromised router, or controlled local proxy.
- Trust boundaries: user to app process, app process to network, untrusted network path to remote server.

## Impact Position

Primary supported impact: in-app WebView content integrity compromise. Because the app loads HTTP content and explicitly permits cleartext traffic, an on-path attacker can modify the response before it is rendered to the user.

Secondary supported impact: HTTP request/response disclosure and tampering in transit.

Worst-case framing for the report: attacker-controlled content could be injected into the WebView, enabling phishing or misleading app-delivered content. This is a realistic MITM impact even though the current evidence does not show credentials, session tokens, personal data, account takeover, or server-side compromise.

## Non-Claims

Do not claim:

- credential theft;
- session-token theft;
- account takeover;
- backend/server compromise;
- local privilege escalation;
- exfiltration of a specific sensitive value;
- confirmed live MITM behavior unless runtime proxy evidence is added.

## Severity Wording

Use qualitative wording rather than overclaiming a numeric severity. Recommended wording:

> This is a meaningful network transport weakness because it violates confidentiality and integrity on a WebView content path. The impact is strongest for content injection and user deception, but the current evidence does not prove theft of credentials or authenticated user data.

## Final One-Sentence Claim

The APK permits cleartext traffic and loads an HTTP URL in a WebView, so a realistic on-path attacker can read or modify the content delivered to the app, compromising WebView content integrity and HTTP transport confidentiality.

