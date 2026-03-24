# PoC Package README

## Purpose
This folder contains member D's bounded PoC material for Assignment 1.

The selected issue is:
- insecure generation of authentication-related session state (`sessionToken`) using `java.util.Random`

This PoC package is written to stay within the currently evidenced claim boundary.

## What This PoC Shows
- `sessionToken` is created after successful login
- `sessionToken` is stored in `SharedPreferences("SessionPrefs")`
- `sessionToken` is generated with `java.util.Random`
- the token is part of session lifecycle state because it is later cleared on logout
- under local-analysis conditions, this supports bounded reproduction or predictability testing attempts

## What This PoC Does Not Claim
- no proven downstream token-validation sink
- no guaranteed auth bypass
- no guaranteed session hijack
- no guaranteed replay success
- no guaranteed remote takeover

## Main Limitation
Current code evidence shows token generation, storage, retrieval, and clearing more clearly than downstream token enforcement.

Therefore the strongest safe conclusion is:
- the app creates authentication-related token material with a non-CSPRNG source
- exploit claims must remain bounded unless stronger runtime or code evidence is added

## Files in This Folder
- `poc-notes.md`
  - main D-side PoC reasoning, code anchors, bounded claim, limitations, and defense wording
- `attack-steps.md`
  - short step-by-step bounded attack path for report drafting and presentation reuse
- `tutorial-qa.md`
  - short tutorial-defense answers aligned with current evidence
- `reproduction-notes.md`
  - execution conditions, assumptions, observable outputs, and explicit limitations for D's PoC package

## Evidence Location
Supporting screenshots are stored in:
- `../evidence/`

Key evidence files include:
- `D01_login_generateSessionToken_random.png`
- `D02_login_createSession_storeToken.png`
- `D04_login_successPath_createSession_profile.png`
- `D05_profile_clearSession_removeToken.png`
- `D06_profile_onCreate_noVisibleValidation.png`
- `D08_manifest_activity_exported_flags.png`
- `D09_search_sessionToken_allHits.png`

## Recommended Use in Final Submission
- Use `poc-notes.md` as the main D-side reference note.
- Use `attack-steps.md` for:
  - report wording on exploit path
  - presentation explanation of attack sequence
- Use `tutorial-qa.md` for:
  - tutorial defense
  - short recorded presentation preparation
- Use `reproduction-notes.md` for:
  - PoC conditions
  - observed limits
  - honest limitation statements
- Use the screenshots in `../evidence/` as supporting figures and proof anchors.

## One-Sentence Bounded Claim
The app generates authentication-related session state (`sessionToken`) using `java.util.Random`; under realistic local-analysis conditions, this supports bounded reproduction or predictability testing attempts, but the current build does not evidence a proven token-validation sink or guaranteed auth bypass.
