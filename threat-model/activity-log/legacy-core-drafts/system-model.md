# System Model (Role B)

## App Purpose (3-5 sentences)
The APK implements a simple local registration and login flow. Users can register credentials in `MainActivity`, then log in through `Login`, and enter `Profile` after successful credential checks. Authentication state is represented by a `sessionToken` stored in `SharedPreferences` (`SessionPrefs`). Logout in `Profile` removes this token. The app is mostly local-state driven, so token generation quality is critical for session trust.

## Components
- UI: `MainActivity` (register/login entry), `Login` (credential check + session creation), `Profile` (post-login + logout)
- Local storage:
  - `credentials.txt` for username/password data
  - `SharedPreferences("SessionPrefs")` for `sessionToken`
- Session logic:
  - `Login.createSession()` writes token
  - `Login.generateSessionToken()` creates token string
  - `Profile.clearSession()` invalidates token on logout

## Key Assets
- Authentication/session state
- `sessionToken` value (security-sensitive)
- Credential file (`credentials.txt`) (secondary asset in this assignment)

## Trust Boundaries
1. User input -> login validation (`checkCredentials`)
2. Authentication result -> session-token creation (`createSession`)
3. Session token -> persisted auth state (`SharedPreferences`)
4. Logout action -> token invalidation (`clearSession`)

## Data Flow (Auth Path)
1. User submits username/password in `Login`.
2. `checkCredentials(...)` reads `credentials.txt` and matches values.
3. If matched, `createSession()` stores `sessionToken` in `SessionPrefs`.
4. Token comes from `generateSessionToken()` (16 chars from `[A-Za-z0-9]`).
5. User reaches `Profile`; logout removes `sessionToken`.

## Evidence Links
- `apk-decompile_code/resources/AndroidManifest.xml`
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java`
- `apk-decompile_code/sources/com/example/mastg_test0016/Profile.java`
- `apk-decompile_code/sources/com/example/mastg_test0016/MainActivity.java`
