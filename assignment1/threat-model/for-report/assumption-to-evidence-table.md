# Assumption-to-Evidence Table (For Report)

| ID | Attacker assumption | Code evidence | Why it supports the assumption |
|---|---|---|---|
| A1 | Login timing can be used as attack context | `Login.createSession()` directly calls token generation on successful login (`Login.java` 174-176) | Token creation is tightly coupled to login event timing |
| A2 | Token predictability depends on generator behavior | `new Random()` and repeated `nextInt(62)` in token generation (`Login.java` 183-188) | Deterministic PRNG behavior enables model-based candidate generation |
| A3 | Token is security-sensitive, not UI-only | Token is persisted as `sessionToken` (`Login.java` 174-176); logout removes it (`Profile.java` 50-52) | Confirms token participates in auth-state lifecycle |
| A4 | There is lower-priority random usage outside security role | UI random number in `MainActivity.randomNumberGenerator()` (`MainActivity.java` 17-20) | Distinguishes high-risk auth random from low-risk UI random |
| A5 | App architecture includes explicit auth flow components | Manifest activities (`AndroidManifest.xml` 28-37) | Supports system model and threat-boundary mapping |
