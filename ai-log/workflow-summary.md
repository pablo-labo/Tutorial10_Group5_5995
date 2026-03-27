# Workflow Summary

## Purpose
This file summarizes where AI assistance was used during the Assignment 1 workflow.

## Stage 1. APK unpacking and workflow setup
AI assistance used for:
- identifying suitable APK analysis workflow steps
- suggesting decompilation tools such as `jadx` and `apktool`
- helping define what evidence to collect first

Human validation:
- confirmed the APK contained accessible manifest, activities, and decompiled Java sources
- verified package name, main activity, and login-related classes directly in the decompiled output

## Stage 2. Vulnerability candidate narrowing
AI assistance used for:
- brainstorming likely randomness/crypto candidate sites
- suggesting search keywords such as `random`, `token`, `session`, `auth`, and `login`
- helping distinguish UI-only randomness from security-sensitive randomness

Human validation:
- searched the decompiled code directly
- confirmed that `Login.generateSessionToken()` used `java.util.Random`
- confirmed that `MainActivity.randomNumberGenerator()` was not part of the selected security path

## Stage 3. Threat model and bounded attack narrative
AI assistance used for:
- drafting attacker assumptions
- proposing realistic threat-model wording
- helping convert code evidence into a bounded attack scenario

Human validation:
- kept only the local-analysis attacker model supported by the APK
- rejected stronger attacker assumptions not evidenced in the current build
- aligned threat wording with visible code paths and stored session state

## Stage 4. Report and mitigation drafting
AI assistance used for:
- drafting report structure
- refining bounded risk wording
- drafting mitigation language around `SecureRandom`

Human validation:
- removed or weakened statements that overclaimed exploit success
- kept `Random` -> `SecureRandom` as the primary fix because it directly addresses the proven weakness
- treated validation and session-lifecycle improvements as strengthening measures rather than new proven findings

## Stage 5. PoC and tutorial preparation
AI assistance used for:
- drafting bounded attack steps
- preparing tutorial Q&A answers
- checking consistency against the rubric

Human validation:
- kept only claims supported by screenshots and decompiled code
- explicitly retained the limitation that downstream token validation was not clearly evidenced
- used AI rehearsal to improve explanation quality, not to create unsupported claims

## Overall Summary
AI was used as a workflow and drafting assistant.
All retained technical claims were checked against the APK decompilation, screenshots, and the assignment rubric before inclusion in project materials.
