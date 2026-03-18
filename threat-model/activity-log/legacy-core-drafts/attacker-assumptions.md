# Attacker Assumptions (Role B)

## Assumptions We Make
- The attacker can observe or infer approximate login timing.
- The attacker can access partial token output in a realistic leakage context.
- The attacker can perform offline enumeration over a bounded timing window.

## Assumptions We Do NOT Make
- We do not assume impossible perfect timing.
- We do not assume full system compromise by default.
- We do not assume unrelated vulnerability classes to make the attack work.

## Realism Justification
- Login timing side-information is commonly observable in interactive apps.
- Token leakage can happen in debug/test/instrumented environments.
- Deterministic PRNG behavior makes bounded candidate search practical once timing and prefix information are available.

## Limitation Statement
If no token leakage exists and timing uncertainty is extremely large, exploitability decreases. However, the design flaw (non-cryptographic random source for session tokens) remains valid and should still be fixed.
