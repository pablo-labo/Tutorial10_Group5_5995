# Prompt-Response Summaries

## Purpose
This file records representative AI interactions in summary form.
Each entry captures the task, the kind of AI output received, and whether the output was accepted, modified, or rejected.

## Entry 1. Decompilation workflow guidance
Prompt summary:
- asked AI how to unpack and inspect an unfamiliar Android APK for security analysis

AI output summary:
- suggested decompilation workflow using standard APK analysis tools
- suggested checking manifest, main activity, and login-related classes first

Outcome:
- accepted as workflow guidance

Validation:
- package name, activity structure, and login-related classes were confirmed in the decompiled project

## Entry 2. Candidate vulnerability search strategy
Prompt summary:
- asked AI how to search for randomness/crypto issues relevant to the assignment scope

AI output summary:
- suggested focusing on values used as token, session, auth code, identifier, or key material
- suggested searching for `random`, `token`, `session`, `auth`, `login`

Outcome:
- accepted and used as search guidance

Validation:
- direct code search located the `sessionToken` path in `Login.java`
- non-selected random usage in `MainActivity.java` was confirmed as lower priority

## Entry 3. Vulnerability selection support
Prompt summary:
- asked AI to compare candidate randomness sites and recommend the most defensible one

AI output summary:
- recommended selecting the `sessionToken` generation path rather than UI/debug randomness

Outcome:
- accepted, but only after direct evidence review

Validation:
- confirmed that the selected value was named `sessionToken`
- confirmed it was created after successful login, stored in `SharedPreferences`, and later cleared on logout

## Entry 4. Threat-model drafting support
Prompt summary:
- asked AI to help frame a realistic attacker model and attack scenario

AI output summary:
- proposed a bounded local-analysis attacker model
- suggested a predictability narrative tied to login timing and offline candidate generation

Outcome:
- accepted in narrowed form

Validation:
- retained only local-analysis assumptions supported by the APK
- removed any stronger implication of guaranteed remote exploitation

## Entry 5. Risk wording and claim-boundary support
Prompt summary:
- asked AI to help produce concise vulnerability, impact, and limitation wording

AI output summary:
- proposed wording for weak randomness in an authentication-related token path
- proposed warning language against overclaiming auth bypass

Outcome:
- accepted after tightening

Validation:
- final wording was aligned to visible code evidence and retained the limitation that downstream token validation was not clearly shown

## Entry 6. Fix / mitigation support
Prompt summary:
- asked AI what mitigation most directly addresses the chosen weakness

AI output summary:
- recommended replacing `java.util.Random` with `SecureRandom`
- suggested additional session-lifecycle and enforcement improvements

Outcome:
- partially accepted

Validation:
- `SecureRandom` replacement was kept as the direct primary fix
- broader lifecycle and validation ideas were retained only as strengthening measures

## Entry 7. Mock tutorial Q&A support
Prompt summary:
- asked AI to simulate rubric-driven tutorial questions

AI output summary:
- generated questions about scope, attacker model, exploitability, and limitation boundaries

Outcome:
- accepted as rehearsal support

Validation:
- answers were revised to stay within evidence-backed boundaries
- unsupported statements were removed before reuse in project materials

## Entry 8. Step-by-step AI interaction example
Purpose:
- satisfy the requirement to record at least one step-by-step AI interaction used during analysis

Step 1. Initial prompt:
- asked AI how to search an unfamiliar APK for a vulnerability related specifically to randomness / cryptography within Assignment 1 scope

AI response summary:
- suggested starting from login, token, auth, and session-related code paths
- suggested searching for `random`, `token`, `session`, `auth`, `login`
- warned that UI/demo randomness should not be selected unless tied to a protected asset

Step 2. Human follow-up:
- searched the decompiled project using the suggested keywords
- located both `Login.generateSessionToken()` and `MainActivity.randomNumberGenerator()`

Step 3. Follow-up prompt:
- asked AI which of the two random-looking code locations was more defensible under the rubric

AI response summary:
- recommended prioritizing the login/session path if the generated value was used as authentication-related state
- recommended deprioritizing the UI/debug random number generator unless it affected a protected action

Step 4. Human evidence check:
- confirmed in decompiled code that `Login.generateSessionToken()` used `java.util.Random`
- confirmed that the generated `sessionToken` was created after successful login, stored in `SharedPreferences`, and later cleared on logout
- confirmed that `MainActivity.randomNumberGenerator()` was unrelated to the retained authentication attack path

Step 5. Draft wording prompt:
- asked AI to help phrase the finding without overclaiming guaranteed bypass or remote takeover

AI response summary:
- proposed bounded wording around weak randomness in an authentication-related token path
- suggested explicitly stating any limitation if downstream token enforcement could not be shown

Step 6. Human narrowing:
- kept the core claim about weak randomness in `sessionToken` generation
- removed any wording that implied guaranteed auth bypass
- added the limitation that downstream token-validation behavior was not clearly evidenced in the current build

Outcome:
- partially accepted and narrowed through direct code validation

Why this interaction was retained:
- it improved workflow efficiency and wording quality while staying within Assignment 1 scope
- every retained claim from this interaction was checked manually against the APK evidence before use
