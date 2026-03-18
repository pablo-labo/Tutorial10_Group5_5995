# Attacker Assumption

## Assumptions Used
Conclusion
- The attacker can estimate login timing within a bounded window.
- The attacker can obtain partial token signal in realistic leakage contexts.
- The attacker can run offline candidate generation.

Evidence
- Token generation occurs in login session path: `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 174-176 and 183-188.

## Assumptions Not Used
Conclusion
- No assumption of server-side compromise.
- No assumption of full remote compromise.
- No assumption of perfect timing precision.
- No dependence on unrelated vulnerability classes.

Evidence
- Model scope stays tied to randomness misuse in token generation path.

## Realism Rationale
Conclusion
- The assumptions are realistic for bounded threat modeling and tutorial defense.
- The assumptions are strong enough to evaluate risk but narrow enough to avoid over-claiming.

Evidence
- Deterministic token source in security role: `Login.java` lines 183-188.
- Persisted token lifecycle: `Login.java` lines 174-176 and `Profile.java` lines 50-52.

## Risk Interpretation
Conclusion
- Under the stated assumptions, predictability risk is credible.
- If assumptions weaken, exploit practicality may drop, but the design weakness remains.

Evidence
- Weak randomness is a property of implementation, independent of attacker success rate in every environment.
