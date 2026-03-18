# System Model Diagram (Assignment Task 2)

This diagram is designed to satisfy Task 2 requirements: main components, key assets, and data flows, explicitly connected to the chosen vulnerability.

```mermaid
flowchart LR
    U[User]

    MA[MainActivity\n(Register / Navigate to Login)]
    LO[Login\n(checkCredentials + createSession)]
    PR[Profile\n(Logout)]

    CRED[(credentials.txt)]
    SP[(SharedPreferences\nSessionPrefs.sessionToken)]

    RNG1[[Random() in Login.generateSessionToken]]
    RNG2[[Random() in MainActivity.randomNumberGenerator]]

    A1{{Asset: Authentication state integrity}}
    A2{{Asset: sessionToken unpredictability}}

    U -->|register input| MA
    U -->|login input| LO

    MA -->|write username/password| CRED
    LO -->|read + compare credentials| CRED

    LO -->|on valid login -> createSession| SP
    RNG1 -->|token material| LO

    PR -->|logout clears token| SP
    U -->|logout action| PR

    SP --> A1
    SP --> A2

    RNG2 -. UI-only random value .-> MA

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px;
    class RNG1 vuln;
```

## Figure notes for report text
- Chosen vulnerability location: `apk-decompile_code/sources/com/example/mastg_test0016/Login.java` (lines 183-188).
- Security-relevant data flow: `generateSessionToken()` -> `createSession()` -> `SharedPreferences(sessionToken)`.
- Lower-priority contrast point: `MainActivity.randomNumberGenerator()` is UI-only and not the selected core vulnerability.
