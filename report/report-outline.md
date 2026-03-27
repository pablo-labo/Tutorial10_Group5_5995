# Report Outline for Member A

## Purpose
This file is the A-side report skeleton prepared to meet the Assignment 1 spec and rubric using current B/C/D outputs.
It is written to fit a `2 pages max` USENIX-style report, so each section stays compact and evidence-backed.

## Suggested Title
Predictable Session Token Generation in an Android APK Due to `java.util.Random`

## Section 1. Introduction
### Goal of this section
Explain the app briefly, state the chosen issue, and keep scope strictly within randomness/crypto.

### Report-ready content
This APK implements a simple local registration and login flow using three main activities: `MainActivity`, `Login`, and `Profile` (`apk-decompile_code/resources/AndroidManifest.xml` lines 22-31). After successful credential verification in `Login`, the app creates a value named `sessionToken`, stores it in `SharedPreferences`, and enters the post-login `Profile` screen (`Login.java` lines 52-59, 174-176). Our selected vulnerability is the use of `java.util.Random` to generate this authentication-related token (`Login.java` lines 183-189). This issue is directly within the Assignment 1 scope because it is a misuse of randomness in a security-sensitive context rather than a UI-only random value.

## Section 2. System and Threat Model
### Goal of this section
Show assets, trust boundaries, attacker assumptions, and why the chosen issue matters.

### Report-ready content
The relevant system components are `Login`, which verifies credentials and creates session state, and `Profile`, which represents the post-login state and clears the token on logout (`Login.java` lines 52-59, 174-176; `Profile.java` lines 50-52). The primary protected asset is the unpredictability and integrity of authentication-related session state represented by `sessionToken`. The token crosses an important trust boundary when the app generates it and persists it in `SharedPreferences("SessionPrefs")` (`Login.java` lines 26-27, 44-45, 174-176).

We use a bounded local-analysis attacker model: the attacker can observe or estimate the login time on an emulator, rooted device, or instrumented test environment and may be able to inspect or test token state locally. We do not assume backend compromise, remote code execution, or a guaranteed token-validation sink in the current build. This attacker model is realistic for the provided APK and keeps the claim tutorial-defensible.

## Section 3. Vulnerability Discovery
### Goal of this section
Tie the exact code path to the vulnerability and explain why it is security-relevant.

### Report-ready content
Static analysis of the decompiled APK identified two visible uses of randomness. The first is `MainActivity.randomNumberGenerator()`, which produces a UI-style random integer and has no clear authentication role (`MainActivity.java` lines 17-20). The second is `Login.generateSessionToken()`, which creates a 16-character value using `new Random()` and repeated `nextInt(62)` calls (`Login.java` lines 183-189). Because this value is explicitly named `sessionToken`, created immediately after successful login, stored as session state, and cleared on logout, it has a security-sensitive role rather than a cosmetic one (`Login.java` lines 52-59, 174-176; `Profile.java` lines 50-52).

`java.util.Random` is a deterministic PRNG rather than a cryptographically secure random generator. Session tokens require unpredictability, so using `Random` for this purpose is an inappropriate design choice. This is the main vulnerability selected for Assignment 1.

## Section 4. Attack Scenario and Impact
### Goal of this section
Give a concrete attack path without overclaiming.

### Report-ready content
In the observed flow, the session token is generated immediately after credential verification and persisted through `createSession()` (`Login.java` lines 52-59, 174-176). Under a realistic local-analysis setup, an attacker who can narrow the login timing window can reproduce the same token-generation logic offline and derive candidate outputs from nearby seeds (`Login.java` lines 183-189). If the attacker can also inspect or test stored token state in that environment, they can compare those candidates against the observed token or token-dependent behavior.

The strongest defensible impact is weakened unpredictability of authentication-related session state. Our evidence does not currently show a proven downstream token-validation sink, so we do not claim guaranteed authentication bypass, session hijack, or remote compromise. Instead, we claim that the app creates session-related state with a predictable PRNG where a CSPRNG should have been used.

## Section 5. Fix / Mitigation
### Goal of this section
State a concrete fix that addresses the actual weakness.

### Report-ready content
The primary mitigation is to replace `java.util.Random` with `SecureRandom` when generating `sessionToken`. This directly addresses the demonstrated weakness by removing the predictable PRNG from the session-token path. To strengthen the design further, the app should also generate a higher-entropy token, preserve explicit rotation on login and invalidation on logout, and make token validation explicit before allowing access to protected flow. In our evaluation, the strongest evidence-backed claim is that this fix blocks the predictability path we identified; broader claims about complete authentication enforcement still depend on downstream validation logic that is not clearly evidenced in the current build.

## Section 6. Tooling and AI Use
### Goal of this section
Cover the spec requirement to mention tooling and AI assistance.

### Report-ready content
We used APK decompilation and static code inspection to locate activity structure, authentication flow, and randomness usage. AI assistance was used to help organize evidence, compare candidate findings against the rubric, and rehearse bounded tutorial Q&A. All final claims were checked against decompiled code locations and supporting screenshots before inclusion.

## Figure / Evidence Plan
Use at most one compact code figure in the report body:
- primary choice: screenshot of `Login.generateSessionToken()` with `createSession()` reference
- fallback: screenshot showing `createSession()` storage plus `generateSessionToken()` weak source

## Sentences To Reuse In Presentation
1. We selected the `sessionToken` path, not the UI random path, because only the token has a security-sensitive role.
2. Our claim is bounded on purpose: we prove weak session-token generation, not a guaranteed remote bypass.
3. The rubric rewards a defensible randomness/crypto vulnerability with clear evidence and attack reasoning, which this path provides.
4. Our primary fix is `Random` to `SecureRandom`; validation and lifecycle controls are strengthening measures, not a new unsupported claim.

## A-Side Integration Checklist
- Keep the report title, abstract, and vulnerability statement aligned to one issue only: weak session-token generation.
- Use code anchors that exist in the current repository path, not placeholder `decompile/...` paths.
- Present `SecureRandom` replacement as the primary mitigation because it directly fixes the proven weakness.
- Present validation, rotation, and invalidation as bounded design improvements that strengthen session handling.
- Reuse the same limitation sentence in report, slides, and tutorial Q&A.
