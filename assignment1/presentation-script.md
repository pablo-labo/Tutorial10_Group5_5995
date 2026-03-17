# Presentation Script (<= 5 min)

## Timing plan (5 speakers, >= 40s each)
- Speaker A (0:00-1:00): App overview + system model.
- Speaker B (1:00-2:00): Threat model + attacker capabilities.
- Speaker C (2:00-3:00): Vulnerability evidence (`Random` in session token).
- Speaker D (3:00-4:00): Attack scenario + PoC highlights.
- Speaker E (4:00-5:00): Mitigation + lessons + validation.

## Slide/script bullets
1. APK purpose and flow: register/login/profile; local credential/session handling.
2. Security assets: credentials, session token, authentication state.
3. Core finding: `Login.generateSessionToken()` uses `java.util.Random` for `sessionToken`.
4. Why exploitable: deterministic PRNG + time-seeded behavior + bounded brute-force window.
5. PoC summary: candidate seed/token search around observed login time.
6. Fix: `SecureRandom`, longer token, rotation/invalidation policy.
7. Q&A readiness: evidence files, code locations, assumptions and limitations.
