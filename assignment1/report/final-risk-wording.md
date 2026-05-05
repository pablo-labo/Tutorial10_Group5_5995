# Final Risk Wording for Team Use

## Purpose
This file gives the exact wording member A should use when integrating B/C/D materials into the final report, presentation, and tutorial Q&A.

## Primary Wording
The app generates an authentication-related `sessionToken` with `java.util.Random` in `Login.generateSessionToken()` and stores it as session state immediately after successful login. Because session tokens require unpredictability, using a deterministic non-CSPRNG source is unsuitable for this security-sensitive purpose.

## Impact Wording
The strongest evidence-backed impact in the current build is weakened unpredictability of authentication-related session state. Under realistic local-analysis conditions, an attacker can reproduce the same generation logic offline and attempt bounded prediction or comparison against observed token state.

## Limitation Wording
Current evidence shows token generation, storage, retrieval, and clearing more clearly than downstream token validation. Therefore, this work does not claim guaranteed authentication bypass, session hijack, or remote takeover.

## Short Version for Slides
Weak randomness is used to generate a security-sensitive `sessionToken`, so the app creates session state with a predictable PRNG rather than a cryptographically secure generator.

## Short Version for Tutorial Q&A
Our selected issue is not generic use of `Random`; it is the use of `java.util.Random` to generate a value explicitly used as `sessionToken`. That makes it a valid Assignment 1 randomness vulnerability, but our impact claim remains bounded because the current code does not show a proven token-validation sink.

## Wording To Avoid
1. "We proved full auth bypass."
2. "The attacker can definitely log in as another user."
3. "The app is remotely exploitable from the internet."
4. "Any use of `Random` is automatically a vulnerability."

## One-Line Fix Wording
Replace `java.util.Random` with `SecureRandom` for session-token generation and enforce explicit validation and invalidation of token-based session state.

## Extended Fix Wording
Our primary fix is to replace `java.util.Random` with `SecureRandom` in `Login.generateSessionToken()`, because this directly removes the predictable PRNG from the demonstrated vulnerability path. We can then strengthen session handling further by using a higher-entropy token, rotating it on login, invalidating it on logout, and making protected-flow validation explicit.

## Fix Boundary Wording
The `SecureRandom` change addresses the proven randomness misuse. Extra checks around validation and lifecycle strengthen the overall session design, but they should be described as mitigation improvements rather than proof that the current APK already enforces token-based access correctly.

## Short Version for A
Lead with the exact weak-randomness site, then explain the primary fix, then restate the limitation boundary. Do not present optional enforcement improvements as if they were already evidenced runtime behavior.
