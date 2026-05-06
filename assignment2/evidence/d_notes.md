# D Notes - Attack Path and PoC Evidence

## Scope

These notes support D / Frank's Assignment 2 Part A role: attack path, PoC planning, exploit conditions, limitations, and tutorial preparation. The evidence is static-analysis evidence from the provided APK decompiled output.

## Evidence Anchors

| ID | File path | Line range | Evidence type | What it shows | Claim supported | Confidence |
|---|---|---:|---|---|---|---|
| E01 | `export/resources/AndroidManifest.xml` | 13 | Manifest | The app requests `android.permission.INTERNET`. | The app has network access. | Strong |
| E02 | `export/resources/AndroidManifest.xml` | 26 | Manifest/config | The app sets `android:usesCleartextTraffic="true"`. | Cleartext traffic is permitted. | Strong |
| E03 | `export/resources/AndroidManifest.xml` | 30-36 | Manifest | `MainActivity` is the launcher activity. | Opening the app reaches the relevant activity. | Strong |
| E04 | `export/sources/com/example/mastg_test0019/MainActivity.java` | 31-38 | Network request | `MainActivity` obtains a WebView and calls `loadUrl`. | Main activity contains the network path. | Strong |
| E05 | `export/sources/com/example/mastg_test0019/MainActivity.java` | 38 | Endpoint | The WebView loads `http://www.example.com`. | The app uses cleartext HTTP. | Strong |
| E06 | `export/sources/com/example/mastg_test0019/MainActivity.java` | 32-36 | TLS validation | `onReceivedSslError` calls `sslErrorHandler.proceed()`. | Unsafe WebView TLS error handling is present. | Strong for code presence; medium for exploit path |
| E07 | `export/sources/com/example/mastg_test0019/MainActivity.java` | 39-43 | Hostname verification | A `HostnameVerifier` returns `true`. | Unsafe verifier pattern exists, but usage is not proven. | Weak |
| E08 | `export/resources/res/layout/activity_main.xml` | 53-62 | UI/data flow | The layout defines the WebView used by `MainActivity`. | Confirms the WebView component exists in the UI. | Strong |
| E09 | `export/resources/res/layout/activity_main.xml` | 30-36 | App function | UI text says `Testing Data Encryption on the Network`. | Supports that the screen relates to network encryption testing. | Medium |
| E10 | `export/resources/res/xml` | directory listing | Boundary | Only `backup_rules.xml` and `data_extraction_rules.xml` were found. | No network security config evidence was found. | Medium |

## System/Threat Model Alignment

The D attack path aligns with the Part A system/threat model as follows:

| Model item | D usage |
|---|---|
| AS1: Web content shown in app WebView | Primary protected asset: integrity and authenticity of rendered WebView content |
| AS2: Request/response data in transit | Secondary protected asset: confidentiality and integrity of HTTP traffic |
| AS3: User decision context | Downstream impact: modified content may mislead the user |
| TB1: User -> Android app process | Victim opens app and consumes rendered WebView content |
| TB2: App process -> network channel | WebView sends HTTP request outside the app process |
| TB3: Untrusted network path -> remote server | On-path attacker can observe or modify cleartext traffic |

## Screenshot Checklist

| Screenshot | Source | What to show | Required |
|---|---|---|---|
| `D01_manifest_network_permission_or_cleartext.png` | `AndroidManifest.xml:13, 26` | `INTERNET` permission and `usesCleartextTraffic="true"` | Required |
| `D02_launcher_activity_main_path.png` | `AndroidManifest.xml:30-36` | `MainActivity` with `MAIN` / `LAUNCHER` | Required |
| `D03_webview_layout_component.png` | `activity_main.xml:53-62` | `<WebView android:id="@+id/webview">` | Required |
| `D04_main_activity_webview_flow.png` | `MainActivity.java:31-38` | `findViewById`, `setWebViewClient`, and `loadUrl` | Required |
| `D05_insecure_http_endpoint.png` | `MainActivity.java:38` | `http://www.example.com` | Required |
| `D06_ssl_error_proceed.png` | `MainActivity.java:32-36` | `onReceivedSslError` and `sslErrorHandler.proceed()` | Required |
| `D07_hostname_verifier_boundary.png` | `MainActivity.java:39-43` | `HostnameVerifier` returning `true` | Optional |

Only D01-D07 are planned for screenshots. System/threat model alignment is handled as text rather than screenshot evidence.

## Attack Path Summary

The app permits cleartext traffic and loads `http://www.example.com` inside a WebView from `MainActivity`. A realistic on-path attacker could observe HTTP request/response data and may modify the response before it is rendered in the WebView. The attack requires the victim to open the app and trigger the WebView load while the attacker is positioned on the network path.

## Impact Summary

The primary supported impact is compromise of WebView content integrity and authenticity. The secondary supported impact is confidentiality exposure of HTTP request/response data in transit. The APK evidence does not directly prove exposure of credentials, tokens, personal data, authenticated API requests, or server-side effects.

## Boundary Notes

The current evidence is static only. Runtime proxy evidence has not been collected. The `HostnameVerifier` returning `true` should not be treated as a proven active network path unless later evidence shows it is attached to a real client. Claims must remain limited to insecure transport behavior and MITM relevance for the observed WebView HTTP path.

## Mitigation Notes

Recommended mitigations:
1. Replace `http://www.example.com` with HTTPS.
2. Remove `android:usesCleartextTraffic="true"` unless there is a documented and narrow development-only reason.
3. Add a restrictive Network Security Config that disallows cleartext traffic.
4. Do not call `sslErrorHandler.proceed()` in `onReceivedSslError`; cancel the request or fail safely.
5. Remove unused permissive `HostnameVerifier` code.
6. Use platform default certificate and hostname validation.
7. If WebView content is required, restrict loaded origins and avoid mixed or cleartext content.
