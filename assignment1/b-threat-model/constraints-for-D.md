# Input to D: Attack Preconditions and Limits

## Preconditions D Should Keep
- Approximate login time can be estimated.
- Token prefix/sample is available from realistic leakage channels.
- Candidate search is bounded (time window, prefix length).

## Constraints D Should Explicitly State
- Do not claim universal remote exploitation.
- Keep attacker model realistic (test/dev leakage, rooted/instrumented environment, local compromise scenarios).
- Separate "design weakness exists" from "practical success probability under given assumptions".

## Expected Attack Narrative Shape
1. Observe/infer login timing.
2. Obtain token prefix/sample.
3. Enumerate candidate outputs consistent with generator behavior.
4. Validate candidate token(s) in target flow.

## What to Avoid
- Overstating as guaranteed auth bypass in all environments.
- Introducing unrelated vulnerability classes outside randomness/crypto scope.
