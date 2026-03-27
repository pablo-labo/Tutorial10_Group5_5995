# Validation Record

## Purpose
This file records how AI-assisted outputs were checked before being used in the final project materials.

## Validation Principles
1. No final vulnerability claim was kept unless it matched decompiled code evidence.
2. Any stronger exploit claim was weakened if downstream enforcement evidence was incomplete.
3. Assignment scope was enforced strictly: only randomness/cryptography issues were retained as the selected finding.
4. AI outputs were treated as draft assistance, not as authoritative proof.

## Code-Based Validation
Validated directly in decompiled code:
- package and activity structure in `AndroidManifest.xml`
- successful login path leading to `createSession()`
- `sessionToken` storage in `SharedPreferences("SessionPrefs")`
- token retrieval helper
- weak token generation using `java.util.Random`
- logout clearing the token
- non-selected UI/debug random usage in `MainActivity`

Representative anchors:
- `Login.java` 52-59
- `Login.java` 174-176
- `Login.java` 179-181
- `Login.java` 183-188
- `Profile.java` 50-52
- `MainActivity.java` 17-20

## Screenshot-Based Validation
Validated using the evidence package:
- `D01_login_generateSessionToken_random.png`
- `D02_login_createSession_storeToken.png`
- `D04_login_successPath_createSession_profile.png`
- `D05_profile_clearSession_removeToken.png`
- `D07_main_randomNumberGenerator_nonSelected.png`
- backup / limitation evidence including `D06`, `D08`, `D09`, `D10`, `D11`

## Scope Validation
Rejected or de-emphasized during validation:
- plaintext credential storage as the primary finding
- generic input-validation issues as the primary finding
- generic use of `Random` without security role context

Reason:
- these points either fall outside Assignment 1 scoring scope or are weaker than the selected issue

## Impact Validation
Retained final impact:
- weakened unpredictability of authentication-related session state
- bounded predictability / reproduction attempts under realistic local-analysis assumptions

Rejected stronger impact claims:
- guaranteed authentication bypass
- guaranteed session hijack
- guaranteed remote takeover

Reason:
- current evidence shows token generation and storage more clearly than downstream token validation

## Mitigation Validation
Retained primary mitigation:
- replace `java.util.Random` with `SecureRandom`

Retained only as strengthening measures:
- higher-entropy token design
- explicit rotation / invalidation
- clearer protected-flow validation

Reason:
- only the `SecureRandom` change directly fixes the proven randomness misuse
- broader controls improve the design but were not themselves fully evidenced runtime behavior

## Rubric Validation
AI-assisted material was checked against rubric expectations for:
- system and threat model linkage
- clear vulnerability discovery explanation
- bounded but concrete attack narrative
- realistic fix / mitigation
- tutorial-defensible wording

## Final Validation Statement
The final project materials retain AI-assisted structure and wording support, but the selected finding, attacker model, bounded impact claim, and mitigation wording were all manually constrained to match the APK evidence and assignment rubric.
