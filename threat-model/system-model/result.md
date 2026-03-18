# System Model (Core Result)

## A. Model Scope
This system model is built for one selected vulnerability only:
- Vulnerability: `Login.generateSessionToken()` uses `java.util.Random` for session tokens.
- Security focus: authentication-state integrity and token unpredictability.

Direct code anchors:
- Token is generated in `Login.generateSessionToken()` (`Login.java` lines 183-188).
- Token is persisted in `Login.createSession()` (`Login.java` lines 174-176).

## B. Main Components
1. `MainActivity`
- Handles register input and navigation to login.
- Contains `randomNumberGenerator()` that is UI-only random usage.

2. `Login`
- Reads and checks credentials.
- Creates and stores session token when login succeeds.

3. `Profile`
- Represents post-login state.
- Removes session token on logout.

4. Local storage
- `credentials.txt` for stored credentials.
- `SharedPreferences("SessionPrefs")` for `sessionToken`.

Manifest evidence for structure:
- `AndroidManifest.xml` lines 28-37 list `Profile`, `Login`, `MainActivity`.

## C. Key Assets (explicit)
Primary assets (in scope):
1. `sessionToken` unpredictability.
2. Session-state integrity (only legitimate authentication should create valid state).

Secondary asset (context only):
1. Local credentials in `credentials.txt`.

## D. Key Data Flows (explicit)
1. User enters credentials in `Login`.
2. `checkCredentials(...)` validates against local credential data.
3. Success path triggers `createSession()`.
4. `createSession()` calls `generateSessionToken()`.
5. Token is written to `SharedPreferences` as `sessionToken`.
6. `Profile.clearSession()` removes token at logout.

Security-critical flow linked to vulnerability:
- `generateSessionToken()` -> `createSession()` -> `SharedPreferences(sessionToken)`.

## E. Trust Boundaries
1. External input -> authentication logic (`checkCredentials`).
2. Authentication logic -> token generation (security decision point).
3. Runtime token -> persistent token state (`SharedPreferences`).
4. Authenticated state -> logout invalidation (`clearSession`).

## F. Why this model supports the chosen vulnerability
The weak random generator is placed on the exact path that creates persistent authentication state. Therefore the risk is not cosmetic API misuse; it affects a protected asset through a critical trust boundary.
