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
- written as one compact sentence
- framed as `led` or `supported`, rather than claiming everyone did everything

The matrix is written as:
- row author -> column teammate

## Contribution Matrix

| Writer \ Subject | Rongbang Cheng | Sienna | Chen Letian | Frank | Shi |
|---|---|---|---|---|---|
| Rongbang Cheng | Led vulnerability scoping, selected the final randomness/crypto issue, and integrated the final report argument. | Built the system and threat model, including assets, attacker assumptions, and bounded risk paths for the chosen issue. | Produced the decompilation evidence pack, including code locations, search traces, and screenshots for the `sessionToken` path. | Developed the attack path, PoC explanation, and reproduction logic used in the report and tutorial preparation. | Designed the mitigation plan and checked that the final submission package stayed aligned with rubric requirements. |
| Sienna | Narrowed the analysis to one in-scope randomness/crypto vulnerability and kept the final argument aligned with the rubric. | Led the system model and threat model, defining assets, attacker capabilities, trust boundaries, and realistic attack goals. | Mapped the model to code-level evidence by locating the token, session, and randomness-related classes and methods. | Translated the attacker model into a concrete exploitation scenario with explicit preconditions and limitation wording. | Evaluated whether the proposed mitigation would block the main attack path and stay consistent with the bounded claim. |
| Chen Letian | Selected the final core vulnerability from the candidate findings and unified the report narrative around it. | Used the app structure and data-flow evidence to produce a clear and defensible system/threat model. | Led APK static analysis, extracted the relevant classes and methods, and prepared screenshots and evidence for the final report. | Used the method-level evidence and session traces to build the attack steps, PoC notes, and reproduction explanation. | Mapped the mitigation to likely code locations and kept the proposed fix tied to the demonstrated weakness. |
| Frank | Kept the final vulnerability claim focused on the rubric's randomness/crypto scope and integrated the attack reasoning into the narrative. | Defined the attacker assumptions and model constraints that kept the PoC realistic and tutorial-defensible. | Provided the decompiled logic, token/session traces, and screenshots needed to support the attack path and bounded reproduction argument. | Led exploitation analysis, wrote the PoC and reproduction notes, and documented attack conditions, limits, and expected outcomes. | Reviewed whether the mitigation would materially reduce predictability risk in the demonstrated scenario. |
| Shi | Kept the final vulnerability statement, report wording, and mitigation explanation consistent with submission-facing requirements. | Explained how the attacker model and protected assets shaped what the fix needed to address. | Supplied the exact code anchors and likely fix locations that made the mitigation proposal concrete rather than generic. | Showed how the selected vulnerability could be used in practice and helped assess whether the proposed fix would raise attack difficulty. | Led mitigation design, submission compliance checks, and final verification of required files, timing, and presentation constraints. |

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
3. Keep entries to one compact sentence each.
4. Preserve the main role split across all rows so the matrix stays internally consistent.
5. Check that the final PDF remains readable on one page if possible; if not, keep the table clear rather than shrinking it too aggressively.
