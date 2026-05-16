# Assignment 2 Validation Record

## Purpose

This file records how AI-assisted outputs were checked before being used in Assignment 2 materials.
It is written in the same spirit as the Assignment 1 validation record: accepted claims are separated from narrowed or rejected claims, and each retained claim is tied to evidence.

## Validation Principles

1. No final claim was retained unless it matched local evidence.
2. Any stronger exploit claim was weakened if the evidence did not prove it.
3. Part A stayed within the intended insecure network transport/configuration class.
4. Part B stayed within legitimate bug bounty disclosure style and safe-testing boundaries.
5. AI outputs were treated as draft assistance, not proof.

## Part A Accepted Claims

Accepted with direct validation:

- the target APK is `a2_case1.apk`;
- the manifest declares `INTERNET` permission;
- the manifest sets `android:usesCleartextTraffic="true"`;
- `MainActivity` is launcher-reachable;
- `MainActivity` initializes a WebView and calls `loadUrl("http://www.example.com")`;
- an on-path attacker can observe and modify cleartext HTTP WebView traffic;
- the supported impact is WebView content integrity/authenticity compromise and HTTP traffic exposure.

## Part A Narrowed Before Retention

Narrowed before use:

- `sslErrorHandler.proceed()` was kept as supporting transport-validation evidence, not the primary root cause;
- the always-true `HostnameVerifier` was kept as weak supporting evidence because it is visible in the class but not clearly bound to the WebView request path;
- "inject attacker code" wording was narrowed to "inject or serve attacker-chosen content" unless JavaScript execution is separately evidenced.

## Part A Rejected From Final Claim

Rejected from the demonstrated claim:

- credential theft;
- session theft;
- account takeover;
- backend compromise;
- live runtime MITM success;
- replay of authenticated requests or sessions.

Reason:

- current evidence proves the cleartext WebView path, but not credentials, tokens, authenticated requests, state-changing actions, backend access, or observed runtime exploitation.

## Part B Accepted Claims

Accepted with direct validation:

- the Indeed Android app logs cookie/session/CSRF/device-related material to Android logcat;
- redacted evidence preserves sensitive key names while removing live values;
- the logged material includes sensitive names such as `JSESSIONID`, CSRF-related values, bearer-token-like values, and refresh-token-like values;
- a controlled replay validation used only a tester-controlled Indeed account;
- the no-cookie baseline produced a login redirect;
- replay with a Cookie header extracted from logcat produced a read-only authenticated profile response indicator for the same tester-controlled account;
- diagnostic/support-report paths can collect WebView cookies and logcat output based on static analysis.

## Part B Narrowed Before Retention

Narrowed before use:

- severity was framed as P2 / High candidate rather than guaranteed High;
- P3 / Medium fallback was retained if triage finds little meaningful account data or strong server-side constraints;
- diagnostic/support-report collection was treated as a plausible user-mediated exposure path, not proven silent remote upload;
- the ADB/logcat collection method was framed as a controlled validation method, not the only possible exposure scenario.

## Part B Rejected From Final Claim

Rejected from the demonstrated claim:

- full account takeover;
- cross-user access;
- sensitive write actions;
- job application submission;
- silent diagnostic upload;
- third-party interception of support-report attachments;
- arbitrary third-party app logcat access on modern Android;
- P1 / Critical severity.

Reason:

- the evidence supports sensitive logging plus read-only authenticated replay indication for a tester-controlled account, but does not prove broader account compromise, write impact, public interception, or destructive impact.

## Evidence Anchors

Part A:

- `assignment2/evidence/D01_manifest_network_permission_or_cleartext.png`
- `assignment2/evidence/D02_launcher_activity_main_path.png`
- `assignment2/evidence/D04_main_activity_webview_flow.png`
- `assignment2/evidence/D05_insecure_http_endpoint.png`
- `assignment2/evidence/D06_ssl_error_proceed.png`
- `assignment2/part-a/evidence/evidence-index.md`

Part B:

- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/evidence-summary-clean-authenticated-run.txt`
- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/evidence-redacted-logcat-cookiehelper.txt`
- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/replay-validation-supplement.md`
- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/diagnostic-pipeline-supplement.md`
- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/poc-deeplink-logcat-capture.py`
- `assignment2/indeed-android-logcat-cookie-disclosure-usyd/poc-replay-from-adb-logcat.py`

## Rubric Validation

AI-assisted material was checked against rubric expectations for:

- Part A system/threat model quality;
- Part A vulnerability evidence and impact reasoning;
- Part A mitigation quality;
- Part B legitimate target/scope handling;
- Part B impact evidence and severity mapping;
- Part B novelty and disclosure-style explanation;
- presentation and Q&A defensibility.

## Final Validation Statement

The final materials retain AI-assisted structure and wording support, but the vulnerability claims, attacker models, impact statements, severity wording, novelty wording, mitigation recommendations, and safe-testing statements were manually constrained to match local evidence and assignment rules.

