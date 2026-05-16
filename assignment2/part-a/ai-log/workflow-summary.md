# Part A AI Workflow Summary

## Purpose

AI assistance was used to support the Part A report-control role assigned to Rongbang Cheng. The goal was to integrate teammate evidence into a single defensible vulnerability claim, prepare presentation material, and check alignment with the Assignment 2 rubric.

## Inputs Reviewed

- Assignment 2 spec and rubric.
- Assignment 1 role split and activity-log pattern.
- Decompiled APK evidence from the `assignment2-A-decompile` branch snapshot.
- System/threat model material from the `system-model-threat-model` branch snapshot.
- PoC and screenshot evidence material from the `PoCs-and-Evidence` branch snapshot.
- Additional teammate notes in `/Users/ruben/Downloads/5995-A2-A.md`.

## AI-Assisted Outputs

- Final Part A vulnerability claim sheet.
- Report outline and report-writing facts for Overleaf drafting.
- Final risk wording and non-claim boundaries.
- Five-member Part A presentation script.
- Evidence index.
- Part A contribution matrix draft.
- Submission checklist.
- Mock Q&A and validation notes.

## Human/Team Validation

The selected vulnerability claim was accepted only after checking it against the decompiled manifest and `MainActivity` code:

- Manifest permits cleartext traffic.
- `MainActivity` loads an HTTP URL in WebView.
- SSL-error proceed behavior exists as supporting transport-validation evidence.
- Always-true HostnameVerifier exists but is not visibly attached to the request path, so it is not used as the primary claim.

