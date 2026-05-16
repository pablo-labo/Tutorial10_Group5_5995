# Rongbang Cheng - Part A Presentation Segment

Target speaking time: 45-55 seconds.

## Script

Hi, I am Rongbang Cheng. My role for Part A was to control the final vulnerability claim and keep the report aligned with the rubric. We focused on the intended network transport issue rather than unrelated Android bugs.

The final claim is that `a2_case1.apk` permits cleartext traffic and loads an HTTP URL inside a WebView. In the manifest, the app requests internet access and sets `usesCleartextTraffic` to true. In `MainActivity`, the WebView is initialized and then calls `loadUrl` with `http://www.example.com`.

The security problem is that this traffic crosses an untrusted network without encryption or authenticated transport. A realistic on-path attacker, for example someone on the same Wi-Fi network or a rogue hotspot, could read the HTTP request and response, or modify the response before the WebView renders it.

We are careful about the impact claim: the strongest supported impact is WebView content injection or modification, plus exposure of HTTP traffic. We do not claim account takeover or credential theft because the evidence does not show credentials or session tokens on this path. The fix is to enforce HTTPS, disable cleartext traffic, and fail closed on TLS errors.

## Handoff

Suggested next speaker: Sienna, for the system and threat model.

