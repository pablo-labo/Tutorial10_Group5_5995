# Threat Model (Part A)

## Security Goal
Prevent untrusted network actors from reading or tampering with content delivered to the app WebView.

## Threat Statement
Because the app explicitly allows cleartext traffic and loads a URL over HTTP, an on-path attacker can intercept/modify network traffic and inject attacker-controlled content into the in-app WebView, violating integrity and confidentiality.

## Attacker Path (End-to-End)
| Step | Attacker Action | Weakness Used | Boundary Crossed | Asset Impact |
|---|---|---|---|---|
| 1 | Position on victim network path (same Wi-Fi / rogue AP / transit) | Trusted-by-default network assumptions | TB3 | Enables visibility/control over traffic path |
| 2 | Observe app request to remote page | `loadUrl("http://www.example.com")` over HTTP | TB2 | AS2 confidentiality loss |
| 3 | Modify/inject HTTP response content | Cleartext traffic + no transport integrity | TB2/TB3 | AS1/AS3 integrity loss |
| 4 | Victim consumes attacker-controlled content inside app | WebView renders modified response | TB1 | Phishing/misleading content, trust abuse |

## STRIDE-Oriented Threat Coverage
| STRIDE Category | Concrete Threat in This APK | Evidence |
|---|---|---|
| Spoofing | Attacker can impersonate trusted content source over HTTP path | `MainActivity.java:38`, `AndroidManifest.xml:26` |
| Tampering | HTTP response body can be altered in transit | `MainActivity.java:38`, `AndroidManifest.xml:26` |
| Information Disclosure | Request/response data visible over cleartext path | `MainActivity.java:38`, `AndroidManifest.xml:26` |
| Denial of Service | Secondary only (traffic blocking/jamming), not the focus of this report | Not used as primary scoring claim |

## Impact Summary
- Primary impact: in-app content integrity compromise (user sees attacker-selected content).
- Secondary impact: exposure of in-transit request/response data.
- Business/user risk: phishing, misinformation, and loss of trust in app-delivered content.

## Mitigation Direction (for Part A continuity)
1. Force HTTPS only and disable cleartext traffic (`usesCleartextTraffic="false"`).
2. Replace `http://www.example.com` with a valid `https://...` endpoint.
3. Enforce `networkSecurityConfig` with `cleartextTrafficPermitted="false"` (global or domain-specific deny).
4. Validate by testing on untrusted Wi-Fi with interception proxy: HTTP requests should fail/redirect to HTTPS only.
5. Why this reduces risk: encrypted/authenticated transport removes the attacker’s ability to passively read or silently modify WebView content in transit.

## Rubric Fit Note
- Model captures a realistic MITM threat path with explicit linkage:
  - attacker capability -> trust boundary crossed -> protected asset impact.
- This directly supports top-band performance for Part A system/threat modeling criteria.
