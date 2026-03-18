# System Model (Core Result)

## A. Scope and Selected Vulnerability
This system model is scoped to one core vulnerability only:
- F1: insecure session-token generation using `java.util.Random` in `Login.generateSessionToken()`.

Why this scope:
- It is directly in Assignment 1 randomness/crypto marking scope.
- It sits on the authentication-state creation path.

Code anchors:
- Token generation: `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 183-188.
- Token persistence: `Login.java` lines 174-176.

## B. Main Components
1. `MainActivity`
- Accepts registration inputs.
- Writes credentials to local file through `saveCredentialsToFile()`.
- Also contains UI-only random usage (`randomNumberGenerator()`), not selected as core vulnerability.

2. `Login`
- Reads and compares stored credentials through `checkCredentials()`.
- Creates session state by storing `sessionToken`.
- Generates `sessionToken` through `generateSessionToken()` (selected weak point).

3. `Profile`
- Represents post-login state.
- Implements logout token removal (`clearSession()`).
- Current flow indicates no explicit token validation gate before profile use.

4. Data stores
- `credentials.txt` (plaintext credentials store).
- `SharedPreferences("SessionPrefs")` with key `sessionToken`.

Manifest structure evidence:
- `apk-decompile_code/resources/AndroidManifest.xml` lines 28-37 (`Profile`, `Login`, `MainActivity`).

## C. Key Assets (explicit)
Primary assets in scope:
1. `sessionToken` unpredictability.
2. Authentication-state integrity.

Context asset:
1. Local credentials (`credentials.txt`).

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

## E. Trust Boundaries
1. User-controlled input -> registration/login logic.
2. Credential verification -> session-creation decision.
3. Token generation -> persistent token storage.
4. Stored token state -> post-login session behavior.

## F. Why this model supports F1
The weak random generator is not isolated utility code; it is on the exact path that creates persisted authentication state. Therefore F1 is a system-level security issue, not a cosmetic API-choice issue.
