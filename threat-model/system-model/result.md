# System Model (Core Result)

## 1) Scope and chosen vulnerability linkage
This system model is scoped to the chosen vulnerability: weak session-token generation in `Login.generateSessionToken()` using `java.util.Random`.

Evidence linkage:
- Token write path: `Login.createSession()` stores token in `SharedPreferences` (`apk-decompile_code/sources/com/example/mastg_test0016/Login.java`, lines 174-176).
- Weak generator call: `new Random()` in token generation (`Login.java`, lines 183-188).

## 2) Core components
- `MainActivity`:
  - Registration entry and navigation to login.
  - Also contains `randomNumberGenerator()` for UI-level random output (`MainActivity.java`, lines 17-20).
- `Login`:
  - Validates credentials, then creates session.
  - Persists `sessionToken` to local `SharedPreferences`.
- `Profile`:
  - Represents post-login state.
  - Logout removes `sessionToken`.

Manifest evidence for app structure:
- Activities listed in `AndroidManifest.xml` lines 28-37 (`Profile`, `Login`, `MainActivity`).

## 3) Key assets
Primary security assets:
- `sessionToken` confidentiality/unpredictability (authentication-state bearer).
- Session-state integrity (only legitimate login should produce usable session state).

Secondary assets (not the final vulnerability focus):
- Local credential data in `credentials.txt`.

## 4) Key data flows
1. User provides username/password in UI.
2. `Login.checkCredentials(...)` validates against local credential store.
3. On success, `Login.createSession()` executes.
4. `createSession()` calls `generateSessionToken()`.
5. Generated token is written to `SharedPreferences(SessionPrefs)`.
6. User enters `Profile`; logout path removes token.

Security-critical data flow (explicit):
- `generateSessionToken()` -> `createSession()` -> `SharedPreferences(sessionToken)`.

## 5) Trust boundaries
Boundary A: User-controlled input -> authentication logic
- User input crosses into credential verification code.

Boundary B: Authentication logic -> token generation logic
- Session state becomes trusted only if token generation is secure.

Boundary C: Runtime auth state -> persisted local state
- Token crosses into persistent storage (`SharedPreferences`), extending impact window.

Boundary D: Logout transition
- Token invalidation boundary (`Profile.clearSession`) controls session termination.

## 6) Why this model supports the chosen vulnerability
The vulnerability is not an isolated API misuse; it sits exactly on the critical authentication-state flow. Because token generation is inside the trust path that creates persistent session state, generator predictability can directly weaken impersonation resistance.
