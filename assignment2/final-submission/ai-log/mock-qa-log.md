# Assignment 2 Mock Q&A Log

## Purpose

This file summarizes rubric-driven AI-assisted Q&A rehearsal for Assignment 2.
The rehearsal was used to expose overclaiming risk, improve presentation wording, and prepare evidence-based answers for Part A and Part B.

## Rehearsal Focus

The rehearsal focused on:

- Part A scope compliance;
- evidence-backed MITM explanation;
- attacker capability and impact boundaries;
- Part B target/scope proof;
- reproduction and impact evidence;
- severity and novelty defensibility;
- mitigation and safe-testing ethics.

## Part A Main Question Themes

1. What is the single primary Part A vulnerability?
2. What exact evidence proves the cleartext WebView path?
3. Why is this MITM-relevant?
4. What can the attacker actually observe or modify?
5. Why should replay, credential theft, and account takeover not be claimed?
6. How should `sslErrorHandler.proceed()` be presented?
7. Why is the always-true `HostnameVerifier` only supporting evidence?
8. What mitigation directly addresses the root cause?

## Part B Main Question Themes

1. What is the target and bug bounty context?
2. What is the vulnerability and root cause?
3. What evidence shows sensitive values entered logcat?
4. What does the replay validation prove?
5. What does the replay validation not prove?
6. Why is P2 / High candidate wording defensible?
7. What would make the issue fall back to P3 / Medium?
8. How is novelty being framed?
9. How did testing remain safe and ethical?
10. What concrete mitigation should Indeed apply?

## Wording Changes After Rehearsal

### Part A: attacker capability

Draft answer before follow-up:

- The attacker can sniff, modify, replay, and inject traffic.

LLM follow-up pressure:

- What exactly is being replayed?
- Does the evidence show credentials, session cookies, or authenticated requests?
- Is JavaScript execution evidenced?

Final tightened answer:

- The attacker can observe and modify cleartext HTTP WebView traffic, including injecting or serving attacker-chosen content before it is rendered.
- We do not rely on replay, credential theft, or account takeover because the evidence does not show credentials, session tokens, or authenticated requests on this path.

Evidence anchors used:

- manifest cleartext permission;
- HTTP `loadUrl`;
- WebView flow screenshots.

### Part A: credential-entry hypothetical

Draft answer before follow-up:

- If the user enters credentials, the attacker can steal them.

LLM follow-up pressure:

- Does the current app evidence show a login form inside the HTTP WebView?
- Is credential entry part of the demonstrated path or only a possible downstream risk?

Final tightened answer:

- If sensitive input were entered into HTTP-loaded WebView content, exposure would be a possible downstream risk.
- The demonstrated claim remains WebView content exposure and modification because no credential-entry flow is evidenced.

### Part B: impact and severity

Draft answer before follow-up:

- The logged cookies allow account takeover, so this should be Critical.

LLM follow-up pressure:

- Was cross-user access shown?
- Were write actions or account changes attempted?
- Was the replay read-only or full session takeover?

Final tightened answer:

- Logged cookie/session material produced read-only authenticated access indication for the same tester-controlled account in a clean client.
- This supports P2 / High candidate wording, with P3 fallback if triage finds limited account data or strong server-side constraints.
- It does not prove full account takeover, cross-user access, sensitive write actions, or Critical impact.

Evidence anchors used:

- no-cookie baseline: login redirect;
- Cookie replay: HTTP 200 profile response indicator;
- account marker present only in replay response.

### Part B: diagnostic pipeline

Draft answer before follow-up:

- Support reports leak the cookies to third parties.

LLM follow-up pressure:

- Was silent upload observed?
- Was third-party interception observed?
- What does static analysis prove versus what remains an exposure scenario?

Final tightened answer:

- Static analysis shows a diagnostic/support-report path can collect WebView cookies and logcat output.
- Silent upload and third-party interception are not proven, so the claim is framed as a broader exposure path rather than a confirmed exfiltration channel.

## Representative Final Q&A Answers

### Q1. Why is Part A not claiming replay?

Part A proves a cleartext HTTP WebView path.
It supports observation, modification, and content injection.
Replay would require evidence of credentials, tokens, authenticated requests, or repeatable state-changing actions, which is not shown on this path.

### Q2. What exactly did the Part B replay validation show?

The no-cookie baseline reached a login redirect.
Supplying the Cookie header extracted from logcat produced a read-only authenticated profile response indicator for the same tester-controlled account.
This supports authenticated replay indication, not account takeover or cross-user access.

### Q3. How did the Part B testing stay ethical?

Testing used only a researcher-controlled account, read-only requests, redacted evidence, no third-party account, no job application, no account changes, and no DoS-style testing.

### Q4. What should the vendor fix?

Remove production logging of full Cookie headers and authentication/session material.
Redact sensitive fields in logcat, support reports, crash reports, telemetry, and diagnostic attachments.
Rotate or invalidate affected sessions if production exposure occurred.
Add regression tests for sensitive log output.

## Final Rehearsal Outcome

The mock Q&A reduced overclaiming risk and improved defensibility.
Final wording keeps Part A within cleartext WebView MITM risk and Part B within sensitive logging plus read-only authenticated replay indication.

