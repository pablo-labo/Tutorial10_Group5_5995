# Activity Log Matrix

## Purpose
This file is the source draft for the required `activity-log.pdf`.
It follows the assignment requirement for an `N x N` contribution matrix for a 5-person team.

## Team Members
- Rongbang Cheng
- Sienna
- Chen Letian
- Frank
- Shi

## Writing Rule
Each entry is:
- short
- specific
- defensible
- consistent with the actual project workflow in `timeline.md`

The matrix is written as:
- row author -> column teammate

## Contribution Matrix

| Writer \ Subject | Rongbang Cheng | Sienna | Chen Letian | Frank | Shi |
|---|---|---|---|---|---|
| Rongbang Cheng | Led vulnerability scoping, selected the final randomness/crypto issue, and integrated the report narrative and final claim boundary. | Built the system and threat model, including attacker assumptions, protected assets, trust boundaries, and bounded risk framing. | Produced the static-analysis evidence pack, including code anchors, search traces, and screenshots for the selected `sessionToken` path. | Developed the bounded attack path, PoC notes, reproduction logic, and tutorial answers explaining why the vulnerability is exploitable under stated assumptions. | Designed the mitigation plan and compliance checks, and helped connect the fix wording back to the final report and submission requirements. |
| Sienna | Narrowed the project to one in-scope vulnerability and kept the final argument aligned with the rubric and report structure. | Led the system model, threat model, attacker capability assumptions, and risk-path explanation for the selected issue. | Supplied the code-level structure and evidence that let the model stay tied to real app behavior rather than generic assumptions. | Converted the attacker model into a realistic exploitation scenario with explicit preconditions and limitation wording. | Evaluated whether the proposed mitigation would address the main attack path and remained consistent with the bounded impact claim. |
| Chen Letian | Chose the final core vulnerability from the candidate findings and unified the report around the strongest evidence-backed issue. | Used the app structure and data-flow evidence to produce a clear and defendable system/threat model. | Led APK static analysis, identified the relevant classes and methods, and prepared the main screenshots and evidence chain for the final finding. | Used the method-level evidence and token/session traces to build the attack steps, PoC notes, and reproduction explanation. | Used the code evidence and likely fix locations to make the mitigation plan concrete and tied to the real weakness. |
| Frank | Kept the final vulnerability claim focused on the rubric's randomness/crypto scope and integrated attack reasoning into the overall narrative. | Defined the attacker model and realistic constraints that kept the PoC bounded and tutorial-defensible. | Provided the decompiled logic, token/session traces, and screenshots needed to support the exploitation path and bounded reproduction argument. | Led the exploitation analysis, wrote the PoC and reproduction notes, and documented attack conditions, limits, and expected impact carefully. | Reviewed whether the mitigation would materially raise attack difficulty and reduce predictability in the demonstrated scenario. |
| Shi | Kept the final vulnerability statement, report wording, and mitigation explanation consistent with submission-facing requirements. | Explained how the attacker model and protected asset reasoning shaped what the fix needed to address. | Supplied the exact code anchors and likely repair locations that made the mitigation proposal concrete rather than generic. | Showed how the selected vulnerability could be used in practice and helped assess whether the proposed fix would block the demonstrated path. | Led mitigation design, submission-compliance planning, and final checks for required deliverables, formatting, timing, and presentation constraints. |

## One-Line Role Summary
- Rongbang Cheng: Led vulnerability scoping, final claim control, and report integration.
- Sienna: Led the system/threat model and attacker-assumption work.
- Chen Letian: Led APK static analysis and evidence extraction.
- Frank: Led attack-path design, PoC notes, and reproduction reasoning.
- Shi: Led mitigation planning and submission-compliance preparation.

## Use Notes
Before converting this to PDF:
1. Keep the matrix format visible.
2. Keep member names consistent with the final submission package.
3. Do not expand entries into long paragraphs.
4. If the team wants to personalize wording slightly, preserve the same responsibility boundaries so entries remain consistent.
