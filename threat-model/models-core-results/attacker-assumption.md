# Attacker Assumptions (Core Result)

## A. Assumptions We Make
A1. The attacker can infer approximate login time within a bounded error range.
A2. The attacker can obtain partial token signal (prefix/sample) in realistic leakage scenarios.
A3. The attacker can perform offline candidate generation and attempt validation.

## B. Assumptions We Do Not Make
N1. We do not assume server-side compromise.
N2. We do not assume full device takeover by default.
N3. We do not assume impossible perfect timing precision.
N4. We do not rely on unrelated vulnerability classes.

## C. Why These Assumptions Are Realistic
1. Timing side-information is commonly inferable in interactive login flows.
2. Partial leakage is plausible in debug/test/instrumented environments.
3. Deterministic generator behavior allows bounded candidate enumeration when timing context is available.

## D. Evidence Connection to Chosen Vulnerability
- Token generation function: `Login.generateSessionToken()` (`Login.java` lines 183-188).
- Token persistence in auth path: `Login.createSession()` (`Login.java` lines 174-176).
- Session lifecycle endpoint: `Profile.clearSession()` (`Profile.java` lines 50-52).

These anchors confirm that assumptions apply to authentication-state material, not UI-only randomness.

## E. Bounded Claim Statement
Under A1-A3, predictability risk is credible and exploitable in realistic contexts; without such conditions, exploit practicality decreases, but design weakness remains.
