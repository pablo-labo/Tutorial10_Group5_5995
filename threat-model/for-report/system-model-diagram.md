# System Model Diagram

Compact horizontal diagram for single-column report layout.

```mermaid
flowchart LR
    U["User"]
    MA["MainActivity"]
    CRED[("credentials.txt")]
    LC["Login checkCredentials"]
    CS["createSession"]
    GST["generateSessionToken\nRandom"]
    SP[("SharedPrefs\nsessionToken")]
    PF["Profile"]
    S["Session"]

    A1{{"Asset\nToken entropy"}}
    A2{{"Asset\nSession integrity"}}

    U --> MA --> CRED --> LC --> CS --> GST --> SP --> PF --> S
    SP --> A1
    S --> A2

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#111;
    classDef store fill:#eaf3ff,stroke:#3b82f6,stroke-width:1px,color:#111;
    classDef asset fill:#f0fdf4,stroke:#16a34a,stroke-width:1px,color:#111;

    class GST vuln;
    class CRED,SP store;
    class A1,A2 asset;
```

## Figure Notes
- Main flow: `User -> MainActivity -> credentials.txt -> Login.checkCredentials -> createSession -> generateSessionToken(Random) -> SharedPreferences(sessionToken) -> Profile -> Session`.
- Core security path: `Random -> Token -> SharedPreferences -> Session`.
- Code anchors: `Login.java` 174-176, 183-188; `Profile.java` 50-52.
- Contrast (not core): `MainActivity.java` 17-20 is UI-only random usage.

## LaTeX Placement Tip
Use one-column figure width:
`\\includegraphics[width=\\columnwidth]{system-model-diagram}`
