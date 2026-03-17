# AI Usage Log (Assignment 1)

## 1) AI-assisted tooling setup
- Prompt summary: "How can I decompile and inspect an APK when JADX/apktool are unavailable locally?"
- AI suggestion: Use `androguard` for static analysis and method/source extraction.
- Validation:
  - Confirmed package + activities from APK metadata.
  - Confirmed decompiled sources for `Login`, `MainActivity`, `Profile` and inner click handlers.

## 2) AI-assisted vulnerability triage
- Prompt summary: "List randomness/crypto call sites in app-owned classes only (`com.example.*`)."
- AI result:
  - `Login.generateSessionToken()` -> `new Random()` + `nextInt(62)` for session token.
  - `MainActivity.randomNumberGenerator()` -> `Random` for display value (non-security role).
- Validation:
  - Exported method source and instruction inventory in `deliverables/evidence/`.
  - Verified `sessionToken` write/read/remove flow in `Login.createSession()`, `Login.getSessionToken()`, `Profile.clearSession()`.

## 3) AI-assisted PoC generation
- Prompt summary: "Create a PoC that reproduces Java Random and searches timestamp windows for token candidates."
- AI output: `deliverables/pocs/predict_session_token.py`.
- Validation:
  - Script implements Java LCG constants (`0x5DEECE66D`, `0xB`, 48-bit state).
  - Token charset and length match decompiled method logic (62 chars, length 16).

## 4) Rubric-driven mock Q&A rehearsal
- Prompt summary: "Act as tutor, ask rubric-based follow-up questions for threat model, exploit realism, and mitigation quality."
- Key questions asked:
  1. Why is this a security-sensitive randomness issue, not just coding style?
  2. What concrete attacker capability is required to exploit predictability?
  3. Why does `SecureRandom` materially reduce risk?
  4. How would you prove the PoC is not over-claiming?
- Improvements made after rehearsal:
  - Explicitly separated security role vs UI-only randomness.
  - Added attacker model constraints (time-window knowledge + token observation/leak).
  - Added mitigation details: CSPRNG + token length + rotation policy.

## 5) AI output validation policy used
- Every claim tied to local evidence files.
- No claim accepted without code location and method-level confirmation.
- Non-app library code excluded from vulnerability claims.

## References used
- APK under analysis: `a1_case1.apk`
- USENIX template page: https://www.usenix.org/conferences/author-resources/paper-templates
- Java `Random` docs: https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
- Java `SecureRandom` docs: https://docs.oracle.com/javase/8/docs/api/java/security/SecureRandom.html
