# Evidence Citation Map (Report Sentence -> Code Evidence)

## Introduction / App Context
1. Claim: The app package is `com.example.mastg_test0016`.
- Evidence: `apk-decompile_code/resources/AndroidManifest.xml` line 7.

2. Claim: App has `MainActivity`, `Login`, `Profile` in auth flow.
- Evidence: `AndroidManifest.xml` lines 28-37.

## System Model
3. Claim: Session token is persisted in `SharedPreferences`.
- Evidence: `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 174-176.

4. Claim: Session token is removed on logout.
- Evidence: `apk-decompile_code/sources/com/example/mastg_test0016/Profile.java` lines 50-52.

5. Claim: There is also a UI-only random value path.
- Evidence: `apk-decompile_code/sources/com/example/mastg_test0016/MainActivity.java` lines 17-20.

## Vulnerability Discovery
6. Claim: Core vulnerability is weak random in session-token generation.
- Evidence: `Login.java` lines 183-188 (`new Random()`, `nextInt(62)`, 16-char token loop).

7. Claim: Vulnerable random output is directly in authentication session path.
- Evidence: `Login.java` lines 174-176 + 183-188.

## Threat Model
8. Claim: Chosen vulnerability affects authentication-state integrity.
- Evidence: token is written as `sessionToken` during login (`Login.java` lines 174-176).

9. Claim: Risk path depends on predictability of deterministic generator.
- Evidence: `new Random()` in token generation (`Login.java` line 184).

10. Claim: UI random usage exists but is lower security priority.
- Evidence: `MainActivity.randomNumberGenerator()` (`MainActivity.java` lines 17-20).

## Mitigation Section Support
11. Claim: Replacing `Random` with CSPRNG is justified for token generation.
- Evidence anchor in code: weak source is explicitly `Random` at token site (`Login.java` lines 183-188).
- Security basis: session tokens require unpredictable entropy source.

## Presentation / Q&A Consistency
12. Claim: Model and vulnerability are linked by concrete data flow.
- Evidence: `generateSessionToken()` -> `createSession()` -> `SharedPreferences(sessionToken)` (`Login.java` lines 183-188 and 174-176).

## Usage Guidance
- Use this map when writing/reporting: every strong sentence should cite one code location above.
- If a sentence has no evidence anchor, either add evidence or weaken wording.
