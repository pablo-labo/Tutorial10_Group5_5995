# Submission Checklist (E)

## Naming & Placement
- fix-plan exists and is correctly named.
- submission-checklist exists and is correctly named.
- presentation-compliance-checklist exists and is correctly named.
- Files are placed on Desktop for final packaging.

## Content Completeness
- Primary vulnerability is clearly stated as randomness misuse in session token generation.
- Fix location references Login.generateSessionToken().
- Token length/entropy is increased or equivalent entropy strategy is documented.
- Token rotation and invalidation behavior is stated.
- Verification steps align to D's attack path and boundaries.

## Consistency Checks
- Terminology matches A/B/C/D (randomness misuse; session token; predictable PRNG risk).
- No over-claiming (no guaranteed auth bypass unless proven).
- Fix plan, report, and slides are aligned in wording.

## Timing & Presentation Constraints
- Content can be presented within allotted time.
- Key points are concise and defensible.

## Evidence Linkage
- References to D evidence or PoC are aligned (no new unsupported claims).
- Relevant source files and manifest references are cited where needed.
