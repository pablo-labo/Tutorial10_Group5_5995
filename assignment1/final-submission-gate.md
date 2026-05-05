# Final Submission Gate

## Purpose
This file is the final compliance gate for Assignment 1.
It converts the current project state into a submission-facing checklist aligned with the spec, rubric, and explicit penalty rules.

Use this file immediately before final packaging.

## Current Status Snapshot

### Already present in repository
- `ai-log/`
- `pocs/`
- report source materials in `report_outline/`
- activity-log source in `activity-log-matrix.md`
- presentation source plan in `presentation-plan.md`

### Not yet present as final deliverables
- `report.pdf`
- `presentation.mp4`
- `activity-log.pdf`

### Partially ready
- `pocs/` exists, but the exact final artifact set still needs to be frozen at packaging time
- `report_outline/usenix.tex` exists, but final compilation is currently blocked by missing LaTeX/template environment

## Gate 1. Required Submission Items
Missing any of these causes the major submission penalty.

### Must exist before submission
- [ ] `report.pdf`
- [x] `ai-log/`
- [x] `pocs/`
- [ ] `presentation.mp4`
- [ ] `activity-log.pdf`

### Current blocker notes
- `report.pdf`: not yet generated
- `presentation.mp4`: not yet generated
- `activity-log.pdf`: source exists as `activity-log-matrix.md`, but PDF not yet generated

## Gate 2. Report Compliance

### Must satisfy
- [ ] uses official USENIX conference paper template
- [ ] final output is `2 pages max`
- [ ] covers brief app intro
- [ ] covers system/threat model
- [ ] covers tooling and AI use
- [ ] covers vulnerability details with code location, risk, and attack path
- [ ] covers fix / mitigation and why it works

### Current status
- content structure: mostly ready
- final PDF compliance: not yet verified
- compile environment: currently blocked because `pdflatex` is unavailable and template dependency needs to be available in the final LaTeX environment

### Final pre-submit report checks
- [ ] title and abstract still match the selected issue only
- [ ] impact wording remains bounded
- [ ] no sentence claims guaranteed auth bypass, hijack, or remote takeover
- [ ] figure count stays minimal enough for `2 pages max`
- [ ] final citations and code anchors are internally consistent

## Gate 3. AI Log Compliance

### Must satisfy
- [x] AI usage documented as a separate submission component
- [x] representative workflow and prompt-response summaries included
- [x] validation of AI-assisted outputs recorded
- [x] rubric-driven mock Q&A summary included

### Final pre-submit AI-log checks
- [ ] confirm folder contents match what the team actually wants to submit
- [ ] remove any accidental placeholder or contradictory file before packaging

## Gate 4. PoC Package Compliance

### Must satisfy
- [x] `pocs/` folder exists
- [x] `README.md` exists
- [x] bounded PoC notes and attack steps exist
- [x] tutorial defense material exists

### Final pre-submit PoC checks
- [ ] `pocs/README.md` exactly matches the final file set
- [ ] no unsupported exploit script or fake artifact is added
- [ ] all PoC wording remains aligned with the bounded claim
- [ ] if no actual media artifact is included, ensure the README does not promise one

## Gate 5. Presentation Compliance

### Must satisfy
- [ ] final file exists as `presentation.mp4`
- [ ] total length is `<= 5 minutes`
- [ ] each member speaks for `>= 40 seconds`
- [ ] presentation wording stays aligned with the bounded written claim

### Current status
- presentation structure and timing plan: ready in `presentation-plan.md`
- final recording: not yet done

### Final pre-recording / pre-submit checks
- [ ] use the agreed 5-speaker sequence
- [ ] keep the default evidence pack aligned with `evidence-poc-freeze-list.md`
- [ ] measure actual individual speaking times, not planned times only
- [ ] measure actual final video duration, not script estimate only
- [ ] ensure no slide or speaker introduces broader exploit claims than the report

## Gate 6. Activity Log Compliance

### Must satisfy
- [ ] final file exists as `activity-log.pdf`
- [ ] uses a 5 x 5 contribution matrix
- [ ] entries are short and consistent
- [ ] entries roughly align with real roles and collaboration

### Current status
- matrix content source: ready in `activity-log-matrix.md`
- final PDF: not yet generated

### Final pre-submit checks
- [ ] matrix formatting remains visible after PDF conversion
- [ ] member names match final submission names
- [ ] entries remain consistent across rows and do not overclaim equal contribution to everything

## Gate 7. Consistency Across All Deliverables

### The following must match everywhere
- [ ] selected issue is the `sessionToken` weak-randomness path
- [ ] attacker model is bounded local analysis
- [ ] impact is bounded predictability risk
- [ ] primary fix is `Random` -> `SecureRandom`

### The following must not appear anywhere
- [ ] guaranteed auth bypass claim
- [ ] guaranteed session hijack claim
- [ ] remote takeover claim
- [ ] generic statement that any use of `Random` is automatically a vulnerability

## Gate 8. Evidence Control

### Current recommended final set
- report body: `D01`
- presentation default set: `D01`, `D02`, `D04`, `D05`, `D07`
- Q&A backup only: `D06`, `D08`, `D09`, `D10`, `D11`

### Final checks
- [ ] report uses only the minimum necessary figure(s)
- [ ] presentation uses the frozen evidence subset
- [ ] backup screenshots are kept available for Q&A but not overloaded into the main story

## Final Hard Blockers
These are the items that currently still block a compliant submission:

1. `report.pdf` has not been generated.
2. `presentation.mp4` has not been recorded/exported.
3. `activity-log.pdf` has not been generated.
4. report compilation/compliance has not yet been verified in a working USENIX LaTeX environment.

## Final Recommendation
Do not spend more time expanding analysis.
The remaining work should be execution and packaging:

1. generate `report.pdf`
2. convert `activity-log-matrix.md` into `activity-log.pdf`
3. create slides from `presentation-plan.md`
4. record `presentation.mp4`
5. run this gate once more before submission
