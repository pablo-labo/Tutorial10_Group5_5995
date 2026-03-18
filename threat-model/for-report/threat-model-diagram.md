# Threat Model Diagram (F1)

This threat model explicitly links attacker goals/capabilities to the chosen F1 vulnerability.

```mermaid
flowchart LR
    V["Vulnerability (F1)<br/>Login.generateSessionToken uses java.util.Random"]

    A["Attacker Goal<br/>predict/reproduce sessionToken"]

    C1["Capability C1<br/>bounded login-time estimation"]
    C2["Capability C2<br/>partial token signal access"]
    C3["Capability C3<br/>offline candidate generation"]

    P1["Precondition P1<br/>timing context available"]
    P2["Precondition P2<br/>token fragment/sample available"]
    P3["Precondition P3<br/>candidate validation path exists"]

    I["Impact<br/>reduced token unpredictability and weaker session integrity"]

    X1["Constraint<br/>no backend compromise assumed"]
    X2["Constraint<br/>no RCE assumed"]
    X3["Constraint<br/>no universal guaranteed bypass claim"]

    V --> A
    A --> I

    C1 --> P1
    C2 --> P2
    C3 --> P3

    P1 --> A
    P2 --> A
    P3 --> A

    X1 -. claim boundary .-> A
    X2 -. claim boundary .-> A
    X3 -. claim boundary .-> A

    classDef vuln fill:#ffe9e9,stroke:#cc3333,stroke-width:1px,color:#222;
    classDef cap fill:#ecfeff,stroke:#0891b2,stroke-width:1px,color:#111;
    classDef pre fill:#eef2ff,stroke:#6366f1,stroke-width:1px,color:#111;
    classDef impact fill:#f0fdf4,stroke:#16a34a,stroke-width:1px,color:#111;
    classDef limit fill:#fff7ed,stroke:#f97316,stroke-width:1px,color:#111;

    class V vuln;
    class C1,C2,C3 cap;
    class P1,P2,P3 pre;
    class I impact;
    class X1,X2,X3 limit;
```

## Reading Guide
- Vulnerability source: `Login.java` lines 183-188.
- Security path in system model: `Random -> Token -> SharedPreferences -> Session`.
- This diagram keeps claims realistic and bounded for tutorial defense.
