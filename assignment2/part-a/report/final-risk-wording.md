# Final Risk Wording - Part A

## Report Claim

The app permits cleartext traffic and directly loads `http://www.example.com` in a WebView. This creates an insecure transport path where an on-path attacker can read or modify HTTP traffic before it is rendered inside the app.

## Impact Wording

The strongest supported impact is WebView content integrity compromise. A same-Wi-Fi attacker, rogue hotspot, compromised router, or controlled MITM proxy could alter the HTTP response and cause the app to display attacker-controlled content. This can mislead users or support phishing-style content injection within the app UI.

The secondary supported impact is confidentiality and integrity loss for HTTP request/response data on that path.

## Limitation Wording

The static evidence does not show credentials, session tokens, personal data, or authenticated API traffic on this path. Therefore, the report should not claim credential theft, session hijacking, account takeover, or backend compromise. A runtime proxy PoC would strengthen the claim from static MITM risk to observed MITM behavior.

## Mitigation Wording

The root cause is the combination of cleartext transport permission and an HTTP WebView load. The direct fix is to enforce HTTPS, disable cleartext traffic, and fail closed on TLS errors. These changes remove the attacker's ability to silently read or modify WebView content in transit.

## Presentation-Safe One-Liner

Our Part A finding is not a broad Android bug hunt: it is the intended network transport issue. The app allows cleartext traffic and loads HTTP content in a WebView, which enables realistic MITM observation and content tampering.

