# Threat Model (Core Result)

## A. Threat Linked to Selected Vulnerability
Selected core issue:
- `Login.generateSessionToken()` uses deterministic `java.util.Random` for security-sensitive session tokens.
- Evidence: `Login.java` lines 183-188.

Threat statement:
- Under realistic observation conditions, deterministic token generation can reduce effective uncertainty and support session impersonation attempts.

## B. Attacker Goals
Primary goal:
1. Predict or reproduce a valid `sessionToken`.
2. Use predicted token context to compromise authentication-state integrity.

Secondary goal:
1. Reduce candidate space enough to make verification practical.

## C. Attacker Capabilities (realistic)
1. Bounded login-time estimation.
2. Partial token signal access in plausible contexts (debug leakage / instrumentation / rooted or test device context).
3. Offline candidate generation from known PRNG behavior.

## D. Attacker Constraints (non-exaggerated)
1. No backend/server compromise assumed.
2. No remote code execution assumed.
3. No universal guaranteed bypass claim.

## E. Attack Preconditions
P1. Timing window around login is estimable.
P2. At least partial token signal is available.
P3. Candidate validation path exists.

Risk meaning:
- If P1 + P2 hold, predictability risk becomes materially higher than with CSPRNG token generation.

## F. Why This Threat Model Is Defensible
- It explicitly links vulnerability location -> protected asset -> attacker capability -> bounded preconditions.
- It keeps claims calibrated and tutorial-defensible.
- It remains fully within randomness/crypto scope.

## G. Security Basis
- `java.util.Random` is deterministic and unsuitable for authentication token generation.
- Security-sensitive token generation requires CSPRNG properties (e.g., `SecureRandom`).
