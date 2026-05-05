# Evidence and PoC Freeze List

## Purpose
This file freezes the recommended evidence set and `pocs/` contents for the final submission path.
It is designed to reduce overloading, keep wording aligned, and ensure the report, presentation, and tutorial Q\&A all point to the same core proof chain.

## Freeze Rule
The project should present one core chain only:

1. successful login
2. session creation
3. weak token generation with `java.util.Random`
4. token storage as session state
5. token lifecycle / bounded limitation

Anything outside that chain should be included only if it helps defend the selected issue.

## Recommended Final Evidence Set

### A. Report body: minimum set
Use only one compact figure in the report body.

Recommended primary choice:
- `evidence/D01_login_generateSessionToken_random.png`

Recommended companion code citations in text:
- `Login.java` 174-176
- `Login.java` 183-188
- `Profile.java` 50-52

Reason:
- D01 is the strongest single screenshot for the chosen vulnerability
- storage and lifecycle can be cited in prose without spending limited page space on extra figures

### B. Presentation slides: small set
Recommended slide evidence set:
- `evidence/D01_login_generateSessionToken_random.png`
- `evidence/D02_login_createSession_storeToken.png`
- `evidence/D04_login_successPath_createSession_profile.png`
- `evidence/D05_profile_clearSession_removeToken.png`
- `evidence/D07_main_randomNumberGenerator_nonSelected.png`

Reason:
- D01 proves the weak generator
- D02 proves session-state persistence
- D04 ties the token to successful login
- D05 proves lifecycle relevance
- D07 helps defend why the selected issue is not the UI random site

### C. Tutorial Q&A backup only
Keep these as backup evidence, not primary slide/report material:
- `evidence/D03_login_getSessionToken_accessor.png`
- `evidence/D06_profile_onCreate_noVisibleValidation.png`
- `evidence/D08_manifest_activity_exported_flags.png`
- `evidence/D09_search_sessionToken_allHits.png`
- all `D10_*` search-chain screenshots
- `evidence/D11_login_session_constants_sharedprefs.png`

Reason:
- these are useful when challenged on boundaries, scope, or missing validation evidence
- they are too detailed or too search-result-heavy for the main narrative

## Recommended `pocs/` Final Contents

### Keep
- `pocs/README.md`
- `pocs/poc-notes.md`
- `pocs/attack-steps.md`
- `pocs/reproduction-notes.md`
- `pocs/tutorial-qa.md`

### Do not add unless there is a real artifact
Do not add placeholder scripts, mock exploit code, or empty media files just to make the folder look richer.

Reason:
- rubric rewards defendable material, not decorative files
- unsupported PoC artifacts create Q\&A risk

## File Roles to Freeze

### `pocs/README.md`
Role:
- submission-facing index of the PoC package

Must match exactly:
- the files actually present in `pocs/`
- the bounded claim used in report and slides

### `pocs/poc-notes.md`
Role:
- main D-side reasoning note

Use for:
- internal preparation
- slide narration drafting
- tutorial defense

### `pocs/attack-steps.md`
Role:
- short attack narrative for report/slides

Use for:
- a compact exploit-path paragraph
- spoken explanation during presentation

### `pocs/reproduction-notes.md`
Role:
- honest reproduction boundary record

Use for:
- tutorial defense when asked what was actually validated
- explaining differences between code proof and runtime proof

### `pocs/tutorial-qa.md`
Role:
- final oral defense support

Use for:
- rehearsal
- keeping all speakers aligned on limitation wording

## Frozen Main Proof Chain
This is the sequence all final materials should reuse:

1. `Login.onClick()` calls `createSession()` after successful credential verification.
2. `createSession()` stores `sessionToken` in `SharedPreferences("SessionPrefs")`.
3. `generateSessionToken()` uses `java.util.Random` and repeated `nextInt(62)` calls.
4. `Profile.clearSession()` later removes the same token.
5. Therefore, the token is authentication-related session state and its unpredictability matters.
6. Current evidence supports bounded predictability-risk claims, not guaranteed auth bypass.

## Evidence Selection Warnings

### Do not overuse search-result screenshots
Search-result evidence is useful for backup, but too many such screenshots make the analysis look weaker and less direct.

### Do not make D06 the center of the narrative
`D06_profile_onCreate_noVisibleValidation.png` is useful only to support the limitation statement.
It should not become the main proof because it does not prove the selected vulnerability itself.

### Do not let D07 compete with D01
`MainActivity.randomNumberGenerator()` is comparison evidence only.
It should appear briefly to explain why it was not selected, then disappear from the main story.

## Immediate Freeze Actions
1. Treat `D01` as the report figure unless a later formatting test proves it unusable.
2. Use `D01 + D02 + D04 + D05 + D07` as the default presentation evidence pack.
3. Keep `D06 + D08 + D09 + D10 + D11` for backup/Q\&A only.
4. Do not add new PoC artifacts unless they are real, tested, and defendable.
5. Update `pocs/README.md` later only if the final `pocs/` file set changes.

## Bottom Line
The project already has enough evidence.
The remaining task is not collecting more screenshots.
It is freezing a small, defensible subset and using it consistently across report, presentation, and Q\&A.
