# Rubric Mapping for B Deliverables

## Task 2 Alignment (System Model)
- App purpose summary: in `system-model.md` (App Purpose section).
- Components/assets/data flows: in `system-model.md` (Components, Key Assets, Data Flow).
- Assumptions and attacker goals: in `threat-model.md` + `attacker-assumptions.md`.

## Task 4 Alignment (Threat Model)
- Where value is generated: `Login.generateSessionToken()` (`Login.java` lines 183-188).
- Why unsuitable: non-cryptographic deterministic PRNG in security-sensitive role.
- Required attacker knowledge/capability: timing estimate + token leakage + bounded search.
- Realistic model and limits: documented in `attacker-assumptions.md`.

## B -> A / D Interfaces
- Risk priority recommendation for final vulnerability claim: `risk-priority-to-A.md`.
- Exploit preconditions/limits for PoC narrative: `constraints-for-D.md`.

## Tutorial Defense Readiness
- 40s speaking script: `presentation-B-40s.md`.
- 5x5 matrix text for B row: `activity-log-B.md`.
