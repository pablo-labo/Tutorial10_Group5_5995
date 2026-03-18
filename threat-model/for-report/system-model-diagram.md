# System Model Diagram (Assignment Task 2)

The diagram below is aligned with the agreed C evidence flow and the selected F1 core vulnerability.

```mermaid
flowchart TD
    U["1) User Input<br/>username / password"]

    subgraph APP["Application Processes"]
      MA["2) MainActivity.saveCredentialsToFile()<br/>stores registration credentials"]
      LC["4) Login.checkCredentials()<br/>reads + compares credentials"]
      CS["5) Login.createSession()<br/>creates session state"]
      GST["6) Login.generateSessionToken()<br/>uses java.util.Random (F1)"]
      PF["8) Profile<br/>(no explicit token validation gate)"]
    end

    CRED[("3) credentials.txt<br/>plaintext credential store")]
    SP[("7) SharedPreferences<br/>SessionPrefs.sessionToken")]
    S["Session State"]

    U --> MA
    MA --> CRED
    CRED --> LC
    LC --> CS
    CS --> GST
    GST --> SP
    SP --> PF
    PF --> S

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#222;
    classDef store fill:#eaf3ff,stroke:#3b82f6,stroke-width:1px,color:#111;
    classDef proc fill:#f8fafc,stroke:#64748b,stroke-width:1px,color:#111;

    class GST vuln;
    class CRED,SP store;
    class MA,LC,CS,PF proc;
```

## Security Path Callout
`Random` -> `Token` -> `SharedPreferences` -> `Session`

## Figure Notes
- Core weak point: `Login.java` lines 183-188.
- Token persistence: `Login.java` lines 174-176.
- Supporting contrast (not core): `MainActivity.randomNumberGenerator()` (`MainActivity.java` lines 17-20).
