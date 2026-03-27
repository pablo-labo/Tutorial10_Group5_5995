# Claim Sheet for Member A

## Purpose
This file is member A's current-stage deliverable.
It locks the single report claim, aligns B/C/D inputs, and sets the wording boundary required by the Assignment 1 spec and rubric.

## Selected Core Vulnerability
The selected Assignment 1 vulnerability is:

- insecure generation of authentication-related session state using `java.util.Random` in `Login.generateSessionToken()`

Why this is the selected issue:
- it is directly within the assignment's `randomness/cryptography` scope
- it is tied to a value explicitly named `sessionToken`
- it is on the successful login path
- it is stronger and more defensible than the UI-only random use in `MainActivity.randomNumberGenerator()`

## Final One-Sentence Claim
The app generates an authentication-related `sessionToken` with `java.util.Random` and stores it as session state, making the token generation unsuitable for a security-sensitive purpose that requires unpredictability.

## Evidence Consolidation
### C-side code evidence
1. Package and activity structure
- `apk-decompile_code/resources/AndroidManifest.xml` lines 7, 22-31

2. Login success path creates session and opens profile
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 52-59

3. Session token storage
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 174-176

4. Session token accessor
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 179-181

5. Weak token generation
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 183-189

6. Logout clears token
- `apk-decompile_code/sources/com/example/mastg_test0016/Profile.java` lines 50-52

7. Non-selected random usage for comparison only
- `apk-decompile_code/sources/com/example/mastg_test0016/MainActivity.java` lines 17-20

### B-side model support
1. Protected assets
- session-token unpredictability
- authentication-state integrity

2. Realistic attacker model
- local-analysis attacker
- emulator, rooted device, or instrumented tutorial environment
- can estimate login timing and, if available, inspect or test token state

3. Main claim boundary
- current code evidences token generation, persistence, retrieval, and clearing more clearly than downstream token validation

### D-side attack support
1. Bounded attack path
- observe successful login
- tie token creation to login moment
- reproduce candidate outputs offline from the same generation logic
- compare candidates against observed token state if local observation is available

2. Honest limitation
- no proven downstream token-validation sink
- no guaranteed auth bypass
- no guaranteed session hijack
- no guaranteed remote takeover

### E-side mitigation integration
1. Primary fix target
- replace `java.util.Random` with `java.security.SecureRandom` in `Login.generateSessionToken()`

2. Strengthening details
- increase token length/entropy beyond the current 16-character design
- keep login-time rotation and logout invalidation explicit
- mention explicit token validation in protected flow only as a mitigation improvement, not as a newly proven vulnerability claim

3. Verification wording boundary
- say the fix blocks the demonstrated predictability path by removing the predictable PRNG source
- do not claim that mitigation proves complete auth-bypass prevention in this APK

## System and Threat Position
### App purpose summary for report
This APK implements a simple local registration and login flow. `MainActivity` writes user credentials to local storage and sends the user to `Login`. After successful credential verification, `Login` creates session-related state and launches `Profile`. The selected security issue is not the general presence of randomness, but the use of `java.util.Random` to generate a value explicitly stored as `sessionToken`.

### Protected asset
The protected asset is the unpredictability and integrity of authentication-related session state represented by `sessionToken`.

### Defensible attacker model
The report should use a bounded local-analysis attacker: an attacker on an emulator, rooted device, or instrumented environment who can estimate the login time and may be able to inspect or test stored token state. This keeps the claim realistic and consistent with the available evidence.

## Allowed and Disallowed Claims
### Safe claims
1. The app creates a value named `sessionToken` after successful login.
2. The app stores that token in `SharedPreferences("SessionPrefs")`.
3. The token is generated with `java.util.Random`, which is not a cryptographically secure random generator.
4. The token participates in session lifecycle state because it is later removed on logout.
5. Under realistic local-analysis conditions, the design supports bounded prediction or reproduction attempts that would be less credible with a CSPRNG-backed token.

### Claims to avoid
1. Do not claim a proven downstream token-validation sink.
2. Do not claim guaranteed authentication bypass in the current build.
3. Do not claim guaranteed session hijack or remote takeover.
4. Do not switch the main finding to plaintext credential storage or input validation, because that would move outside Assignment 1 marking scope.

## Report-Ready Core Wording
### Vulnerability statement
The app generates a security-labelled `sessionToken` with `java.util.Random` in `Login.generateSessionToken()` and stores it as session state immediately after successful login. Because session tokens require unpredictability, a deterministic non-CSPRNG source is unsuitable for this role.

### Impact statement
In the observed APK, the strongest defensible impact is weakened unpredictability of authentication-related session state, not a proven universal bypass. Under realistic local-analysis conditions, an attacker can reproduce the same generation logic offline and attempt bounded prediction or comparison against observed token state.

### Limitation statement
Current evidence shows token generation, storage, retrieval, and clearing more clearly than downstream token validation. Therefore, the present work supports a bounded predictability-risk claim rather than a guaranteed auth-bypass claim.

### Fix statement
The primary fix is to replace `java.util.Random` with `SecureRandom` in `Login.generateSessionToken()` so the token is generated by a cryptographically secure source. A stronger session design would also make token validation explicit in protected flow and preserve clear rotation and invalidation behavior across login and logout.

### Fix-effect statement
This mitigation directly addresses the demonstrated weakness because it removes the predictable PRNG from the session-token generation path. It strengthens unpredictability of authentication-related state, while any broader access-control assurance still depends on how the app validates and enforces token state downstream.

## Rubric Alignment
### System & Threat Model
- clearly names protected asset, attacker capabilities, trust boundary, and bounded assumptions

### Vulnerability Discovery & Explanation
- directly identifies a randomness misuse in a security-sensitive path
- ties code location to security role, attacker model, and concrete attack steps

### Fix / Mitigation
- supports a concrete primary mitigation (`Random` -> `SecureRandom`) plus carefully bounded lifecycle/enforcement improvements

### Recorded Presentation & Q&A
- gives one consistent claim that can be explained and defended without overclaiming
- lets A explain both what is fixed now and what remains outside the current evidence boundary

## Handoff Requirements
### To E
Use this fix target:
- replace `java.util.Random` with `SecureRandom` for `sessionToken` generation
- keep token length and alphabet sufficiently strong
- make token validation explicit in protected flow
- consider rotation and invalidation semantics, not just generation source

### To final report editor
Every strong statement in the final report should be traceable to one of the evidence anchors above or to the bounded mitigation reasoning from E.
If a sentence cannot be traced to code evidence, threat-model assumptions, or the stated mitigation boundary, weaken it or remove it.

### To presentation editor
When presenting the fix, keep the sequence:
1. identify the exact weak-randomness location
2. explain why `SecureRandom` is the primary repair
3. describe rotation/invalidation and optional validation checks as strengthening measures
4. restate that the impact claim remains bounded
