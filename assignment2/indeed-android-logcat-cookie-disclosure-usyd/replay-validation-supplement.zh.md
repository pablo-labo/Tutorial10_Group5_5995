# 补充证据 2：受控 Cookie Replay 验证

## 目的

本补充材料用于说明此前提交报告的后续验证结果：

> Indeed Android App Logs Cookie, CSRF, Session, and Device Identifiers to Android logcat

原始报告中对 replay 影响保持保守，将其列为未确认。提交后，我仅使用自己控制的 Indeed 测试账号，进行了受控、只读的 replay 验证。

本补充材料不替代原始报告，只用于补充影响验证证据。

这里使用 ADB/logcat 是为了以可控、可审计的研究方式提取漏洞值并验证其可复用性。它不应被理解为唯一相关的暴露路径。正如此前 diagnostic-pipeline supplement 中所述，静态分析发现 App 内部存在 support/error-report 流程，会收集 cookies 和 `logcat -d` 输出并写入诊断报告。因此，本次 replay 结果同样适用于用户触发的支持/错误报告场景，而不只是研究人员通过 ADB 进行的测试。

## 高层结果

受控 replay 验证显示出明确的认证状态差异：

```text
No-cookie baseline: unauthenticated, redirected to Indeed login.
With Cookie header extracted from Android logcat: HTTP 200 on https://profile.indeed.com/.
With Cookie header extracted from Android logcat and a redacted account marker: marker present in replay response.
```

保守结论：

```text
Logged cookie/session material appears reusable for read-only authenticated access to the tester-controlled account.
The replay response contained a tester-account-specific marker that was absent from the no-cookie baseline response.
The raw marker value is omitted; only a short SHA-256 prefix of the input marker is provided.
```

这支持将影响从：

```text
Potential sensitive information exposure
```

提升为：

```text
Read-only authenticated data exposure indicated in a tester-controlled replay scenario
```

## 安全和范围控制

本次 replay 验证采用了最小化风险设计：

```text
Only a tester-controlled Indeed account was used.
Only values from that same tester-controlled account were used.
Only read-only GET requests were performed.
No third-party account was accessed.
No profile, resume, saved job, application, account setting, or other user data was modified.
Raw Cookie, JSESSIONID, CSRF, BearerToken, and RefreshToken values are omitted.
No full response body was saved.
```

## 被 replay 材料的来源

Cookie header 从本地 Android logcat 中的以下日志行提取：

```text
D/IndeedCookieHelper: cookies: ...
```

该日志中的 Cookie header 包含以下敏感 key name：

```text
Device-ID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
JSESSIONID
CTK
SURF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
Indeed-App-Proctor-Groups
```

本补充材料有意排除了所有原始值。

## ADB 是验证方法，不是唯一暴露场景

本 replay 测试使用 adb logcat，是因为它能以可控、可审计的方式提取 App 实际写入日志的值。

更广泛的风险在于，同样的日志材料可能被 App 的合法工作流打包。在此前 diagnostic-pipeline supplement 中，静态分析显示 App 存在 support/error-report helper，其行为包括：

```text
Collects WebView cookies.
Collects logcat output using logcat -d.
Builds a diagnostic report intended for a support/email flow.
```

影响含义：

```text
If a normal user follows support guidance and sends an error report, the user may unintentionally include high-sensitivity session material such as JSESSIONID, CSRF values, BearerToken-like cookies, and RefreshToken-like cookies in the report.
The replay validation in this supplement shows why that matters: the logged cookie/session material was sufficient to obtain a read-only authenticated profile response for the same tester-controlled account.
```

保守边界：

```text
This supplement does not claim that the diagnostic report was silently uploaded.
This supplement does not claim that a third party actually intercepted a support-report attachment.
This supplement does claim that ADB was only the controlled validation method, while app-level diagnostic/support flows broaden the realistic exposure model beyond local manual logcat inspection.
```

## 验证环境

```text
Replay client: clean Python urllib client, not a browser profile.
Request method: GET only.
Target URL: https://profile.indeed.com/
Redirect handling: redirects were not followed for both baseline and replay requests.
Account scope: tester-controlled Indeed account only.
Response handling: full response bodies were not saved or attached.
Marker handling: the marker value was used only for matching and was not printed or attached.
```

marker hash 说明：

```text
redacted_marker_input_sha256_12 identifies the redacted tester-controlled marker used for matching.
It is not a hash of the response body and does not mean the marker was present in the baseline response.
Presence is represented only by account_marker_present: yes/no.
```

## 实验设计

实验对同一个只读 profile URL 进行了两个受控请求。

目标：

