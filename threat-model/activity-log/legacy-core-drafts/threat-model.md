# Threat Model (Role B)

## Core Threat Statement
The app uses `java.util.Random` in `Login.generateSessionToken()` to produce a security-sensitive session token. This PRNG is deterministic and not designed for cryptographic security, making token outputs more predictable than required for authentication state.

## Attacker Goal
- Impersonate a logged-in user by predicting or reproducing valid `sessionToken` values.

## Protected Assets in Scope
- Session authenticity and login-state integrity.

## Attacker Capabilities (Realistic)
- Can estimate victim login time within a bounded error window.
- Can obtain token prefix/sample through realistic channels in test/dev or compromised-device scenarios (logs, instrumentation, local leakage).
- Can run offline candidate generation and then test candidates.

## Out-of-Scope Capabilities
- No assumption of remote code execution.
- No assumption of backend/server compromise.
- No requirement to break strong cryptography.

## Preconditions for Exploitation
1. Login event timing can be approximated.
2. Partial or full token information is observable/leaked.
3. Attacker can generate candidates from known generator behavior.

## Why This Is Security-Relevant
Token generation is part of authentication state control, not UI-only randomness. A predictable generator in this position reduces effective entropy and weakens session impersonation resistance.

## Risk Priority Recommendation (to A)
Choose this as the single core vulnerability because it is:
- In exact randomness/crypto marking scope
- Backed by direct code evidence
- Defensible with a realistic attacker model and bounded exploit path
