# Part A Contribution Matrix Draft

This draft can be merged into the final `activity-log.pdf`. It uses the same five-role structure as Assignment 1.

## Team Members

- Rongbang Cheng
- Sienna Cai
- Letian Chen
- Yuzhi Shao
- Shi

## One-Line Role Summary

- Rongbang Cheng: Led Part A vulnerability claim control, report narrative integration, impact boundary wording, and presentation claim alignment.
- Sienna Cai: Led Part A system/threat model, including assets, trust boundaries, attacker model, and attack-to-asset mapping.
- Letian Chen: Led APK decompilation evidence extraction, including manifest settings, WebView path, HTTP endpoint, and TLS/hostname validation evidence.
- Yuzhi Shao: Led attack path and PoC reasoning, including static reproduction steps, preconditions, supported impact, and non-claims.
- Shi: Led mitigation planning and submission quality checks, including concrete fix steps, verification plan, and presentation compliance checklist.

## Contribution Matrix

| Writer \ Subject | Rongbang Cheng | Sienna Cai | Letian Chen | Yuzhi Shao | Shi |
|---|---|---|---|---|---|
| Rongbang Cheng | Led the final Part A claim, kept the report focused on the intended network-transport weakness, and integrated teammate inputs into a consistent narrative. | Built the system and threat model that linked the WebView HTTP path to trust boundaries, protected assets, and a realistic on-path attacker. | Produced the static evidence anchors for the manifest, WebView flow, HTTP endpoint, SSL-error handling, and hostname-verifier boundary. | Developed the attack path and PoC reasoning that converted the static evidence into realistic MITM impact and clear non-claims. | Designed the concrete mitigation plan and checked that the fix, verification, and presentation wording addressed the root cause. |
| Sienna Cai | Kept the final vulnerability statement aligned with the system model and avoided unrelated Android vulnerability classes. | Led the model of assets, trust boundaries, attacker capability, and cleartext WebView data flow. | Supplied code/config evidence needed to make the model concrete rather than abstract. | Mapped the modeled attacker to step-by-step exploitation and supported impact reasoning. | Connected mitigation steps to the assets and trust boundaries affected by the attack. |
| Letian Chen | Used the selected claim to prioritize which decompiled evidence should support the report and video. | Provided code locations needed for system components and trust-boundary mapping. | Led the decompilation and static evidence extraction for Part A. | Supplied line-level evidence used in the PoC and reproduction notes. | Identified concrete code/config locations where mitigation should be applied. |
| Yuzhi Shao | Helped keep the final impact claim bounded to what the static evidence supports. | Used the attacker model and asset mapping to structure the exploitation path. | Relied on the decompiled code and screenshots to make the PoC reproducible and evidence-backed. | Led attack-path writing, static PoC reasoning, preconditions, limitations, and supported/non-supported impact. | Checked that proposed fixes would block the demonstrated attack path. |
| Shi | Checked that the final claim, report wording, and presentation narrative stayed submission-ready. | Used the model to explain why the fix protects AS1, AS2, and AS3. | Used the static evidence to locate the manifest, WebView URL, and SSL error handling changes required by the fix. | Used the attack path to define verification checks that would prove exploitation is blocked. | Led mitigation design, verification plan, and Part A submission/presentation compliance checks. |

