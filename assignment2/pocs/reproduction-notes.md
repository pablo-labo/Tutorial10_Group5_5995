# Reproduction Notes - Assignment 2 Part A

## PoC Type

Static PoC. Optional controlled MITM observation and response-modification PoC may be added later if runtime testing is approved.

## Purpose

The purpose is to show, using the provided APK's decompiled output, that the app permits cleartext traffic and loads an HTTP URL through a WebView.

## Setup Assumptions

- The APK under analysis is `a2_case1.apk`.
- The decompiled output is located under `export/`.
- No external systems are scanned or attacked.
- No runtime proxy capture has been performed yet.

## Static PoC Steps

1. Confirm that the app requests network access.
   - Evidence: `export/resources/AndroidManifest.xml:13`
   - Expected observation: `android.permission.INTERNET`.

2. Confirm that cleartext traffic is permitted.
   - Evidence: `export/resources/AndroidManifest.xml:26`
   - Expected observation: `android:usesCleartextTraffic="true"`.

3. Confirm that `MainActivity` is the launcher activity.
   - Evidence: `export/resources/AndroidManifest.xml:30-36`
   - Expected observation: `MainActivity` appears under the `MAIN` and `LAUNCHER` intent filter.

4. Confirm that the main layout contains a WebView.
   - Evidence: `export/resources/res/layout/activity_main.xml:53-62`
   - Expected observation: a `WebView` with ID `@+id/webview`.

5. Confirm that `MainActivity` obtains and uses the WebView.
   - Evidence: `export/sources/com/example/mastg_test0019/MainActivity.java:31-38`
   - Expected observation: `findViewById(R.id.webview)` followed by `webView.loadUrl(...)`.

6. Confirm that the loaded endpoint uses HTTP.
   - Evidence: `export/sources/com/example/mastg_test0019/MainActivity.java:38`
   - Expected observation: `webView.loadUrl("http://www.example.com")`.

7. Confirm unsafe SSL error handling.
   - Evidence: `export/sources/com/example/mastg_test0019/MainActivity.java:34-35`
   - Expected observation: `onReceivedSslError(...)` calls `sslErrorHandler.proceed()`.

## Optional Controlled MITM Observation

This step should only be performed with approval.

The runtime PoC should attempt only a harmless content-integrity demonstration: observe the HTTP WebView request and, if approved, modify a harmless response string to show that WebView-rendered content can be changed in transit.

Tools may include:
- Android emulator or controlled test device;
- Burp Suite, mitmproxy, or Charles Proxy;
- the provided APK only.

Steps:
1. Install the provided APK in a controlled emulator or test device.
2. Configure the device to use a local proxy.
3. Open the app normally.
4. Observe whether the WebView request to `http://www.example.com` appears in plaintext.
5. Optionally modify a harmless response value to demonstrate response integrity risk.

## Safety Boundary

The PoC must only interact with the provided APK through normal app behavior. It must not scan, brute force, disrupt, or test unrelated public systems.

## Expected Observations

For the static PoC, the expected result is evidence of:
- network permission;
- cleartext traffic permitted;
- WebView loading an HTTP endpoint;
- unsafe SSL error handling.

For an approved runtime PoC, the expected result would be plaintext HTTP traffic visible in the local proxy.

## Claims Supported

This PoC supports the claim that the APK contains an insecure network transport path through WebView HTTP loading.

If runtime response modification is later approved and observed, it would support the stronger claim that the WebView-rendered content can be modified by an on-path attacker in the controlled test environment.

## Claims Not Supported

This PoC does not support claims of:
- credential theft;
- session theft;
- account takeover;
- backend compromise;
- confirmed sensitive data exposure;
- confirmed live MITM impact unless runtime proxy evidence is collected.

## Evidence Anchor Mapping

- Network permission: E01
- Cleartext enabled: E02
- Launcher activity: E03
- WebView request path: E04, E08
- HTTP endpoint: E05
- SSL error bypass: E06
- Hostname verifier boundary: E07
