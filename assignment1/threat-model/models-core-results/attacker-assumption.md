# Attacker Assumptions (Core Result, Refined Draft)

## A. Attacker Profile Set
1. External attacker:
- Assumed capability is limited for this issue because APK evidence does not show backend token protocol.

2. Internal/local attacker (primary):
- Rooted-device user, emulator analyst, or instrumentation/debug user.
- Can observe login timing and inspect token state or behavior.

3. MITM attacker:
- Considered but not primary in this APK because token network transmission is not evidenced.

## B. Assumptions We Make
A1. Token generation timing can be estimated with bounded error.
A2. Local-analysis attacker can obtain token state/signal relevant to verification.
A3. Attacker can perform deterministic offline candidate generation and bounded validation attempts.
A4. Threat is evaluated on auth-state token path (`P2 -> DS2`), not UI random usage.

## C. Assumptions We Do Not Make
N1. No server-side compromise assumption.
N2. No guaranteed remote account takeover assumption.
N3. No perfect timestamp precision assumption.
N4. No unrelated vulnerability class chaining as a requirement.
N5. No assumption that downstream token-validation gate is already proven complete.

## D. DFD Threat Position Reference
1. Process node: `P2 Login` (`generateSessionToken()`, `createSession()`).
2. Data store node: `DS2 SharedPreferences(SessionPrefs)`.
3. Data flow: token creation and persistence from `P2` to `DS2`.

## E. Why the Assumptions Are Defensible
1. Assignment context supports local adversary modeling on emulator/instrumented devices.
2. Deterministic PRNG behavior supports bounded candidate reproduction once timing context is available.
3. `sessionToken` naming and lifecycle operations show security intent, making unpredictability a valid requirement.

Evidence anchors:
- `Login.java` 174-176 (`createSession()` persistence).
- `Login.java` 183-188 (`Random`-based token generation).
- `Profile.java` 50-52 (`clearSession()` token removal).
- `Login.java` 52-59 (post-login transition).

## F. Assumption-to-Outcome Mapping
1. A1 + A2 -> candidate enumeration plausibility.
2. A1 + A2 + A3 -> bounded validation-path plausibility.
3. Missing A2 or A3 -> keep claim at design-flaw level, avoid exploit-success over-claim.

## G. Bounded Claim and Risk Acceptance
Bounded claim:
- Predictability risk is credible under realistic local-analysis assumptions, but impact should be bounded when enforcement evidence is incomplete.

Risk acceptance:
- Accept: bounded impact language.
- Do not accept: predictable PRNG use for security token generation.
