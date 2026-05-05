# Attack Steps

## Purpose
This file gives member D's bounded attack path in a short, reusable format.

## Selected Issue
- `sessionToken` is generated with `java.util.Random` in `Login.generateSessionToken()`.

## Preconditions
1. A local-analysis setup is available.
2. A successful login can be performed on the test device or emulator.
3. The attacker can observe or narrow the login timing window.
4. If possible, stored token state is accessible in the local-analysis setup.

## Bounded Attack Path
1. Launch the app and perform a valid login.
2. Use the login-success path in `Login.onClick()` to show that successful credential verification leads to `createSession()` and then transition to `Profile`.
3. Show that `createSession()` stores `sessionToken` in `SharedPreferences("SessionPrefs")`.
4. Show that `generateSessionToken()` creates the token with `new Random()` and repeated `nextInt(62)` over a 16-character loop.
5. Reproduce the same token-generation logic offline for analysis.
6. If stored token state is accessible in the local-analysis setup, compare observed stored token state against the reproduced logic.
7. Conclude that the app creates authentication-related token material with a non-CSPRNG source, supporting bounded reproduction or predictability testing attempts under local-analysis conditions.

## Evidence Anchors
- `Login.java` lines 52-59
- `Login.java` lines 174-176
- `Login.java` lines 183-188
- `Profile.java` lines 50-52
- `Profile.java` lines 21-39

## Limitation
- Current evidence shows token generation and storage more clearly than downstream token enforcement.
- This attack path does not prove guaranteed auth bypass or session hijack.
