# Threat Model (Core Result)

## A. Threat Linked to Selected Vulnerability
Selected core issue:
- `Login.generateSessionToken()` uses deterministic `java.util.Random` for security-sensitive session tokens.
- Evidence: `Login.java` lines 183-188.

Threat statement:
- Under realistic observation conditions, deterministic token generation reduces the uncertainty of a value intended to represent session state.
- If an attacker can observe the login window and later observe or test token state, this design can support prediction or reproduction attempts that would not be credible with a CSPRNG-backed token.

## B. Attacker Goals
Primary goal:
1. Predict or reproduce a valid `sessionToken`.
2. Undermine authentication-state integrity by anticipating or replaying a token-like value.

Secondary goal:
1. Reduce candidate space enough to make verification practical.
2. Show that the app's "session token" is not generated to a security-appropriate standard.

## C. Attacker Capabilities (realistic)
1. Observe or estimate the victim login time within a bounded window on a device or test environment.
2. Obtain token state or partial token signal in a plausible local-analysis setting, such as instrumentation, debugging, or a rooted/tutorial device.
3. Reproduce candidate outputs offline because `java.util.Random` is deterministic once seeded.
4. Compare predicted candidates against observed state if a validation or consistency check is available.

## D. Attacker Constraints (non-exaggerated)
1. No backend/server compromise assumed.
2. No remote code execution assumed.
3. No universal guaranteed bypass claim.
4. No claim that token prediction alone proves immediate profile entry in the current build.

## E. Attack Preconditions
P1. Timing window around login is estimable.
P2. At least partial token signal is available.
P3. Candidate validation path exists.

Risk meaning:
- If P1 + P2 hold, predictability risk becomes materially higher than with CSPRNG token generation.
- If P3 is weak or absent in the current build, exploit impact is bounded, but the design error remains valid because the token is still created as authentication-related state.

## F. Concrete Attack Scenario (bounded and defendable)
1. The attacker observes or induces a victim login on a testable device and narrows the login time to a short window.
2. Because `createSession()` immediately calls `generateSessionToken()`, the token is generated at that login moment (`Login.java` 174-176).
3. The attacker reproduces candidate outputs for nearby PRNG seeds and the same 16-character generation logic (`Login.java` 183-188).
4. If the attacker can inspect or test the stored session state in a realistic local-analysis setting, they can compare candidates against the observed token value or token-dependent behavior.
5. This does not prove a universal remote bypass, but it does show that the token's unpredictability is weaker than intended for authentication state.

## G. Why This Threat Model Is Defensible
- It explicitly links vulnerability location -> protected asset -> attacker capability -> bounded preconditions.
- It keeps claims calibrated and tutorial-defensible.
- It remains fully within randomness/crypto scope.
- It openly states the main limitation: the present code shows token creation and storage more clearly than downstream token enforcement.

## H. Security Basis
- `java.util.Random` is deterministic and unsuitable for authentication token generation.
- Security-sensitive token generation requires CSPRNG properties (e.g., `SecureRandom`).
