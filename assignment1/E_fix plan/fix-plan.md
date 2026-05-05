# Fix Plan (E)

## Scope & Dependency Inputs
- Depends on A: final vulnerability definition (primary: randomness misuse in session token generation).
- Depends on C: fix locations (Login.generateSessionToken, MainActivity/Login, Profile).
- Depends on D: attack validation boundaries and PoC notes.

## Goals
1. Replace non-cryptographic PRNG with cryptographically secure randomness for session token generation.
2. Increase token entropy (length/encoding) to reduce predictability and brute-force feasibility.
3. Enforce token lifecycle: rotation on login, invalidation on logout, optional expiry.
4. Confirm fix blocks the demonstrated attack path without over-claiming.

## Fix / Mitigation Design
### 1) SecureRandom for token generation (primary fix)
- Target: `Login.generateSessionToken()`
- Change `java.util.Random` -> `java.security.SecureRandom`.
- Rationale: eliminates predictable PRNG sequence in security-sensitive context.

### 2) Token length & encoding
- Increase token length from 16 chars to 32+ chars or equivalent 192+ bits.
- Use Base64 URL-safe or hex encoding.

### 3) Rotation & invalidation
- On successful login: always generate a new token and overwrite previous value.
- On logout: delete `sessionToken` from `SharedPreferences`.
- Optional: store `issuedAt` + `ttl` and treat expired tokens as invalid.

### 4) Enforce usage (access control)
- Add token presence/validity check before Profile access.
- If missing/invalid: redirect to Login.

## Verification Strategy (aligned to D)
1. Verify `SecureRandom` is used in `generateSessionToken()`.
2. Confirm token length/encoding change in generated values.
3. Confirm token rotation on login and removal on logout.
4. Validate that Profile access checks token existence/validity.
5. Attempt the prior predictability path (timed window) and confirm no feasible enumeration.

## Risk & Boundary Statement
- Fix addresses randomness misuse and predictability; does not claim complete auth bypass prevention without downstream token validation evidence.
- Mitigation is scoped to the demonstrated risk path.
