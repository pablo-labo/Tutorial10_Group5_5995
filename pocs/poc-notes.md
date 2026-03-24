# PoC Notes for Member D

## Scope
This note is for the bounded PoC and tutorial defense only.

Selected issue:
- The app generates authentication-related session state (`sessionToken`) using `java.util.Random` in `Login.generateSessionToken()`.

Out of scope for this PoC:
- claiming a proven downstream token-validation sink
- claiming guaranteed auth bypass
- claiming guaranteed session hijack
- claiming remote takeover

## Strict Claim
What we can claim:
- After successful credential verification, the app creates a value named `sessionToken`.
- The token is stored in `SharedPreferences("SessionPrefs")`.
- The token is generated with `java.util.Random`, which is not a cryptographically secure generator.
- The same token is part of session lifecycle state because it is later removed on logout.
- Under realistic local-analysis conditions, this weak design supports bounded reproduction or predictability testing attempts that would be less credible with a CSPRNG-backed token.

What we must not claim:
- We do not currently prove that the token is validated before access is granted.
- We do not currently prove that predicting the token is enough to enter `Profile`.
- We do not currently prove a universal exploit path outside local-analysis conditions.

## Code Evidence
Primary anchors:
- `Login.java` lines 52-59: successful login path calls `createSession()` and then opens `Profile`.
- `Login.java` lines 174-176: `createSession()` stores `sessionToken`.
- `Login.java` lines 179-181: token is retrievable with `getSessionToken()`.
- `Login.java` lines 183-188: `generateSessionToken()` uses `new Random()` and `nextInt(62)` in a 16-character loop.
- `Profile.java` lines 21-39: session state is loaded, but no explicit token-validation gate is visible here.
- `Profile.java` lines 50-52: logout removes `sessionToken`.
- `AndroidManifest.xml` lines 28-37: `Profile` and `Login` are not exported; `MainActivity` is exported.
- `MainActivity.java` lines 17-20: there is also non-selected UI/debug random usage, which is not the chosen issue.

Search-result evidence:
- `sessionToken` hits are limited to `Login.java` and `Profile.java`.
- Session-state chain hits cover `SESSION_PREF_NAME`, `KEY_SESSION_TOKEN`, `createSession`, `getSessionToken`, and `clearSession`.

## Why the Vulnerability Is In Scope
This is not just a weak random helper used for display or UI behavior.
The generated value is explicitly named `sessionToken`, created immediately after successful login, persisted as session state, and cleared on logout.
That makes unpredictability the relevant security property.
`java.util.Random` is deterministic and therefore unsuitable for authentication-related token generation.

## Attacker Model Used for D
This PoC should follow B's bounded model:
- local-analysis attacker
- emulator, rooted test device, or instrumented environment
- can observe or estimate login timing
- can inspect token state or a partial token signal in a realistic local setting
- can reproduce candidate generation logic offline

We are not using:
- backend compromise
- remote code execution
- internet-scale remote attacker assumptions

## Bounded PoC Goal
Goal:
- show that the app creates authentication-related token material with a non-CSPRNG source in a security-sensitive path

Bounded demonstration:
- observe a successful login event
- tie token generation to that moment
- reproduce the exact token-generation logic offline
- if local observation is available, compare reproduced candidates against stored token state

This is enough to support a defensible Assignment 1 attack narrative even if a full bypass is not proven.

## Reproduction Preconditions
1. A local-analysis setup is available.
2. A successful login can be performed on the test device or emulator.
3. The attacker can observe or narrow the login timing window.
4. Ideally, the attacker can inspect token state in a realistic local-analysis context.

If condition 4 is not available:
- the PoC still supports the weaker claim that security-sensitive token creation uses an unsuitable randomness source
- the practical impact claim must remain bounded

## Attack Steps Draft
1. Launch the app and perform a valid login.
2. On success, note that `Login.onClick()` calls `createSession()` and then opens `Profile`.
3. Show that `createSession()` stores `sessionToken` in `SharedPreferences("SessionPrefs")`.
4. Show that `generateSessionToken()` uses `new Random()` and a 62-character alphabet in a 16-character loop.
5. Reimplement the same token-generation logic offline for analysis purposes.
6. In a local-analysis setup, compare it against observed stored token state, if such state is accessible in the local-analysis setup.
7. Conclude that the app uses a non-CSPRNG source for session-related token creation, which is unsuitable for intended token unpredictability.

## Main Limitation
Current code evidence shows token generation, storage, retrieval, and clearing more clearly than downstream token enforcement.
Because of that, the safest final wording is:

"The app generates authentication-related session state using `java.util.Random`, which is unsuitable for this purpose. Under realistic local-analysis conditions, this supports bounded reproduction or predictability testing attempts, but the current build does not provide code evidence for a proven token-validation sink or guaranteed auth bypass."

## Short Tutorial Defense Answers
Why is this the selected vulnerability?
- Because the random value is a `sessionToken`, not a UI-only number.

Why is `java.util.Random` a problem here?
- Because session tokens require unpredictability, and `Random` is not a CSPRNG.

Why is this still a valid issue if impact is bounded?
- Because the flaw is in a security-sensitive token creation path, not a cosmetic API choice.

What is the biggest limitation?
- No proven downstream token-validation sink is shown in the current code.

What fix should be recommended?
- Replace `Random` with `SecureRandom` for token generation and ensure token validation is explicit and correctly enforced.

## Evidence Files
- `../evidence/D01_login_generateSessionToken_random.png`
- `../evidence/D02_login_createSession_storeToken.png`
- `../evidence/D03_login_getSessionToken_accessor.png`
- `../evidence/D04_login_successPath_createSession_profile.png`
- `../evidence/D05_profile_clearSession_removeToken.png`
- `../evidence/D06_profile_onCreate_noVisibleValidation.png`
- `../evidence/D07_main_randomNumberGenerator_nonSelected.png`
- `../evidence/D08_manifest_activity_exported_flags.png`
- `../evidence/D09_search_sessionToken_allHits.png`
- `../evidence/D10_search_sessionState_chain_SESSION_PREF_NAME.png`
- `../evidence/D10_search_sessionState_chain_KEY_SESSION_TOKEN.png`
- `../evidence/D10_search_sessionState_chain_createSession.png`
- `../evidence/D10_search_sessionState_chain_getSessionToken.png`
- `../evidence/D10_search_sessionState_chain_clearSession.png`
- `../evidence/D11_login_session_constants_sharedprefs.png`
