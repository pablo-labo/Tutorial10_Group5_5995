# System Model Diagram (Assignment Task 2)

Horizontal diagram with explicit main components, core assets, and data flow (aligned with F1).

```mermaid
flowchart LR
    U["User Input"]

    MA["MainActivity\nsaveCredentialsToFile"]
    CRED[("credentials.txt")]
    LC["Login\ncheckCredentials"]
    CS["Login\ncreateSession"]
    GST["Login\ngenerateSessionToken\n(Random)"]
    SP[("SharedPreferences\nsessionToken")]
    PF["Profile\n(no token validation)"]
    SS["Session"]

    A1{{"Asset A1\nToken Unpredictability"}}
    A2{{"Asset A2\nSession Integrity"}}

    U --> MA
    MA --> CRED
    CRED --> LC
    LC --> CS
    CS --> GST
    GST --> SP
    SP --> PF
    PF --> SS

    SP --> A1
    SS --> A2

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#111;
    classDef store fill:#eaf3ff,stroke:#3b82f6,stroke-width:1px,color:#111;
    classDef asset fill:#f0fdf4,stroke:#16a34a,stroke-width:1px,color:#111;

    class GST vuln;
    class CRED,SP store;
    class A1,A2 asset;
```

## Node Notes (for readability)
- `MainActivity.saveCredentialsToFile`: writes credentials to `credentials.txt`.
- `Login.checkCredentials`: reads and compares stored credentials.
- `Login.createSession`: creates auth session state.
- `Login.generateSessionToken (Random)`: selected F1 weak randomness point.
- `SharedPreferences(sessionToken)`: persistent token store.
- `Profile (no token validation)`: no explicit token validation gate shown in observed flow.

## Security Path
`Random -> Token -> SharedPreferences -> Session`

## Evidence Anchors
- `Login.java` lines 183-188 (weak token generation)
- `Login.java` lines 174-176 (token persistence)
- `MainActivity.java` lines 17-20 (UI-only random contrast)
