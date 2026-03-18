# Threat Model Q&A Explanation (with evidence + security knowledge)

## Q1: Why is this a randomness/crypto issue under rubric scope?
Because the weakness is in token entropy source selection (`Random` vs CSPRNG), directly affecting unpredictability.

Evidence:
- `new Random()` in `Login.generateSessionToken()` (`Login.java` line 184).

## Q2: Why is this security-relevant if app is local?
Local architecture does not remove authentication-state risk. If token-bearing state is predictable, impersonation resistance degrades in environments where attacker can observe timing/leakage.

Security knowledge:
- Threat models must match environment assumptions; local app still needs secure auth-state generation.

## Q3: Are you over-claiming universal bypass?
No. We explicitly limit claims:
- bounded timing + leakage assumptions required,
- no universal guaranteed exploit claim,
- no unrelated vulnerabilities relied upon.

## Q4: Why prioritize this over other findings?
Because it is exactly on the auth token path and strictly in scoring scope. UI-only random usage is lower security impact.

Evidence comparison:
- Auth path random: `Login.java` lines 183-188
- UI random: `MainActivity.java` lines 17-20
