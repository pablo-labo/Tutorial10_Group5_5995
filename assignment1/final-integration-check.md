# Final Integration Check

## Purpose
This file is the cross-member integration check for the current project state.
It maps A/B/C/D/E outputs to the Assignment 1 spec, rubric, and `timeline.md`, and separates:
- what is already integrated
- what is partially integrated
- what is still missing before final submission

It is not the final submission checklist yet.
It is the team-level status view used before the final packaging stage.

## Integration Baseline
Selected vulnerability:
- predictable generation of authentication-related `sessionToken` using `java.util.Random` in `Login.generateSessionToken()`

Required team boundary:
- keep the claim inside `randomness/cryptography`
- keep impact bounded
- do not claim guaranteed auth bypass, session hijack, or remote takeover without new evidence

## A/B/C/D/E Status by Workstream

### A. Vulnerability claim and report control
Status: INTEGRATED

Ready outputs:
- `report_outline/claim-sheet.md`
- `report_outline/report-outline.md`
- `report_outline/final-risk-wording.md`
- `report_outline/usenix.tex`

Integrated correctly:
- single selected vulnerability is stable
- wording boundary is explicit
- E's primary fix (`Random` -> `SecureRandom`) is absorbed into A wording
- mitigation is framed as primary fix plus bounded strengthening measures

Remaining for final stage:
- compile and trim final `report.pdf` to `2 pages max`
- ensure final citations use real repository paths / code anchors consistently
- ensure final prose stays within the same bounded impact wording used in slides and Q&A

### B. System and threat model
Status: MOSTLY INTEGRATED

Ready outputs:
- `threat-model/models-core-results/system-model.md`
- `threat-model/models-core-results/threat-model.md`
- `threat-model/models-core-results/attacker-assumption.md`
- `threat-model/for-report/attack-scenario.md`
- `threat-model/for-report/qa-notes.md`
- `threat-model/for-report/evidence-citation-map.md`

Integrated correctly:
- protected asset is clear (`sessionToken` unpredictability / auth-state integrity)
- attacker model is realistic and bounded
- threat is linked to the chosen token-generation path rather than generic random usage

Remaining for final stage:
- make sure the final report uses one compact attack-scenario paragraph rather than leaving key logic only in B-side notes
- make sure diagram(s) included in report/slides match the final wording and do not overstate attacker capability

### C. Static analysis and evidence package
Status: INTEGRATED

Ready outputs:
- decompiled code in `apk-decompile_code/`
- screenshots in `evidence/`

Integrated correctly:
- evidence covers manifest, login success path, token storage, token accessor, weak generation, logout clearing, and non-selected UI random usage
- code anchors consistently support the chosen vulnerability

Remaining for final stage:
- choose the minimum screenshot set needed for the report body
- keep the rest for presentation/Q&A backup
- verify line references remain consistent across all final materials

### D. Attack path and PoC
Status: MOSTLY INTEGRATED

Ready outputs:
- `pocs/poc-notes.md`
- `pocs/attack-steps.md`
- `pocs/tutorial-qa.md`
- `pocs/reproduction-notes.md`
- `pocs/README.md`

Integrated correctly:
- attack path stays bounded
- PoC claim matches B's attacker assumptions
- limitations are stated honestly

Remaining for final stage:
- decide what concrete artifact goes into `pocs/` as the final demonstrator material
- ensure `pocs/README.md` matches the exact files finally submitted
- keep tutorial answers synchronized with A's final wording

### E. Fix / mitigation and compliance preparation
Status: PARTIALLY INTEGRATED

Ready outputs:
- `E_fix plan/fix-plan.md`
- `E_fix plan/submission-checklist.md`
- `E_fix plan/presentation-compliance-checklist.md`

Integrated correctly:
- primary fix is correctly centered on `SecureRandom`
- mitigation boundary is compatible with A and D

Not yet complete:
- current compliance files are framework-level, not final enforcement-level
- submission/compliance checks do not yet fully cover final required deliverables
- presentation constraints are not yet tracked as a full final-stage checklist

Remaining for final stage:
- convert E's current checklists into a true final submission gate
- check required deliverables explicitly: `report.pdf`, `ai-log/`, `pocs/`, `presentation.mp4`, `activity-log.pdf`
- check report format rules explicitly: official USENIX template and `2 pages max`
- check presentation rules explicitly: `<= 5 minutes`, each member `>= 40 seconds`
- check `activity-log.pdf` uses the required `N x N` contribution matrix

## Spec and Rubric Mapping

### 1. System and Threat Model
Current status: MOSTLY READY

Covered now:
- app purpose summary
- main components and data flow
- protected asset
- attacker model
- trust-boundary reasoning

Still needed before final submission:
- one compact final report paragraph that cleanly links model to the bounded attack scenario

### 2. Vulnerability Discovery and Explanation
Current status: READY

Covered now:
- exact class and method location
- security role of the value
- why `Random` is unsuitable
- why `MainActivity.randomNumberGenerator()` was not selected
- bounded attack narrative

Main condition:
- keep all final impact wording bounded and evidence-backed

### 3. Fix / Mitigation
Current status: READY IN CONTENT, NOT YET FINALIZED IN DELIVERY

Covered now:
- primary fix location
- primary repair choice
- stronger lifecycle guidance
- bounded explanation of why the fix works

Still needed before final submission:
- one polished final paragraph or slide-ready explanation that distinguishes:
  - direct fix for proven weakness
  - optional strengthening improvements

### 4. Recorded Presentation and Q&A
Current status: CONTENT MOSTLY READY, DELIVERY READINESS NOT YET VERIFIED

Covered now:
- reusable tutorial answers
- bounded attack explanation
- final-risk wording

Still needed before final submission:
- final speaking allocation
- time check against rubric limits
- consistent slide wording across all speakers

### 5. Required Submission Package
Current status: NOT YET READY

Not evidenced in current repository as final deliverables:
- `report.pdf`
- `ai-log/`
- `presentation.mp4`
- `activity-log.pdf`

Partially evidenced:
- `pocs/` exists, but final submission content still needs to be frozen

## Cross-Team Consistency Check
The following items are currently consistent across A/B/C/D/E:
- selected issue is `sessionToken` weak randomness, not plaintext credentials or generic input validation
- attacker model is bounded local analysis
- impact claim is bounded
- primary fix is `Random` -> `SecureRandom`

The following items still require one final coordinated pass:
- exact file/line citation formatting in the final report
- final wording for mitigation vs. broader session-enforcement improvements
- the exact artifact list to be included in `pocs/`
- final presentation script timing and member allocation

## Immediate Next Actions
1. Freeze the final one-sentence claim, limitation sentence, and one-line fix wording from A as the team-wide source of truth.
2. Select the exact screenshot set and code anchors C will carry into the report and slides.
3. Freeze D's final PoC artifact set and make `pocs/README.md` match it exactly.
4. Upgrade E's draft compliance checklists into final-stage submission and presentation gates.
5. Produce the actual final deliverables that do not yet exist in the repository: `report.pdf`, `ai-log/`, `presentation.mp4`, and `activity-log.pdf`.

## Bottom-Line Status
The analytical core of the project is already assembled.
The main remaining risk is no longer vulnerability selection; it is final integration and submission control.

If the team stopped now, the likely failure mode would not be "wrong vulnerability."
It would be incomplete final deliverables, inconsistent final wording, or preventable presentation/compliance penalties.
