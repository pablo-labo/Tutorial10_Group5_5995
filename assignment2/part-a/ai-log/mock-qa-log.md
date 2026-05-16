# Part A Mock Q&A Log

## Q1. What is the single primary vulnerability?

The single primary vulnerability is insecure network transport: the APK permits cleartext traffic and loads an HTTP URL in a WebView.

## Q2. What exact evidence proves this?

`AndroidManifest.xml` declares `INTERNET` permission and sets `android:usesCleartextTraffic="true"`. `MainActivity.java` initializes a WebView and calls `webView.loadUrl("http://www.example.com")`.

## Q3. Why is this a MITM-relevant vulnerability?

HTTP does not provide encryption, response integrity, or server authentication. Once the request crosses an untrusted network, an on-path attacker can read or modify the request/response before WebView renders it.

## Q4. What can the attacker actually do?

The supported impact is observing HTTP traffic and modifying WebView content. This can enable content injection, misleading content, or phishing-style user deception inside the app UI.

## Q5. What should we not claim?

We should not claim credential theft, session hijacking, account takeover, backend compromise, or live runtime MITM success unless additional runtime evidence is collected.

## Q6. How should SSL-error handling be discussed?

`sslErrorHandler.proceed()` is unsafe and should be shown as supporting transport-validation evidence. The primary root cause remains cleartext traffic plus the HTTP WebView load.

## Q7. How should the always-true HostnameVerifier be discussed?

It should be treated as suspicious weak supporting evidence only. The current decompiled code shows it is created, but does not show it being attached to a concrete HTTPS client or the WebView request path.

## Q8. What is the mitigation?

Use HTTPS, set `usesCleartextTraffic="false"`, add restrictive Network Security Config, cancel on SSL errors, avoid permissive HostnameVerifier logic, and verify no HTTP request or TLS-error proceed path remains.

## Improvements Made After Mock Q&A

- Narrowed the claim to one primary vulnerability.
- Added explicit non-claims to prevent overstatement.
- Separated primary evidence from supporting evidence.
- Mapped attacker capability to assets and trust boundaries.

