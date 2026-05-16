# Assignment 2 Prompt-Response Summaries

## Purpose

This file records representative AI interactions in summary form.
Each entry captures the task, the kind of AI output received, whether it was accepted, modified, or rejected, and how the result was validated.

## Entry 1. Part A evidence strategy

Prompt summary:

- asked AI how to align Part A with the updated Assignment 2 scope hint.

AI output summary:

- suggested focusing on insecure network transport/configuration evidence;
- suggested checking cleartext traffic settings, HTTP WebView loading, and TLS-validation handling.

Outcome:

- accepted as workflow guidance.

Validation:

- checked the manifest and `MainActivity` evidence directly;
- retained only the cleartext WebView path as the primary claim.

## Entry 2. Part A claim-boundary wording

Prompt summary:

- asked AI how to explain MITM impact without overclaiming.

AI output summary:

- recommended claiming observation, modification, and content injection for cleartext HTTP WebView traffic;
- warned against unsupported credential theft, session replay, account takeover, and backend compromise claims.

Outcome:

- accepted after tightening.

Validation:

- retained only claims supported by `usesCleartextTraffic="true"` and `loadUrl("http://www.example.com")`;
- moved `sslErrorHandler.proceed()` to supporting evidence.

## Entry 3. Assignment 1 role inheritance

Prompt summary:

- asked AI why Rongbang should speak first in the Part A video and whether there was Assignment 1 evidence for that role.

AI output summary:

- identified Assignment 1 role A as vulnerability claim/report control;
- mapped Assignment 1's first speaker role to Assignment 2 Part A's final-claim introduction.

Outcome:

- accepted.

Validation:

- checked Assignment 1 `presentation-plan.md`, `timeline.md`, and `activity-log-matrix.md`;
- checked Assignment 2 Part A team script and contribution draft.

## Entry 4. Part B disclosure-style structure

Prompt summary:

- asked AI how Part B should differ from Part A because it is an in-the-wild bug bounty finding.

AI output summary:

- recommended organizing around target, scope proof, vulnerability, reproduction, impact, severity, novelty, mitigation, and ethics;
- warned against spending too much time on generic system modeling.

Outcome:

- accepted.

Validation:

- aligned with the Assignment 2 Part B rubric and final presentation requirements.

## Entry 5. Part B severity and impact wording

Prompt summary:

- asked AI how to frame the Indeed Android logcat finding after replay-validation evidence.

AI output summary:

- suggested P2 / High candidate wording based on read-only authenticated replay indication;
- suggested a fallback to P3 / Medium if triage finds limited account data or constrained token reuse.

Outcome:

- accepted in bounded form.

Validation:

- checked `replay-validation-supplement.md`;
- retained non-claims around account takeover, cross-user access, write actions, silent upload, and Critical severity.

## Entry 6. Part B mitigation and ethics script

Prompt summary:

- asked AI to shorten a final Part B member segment covering mitigation, ethics, and close.

AI output summary:

- proposed a concise segment covering removal of sensitive logging, diagnostic-pipeline redaction, session rotation/invalidation, read-only own-account testing, and redaction.

Outcome:

- accepted as presentation drafting support.

Validation:

- checked against `replay-validation-supplement.md`, `diagnostic-pipeline-supplement.md`, and the safe-testing notes.

## Entry 7. Required-file organization

Prompt summary:

- asked AI to compare current Assignment 2 materials against the required submission package.

AI output summary:

- identified non-video gaps: `activity-log.pdf` and root-level `ai-log/`;
- recommended using Assignment 1's activity-log and AI-log structure.

Outcome:

- accepted.

Validation:

- checked Assignment 2 required-file checklist and Assignment 1 final AI-log/activity-log approach.

## Step-by-Step Interaction Example

Purpose:

- record one representative step-by-step AI interaction used to refine final Part A presentation wording.

Step 1. Initial prompt:

- asked AI whether Part A attacker capability should include sniffing, modifying, replaying, and injecting.

AI response summary:

- accepted sniffing, modifying, and content injection for cleartext HTTP WebView traffic;
- warned that replay should not be a primary claim without tokens, credentials, or authenticated requests.

Human check:

- reviewed the evidence chain and confirmed it shows HTTP WebView loading, not authenticated requests.

Step 2. Follow-up prompt:

- asked why replay should be excluded.

AI response summary:

- explained that replay requires a meaningful captured value or action to replay;
- noted that the current evidence does not show session cookies, credentials, tokens, or state-changing API requests.

Human check:

- kept replay out of the primary Part A claim.

Step 3. Scenario prompt:

- asked what if the user enters credentials into the WebView.

AI response summary:

- identified credential theft as a possible downstream risk if sensitive input exists;
- warned that credential theft should not be claimed without evidence of a credential-entry flow.

Human check:

- retained this as a limitation/possible downstream risk only, not a demonstrated impact.

Step 4. Slide wording prompt:

- asked whether the phrase "modify or replay responses to render attacker chosen or stale content inside the WebView" was safe.

AI response summary:

- recommended replacing "replay responses" with "serve stale content" or "inject attacker-chosen content" to avoid implying authenticated replay.

Final retained wording:

- "An on-path attacker can observe and modify HTTP responses in transit, including injecting attacker-chosen content or serving stale content before it is rendered inside the WebView."

Outcome:

- accepted after narrowing.

Why retained:

- it improved presentation wording and reduced overclaiming risk while preserving the evidence-backed security impact.

