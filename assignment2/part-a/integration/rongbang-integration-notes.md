# Rongbang Integration Notes - Assignment 2 Part A

## Branch Snapshots Reviewed

| Snapshot | Remote branch | Useful material |
|---|---|---|
| `branch-snapshots/assignment2-A-decompile` | `origin/assignment2-A-decompile` | Decompiled manifest and `MainActivity` code evidence. |
| `branch-snapshots/system-model-threat-model` | `origin/system-model-threat-model` | System model, threat model, attacker assumptions. |
| `branch-snapshots/PoCs-and-Evidence` | `origin/PoCs-and-Evidence` | Evidence screenshots, attack steps, reproduction notes. |

## Inputs Accepted

- From C/decompile: manifest and `MainActivity` evidence is strong and should be cited directly.
- From B/system model: on-path attacker, assets AS1-AS3, and trust boundaries are report-ready.
- From D/PoC: attack path is defensible as static PoC evidence; runtime MITM should be described as optional unless collected.

## Final Integrated Position

Use one primary vulnerability, not multiple findings:

> Cleartext traffic is enabled and an HTTP URL is loaded in a WebView, creating MITM risk for WebView content integrity and HTTP transport confidentiality.

Use `sslErrorHandler.proceed()` as secondary supporting evidence, not the primary root cause. Use the permissive `HostnameVerifier` only as weak supporting context because the current code does not show it being attached to the WebView request path.

## Report Assembly Checklist

- [ ] Keep report within 2 pages and official USENIX format.
- [ ] Include a simple system/threat model figure.
- [ ] Cite manifest cleartext setting and WebView HTTP load as the two primary evidence points.
- [ ] Explain on-path attacker capability and protected asset impact.
- [ ] Include limitations to avoid overclaiming.
- [ ] Include concrete mitigations tied to root cause.
- [ ] Ensure each member speaks at least 40 seconds in `parta-presentation.mp4`.

