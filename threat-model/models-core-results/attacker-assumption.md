# Attacker Assumptions (Core Result)

## A. Assumptions We Make
A1. The attacker can infer approximate login time within a bounded error range.
A2. The attacker can obtain token state or partial token signal in a realistic local-analysis scenario (for example debugging, instrumentation, or a rooted test device).
A3. The attacker can perform offline candidate generation and attempt validation.
A4. The attacker is targeting the app's session-state material, not unrelated UI randomness.

## B. Assumptions We Do Not Make
N1. We do not assume server-side compromise.
N2. We do not assume full device takeover by default.
N3. We do not assume impossible perfect timing precision.
N4. We do not rely on unrelated vulnerability classes.
N5. We do not assume the current build already contains a proven downstream token-check gate.

## C. Why These Assumptions Are Realistic
1. Timing side-information is commonly inferable in interactive login flows.
2. Local observation on a tutorial, emulated, or instrumented Android app is realistic in this assignment context and easier to defend than an internet-scale attacker story.
3. Deterministic generator behavior allows bounded candidate enumeration when timing context is available.
4. The token is explicitly named `sessionToken` and persisted in `SessionPrefs`, so it is reasonable to treat it as authentication-related material.

## D. Evidence Connection to Chosen Vulnerability
- Token generation function: `Login.generateSessionToken()` (`Login.java` lines 183-188).
- Token persistence in auth path: `Login.createSession()` (`Login.java` lines 174-176).
- Session lifecycle endpoint: `Profile.clearSession()` (`Profile.java` lines 50-52).
- Login success path into profile: `Login.java` lines 52-59.

These anchors confirm that assumptions apply to authentication-state material, not UI-only randomness.

## E. Bounded Claim Statement
Under A1-A4, predictability risk is credible in realistic local-analysis contexts; without those conditions, exploit practicality decreases, but the design weakness remains because a session token should not be generated with a predictable PRNG.

## F. Tutorial-Defense Position
If asked "is this a guaranteed bypass in the current build?", the defensible answer is no.
If asked "is this still a valid security issue?", the defensible answer is yes, because the app creates authentication-related state with `java.util.Random`, which is an unsuitable generator for session-token material.
