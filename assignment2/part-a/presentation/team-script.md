# Part A Team Presentation Script

Target total time: 4:15-4:45. Each member should speak at least 40 seconds.

## Rongbang Cheng - Claim and Report Control

Target: 45-55 seconds.

Hi, I am Rongbang Cheng. My role for Part A was to control the final vulnerability claim and keep the report aligned with the rubric. We focused on the intended network transport issue rather than unrelated Android bugs.

The final claim is that `a2_case1.apk` permits cleartext traffic and loads an HTTP URL inside a WebView. In the manifest, the app requests internet access and sets `usesCleartextTraffic` to true. In `MainActivity`, the WebView is initialized and then calls `loadUrl` with `http://www.example.com`.

The security problem is that this traffic crosses an untrusted network without encryption or authenticated transport. A realistic on-path attacker, for example someone on the same Wi-Fi network or a rogue hotspot, could read the HTTP request and response, or modify the response before the WebView renders it.

We are careful about the impact claim: the strongest supported impact is WebView content injection or modification, plus exposure of HTTP traffic. We do not claim account takeover or credential theft because the evidence does not show credentials or session tokens on this path.

## Sienna Cai - System and Threat Model

Target: 45-55 seconds.

My part is the system and threat model. The relevant app flow is simple: the user starts `MainActivity`, the app initializes a WebView and WebViewClient, and the WebView sends a network request to a remote server over an HTTP cleartext channel.

There are three important trust boundaries. TB1 is from the user into the Android app process. TB2 is where the app process sends traffic into the untrusted network. TB3 is the network path between the device and the remote server. The vulnerability matters mainly at TB2 and TB3, because HTTP does not protect confidentiality or integrity once traffic leaves the app.

The protected assets are WebView content authenticity and integrity, the confidentiality and integrity of request and response data in transit, and the user's decision context. Our attacker is a realistic on-path attacker, such as someone on the same Wi-Fi, a rogue access point, or a compromised router. This attacker does not need root access to the phone or control of the backend server.

## Letian Chen - Static Evidence

Target: 45-55 seconds.

My part is static analysis and evidence extraction. After decompiling the APK, the first key evidence is in `AndroidManifest.xml`: the app declares the `INTERNET` permission and sets `android:usesCleartextTraffic="true"` at the application level. This means Android is configured to permit cleartext network traffic for this app.

The second key evidence is in `MainActivity.java`. The launcher activity obtains the WebView from the layout, attaches a WebViewClient, and then calls `webView.loadUrl("http://www.example.com")`. This is the direct network path: the app is not only configured to allow cleartext, it actually loads an HTTP URL in the WebView.

There is also supporting insecure TLS-handling evidence. The WebViewClient overrides `onReceivedSslError` and calls `sslErrorHandler.proceed()`, which means certificate errors would not stop the load. The class also contains a HostnameVerifier that always returns true, but since the decompiled code does not show it being attached to a client, we treat it as supporting context rather than the primary exploit path.

## Yuzhi Shao - Attack Path and PoC Reasoning

Target: 45-55 seconds.

My part is the attack path and PoC reasoning. The attack requires normal app use and a realistic on-path network position. The victim opens the app, `MainActivity` runs, and the WebView loads `http://www.example.com`.

Because the request is HTTP, an on-path attacker can observe the request and response in plaintext. The attacker may also modify the response body or headers before the content reaches the app. The WebView then renders that modified content inside the application, so the user sees attacker-controlled content in a trusted app context.

The static PoC proves the vulnerable path by connecting the manifest setting, the launcher activity, the WebView component, and the HTTP `loadUrl` call. A runtime proxy test could further demonstrate response modification, but we do not need to overclaim it. Our supported impact is WebView content integrity compromise and HTTP traffic exposure. We do not claim session theft, credential theft, account takeover, or backend compromise.

## Shi - Mitigation and Verification

Target: 45-55 seconds.

My part is the mitigation plan. The root cause is the cleartext transport path and unsafe WebView transport handling, so the fix should remove that path rather than only adding generic advice.

First, replace the HTTP URL with a valid HTTPS endpoint. Second, set `android:usesCleartextTraffic="false"` and add a restrictive Network Security Config that denies cleartext traffic by default. Third, remove `sslErrorHandler.proceed()` and use fail-closed behavior, such as cancelling the load when TLS validation fails. If WebView navigation is required, restrict it to trusted HTTPS origins.

The verification plan has both static and dynamic checks. Statically, there should be no `usesCleartextTraffic="true"`, no `loadUrl("http://...")`, and no SSL-error proceed call. Dynamically, under an on-path proxy test, HTTP content injection should fail and invalid certificate scenarios should be blocked instead of rendered. These changes protect the in-transit data and prevent users from seeing attacker-modified WebView content.

