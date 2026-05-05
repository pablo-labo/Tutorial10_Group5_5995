# Tutorial Q&A

## Q1. What is the vulnerability you selected?
The selected issue is that the app generates authentication-related session state (`sessionToken`) using `java.util.Random` in `Login.generateSessionToken()`, which is unsuitable for security-sensitive token generation.

## Q2. Why is this in scope for Assignment 1?
Because the random value is not a UI-only value. It is explicitly named `sessionToken`, created after successful login, stored in `SharedPreferences("SessionPrefs")`, and cleared on logout.

## Q3. Why is `java.util.Random` a problem here?
`java.util.Random` is a deterministic PRNG, not a cryptographically secure random generator. Session tokens need unpredictability, so a CSPRNG such as `SecureRandom` is the appropriate choice.

## Q4. What is the protected asset?
The protected asset is the unpredictability and integrity of authentication-related session state, represented here by `sessionToken`.

## Q5. What attacker model are you using?
A bounded local-analysis attacker model: emulator, rooted device, or instrumented test environment, with the ability to observe or narrow login timing and, if possible, inspect stored token state locally.

## Q6. What is your bounded attack scenario?
After a successful login, the app immediately creates and stores `sessionToken` using `java.util.Random`. Under local-analysis conditions, an attacker can reproduce the same token-generation logic offline and, if stored token state is accessible, compare observed token state against reproduced logic.

## Q7. Are you claiming guaranteed auth bypass?
No. Current evidence does not show a proven downstream token-validation sink, so we do not claim guaranteed auth bypass, session hijack, or remote takeover.

## Q8. Why is this still a valid issue if impact is bounded?
Because the flaw is in a security-sensitive token creation path. Even if the strongest exploit path is not fully proven in this build, using a non-CSPRNG source for session-token generation is still a valid security design weakness.

## Q9. What is the biggest limitation of your argument?
The code clearly shows token generation, storage, retrieval, and clearing, but it does not clearly show downstream token validation or enforcement. That limits how far the impact claim can go.

## Q10. Why did you not choose the `MainActivity.randomNumberGenerator()` call?
Because that random value appears to be UI/debug-style randomness. It is not tied to authentication state, unlike `sessionToken`.

## Q11. What fix should be recommended?
Replace `java.util.Random` with `SecureRandom` for token generation and make token validation explicit and correctly enforced in protected flow.

## Q12. What code evidence supports your answers?
- `Login.java` lines 52-59: login success path
- `Login.java` lines 174-176: token storage
- `Login.java` lines 179-181: token accessor
- `Login.java` lines 183-188: weak token generation
- `Profile.java` lines 21-39: visible session loading without explicit validation shown here
- `Profile.java` lines 50-52: logout clears token
- `MainActivity.java` lines 17-20: non-selected random usage
