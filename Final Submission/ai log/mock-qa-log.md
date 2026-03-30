# Mock Q&A Log

## Purpose
This file summarizes rubric-driven LLM rehearsal used to prepare for the tutorial Q&A and recorded presentation.

## Why rehearsal was needed
The rubric places strong weight on whether the group can explain and defend the submitted work.
The rehearsal therefore focused on:
- scope compliance
- evidence-backed explanation
- attacker realism
- bounded impact wording
- mitigation justification

## Main rehearsal question themes
1. Why is this issue in scope for Assignment 1?
2. Why was `Login.generateSessionToken()` selected instead of `MainActivity.randomNumberGenerator()`?
3. Why is `java.util.Random` unsuitable here?
4. What is the protected asset?
5. What attacker model is realistic?
6. What exactly is the attack path?
7. Why is the impact claim bounded?
8. What is the strongest limitation?
9. What fix is directly justified?
10. What evidence anchors support these answers?

## Main wording changes after rehearsal
Before rehearsal, some draft wording was too broad.

Examples of wording tightened after LLM rehearsal:
- changed from broad exploit language to bounded predictability-risk language
- changed from generic `Random` criticism to `sessionToken`-specific security-role language
- changed from broad mitigation claims to `SecureRandom` as the primary fix plus bounded strengthening measures

## Questions that caused the biggest changes
### Q. Are you claiming guaranteed auth bypass?
Change made:
- final answer explicitly says no
- limitation about missing downstream token-validation evidence was made mandatory in final wording

### Q. Why not choose another vulnerability?
Change made:
- final answer now explicitly distinguishes selected auth-state randomness from lower-priority UI/debug randomness

### Q. How do you know the token is security-sensitive?
Change made:
- final answer now always references token naming, storage, login creation path, and logout lifecycle

## Rubric-driven follow-up examples
The examples below summarize how LLM rehearsal was used for follow-up pressure-testing rather than for generating unsupported claims.

### Example 1. Scope and vulnerability selection
Rubric-style question:
- Why is this issue in scope for Assignment 1, and why was it chosen over other code smells?

Draft answer before follow-up:
- The app uses `Random`, so we selected that as a crypto weakness.

LLM follow-up pressure:
- Where exactly is `Random` used?
- Is that value tied to authentication or only to UI behavior?
- What code anchor proves the selected path is stronger than the other candidate?

Final tightened answer:
- We selected `Login.generateSessionToken()` because it generates an authentication-related `sessionToken` after successful login, stores it in session state, and clears it on logout.
- We did not select `MainActivity.randomNumberGenerator()` because it appears lower priority and is not part of the retained protected-flow argument.

Evidence anchors used in the final answer:
- `Login.java` 52-59
- `Login.java` 174-181
- `Profile.java` 50-52
- `MainActivity.java` 17-20

### Example 2. Impact boundary and limitation handling
Rubric-style question:
- Are you claiming the weakness guarantees auth bypass or session hijack?

Draft answer before follow-up:
- An attacker may predict the token and take over the session.

LLM follow-up pressure:
- What evidence shows downstream token validation actually accepts attacker-generated values?
- Can you prove takeover, or only weakened unpredictability in a security-relevant token path?

Final tightened answer:
- We are not claiming guaranteed auth bypass or guaranteed session hijack.
- Our retained claim is weaker and evidence-backed: `java.util.Random` reduces unpredictability in an authentication-related `sessionToken` path, which creates a bounded predictability risk under a local-analysis attacker model.
- We explicitly keep the limitation that downstream token-validation behavior is not clearly evidenced in the current build.

Evidence anchors used in the final answer:
- `Login.java` 52-59
- `Login.java` 183-188
- `D01_login_generateSessionToken_random.png`
- `D02_login_createSession_storeToken.png`

### Example 3. Mitigation justification
Rubric-style question:
- Why is your proposed fix realistic, and how does it address the specific weakness you identified?

Draft answer before follow-up:
- We would improve session handling and validation.

LLM follow-up pressure:
- Which mitigation directly fixes the randomness weakness itself?
- Which ideas are only broader hardening suggestions?

Final tightened answer:
- The directly justified fix is to replace `java.util.Random` with `SecureRandom` for `sessionToken` generation.
- We describe rotation, invalidation, and clearer protected-flow validation only as strengthening measures, not as the primary fix for the proven issue.

Evidence anchors used in the final answer:
- `Login.java` 52-59
- retained mitigation wording in the report outline derived from the validated code path

## Final rehearsal outcome
The team-wide final position after mock Q&A was:
- selected issue: weak randomness in authentication-related `sessionToken` generation
- attacker model: bounded local-analysis attacker
- impact: bounded predictability risk, not guaranteed takeover
- fix: `Random` -> `SecureRandom`, with optional lifecycle/enforcement improvements described carefully

## Final Rehearsal Statement
The LLM mock Q&A was used to expose overclaiming risk and improve defensibility.
The final answers kept only those statements that could be supported by decompiled code, screenshots, and bounded attacker assumptions.
