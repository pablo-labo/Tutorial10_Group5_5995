# System Model (Core Result)

## A. Scope and Selected Vulnerability
This system model is scoped to one core vulnerability only:
- F1: insecure session-token generation using `java.util.Random` in `Login.generateSessionToken()`.

Why this scope:
- It is directly in Assignment 1 randomness/crypto marking scope.
- It sits on the authentication-state creation path.
- It is the only application-level random use that is tied to a security-labelled value rather than UI behavior.

Code anchors:
- Token generation: `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 183-188.
- Token persistence: `Login.java` lines 174-176.
- Login-to-profile transition: `Login.java` lines 52-59.
- Observed token lifecycle endpoint: `Profile.java` lines 50-52.

## B. Main Components
1. `MainActivity`
- Accepts registration inputs.
- Writes credentials to local file through `saveCredentialsToFile()`.
- Also contains UI-only random usage (`randomNumberGenerator()`), not selected as core vulnerability.

2. `Login`
- Reads and compares stored credentials through `checkCredentials()`.
- Creates session state by storing `sessionToken`.
- Generates `sessionToken` through `generateSessionToken()` (selected weak point).
- Starts `Profile` only after successful credential check and `createSession()`.

3. `Profile`
- Represents post-login state.
- Implements logout token removal (`clearSession()`).
- In the observed build, no explicit token-validation gate is visible before entering `Profile`; this bounds current exploit impact and should be stated honestly.

4. Data stores
- `credentials.txt` (plaintext credentials store).
- `SharedPreferences("SessionPrefs")` with key `sessionToken`.

Manifest structure evidence:
- `apk-decompile_code/resources/AndroidManifest.xml` lines 28-37 (`Profile`, `Login`, `MainActivity`).

## C. Key Assets (explicit)
Primary assets in scope:
1. `sessionToken` unpredictability.
2. Authentication-state integrity.

Supporting assets:
1. Local credentials (`credentials.txt`).
2. Session lifecycle state in `SharedPreferences("SessionPrefs")`.

## D. Data Flow (aligned with C evidence)
1. User input.
2. `MainActivity.saveCredentialsToFile()`.
3. `credentials.txt` (plaintext).
4. `Login.checkCredentials()`.
5. `Login.createSession()`.
6. `Login.generateSessionToken()` (insecure randomness).
7. `SharedPreferences(sessionToken)`.
8. `Profile` (no explicit validation gate in observed flow).

Critical security path:
- `Random` -> `Token` -> `SharedPreferences` -> `Session`.

Security interpretation:
- The selected weak randomness is not a detached helper. It is used to create a value named and stored as session state immediately after successful login.
- However, the observed build shows generation and persistence more clearly than downstream validation, so the model must distinguish "security-sensitive token creation" from "fully demonstrated auth bypass."

## E. Trust Boundaries
1. User-controlled input -> registration/login logic.
2. Credential verification -> session-creation decision.
3. Token generation -> persistent token storage.
4. Stored token state -> post-login session behavior.
5. App-private storage -> any attacker who can observe, instrument, or read state on the device.

## F. Boundaries of What We Claim
1. We do claim the app creates authentication-related state using a predictable PRNG.
2. We do claim this weakens the intended unpredictability of a session token.
3. We do not claim a guaranteed remote bypass, because the current code does not show a backend or a strong token-validation check.
4. We do not rely on unrelated issues such as plaintext credential storage as the core vulnerability for Assignment 1.

## G. Why this model supports F1
The weak random generator is not isolated utility code; it is on the exact path that creates persisted authentication state. Therefore F1 is a system-level security issue, not a cosmetic API-choice issue.
