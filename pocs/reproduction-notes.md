# Reproduction Notes

## Purpose
This file records how member D's bounded PoC should be reproduced and what should be stated honestly if some runtime observation is not available.

## Reproduction Goal
The goal is not to prove a full auth bypass.

The goal is to reproduce and explain that:
- `sessionToken` is created after successful login
- `sessionToken` is stored as session-related state
- `sessionToken` is generated with `java.util.Random`
- under local-analysis conditions, this supports bounded reproduction or predictability testing attempts

## Required Setup
1. A local-analysis environment such as an emulator, rooted test device, or instrumented Android setup.
2. The provided APK installed and runnable.
3. A valid login path that reaches `createSession()`.

## Evidence-Based Reproduction Path
1. Launch the app and perform a valid login.
2. Use the decompiled evidence to confirm that successful login triggers `createSession()` and then opens `Profile`.
3. Confirm that `createSession()` stores `sessionToken` in `SharedPreferences("SessionPrefs")`.
4. Confirm that `generateSessionToken()` uses `new Random()` with repeated `nextInt(62)` over a 16-character alphabet.
5. Reimplement the same generation logic offline for analysis.
6. If observed stored token state is accessible in the local-analysis setup, compare observed stored token state against reproduced logic.

## What To Record During Reproduction
- Device or emulator used
- Whether the APK ran successfully
- Whether a valid login was completed
- Whether stored token state was actually accessible
- Whether comparison against stored token state was attempted
- What part of the claim was directly validated
- What part remained unproven

## If Token State Is Accessible
You may state:
- the app stores a session-related token generated with a non-CSPRNG source
- the local-analysis setup allowed observation of stored token state
- bounded reproduction or predictability testing attempts are practically meaningful in this environment

## If Token State Is Not Accessible
You should state:
- the code still proves weak generation of authentication-related token material
- the practical exploit demonstration remains bounded because stored token state could not be observed in this setup
- no stronger claim should be made without additional runtime evidence

## Safe Final Reproduction Statement
The current build evidences weak generation and storage of authentication-related session state, and under realistic local-analysis conditions this supports bounded reproduction or predictability testing attempts. However, the present evidence does not show a proven downstream token-validation sink or guaranteed auth bypass.

## Main Limitation
Current code evidence shows token generation, storage, retrieval, and clearing more clearly than downstream token enforcement.

That limitation must remain explicit in any final D-side explanation.

## Evidence Anchors
- `Login.java` lines 52-59
- `Login.java` lines 174-176
- `Login.java` lines 179-181
- `Login.java` lines 183-188
- `Profile.java` lines 21-39
- `Profile.java` lines 50-52
- `AndroidManifest.xml` lines 28-37