```text
https://profile.indeed.com/
```

Test A：no-cookie baseline

```text
Purpose: verify that the clean client is not already authenticated.
Cookie header: none
Expected result: redirect to login or unauthenticated response
```

Test B：replay request

```text
Purpose: verify whether cookie material from Android logcat grants authenticated access.
Cookie header: extracted from D/IndeedCookieHelper logcat line
Expected result if replay works: HTTP 200 / authenticated profile page response
```

未使用任何写入方法：

```text
No POST
No PUT
No PATCH
No DELETE
```

## PoC 工具

我使用了一个小型只读辅助脚本。该脚本会从 adb logcat 中提取最新 cookie 行，并立即执行 baseline 和 replay 检查：

```text
replay_from_adb_logcat.py
```

脚本安全控制：

```text
Allows only HTTPS Indeed hosts.
Uses GET or HEAD only.
Does not print raw cookies.
Does not save response bodies.
Prints only status code, content type, response size, a short SHA-256 prefix, redirect location with query redacted, and coarse authentication/login hints.
Requires --i-own-this-account acknowledgement before running.
Optionally accepts --account-marker to check for a tester-account-specific response marker without printing the raw marker.
Keeps the raw Cookie header in memory only; it is not written to a temporary file.
```

## 使用的命令

自动 adb logcat 提取和 replay 验证：

```powershell
python .\indeed-android-logcat-cookie-disclosure-poc\replay_from_adb_logcat.py `
  --i-own-this-account `
  --url "https://profile.indeed.com/" `
  --account-marker "<redacted tester-account-specific marker>"
```

脚本自动执行以下步骤：

```text
1. Clear adb logcat.
2. Force-stop the Indeed Android app.
3. Trigger the deeplink http://www.indeed.com/jobs?q=test.
4. Read adb logcat.
5. Extract the latest D/IndeedCookieHelper: cookies: ... line.
6. Run a no-cookie baseline request.
7. Run a replay request with the extracted Cookie header.
8. Check for a redacted tester-account-specific marker in both responses.
```

marker 值不包含在本报告中，因为它包含测试账号相关个人信息。报告只记录其是否存在以及 SHA-256 前缀。

## 观察结果

### Test A：No-Cookie Baseline

```text
status: 302
redirect_location: https://secure.indeed.com/account/login?<redacted-query>
content_type:
body_bytes_read: 0
body_sha256_12: e3b0c44298fc
auth_hint_hits: 0
login_hint_hits: 0
account_marker_present: no
redacted_marker_input_sha256_12: 30ee45c80520
elapsed_ms: 215
classification: likely-not-authenticated
```

解释：

```text
The clean client was not authenticated without the logged cookie material.
```

### Test B：使用日志 Cookie Header 和脱敏账号 Marker 进行 Replay

```text
status: 200
content_type: text/html;charset=utf-8
body_bytes_read: 82761
body_sha256_12: b63e1e4876e0
auth_hint_hits: 5
login_hint_hits: 2
account_marker_present: yes
redacted_marker_input_sha256_12: 30ee45c80520
elapsed_ms: 452
classification: authenticated-readonly-access-indicated
```

解释：

```text
The same clean client received an HTTP 200 response from a read-only authenticated profile URL after the Cookie header from Android logcat was supplied.
The replay response contained the redacted tester-account-specific marker, while the no-cookie baseline did not.
The matching marker is represented by redacted_marker_input_sha256_12 only; the raw marker is omitted.
```

## 保守影响陈述

本补充材料支持以下影响陈述：

```text
Using a tester-controlled account, cookie/session material logged by the Android app could be reused in a clean client to obtain a read-only authenticated profile response for the same account. The response contained a redacted tester-account-specific marker that was absent in the no-cookie baseline.
```

建议的严重性影响：

```text
This finding is a P2 / High candidate because replay was demonstrated against a read-only authenticated profile page for a tester-controlled account.
The ADB step was used to validate the replayability of logged material; it is not the only plausible exposure scenario because the app's diagnostic/support-report flow can collect both cookies and logcat output.
```

## P2 候选理由

本补充材料支持将该问题视为 P2 / High candidate，而不仅仅是普通本地日志泄露，理由如下：

```text
1. Replayability moved from theoretical to demonstrated.
   原始报告证明了敏感值进入 logcat。本补充材料进一步证明，logcat 中的 Cookie header 被 clean client 接受，并为测试者控制的账号产生了只读认证响应。

2. The baseline/replay difference is clear.
   无 cookie baseline 对同一 profile endpoint 返回 HTTP 302 并跳转到 Indeed login flow。使用 logcat Cookie header 的 replay 请求返回 HTTP 200。

