# Attack Steps - Assignment 2 Part A

## Scope

This note covers Assignment 2 Part A only. The analysis is based on static evidence from the provided APK decompiled output. No external target testing, scanning, brute force, denial-of-service testing, or real-world bug bounty activity is included.

## Evidence Mapping

| ID | Evidence |
|---|---|
| E01 | `export/resources/AndroidManifest.xml:13` requests `android.permission.INTERNET`. |
| E02 | `export/resources/AndroidManifest.xml:26` sets `android:usesCleartextTraffic="true"`. |
| E03 | `export/resources/AndroidManifest.xml:30-36` identifies `MainActivity` as the launcher activity. |
| E04 | `export/sources/com/example/mastg_test0019/MainActivity.java:31-38` creates a `WebView` and loads a URL. |
| E05 | `export/sources/com/example/mastg_test0019/MainActivity.java:38` loads `http://www.example.com`. |
| E06 | `export/sources/com/example/mastg_test0019/MainActivity.java:34-35` calls `sslErrorHandler.proceed()` after an SSL error. |
| E07 | `export/sources/com/example/mastg_test0019/MainActivity.java:39-43` contains a `HostnameVerifier` that returns `true`, but the static evidence does not show it being attached to a network client. |
| E08 | `export/resources/res/layout/activity_main.xml:53-62` defines the `WebView` used by `MainActivity`. |

## Protected Asset

The primary protected asset is the integrity and authenticity of web content rendered inside the app WebView. This maps to AS1 in the system model.

The secondary protected asset is the confidentiality and integrity of HTTP request/response data in transit. This maps to AS2.

A downstream user-facing asset is the user's decision context when viewing app-delivered WebView content. This maps to AS3.

The evidence does not prove credential theft, session theft, account takeover, or server-side compromise.

## Attacker Model

A realistic attacker is an on-path network attacker, such as a user on the same Wi-Fi network, a malicious hotspot operator, a compromised router, or a controlled local proxy used in a lab setting.

## Preconditions

1. The victim installs and opens the provided APK.
2. `MainActivity` is launched.
3. The WebView code path runs.
4. The app loads the configured HTTP URL.
5. The attacker can observe or interfere with the victim's network traffic.
6. Cleartext traffic is permitted and used by the app.

## Attack Path

1. The attacker obtains an on-path position on the victim's network.
   - Boundary/asset mapping: TB3.
   - Evidence: E02, E05.

2. The victim opens the app, which launches `MainActivity`.
   - Boundary/asset mapping: TB1.
   - Evidence: E03.

3. `MainActivity` initializes the layout and obtains the WebView by ID.
   - Boundary/asset mapping: TB1, AS1.
   - Evidence: E04, E08.

4. The app loads `http://www.example.com` in the WebView.
   - Boundary/asset mapping: TB2, AS2.
   - Evidence: E05.

5. Because the URL uses HTTP and cleartext traffic is permitted, an on-path attacker can observe the HTTP request and response.
   - Boundary/asset mapping: TB2/TB3, AS2.
   - Evidence: E02, E05.

6. The attacker may modify the HTTP response before it reaches the WebView, which can affect the content rendered inside the app.
   - Boundary/asset mapping: TB2/TB3, AS1, AS3.
   - Evidence: E02, E05.

7. If a WebView HTTPS load encounters an SSL error, the code calls `sslErrorHandler.proceed()`. This is unsafe TLS error handling, although the currently proven direct load is HTTP.
   - Evidence: E06.

## Impact

The primary supported impact is in-app WebView content integrity compromise. Because the app loads cleartext HTTP content, a realistic on-path attacker may alter the response before it is rendered in the WebView.

The secondary supported impact is confidentiality exposure of HTTP request/response data on that path.

The current evidence does not show credentials, session tokens, personal data, or authenticated API traffic being sent over this path. Therefore, credential theft, session theft, account takeover, and data exfiltration of a specific sensitive value should not be claimed.

## Boundary Conditions and Non-Claims

The static evidence proves that the app permits cleartext traffic and loads an HTTP URL in a WebView. It also shows unsafe SSL error handling in the WebView client.

The evidence does not prove:
- theft of credentials;
- theft of session tokens;
- account takeover;
- server-side compromise;
- modification of application state;
- live MITM success in runtime testing;
- sensitive user data exposure.

The `HostnameVerifier` that returns `true` should be treated as weak supporting evidence only, because the decompiled code does not show it being assigned to a client or used in the WebView request path.

A controlled runtime proxy test would be needed to strengthen the claim from static risk to observed MITM behavior.
