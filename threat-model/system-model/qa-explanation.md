# System Model Q&A Explanation (with evidence + security knowledge)

## Q1: Why is `sessionToken` treated as a high-value asset?
Because it is authentication-state material, not display-only data. Once stored, it represents whether a user is considered logged in. Security principle: bearer session tokens require strong unpredictability and lifecycle control.

Evidence:
- Token persistence in `createSession()` (`Login.java` lines 174-176).
- Token removal in logout (`Profile.java` lines 50-52).

## Q2: How do you know this is not just UI random behavior?
`MainActivity.randomNumberGenerator()` exists but is UI-level (`MainActivity.java` lines 17-20). The chosen vulnerability is different: token generation in `Login.generateSessionToken()` feeds authentication state.

Security knowledge:
- Risk depends on security role, not only API name. Same API can be low risk in UI and high risk in auth flows.

## Q3: Where are trust boundaries in this app?
- User input -> auth logic
- Auth logic -> token creation
- Token creation -> persistent state
- Persistent state -> profile access lifecycle

Why this matters:
- Threat modeling requires placing vulnerabilities in boundaries where trust decisions are made.

## Q4: How does this help tutorial defense?
It gives a complete chain from architecture to exploitability:
component -> data flow -> trust boundary -> security property -> risk.
This avoids unsupported claims and keeps arguments rubric-aligned.
