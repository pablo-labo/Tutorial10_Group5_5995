# Threat Model Diagram (F1)

Detailed horizontal threat model with explicit preconditions, capabilities, constraints, impact, and code anchors.

```mermaid
flowchart LR
    V["Chosen Vulnerability (F1)\nLogin.generateSessionToken() uses java.util.Random\n(Login.java 183-188)"]

    G["Attacker Goal\nPredict/reproduce valid session token context\nto weaken authentication-state integrity"]

    C1["Capability C1\nEstimate victim login timing\nwithin bounded window"]
    C2["Capability C2\nObtain partial token signal\n(prefix/sample) in realistic contexts"]
    C3["Capability C3\nRun offline candidate generation\nfrom known PRNG behavior"]

    P1["Precondition P1\nTiming context available"]
    P2["Precondition P2\nToken signal available"]
    P3["Precondition P3\nCandidate validation path exists"]

    I["Impact\nReduced token unpredictability\nWeaker session-state integrity"]

    L1["Constraint L1\nNo backend/server compromise assumed"]
    L2["Constraint L2\nNo remote code execution assumed"]
    L3["Constraint L3\nNo universal guaranteed bypass claim"]

    K1["Code Anchor\nLogin.java 174-176\ncreateSession stores sessionToken"]
    K2["Code Anchor\nProfile.java 50-52\nclearSession lifecycle endpoint"]

    V --> G
    C1 --> P1 --> G
    C2 --> P2 --> G
    C3 --> P3 --> G
    G --> I

    K1 -. evidence .-> G
    K2 -. lifecycle evidence .-> I

    L1 -. claim boundary .-> G
    L2 -. claim boundary .-> G
    L3 -. claim boundary .-> G

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#111;
    classDef cap fill:#ecfeff,stroke:#0891b2,stroke-width:1px,color:#111;
    classDef pre fill:#eef2ff,stroke:#6366f1,stroke-width:1px,color:#111;
    classDef impact fill:#f0fdf4,stroke:#16a34a,stroke-width:1px,color:#111;
    classDef limit fill:#fff7ed,stroke:#f97316,stroke-width:1px,color:#111;
    classDef anchor fill:#fefce8,stroke:#ca8a04,stroke-width:1px,color:#111;

    class V vuln;
    class C1,C2,C3 cap;
    class P1,P2,P3 pre;
    class I impact;
    class L1,L2,L3 limit;
    class K1,K2 anchor;
```

## Threat Logic Summary
- Vulnerability is directly linked to token generation in auth path.
- Attack claim is bounded by explicit capabilities/preconditions.
- Constraints are part of the model to avoid over-claiming.
