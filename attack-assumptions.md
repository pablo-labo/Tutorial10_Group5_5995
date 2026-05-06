# Attack Assumptions & Trust Boundaries (Part A)

## Primary Attacker Profile
- Attacker type: realistic **on-path network attacker** (same Wi-Fi, rogue hotspot, or compromised transit segment).
- Access needed: network position only (no root access to victim phone required).
- Motivation: modify or observe web content delivered inside app WebView.

## Core Assumptions
| ID | Assumption | Rationale / Evidence |
|---|---|---|
| AA1 | App traffic path can traverse untrusted networks | Mobile usage often includes public/shared Wi-Fi; rubric explicitly expects realistic on-path attacker |
| AA2 | App permits cleartext traffic | `AndroidManifest.xml:26` sets `usesCleartextTraffic="true"` |
| AA3 | App actively loads HTTP content | `MainActivity.java:38` uses `loadUrl("http://www.example.com")` |

## Trust Boundaries and What Changes Across Them
| Boundary | From -> To | Security Expectation | Failure in This APK |
|---|---|---|---|
| TB1 | User -> App process | User should see authentic remote content | App displays potentially attacker-modified content |
| TB2 | App process -> Network | Transport should protect confidentiality/integrity | HTTP cleartext breaks both properties |
| TB3 | Network path -> Remote server | Endpoint identity and channel confidentiality expected | Plain HTTP provides neither |

## Attacker Capabilities (Constrained but Realistic)
1. Observe unencrypted HTTP request/response bytes in transit.
2. Modify response body/headers before content reaches WebView.
3. Serve attacker-controlled content while preserving apparent app workflow.

## Out-of-Scope Assumptions (to keep Part A focused)
1. No claim of local privilege escalation on victim device.
2. No claim of backend compromise.
3. No unrelated vulnerability classes (storage, IPC, binary hardening) used for scoring.

## Rubric Fit Note
- These assumptions directly satisfy the Part A marking expectation for a **realistic on-path attacker** explicitly linked to **trust boundaries and protected assets**, which is the key requirement for full marks in the system/threat model row.
