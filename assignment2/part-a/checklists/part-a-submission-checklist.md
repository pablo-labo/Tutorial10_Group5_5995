# Part A Submission Checklist

## Required Part A Outputs

- [ ] `report.pdf` is written in the official USENIX template.
- [ ] `report.pdf` is no more than 2 pages including figures/references.
- [ ] `parta-presentation.mp4` is no more than 5 minutes.
- [ ] Every team member speaks for at least 40 seconds in the Part A video.
- [ ] AI usage log includes Part A AI-assisted analysis, validation, and mock Q&A summary.
- [ ] Activity log includes Part A contribution mapping.

## Claim Consistency

- [ ] Exactly one primary Part A vulnerability claim is used: cleartext traffic enabled plus HTTP WebView loading.
- [ ] `sslErrorHandler.proceed()` is described as supporting insecure WebView TLS handling, not the primary root cause.
- [ ] Always-true `HostnameVerifier` is described as weak supporting evidence unless later evidence proves it is bound to a network client.
- [ ] No unrelated Android vulnerability classes are mixed into the Part A claim.

## Evidence Checks

- [ ] Manifest evidence cites `INTERNET` permission and `usesCleartextTraffic="true"`.
- [ ] `MainActivity` evidence cites WebView initialization and `loadUrl("http://www.example.com")`.
- [ ] Threat model links attacker capability to assets and trust boundaries.
- [ ] Impact wording is bounded to WebView content integrity and HTTP traffic confidentiality/integrity.
- [ ] Non-claims are explicit: no credential theft, session theft, account takeover, backend compromise, or live MITM proof unless new runtime evidence is collected.

## Video Checks

- [ ] Rongbang introduces final claim and report control.
- [ ] Sienna explains system/threat model, assets, boundaries, and attacker.
- [ ] Letian explains static evidence.
- [ ] Yuzhi explains attack path and PoC reasoning.
- [ ] Shi explains mitigation and verification.
- [ ] Slides show code/config evidence, not only narration.
- [ ] Final video timing is checked before submission.

