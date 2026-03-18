# Attacker Assumptions Q&A Explanation (with evidence + security knowledge)

## Q1: Why include leakage assumptions?
Because threat modeling should avoid unrealistic omnipotence and specify concrete observation channels.

Security knowledge:
- Attack feasibility depends on observability + controllability, not only code weakness.

## Q2: What keeps this defensible in tutorial Q&A?
- We clearly state what is assumed and what is out of scope.
- We tie assumptions to code path criticality (token creation and persistence).

Evidence anchors:
- Token generation: `Login.java` lines 183-188.
- Token persistence: `Login.java` lines 174-176.

## Q3: Why not claim guaranteed exploit?
Because secure reporting requires calibrated claims. We claim increased predictability risk under explicit conditions, which is evidence-based and rubric-safe.
