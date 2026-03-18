# Attacker Assumptions (Core Result)

## 1) Assumptions we make
A1. Attacker can estimate login timing to a bounded window.
A2. Attacker can observe token fragment/sample in realistic leakage scenarios.
A3. Attacker can run offline candidate generation and attempt validation.

## 2) Assumptions we do NOT make
N1. No full backend/server compromise.
N2. No impossible perfect knowledge of all runtime state.
N3. No dependence on unrelated vulnerability categories.

## 3) Defensibility rationale
- A1 is common in interactive login systems (event timing is often inferable).
- A2 is realistic in dev/test/log or instrumented-device contexts.
- A3 is practical when generator is deterministic and candidate space is bounded by timing.

## 4) Impact on risk statement
These assumptions make the attack model realistic but bounded. Even when exploit probability varies by environment, the root design issue remains: non-CSPRNG token generation in a security-sensitive role.
