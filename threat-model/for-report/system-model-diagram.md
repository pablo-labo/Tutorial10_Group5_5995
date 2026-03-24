# System Model Diagram

Unified horizontal diagram with style matching the preferred version.

```mermaid
flowchart LR
    U["User"]

    MA["MainActivity<br/>(saveCredentialsToFile)"]
    LO["Login<br/>(checkCredentials)"]
    CS["Login<br/>(createSession)"]
    PR["Profile<br/>(no token validation / logout)"]

    CRED[("credentials.txt")]
    SP[("SharedPreferences<br/>SessionPrefs.sessionToken")]

    RNG1[["Random() in Login.generateSessionToken"]]
    RNG2[["Random() in MainActivity.randomNumberGenerator"]]

    A1{{"Asset: Authentication state integrity"}}
    A2{{"Asset: sessionToken unpredictability"}}

    U -->|register input| MA
    MA -->|write username/password| CRED

    U -->|login input| LO
    LO -->|read + compare credentials| CRED
    LO -->|valid login| CS

    CS -->|calls generateSessionToken| RNG1
    RNG1 -->|token output| CS
    CS -->|store sessionToken| SP

    SP -->|session state used| PR
    U -->|logout action| PR
    PR -->|logout clears token| SP

    SP --> A1
    SP --> A2

    RNG2 -. UI-only random value .-> MA

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px;
    class RNG1 vuln;
```

## Figure Notes
- Data flow aligned with agreed chain: `User input -> MainActivity.saveCredentialsToFile -> credentials.txt -> Login.checkCredentials -> Login.createSession -> Login.generateSessionToken -> SharedPreferences(sessionToken) -> Profile`.
- Core security path: `Random -> Token -> SharedPreferences -> Session`.
- Code anchors: `Login.java` 174-176 and 183-188, `MainActivity.java` 17-20, `Profile.java` 50-52.
