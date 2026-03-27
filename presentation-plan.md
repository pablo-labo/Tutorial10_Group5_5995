# Presentation Plan

## Purpose
This file is the source plan for the required `presentation.mp4`.
It is designed to keep the team within:
- `<= 5 minutes` total
- `>= 40 seconds` speaking time per member
- one consistent, bounded vulnerability narrative

## Presentation Goal
Explain one defensible Assignment 1 issue:
- the app generates authentication-related `sessionToken` state using `java.util.Random`

The recording should prove that the team:
- selected an in-scope randomness/crypto vulnerability
- understood the system and threat model
- validated the code evidence
- can explain a bounded attack path
- can justify a concrete fix without overclaiming

## Global Boundary Rules
Must say:
- the issue is the `sessionToken` path, not generic use of `Random`
- impact is bounded
- the current build does not prove guaranteed auth bypass, session hijack, or remote takeover
- `SecureRandom` is the primary fix

Must not say:
- "we proved full auth bypass"
- "the app is remotely exploitable from the internet"
- "any use of Random is automatically a vulnerability"

## Recommended Evidence Pack for Slides
Default slide evidence set:
- `evidence/D01_login_generateSessionToken_random.png`
- `evidence/D02_login_createSession_storeToken.png`
- `evidence/D04_login_successPath_createSession_profile.png`
- `evidence/D05_profile_clearSession_removeToken.png`
- `evidence/D07_main_randomNumberGenerator_nonSelected.png`

Backup only:
- `D06`, `D08`, `D09`, `D10`, `D11`

## 5-Minute Speaking Allocation
Total target: about 4 minutes 30 seconds to 4 minutes 50 seconds

Recommended allocation:
- Rongbang Cheng (A): 55 seconds
- Sienna (B): 55 seconds
- Chen Letian (C): 55 seconds
- Frank (D): 55 seconds
- Shi (E): 55 seconds

Total planned speaking time:
- about 4 minutes 35 seconds

Reserved buffer:
- about 25 seconds for transitions or slight overruns

This satisfies the `>= 40 seconds` rule for all five members.

## Slide and Script Structure

### Slide 1. Title and final selected issue
Speaker:
- Rongbang Cheng

Time:
- 0:00 to 0:55

Must cover:
- app context in one sentence
- exact selected issue
- why it is in Assignment 1 scope

Core line:
- The selected issue is not generic use of randomness; it is the use of `java.util.Random` to generate an authentication-related `sessionToken` after successful login.

Visual:
- title only or app-flow overview

### Slide 2. System and threat model
Speaker:
- Sienna

Time:
- 0:55 to 1:50

Must cover:
- relevant components: `Login`, `Profile`, `SharedPreferences`
- protected asset
- bounded attacker model

Core line:
- The protected asset is the unpredictability and integrity of authentication-related session state, and our attacker is a bounded local-analysis attacker rather than an internet-scale remote adversary.

Visual:
- simple system/threat model diagram

### Slide 3. Code evidence and vulnerability selection
Speaker:
- Chen Letian

Time:
- 1:50 to 2:45

Must cover:
- successful login leads to session creation
- `createSession()` stores `sessionToken`
- `generateSessionToken()` uses `new Random()`
- why `MainActivity.randomNumberGenerator()` was not selected

Core line:
- We selected this path because the value is explicitly named `sessionToken`, stored as session state, and cleared on logout, which makes unpredictability security-relevant.

Visual:
- `D04`
- `D02`
- `D01`
- optionally `D07` briefly

### Slide 4. Attack scenario and bounded impact
Speaker:
- Frank

Time:
- 2:45 to 3:40

Must cover:
- bounded preconditions
- short attack path
- limitation boundary

Core line:
- Under local-analysis conditions, an attacker can reproduce candidate outputs around the login timing window, but our current evidence does not prove a downstream token-validation sink or guaranteed auth bypass.

Visual:
- attack-step summary or bounded attack diagram

### Slide 5. Fix / mitigation and submission-quality close
Speaker:
- Shi

Time:
- 3:40 to 4:35

Must cover:
- primary fix
- strengthening measures
- what the fix does and does not prove

Core line:
- The direct fix is to replace `java.util.Random` with `SecureRandom`; stronger validation and lifecycle controls are additional improvements, not proof that the current build already enforces token-based access correctly.

Visual:
- fix summary bullets

## Recommended Slide Count
- 5 slides total
- 1 speaker per slide

Reason:
- keeps transitions clean
- makes speaking allocation easy to defend
- reduces time-loss from overcrowded slides

## Recording Order
1. A introduces the selected issue and scope.
2. B explains the model and attacker.
3. C presents the code evidence.
4. D explains the bounded attack path.
5. E explains the fix and closes with the limitation boundary.

## Final Closing Sentence
Use one short closing line after E's section:
- We therefore report a valid randomness vulnerability in a security-sensitive token path, with bounded impact claims and a concrete, technically justified mitigation.

## Rehearsal Checklist
Before recording:
1. Time each speaker once alone.
2. Time the full run once with slide transitions.
3. Check that each speaker exceeds 40 seconds.
4. Check that total length remains below 5 minutes.
5. Check that no speaker says stronger impact wording than the agreed team boundary.

## Q&A Hand-off Notes
Likely strongest owners by topic:
- scope / final claim: A
- system model / attacker model: B
- code evidence: C
- attack path / limitations: D
- mitigation / compliance: E

## Bottom Line
The presentation should not try to show everything.
It should show one clean vulnerability chain, one bounded threat model, one bounded exploit narrative, and one direct mitigation.
