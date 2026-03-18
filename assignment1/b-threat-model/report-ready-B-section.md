# Report-Ready Text (B Sections)

## System and Threat Model
The target APK (`com.example.mastg_test0016`) defines a three-screen local authentication flow (`MainActivity`, `Login`, `Profile`) as shown in the manifest (`AndroidManifest.xml`, lines 7 and 28-37). The protected asset in our scope is session-state integrity: after successful credential checks, `Login.createSession()` persists `sessionToken` into `SharedPreferences` (`Login.java`, lines 174-176). The session lifecycle ends when `Profile.clearSession()` removes the token (`Profile.java`, lines 50-52).

Our attacker goal is session impersonation by predicting or reproducing valid session-token values. We assume realistic capabilities: bounded login-time estimation, partial token leakage in test/dev or compromised-device settings, and offline candidate generation. We do not assume remote code execution or backend compromise. Under this model, token unpredictability is a required security property because the token is used as authentication state material rather than UI-only randomness.

## Threat Explanation for the Core Finding
The token is generated in `Login.generateSessionToken()` using `java.util.Random` (`Login.java`, lines 183-188). This generator is deterministic and unsuitable for security-sensitive token generation. Because token creation occurs immediately after successful login (`Login.java`, lines 58 and 174-176), an attacker with bounded timing knowledge and token leakage can reduce the candidate space and attempt session-token prediction. Therefore, this issue is not merely code style: it is a direct authentication-state risk within randomness/crypto scope.
