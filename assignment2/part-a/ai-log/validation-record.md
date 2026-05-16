# Part A Validation Record

## Rubric Alignment

| Rubric Item | Validation |
|---|---|
| System & threat model | Sienna's model includes app process, WebView, HTTP channel, remote server, realistic on-path attacker, trust boundaries, and protected assets. |
| Vulnerability discovery and impact | Static code/config evidence supports the intended Part A class: insecure network transport/configuration enabling MITM. |
| Mitigation | Shi's mitigation plan addresses root cause: enforce HTTPS, disable cleartext, fail closed on TLS errors, and verify with static/dynamic checks. |

## Accepted Claims

- The app permits cleartext traffic.
- The app loads `http://www.example.com` in WebView.
- An on-path attacker can observe or modify HTTP request/response traffic.
- The primary supported impact is WebView content integrity compromise.
- Secondary supported impact is HTTP request/response confidentiality and integrity loss.
- `sslErrorHandler.proceed()` is supporting evidence of unsafe TLS failure handling.

## Rejected or Narrowed Claims

- Credential theft: rejected because no credential or token path is evidenced.
- Session theft: rejected because no session token is shown in the HTTP WebView path.
- Account takeover: rejected because no authentication or account state change is evidenced.
- Backend compromise: rejected because the attack path is network transport tampering, not server compromise.
- HostnameVerifier as primary exploit path: narrowed because the decompiled code does not show it being attached to a network client.
- Live MITM success: not claimed because no runtime proxy proof has been collected in the current evidence set.

## Final Safe Claim

The APK permits cleartext traffic and loads an HTTP URL in a WebView, enabling a realistic on-path attacker to read or modify WebView HTTP traffic before it is rendered inside the app.

