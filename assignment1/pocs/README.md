# PoC: Predictable Session Token (`java.util.Random`)

## Vulnerable logic
From `Login.generateSessionToken()`:
- Uses `new Random()` (time-seeded PRNG)
- Generates 16 chars from a 62-char alphabet
- Stores token as `sessionToken` in `SharedPreferences`

`java.util.Random` is not cryptographically secure for authentication/session material.

## Files
- `predict_session_token.py`: reproduces Java `Random` and brute-forces candidate tokens in a timestamp window.

## Reproduction steps
1. Estimate victim login time (`center-ms`) from logs, network timing, or UI observation.
2. Obtain leaked/partial token prefix (e.g., first 4–8 chars).
3. Run:

```bash
python3 deliverables/pocs/predict_session_token.py \
  --prefix Ab12 \
  --center-ms 1710662400000 \
  --window-ms 5000
```

4. Validate returned candidate token(s) against the target app/session check.

## Expected result
Within a narrow time window, candidate token set is small, demonstrating predictability and weak entropy for a security-sensitive token.

## Mitigation
Replace `Random` with `SecureRandom`, keep token length >= 32 bytes (Base64URL encoded), and rotate tokens on login/logout.
