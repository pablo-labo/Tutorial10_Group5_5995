# Threat Model Q&A Notes

## Q1. Why is `Login.generateSessionToken()` the selected vulnerability instead of `MainActivity.randomNumberGenerator()`?
Because the selected site generates a value explicitly named `sessionToken` and stores it in `SharedPreferences("SessionPrefs")` during session creation (`Login.java` 174-176, 183-188). By contrast, `MainActivity.randomNumberGenerator()` only returns a UI/debug-style value and is not tied to authentication state (`MainActivity.java` 17-20).

## Q2. Why is `java.util.Random` unsuitable here?
`java.util.Random` is a deterministic PRNG rather than a cryptographically secure generator. That makes it inappropriate for values whose security property is unpredictability, such as a session token. A stronger design would use `SecureRandom` to generate the token.

## Q3. What asset is actually being protected?
The primary asset is the unpredictability and integrity of session state. In this APK, the app creates a token called `sessionToken`, stores it as persistent session state, and clears it on logout (`Login.java` 174-176, `Profile.java` 50-52).

## Q4. Are you claiming a guaranteed remote account takeover?
No. The defensible claim is narrower: the app uses a predictable PRNG to create authentication-related state. The current build clearly shows token creation and storage, but it does not clearly show a backend or a downstream token-validation gate, so the exploit claim must stay bounded.

## Q5. What is the realistic attacker model?
A realistic model for this assignment is a local-analysis attacker on an emulator, tutorial device, or instrumented environment who can estimate login timing and inspect or test token state. This is more defensible than claiming an internet-scale attacker when the APK shows no server-side session handling.

## Q6. What is the shortest defendable attack scenario?
1. The attacker observes a login event or narrows its timing window.
2. `createSession()` immediately generates and stores a 16-character token using `new Random()` (`Login.java` 174-176, 183-188).
3. The attacker reproduces candidate outputs for nearby seeds offline.
4. If token state can be observed or checked in a realistic local-analysis setting, the attacker can compare candidates against the generated token or token-dependent behavior.

## Q7. What is the biggest limitation of this vulnerability argument?
The current APK shows token generation more clearly than token enforcement. That limits how far we should push the impact claim. Saying this explicitly usually strengthens the credibility of the rest of the analysis.

## Q8. Why is this still worth reporting if impact is bounded?
Because creating session-state material with a non-cryptographic generator is still a design flaw in a security-sensitive path. Even if this build does not expose the strongest possible exploit path, the implementation fails the security requirement that authentication tokens be unpredictable.

## Q9. What fix should we recommend?
Replace `java.util.Random` with `SecureRandom` for token generation, and ensure the token is actually validated before granting access to protected state. This addresses both the entropy weakness and the current ambiguity around session enforcement.

## Q10. What evidence should we cite during Q&A?
- `Login.java` 174-176: session creation persists `sessionToken`
- `Login.java` 183-188: `generateSessionToken()` uses `new Random()` and `nextInt(62)`
- `Login.java` 52-59: successful login transitions to `Profile`
- `Profile.java` 50-52: logout clears the stored token
- `MainActivity.java` 17-20: non-selected UI-only random usage
