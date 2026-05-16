# Assignment 2 AI Workflow Summary

## Purpose

This file summarizes where AI assistance was used during Assignment 2.
It follows the Assignment 1 AI-log style: for each stage, it records what AI helped with, what output was retained, and how the team validated or narrowed that output before using it.

## Stage 1. Assignment Requirements and Role Mapping

AI assistance used for:

- summarizing the Assignment 2 spec and rubric;
- separating Part A requirements from Part B requirements;
- mapping the Assignment 1 five-role workflow onto Part A and the Part B presentation split.

Retained output:

- Part A should stay focused on the intended insecure network transport/configuration issue;
- Part B should use a disclosure-style structure: target, scope, vulnerability, reproduction, impact, severity, novelty, mitigation, and ethics;
- the team should keep one clear speaking segment per member to satisfy the 40-second individual requirement.

Human validation:

- checked `assignment2-spec-4.pdf` and `assignment2-rubric-3.pdf`;
- checked Assignment 1 role materials before reusing the same Part A role split;
- rejected any workflow that treated Part B like a generic system-model report, because Part B is graded through bug bounty evidence, impact, novelty, presentation, and Q&A.

## Stage 2. Part A APK Evidence Strategy

AI assistance used for:

- identifying the evidence needed for an insecure transport/TLS configuration claim;
- suggesting how to connect manifest settings, launcher reachability, WebView behavior, and HTTP loading;
- helping distinguish primary evidence from supporting evidence.

Retained output:

- primary Part A evidence chain:
  - `INTERNET` permission;
  - `usesCleartextTraffic="true"`;
  - launcher-reachable `MainActivity`;
  - WebView initialization;
  - `loadUrl("http://www.example.com")`;
- supporting evidence:
  - `sslErrorHandler.proceed()`;
  - always-true `HostnameVerifier`, treated cautiously.

Human validation:

- checked the decompiled manifest and `MainActivity.java`;
- checked teammate screenshot evidence in `assignment2/evidence/`;
- kept the HostnameVerifier as weak supporting evidence only because the current decompiled code does not show it being attached to the WebView request path.

## Stage 3. Part A Claim and Impact Boundary

AI assistance used for:

- drafting a concise final vulnerability claim;
- preparing presentation-safe attacker capability wording;
- identifying overclaiming risks around replay, credential theft, and account takeover.

Retained output:

- final Part A claim: the APK permits cleartext traffic and loads an HTTP URL in a WebView;
- attacker capability: an on-path attacker can observe and modify HTTP WebView traffic, including injecting or serving attacker-chosen content;
- impact boundary: WebView content integrity/authenticity compromise and HTTP traffic exposure.

Human validation:

- rejected credential theft, session theft, account takeover, backend compromise, and live runtime MITM success because the current evidence does not show credentials, tokens, authenticated requests, backend access, or observed runtime exploitation;
- kept replay out of the primary claim because no replayable credential, token, or state-changing request is evidenced on this path.

## Stage 4. Part A Report and Video Preparation

AI assistance used for:

- preparing report outline material;
- drafting concise speaking segments for each member;
- creating Part A mock Q&A and limitation wording.

Retained output:

- Part A report draft and claim sheet;
- five-member Part A presentation script;
- evidence index and submission checklist;
- mock Q&A entries that explain why the claim is bounded.

Human validation:

- checked that each speaking segment matched a real role and evidence source;
- kept the final presentation sequence aligned with the Assignment 1 role split;
- checked that each answer remained consistent with the report draft and evidence index.

## Stage 5. Part B Finding Organization

AI assistance used for:

- organizing the Indeed Android finding into disclosure-style sections;
- summarizing redacted logcat evidence, PoC script behavior, diagnostic-pipeline notes, and replay-validation results;
- converting long report material into presentation/Q&A-ready wording.

Retained output:

- target: Indeed Android app / `com.indeed.android.jobsearch`;
- vulnerability class: sensitive cookie/session/CSRF/device-related material written to Android logcat;
- evidence structure:
  - redacted logcat cookie evidence;
  - controlled deeplink/logcat capture;
  - diagnostic/support-report collection path;
  - baseline-vs-cookie replay validation;
- presentation emphasis on one final finding rather than multiple unrelated observations.

Human validation:

- checked `evidence-summary-clean-authenticated-run.txt` and `evidence-redacted-logcat-cookiehelper.txt`;
- checked the replay supplement's no-cookie baseline and cookie replay result;
- kept the diagnostic-pipeline path as an exposure scenario rather than proof of silent upload or third-party interception.

## Stage 6. Part B Severity, Novelty, and Ethics Wording

AI assistance used for:

- refining P2 / High candidate wording after read-only replay validation;
- identifying fallback conditions where P3 / Medium may still be appropriate;
- drafting safe-testing and ethics wording.

Retained output:

- P2 / High candidate wording based on read-only authenticated replay indication for the same tester-controlled account;
- fallback boundary: P3 may apply if triage finds no meaningful account data or strong server-side constraints;
- ethics wording: researcher-controlled account, read-only requests, no third-party account, no job application, no account modification, no DoS, and redacted evidence.

Human validation:

- did not claim full account takeover, cross-user access, sensitive write actions, silent diagnostic upload, third-party interception, or P1/Critical severity;
- kept raw values out of public-facing material;
- checked that the mitigation wording addressed both the original logging source and diagnostic/support-report pipelines.

## Overall Summary

AI was used as a workflow, drafting, validation, and rehearsal assistant.
The retained technical claims were manually checked against the APK evidence, screenshots, redacted logs, PoC outputs, replay-validation notes, assignment documents, and safe-testing limits.
AI-supported wording was narrowed whenever it exceeded the evidence.

