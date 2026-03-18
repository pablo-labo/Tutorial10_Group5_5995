# Threat Model Diagram (F1)

Horizontal threat model with concise labels to avoid clipping.

```mermaid
flowchart LR
    V["F1 Vulnerability\nRandom for session token"]

    C1["Cap C1\nTiming estimate"]
    C2["Cap C2\nToken fragment access"]
    C3["Cap C3\nOffline candidate gen"]

    P1["Pre P1\nTiming context"]
    P2["Pre P2\nToken signal"]
    P3["Pre P3\nValidation path"]

    G["Goal\nPredict/reproduce token"]
    I["Impact\nWeaker session integrity"]

    L1["Limit\nNo backend compromise"]
    L2["Limit\nNo RCE assumption"]
    L3["Limit\nNo universal bypass claim"]

    V --> G
    C1 --> P1 --> G
    C2 --> P2 --> G
    C3 --> P3 --> G
    G --> I

    L1 -. boundary .-> G
    L2 -. boundary .-> G
    L3 -. boundary .-> G

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#111;
    classDef cap fill:#ecfeff,stroke:#0891b2,stroke-width:1px,color:#111;
    classDef pre fill:#eef2ff,stroke:#6366f1,stroke-width:1px,color:#111;
    classDef impact fill:#f0fdf4,stroke:#16a34a,stroke-width:1px,color:#111;
    classDef limit fill:#fff7ed,stroke:#f97316,stroke-width:1px,color:#111;

    class V vuln;
    class C1,C2,C3 cap;
    class P1,P2,P3 pre;
    class I impact;
    class L1,L2,L3 limit;
```

## Node Notes
- `F1 Vulnerability`: `Login.generateSessionToken()` uses `java.util.Random` (`Login.java` 183-188).
- `Goal`: predict or reproduce valid session token context.
- `Impact`: reduced token unpredictability and weaker session-state integrity.
- `Limits`: bounded claims for tutorial defense (no overstatement).
