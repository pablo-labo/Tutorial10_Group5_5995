# Part A Evidence Index

This index maps each submitted evidence item to the exact claim it supports. Use it for the Part A video, AI log validation, and activity log. The final report writer may cite the same facts, but this file is not report prose.

## Primary Evidence Chain

| ID | Source | Location | Observation | Supported Claim | Strength |
|---|---|---:|---|---|---|
| A-E01 | `branch-snapshots/assignment2-A-decompile/export/resources/AndroidManifest.xml` | line 13 | App declares `android.permission.INTERNET`. | The app can initiate network traffic. | Strong |
| A-E02 | `branch-snapshots/assignment2-A-decompile/export/resources/AndroidManifest.xml` | line 26 | Application sets `android:usesCleartextTraffic="true"`. | Cleartext HTTP traffic is allowed by app configuration. | Strong |
| A-E03 | `branch-snapshots/assignment2-A-decompile/export/resources/AndroidManifest.xml` | lines 30-36 | `MainActivity` is the launcher activity. | The vulnerable WebView path is reachable through normal app launch. | Strong |
| A-E04 | `branch-snapshots/assignment2-A-decompile/export/sources/com/example/mastg_test0019/MainActivity.java` | lines 31-32 | `MainActivity` obtains the WebView and attaches a `WebViewClient`. | WebView is the relevant network-rendering component. | Strong |
| A-E05 | `branch-snapshots/assignment2-A-decompile/export/sources/com/example/mastg_test0019/MainActivity.java` | line 38 | `webView.loadUrl("http://www.example.com")`. | The app actively loads HTTP cleartext content in WebView. | Strong |
| A-E06 | `branch-snapshots/assignment2-A-decompile/export/sources/com/example/mastg_test0019/MainActivity.java` | lines 34-35 | `onReceivedSslError` calls `sslErrorHandler.proceed()`. | WebView TLS error handling is unsafe. Use as supporting evidence. | Strong supporting |
| A-E07 | `branch-snapshots/assignment2-A-decompile/export/sources/com/example/mastg_test0019/MainActivity.java` | lines 39-43 | A `HostnameVerifier` returns `true`. | Suspicious hostname-validation pattern. Do not treat as primary exploit path unless later evidence shows it is used. | Weak supporting |

## Screenshot Evidence From Teammate Branch

| Screenshot | Meaning |
|---|---|
| `assignment2/evidence/D01_manifest_network_permission_or_cleartext.png` | Manifest network permission and cleartext setting. |
| `assignment2/evidence/D02_launcher_activity_main_path.png` | Launcher `MainActivity` path. |
| `assignment2/evidence/D03_webview_layout_component.png` | WebView component in layout. |
| `assignment2/evidence/D04_main_activity_webview_flow.png` | MainActivity WebView initialization flow. |
| `assignment2/evidence/D05_insecure_http_endpoint.png` | `http://www.example.com` endpoint loaded in WebView. |
| `assignment2/evidence/D06_ssl_error_proceed.png` | SSL error proceed behavior. |
| `assignment2/evidence/D07_hostname_verifier_boundary.png` | Always-true HostnameVerifier boundary note. |

## Final Claim Supported By Evidence

The APK permits cleartext traffic and loads an HTTP URL inside a WebView. A realistic on-path attacker can read or modify HTTP request/response data before it is rendered inside the app, compromising WebView content integrity and HTTP transport confidentiality.

## Evidence Boundaries

- Static evidence is sufficient to prove insecure configuration and an HTTP WebView path.
- Runtime MITM response modification has not been claimed as observed unless a proxy test is later added.
- Evidence does not support credential theft, session theft, account takeover, backend compromise, or sensitive personal data exfiltration.
