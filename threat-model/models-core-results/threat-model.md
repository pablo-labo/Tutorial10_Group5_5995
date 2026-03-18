# Threat Model

## Selected Vulnerability
Conclusion
- The chosen vulnerability is weak session token generation using `java.util.Random`.
- This is a randomness misuse in a security-sensitive authentication context.

Evidence
- `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` lines 183-188 show `new Random()` used for token generation.
- `Login.java` lines 174-176 show token is persisted as session state.

## Threat Statement
Conclusion
- Deterministic token generation can reduce effective uncertainty under realistic observation conditions.
- Reduced uncertainty can support session impersonation attempts.

Evidence
- Deterministic source in token path: `Login.java` lines 183-188.
- Token used in persisted session state: `Login.java` lines 174-176.

## Attacker Goals
Conclusion
- Primary goal is to predict or reproduce valid token context to weaken session integrity.
- Secondary goal is to reduce candidate space for practical validation.

Evidence
- Token is central to session state lifecycle in `Login` and `Profile` paths.

## Attacker Capabilities
Conclusion
- Realistic capabilities include bounded timing estimation, partial token signal access, and offline candidate generation.
- The model does not require unrealistic omniscient access.

Evidence
- Login-triggered token creation path supports timing-based context: `Login.java` lines 174-176.
- Deterministic generator supports candidate modeling: `Login.java` lines 183-188.

## Attack Preconditions
Conclusion
- Attack feasibility depends on timing context, token signal, and a validation path.
- Claims remain conditional and bounded.

Evidence
- Session token generation and persistence are observable architectural steps in code path.

## Claim Boundaries
Conclusion
- The report does not assume backend compromise.
- The report does not assume remote code execution.
- The report does not claim guaranteed bypass in all environments.

Evidence
- Bounded claim logic is consistent with local-app code evidence and selected vulnerability scope.

## Threat Model Justification
Conclusion
- The threat model is defensible because it links vulnerability location, asset impact, attacker capability, and bounded preconditions.

Evidence
- Vulnerability and persistence anchors: `Login.java` lines 174-176 and 183-188.
- Session lifecycle anchor: `Profile.java` lines 50-52.
