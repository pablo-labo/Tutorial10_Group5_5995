# Risk Path Ranking (For Report)

## Ranking objective
Prioritize one core vulnerability for Assignment 1 scoring: randomness/crypto issue with strongest evidence and clearest exploit path.

## Candidate comparison

### Candidate 1 (Selected): auth token generation with `Random`
- Location: `Login.generateSessionToken()` (`Login.java` 183-188)
- Security role: authentication session token
- Impact surface: session-state integrity / impersonation resistance
- Exploitability narrative: realistic with bounded timing + leakage assumptions
- Rubric fit: direct randomness/crypto misuse in security-sensitive context

### Candidate 2 (Not selected): UI random number
- Location: `MainActivity.randomNumberGenerator()` (`MainActivity.java` 17-20)
- Security role: UI/display behavior
- Impact surface: minimal security effect
- Exploitability narrative: weak or non-security
- Rubric fit: low

## Final ranking
1. Candidate 1 (core vulnerability)
2. Candidate 2 (supporting context only)

## Why this ranking is defensible
It explicitly maps vulnerability location -> security role -> attacker goal -> realistic threat path, and avoids over-broad or out-of-scope claims.
