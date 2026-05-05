# Presentation Compliance Checklist (E)

## Fix Summary (Must State)
- Random -> SecureRandom in generateSessionToken().
- Token length/entropy increase.
- Rotation on login; invalidation on logout.
- Optional expiry strategy noted (if used).

## Attack Path Blocking (Must State)
- Prior path relied on predictability of PRNG.
- SecureRandom makes enumeration infeasible.
- Fix is scoped to the proven risk.

## Boundary Control (Must State)
- Do not claim guaranteed auth bypass or remote takeover.
- State that enforcement depends on downstream token checks.
- Align with D's boundary notes.

## Evidence Pointers (Must Be Ready)
- Login.generateSessionToken() as primary fix location.
- Profile access path for enforcement (if updated).
- Manifest/Activity context only as background.
