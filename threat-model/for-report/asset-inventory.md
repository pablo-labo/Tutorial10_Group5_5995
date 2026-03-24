# Asset Inventory (Refined Draft)

## Scope Note
This inventory is built for the selected vulnerability: **randomness misuse in session token generation (predictable PRNG risk)**.

Threat IDs used below:
- T1: Predictable token generation (`Random` in auth token path).
- T2: Token-state observation/abuse in local-analysis scenario.
- T3: Session integrity weakening due to weak token design.

## Asset Table
| Asset Name | Asset Type | Location (DFD Node / Code) | Owner | CIA Impact | Sensitivity | Related Threat |
|---|---|---|---|---|---|---|
| `sessionToken` value | Data (auth state) | `DS2` SharedPreferences `SessionPrefs`; `Login.java` 174-176 | App auth/session logic | C: High, I: High, A: Medium | High | T1, T2, T3 |
| Token generation logic | Process / Code | `P2 Login`; `Login.generateSessionToken()` `Login.java` 183-188 | App auth/session logic | C: Medium, I: High, A: Low | High | T1, T3 |
| Session creation flow | Process / Data flow | `P2 -> DS2`; `createSession()` `Login.java` 174-176 | App auth/session logic | C: Medium, I: High, A: Medium | High | T1, T3 |
| Session removal flow | Process / Data flow | `P3 -> DS2`; `Profile.clearSession()` `Profile.java` 50-52 | App auth/session logic | C: Low, I: Medium, A: Medium | Medium | T2, T3 |
| Credentials file content | Data (credential) | `DS1 credentials.txt`; `MainActivity.java` 54-63 | App registration/login logic | C: High, I: High, A: Medium | High | Supporting context (non-core for this threat) |
| Credential check logic | Process / Code | `P2 Login`; `checkCredentials()` `Login.java` 71+ | App login logic | C: Medium, I: High, A: Medium | Medium | Supporting context (non-core for this threat) |
| Activity transition control | Process / Flow control | `Login.java` 52-59 (`startActivity(Profile)`) | App UI/auth flow | C: Low, I: Medium, A: Low | Medium | T3 |
| App process runtime | Runtime platform asset | Android app sandbox process | App/platform boundary | C: Medium, I: Medium, A: Medium | Medium | T2 |
| Local persistent storage boundary | Infrastructure/storage asset | App-private storage (`DS1`, `DS2`) | App/platform boundary | C: High, I: Medium, A: Medium | High | T2 |
| Third-party Android libraries | Supply-chain asset | Decompiled dependencies in APK | Build/dependency owner | C: Low, I: Medium, A: Low | Medium | Supply-chain context (not primary threat path) |

## Notes for Report Use
1. For the 2-page report, keep only top 3-5 assets (token value, token generation logic, session creation flow, local storage boundary, credentials file as context).
2. Keep threat linkage explicit: T1/T2/T3 should map to DFD `P2`, `DS2`, and flow `P2 -> DS2`.
