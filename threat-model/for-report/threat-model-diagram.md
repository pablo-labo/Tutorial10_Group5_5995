# Threat Model Diagram

Compact horizontal diagram with the same style as the first version.

```mermaid
flowchart LR
    V["F1\nRandom token"]

    C1["C1\nTiming window"]
    C2["C2\nToken signal"]
    C3["C3\nOffline generation"]

    P1["P1\nTiming known"]
    P2["P2\nSignal available"]
    P3["P3\nValidation path"]

    G["Goal\nPredict token"]
    I["Impact\nWeaker session integrity"]

    L1["L1\nNo backend compromise"]
    L2["L2\nNo RCE"]
    L3["L3\nNo universal bypass claim"]

    V --> G --> I
    C1 --> P1 --> G
    C2 --> P2 --> G
    C3 --> P3 --> G

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

## Figure Notes
- F1 code anchor: `Login.generateSessionToken()` uses `Random` in `Login.java` 183-188.
- Session persistence anchor: `Login.java` 174-176.
- Lifecycle anchor: `Profile.java` 50-52.
- Interpretation: risk claim is conditional on P1-P3 and bounded by L1-L3.

## LaTeX Placement Tip
Use one-column figure width:
`\\includegraphics[width=\\columnwidth]{threat-model-diagram}`
