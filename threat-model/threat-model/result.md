# Threat Model (Core Result)

## A. Chosen Vulnerability (explicit linkage)
- Selected issue: `Login.generateSessionToken()` uses `java.util.Random`.
- Code evidence: `Login.java` lines 183-188.
- Security role: session token generation for authentication state.

## B. Threat Statement
Because a deterministic non-CSPRNG source is used for session-token material, token predictability risk increases under realistic observation conditions (timing + leakage), enabling session impersonation attempts.

## C. Attacker Goals
Primary goal:
1. Reproduce or predict valid `sessionToken` values to impersonate authenticated state.

Secondary goal:
1. Reduce candidate token space enough for feasible validation attempts.

## D. Attacker Capabilities (realistic)
1. Estimate login timing within a bounded window.
2. Access token fragment/sample through realistic channels (debug leakage, instrumentation, rooted/test device context).
3. Run offline candidate generation from known PRNG behavior.

## E. Attacker Constraints (non-exaggerated)
1. No assumption of backend/server compromise.
2. No assumption of remote code execution.
3. No claim of guaranteed exploitation in all environments.

## F. Preconditions for Attack Path
P1. Login timing context is available.
P2. At least partial token signal is available.
P3. Candidate checking path exists.

If P1 + P2 hold, risk is materially higher than CSPRNG-based token generation.

## G. Security Basis
- `java.util.Random` is deterministic and unsuitable for security-sensitive token generation.
- Session/authentication tokens require CSPRNG properties (e.g., `SecureRandom`) to resist prediction.

## H. Why this threat model is defensible
It explicitly links vulnerability location -> protected asset -> attacker capabilities -> bounded exploit preconditions, while avoiding over-claims.
