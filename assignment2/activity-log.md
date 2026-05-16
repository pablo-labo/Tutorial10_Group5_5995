# Assignment 2 Activity Log

## Purpose

This document is the source for the required `activity-log.pdf`.
It follows the Assignment 1 approach: a 5-person contribution matrix with short, specific, defensible entries.

It covers both parts of Assignment 2:

- Part A: provided APK analysis and recorded Part A presentation.
- Part B: in-the-wild bug bounty finding, evidence package, recorded presentation, and Q&A preparation.

## Team Members

- Rongbang Cheng
- Sienna Cai
- Letian Chen
- Yuzhi Shao
- Jingzhao Shi

## Writing Rule

Each entry is:

- short and specific;
- framed as `led` or `supported`;
- consistent with the Part A role split inherited from Assignment 1;
- consistent with the Part B disclosure-style workflow;
- focused on concrete deliverables rather than generic teamwork.

The matrix is written as:

- row author -> column teammate.

## One-Line Role Summary

- Rongbang Cheng: Led Part A claim control and report integration; led Part B mitigation, ethics, and closing wording.
- Sienna Cai: Led Part A system/threat modeling; led Part B target, scope, and safe-testing explanation.
- Letian Chen: Led Part A static evidence extraction; led Part B vulnerability and root-cause explanation.
- Yuzhi Shao: Led Part A attack-path and PoC reasoning; led Part B reproduction evidence and validation explanation.
- Jingzhao Shi: Led Part A mitigation and submission-quality checks; led Part B impact, severity, and novelty justification.

## Part A Contribution Summary

| Member | Primary Part A Contribution |
|---|---|
| Rongbang Cheng | Led the final Part A claim, kept the report focused on cleartext WebView transport, integrated teammate inputs, and prepared claim-control presentation wording. |
| Sienna Cai | Led the system and threat model, including protected assets, trust boundaries, attacker capability, and the network-focused model. |
| Letian Chen | Led APK decompilation evidence extraction, including manifest settings, launcher path, WebView flow, HTTP endpoint, and TLS/hostname-validation evidence. |
| Yuzhi Shao | Led attack-path and PoC reasoning, including static reproduction steps, realistic MITM preconditions, supported impact, and non-claim boundaries. |
| Jingzhao Shi | Led mitigation planning and submission-quality checks, including HTTPS enforcement, cleartext disabling, TLS fail-closed behavior, and verification checks. |

## Part B Contribution Summary

| Member | Primary Part B Contribution |
|---|---|
| Rongbang Cheng | Led mitigation, ethics, and closing material, including logging removal, diagnostic-pipeline redaction, token/session rotation, and safe-testing boundaries. |
| Sienna Cai | Led target, scope, and safe-testing framing for the in-the-wild finding, including legal boundary and program-oriented presentation wording. |
| Letian Chen | Led vulnerability and root-cause explanation for the Android logcat sensitive information disclosure finding. |
| Yuzhi Shao | Led reproduction evidence, including the authenticated-run log evidence and baseline-vs-cookie replay validation. |
| Jingzhao Shi | Led impact, severity, and novelty justification, including conservative P2/P3 framing and zero-day/public-disclosure reasoning. |

## Contribution Matrix

| Writer \ Subject | Rongbang Cheng | Sienna Cai | Letian Chen | Yuzhi Shao | Jingzhao Shi |
|---|---|---|---|---|---|
| Rongbang Cheng | Led Part A final claim control, report integration, and impact-boundary wording; led Part B mitigation, ethics, and closing material. | Used Sienna's model and scope framing to keep both presentations legally and technically bounded. | Integrated Letian's code and root-cause evidence into concise report and presentation wording. | Used Yuzhi's attack-path and replay-validation evidence to keep impact claims evidence-backed. | Used Jingzhao's mitigation and severity checks to keep final wording aligned with rubric expectations. |
| Sienna Cai | Kept the final Part A claim aligned with the system model and supported safe-testing language for Part B. | Led assets, trust boundaries, attacker capability, and network-flow modeling for Part A; led target/scope explanation for Part B. | Connected code-level evidence to app components, trust boundaries, and the affected data flow. | Mapped attacker capabilities into realistic Part A and Part B attack scenarios with clear preconditions. | Helped connect mitigation and severity statements to the assets and boundaries affected by each finding. |
| Letian Chen | Used Rongbang's selected claim to prioritize which decompiled evidence should support the Part A report and video. | Provided code locations needed for Part A system components and threat-boundary mapping. | Led Part A static analysis and evidence extraction; led Part B vulnerability and root-cause explanation. | Supplied line-level evidence, screenshots, logs, and request/response facts used in reproduction reasoning. | Identified concrete code/config and logging locations where mitigations and redaction controls should apply. |
| Yuzhi Shao | Helped keep Part A and Part B impact claims bounded to what the evidence supports. | Used the attacker model and scope constraints to structure realistic exploitation paths. | Relied on decompiled code, screenshots, log evidence, and PoC artifacts to make reproduction evidence-backed. | Led Part A attack-path writing; led Part B reproduction evidence and baseline-vs-cookie replay-validation explanation. | Checked that proposed fixes would block the demonstrated attack paths and reduce the proven risks. |
| Jingzhao Shi | Checked that final claim wording, report wording, and presentation narrative stayed submission-ready. | Used the model and scope framing to explain why the findings mattered within safe legal boundaries. | Used static evidence and log evidence to locate where fixes and redaction controls should apply. | Used the attack/reproduction paths to define verification checks and safe-testing limits. | Led Part A mitigation and submission-quality checks; led Part B impact, severity, and novelty justification. |

## Export Checklist

Before exporting this document into `activity-log.pdf`:

1. Confirm final member names match the submitted videos and report.
2. Confirm Part B role descriptions match the final recorded Part B presentation.
3. Keep the matrix readable; if needed, use landscape orientation.
4. Do not include raw secrets, private bug bounty data, or unredacted evidence.
5. Export the final file as `assignment2/activity-log.pdf`.
