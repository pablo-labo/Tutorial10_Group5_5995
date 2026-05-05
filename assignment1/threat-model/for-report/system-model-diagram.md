# System Model Diagram

Unified horizontal diagram with style matching the preferred version.

```mermaid
flowchart LR
    classDef process fill:#efe9ff,stroke:#7a63d1,stroke-width:1.5px,color:#1f1f1f;
    classDef entity fill:#e8f6e8,stroke:#4b9b5f,stroke-width:1.5px,color:#1f1f1f;
    classDef datastore fill:#fff6d9,stroke:#b08a00,stroke-width:1.5px,color:#1f1f1f;

    E1["User / Admin"]
    A1["Attacker\n(Local / MITM)"]

    subgraph TB1["Trust Boundary 1: External -> App Process"]
      P1(("P1: Register / Login"))
      P2(("P2: Session Handling\ngenerateSessionToken()"))
      P3(("P3: Profile / Logout"))
    end

    subgraph TB2["Trust Boundary 2: App Process -> Local Storage"]
      DS1["DS1\n────────────\ncredentials.txt"]
      DS2["DS2\n────────────\nSessionPrefs: sessionToken"]
    end

    E1 -->|"credentials input"| P1
    P1 -->|"write/read credentials"| DS1
    P1 -->|"auth success"| P2
    P2 -->|"generate + store token"| DS2
    P2 -->|"open profile"| P3
    P3 -->|"logout remove token"| DS2

    A1 -.->|"observe login timing"| P2
    A1 -.->|"attempt token-state inference"| DS2

    class E1,A1 entity
    class P1,P2,P3 process
    class DS1,DS2 datastore

    style TB1 fill:#ffffff,stroke:#8a8a8a,stroke-width:1.5px,stroke-dasharray: 6 4
    style TB2 fill:#ffffff,stroke:#8a8a8a,stroke-width:1.5px,stroke-dasharray: 6 4
```

## Figure Notes
- Data flow aligned with agreed chain: `User input -> MainActivity.saveCredentialsToFile -> credentials.txt -> Login.checkCredentials -> Login.createSession -> Login.generateSessionToken -> SharedPreferences(sessionToken) -> Profile`.
- Core security path: `Random -> Token -> SharedPreferences -> Session`.
- Code anchors: `Login.java` 174-176 and 183-188, `MainActivity.java` 17-20, `Profile.java` 50-52.
