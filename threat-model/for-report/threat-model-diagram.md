# Attack Path Diagram (Threat Model)

Compact 5-step attack path focused on the selected vulnerability.

```mermaid
flowchart TB
    S1["Step 1: Observe login window"]
    S2["Step 2: Random-based token created\n(Login.java 183-188)"]
    S3["Step 3: Generate candidates offline\n(bounded seed window)"]
    S4["Step 4: Compare with token signal\n(SessionPrefs path)"]
    S5["Step 5: Demonstrate reduced\nsession-token unpredictability"]

    S1 -->|"timing context"| S2
    S2 -->|"deterministic output"| S3
    S3 -->|"candidate set"| S4
    S4 -->|"match evidence"| S5

    P1["Preconditions:\nP1 timing estimate\nP2 token signal access\nP3 validation path"]
    B1["Boundary:\nNo guaranteed remote takeover claim"]

    P1 -. required .-> S3
    B1 -. scope limit .-> S5
```

## Short Explanation
1. The vulnerability is on the token-generation point in `Login.generateSessionToken()` using `java.util.Random`.
2. Under bounded timing knowledge, deterministic candidate generation becomes plausible in local-analysis conditions.
3. If candidate validation is available, attacker can demonstrate weaker token unpredictability.
4. This supports a bounded threat claim on authentication-state integrity, not a universal remote bypass claim.

## LaTeX Placement Tip
Use one-column figure width:
`\\includegraphics[width=\\columnwidth]{attack-path-diagram}`