3. The replay response included account-specific proof.
   脱敏的测试账号特异性 marker 在 baseline 响应中不存在，在 replay 响应中存在。原始 marker 被省略，只提供 redacted_marker_input_sha256_12。

4. The logged material includes authentication/session/token-like fields, not only analytics identifiers.
   观察到的 key name 包括 JSESSIONID, CSRF, INDEED_CSRF_TOKEN, ENC_CSRF, __Secure-PassportAuthProxy-BearerToken, and __Secure-PassportAuthProxy-RefreshToken。

5. The impact is authenticated data exposure.
   已验证影响是对测试者控制账号 profile context 的只读认证访问。这强于非秘密日志的被动泄露。

6. ADB was the validation channel, not the only plausible exposure path.
   此前记录的 diagnostic/support-report flow 可以收集 WebView cookies 和 logcat output。非技术用户如果按照客服指引发送诊断报告，可能会无意中将同样的高敏感 session material 打包进诊断报告或 email/share attachment。

7. Refresh-token-like cookie names increase sensitivity.
   本报告不声称已单独 replay RefreshToken，但 Cookie header 中出现 RefreshToken-like cookie name 会提高风险，尤其是在这些内容被 support、crash 或 diagnostic workflows 收集时。
```

为何仍作为 candidate，而不是更强结论：

```text
The test was read-only.
The test used only the researcher's own tester-controlled account.
No cross-user access was attempted.
No write action or account takeover was attempted.
No standalone BearerToken or RefreshToken replay was tested.
No silent diagnostic upload or third-party interception was proven.
```

推荐 triage 表述：

```text
P2 / High candidate: Sensitive information in logs with demonstrated read-only authenticated session replay and a broader user-mediated diagnostic-report exposure path.
Fallback: P3 if Indeed determines that the replayed profile page contains no meaningful account data, the affected cookies are very short-lived, or server-side controls materially constrain reuse.
```

保守 caveat：

```text
If Indeed determines that the replayed profile page does not expose meaningful account data, or that affected cookies are short-lived, strongly bound, or otherwise constrained, P3 may still be appropriate.
```

## 未声称的内容

为避免夸大影响：

```text
No account takeover is claimed.
No cross-user access is claimed.
No sensitive write action is claimed.
No profile edit was performed.
No resume edit/upload/download was performed.
No saved job or application state was modified.
No job application was submitted.
No standalone replay of BearerToken or RefreshToken was tested.
No raw tokens or cookies are attached.
```

## 推荐 Triage 解读

原始报告证明：

```text
Sensitive cookie/session/CSRF/authentication-token-like material is logged to Android logcat.
```

本补充材料新增：

```text
The logged Cookie header was accepted by a clean client for read-only authenticated access to the same tester-controlled account.
The replay response contained a tester-account-specific marker, represented only by redacted_marker_input_sha256_12: 30ee45c80520.
```

推荐分类：

```text
Sensitive information in logs with read-only authenticated session replay indicated by baseline-vs-cookie response differences and a redacted tester-account-specific marker.
ADB/logcat was used as the validation channel, while the previously documented diagnostic-report flow broadens exposure to user-mediated support reports.
CWE-532: Insertion of Sensitive Information into Log File.
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor.
```

## 相关公开案例

以下案例用于说明：Android/mobile 场景中 session、credential 或其他敏感数据写入日志，是已被认可的漏洞类型。它们不作为直接严重性基准，因为每个案例的访问前提、受影响数据和可利用性不同。

### CVE-2024-6294：Android session stored in logcat

NVD 描述了一个 Android 应用在用户登录时将 user session data 写入 logcat。描述中指出，恶意 App 或具有物理设备访问能力的攻击者可以取回 session，并使用它登录该 App 及相关服务。

与本报告的相关性：

```text
This is the closest public analogue because it involves Android logcat, user session material, and reuse of the session to access services.
The Indeed validation similarly shows that logged cookie/session material can be replayed for read-only authenticated access to the tester-controlled account.
```

重要区别：

```text
CVE-2024-6294 is scored with local/physical-style prerequisites and does not automatically imply a specific Bugcrowd priority for this report.
The current Indeed supplement does not claim cross-user access or full account takeover.
```

参考：

```text
https://nvd.nist.gov/vuln/detail/CVE-2024-6294
```

### CVE-2020-6653：Android login credentials stored in logcat

NVD 描述 Eaton Secure Connect Android App 的部分版本在账号创建或注册期间将用户登录凭据写入 logcat。该记录映射到 CWE-200 和 CWE-532，并说明恶意 App 或未授权用户可能收集这些信息，之后用于监控和控制用户账号及关联设备。

与本报告的相关性：

```text
This supports the core weakness mapping: authentication material should not be written to Android logcat.
It also supports the impact path where logged authentication material can enable account access beyond mere local information disclosure.
```

重要区别：

```text
CVE-2020-6653 involved login credentials, while the Indeed case involves cookie/session/authentication-token-like material.
The Indeed replay validation was limited to read-only authenticated access and did not test sensitive write actions.
```

参考：

```text
https://nvd.nist.gov/vuln/detail/CVE-2020-6653
https://www.eaton.com/content/dam/eaton/company/news-insights/cybersecurity/security-bulletins/Eaton-vulnerability-advisory-secure-connect-mobile-app.pdf
```

### CVE-2019-5634：Android app sensitive debug logs stored on device storage

公开 CVE 数据库描述 Hickory Smart for Android 将 internet API 和 BLE communication data 记录到 Android 设备存储路径中的 debug logs，且不需要 root 即可访问。

与本报告的相关性：

```text
This supports the broader mobile risk model: sensitive diagnostic/debug logs can become accessible outside the intended trust boundary.
This aligns with the ReportEmailHelper/diagnostic-report concern in the original supplemental evidence.
```

重要区别：

```text
The current Indeed file-location review did not prove that the ReportEmailHelper diagnostic file is written to public external storage.
Therefore, this case is cited only as a related sensitive-log exposure pattern, not as a claim that Indeed stores the diagnostic file in the same way.
```

参考：

```text
https://app.opencve.io/cve/CVE-2019-5634
```

### CVE-2015-2714 / Mozilla MFSA 2015-52：Sensitive Android logcat data

Mozilla advisory 描述 Firefox for Android 将可能敏感的 URL-encoded information 写入 Android logcat。Mozilla 将该 advisory impact 评为 Moderate，并提及 Android 版本相关的 logcat 访问限制。

与本报告的相关性：

```text
This supports the Android-specific principle that sensitive data in logcat is a recognized privacy/security issue.
It also supports the conservative discussion of Android logcat access constraints.
```

重要区别：

```text
The Mozilla case involved sensitive URL data, while the Indeed case involves cookie/session/authentication-token-like material and a positive read-only replay validation.
```

参考：

```text
https://www.mozilla.org/en-US/security/advisories/mfsa2015-52/
```

### CVE-2016-6799：Cordova Android sensitive log output

Apache Cordova Android 曾存在敏感日志问题：传递给 Android `Log` API 的 App 数据可能在旧 Android 版本中通过 logcat 被读取。公开 advisory 数据库将其映射到 CWE-532。

与本报告的相关性：

```text
This supports the weakness class: sensitive information inserted into Android logs can be a CVE-level issue.
```

重要区别：

```text
This is a framework-level issue and older Android logcat access model, while the Indeed report concerns a specific production app logging cookie/session material.
```

参考：

```text
https://advisories.gitlab.com/npm/cordova-android/CVE-2016-6799/
```

## 公开案例对严重性的支持

这些可对照案例支持三点：

```text
1. Android logcat/session/credential leakage is a recognized vulnerability class.
2. Session or credential material in logs can create account-access impact, not merely theoretical data leakage.
3. Final severity is context-dependent and depends on access prerequisites, token replayability, exposed data sensitivity, and server-side controls.
```

Indeed 的后续证据比单纯潜在日志泄露更强，因为 replay 在 clean client 中产生了明确的 baseline-vs-cookie authentication-state difference，并且使用的是测试者控制账号。它也比 ADB-only finding 更强，因为此前记录的诊断报告路径可以在正常 support/error-report workflow 中收集 cookies 和 logcat output。该结论仍保持保守，因为测试是只读的，没有证明 full account takeover、敏感写操作、silent upload 或第三方实际截获 support-report attachment。

## 补充修复建议

除移除原始 cookie log 之外：

```text
Immediately stop logging full Cookie headers and authentication/session material.
Review historical diagnostic/support logs for exposure.
Invalidate or rotate affected sessions if production logs collected these values.
Ensure support-report, crash-report, telemetry, and diagnostic pipelines redact these fields.
Reduce session replay risk through server-side binding, short lifetimes, replay detection, and session revocation controls.
```

## 本补充材料建议附件

推荐：

```text
bugcrowd-supplement-2-replay-validation.md
replay_from_adb_logcat.py
```

不要附加：

```text
tmp-cookie-header.txt
raw Cookie header
raw logcat with live values
full HTTP response body
unredacted screenshots
```
