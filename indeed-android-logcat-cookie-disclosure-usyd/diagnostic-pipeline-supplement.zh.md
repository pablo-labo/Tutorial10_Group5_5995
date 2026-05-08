# 补充证据：诊断报告与遥测相关暴露路径

## 结论摘要

本补充材料用于说明：`IndeedCookieHelper` 将 cookie/session/CSRF/authentication-token-like 字段写入 Android logcat 后，风险是否仅限于研究者通过 ADB 读取日志。

复核结论：

```text
最强的新证据是 ReportEmailHelper。
静态分析显示该路径会生成诊断报告文件，并收集 WebView cookies 与 logcat -d 输出。
这增强了 P3 / Medium 或 USYD S2 / Medium 的说服力，因为敏感值可能进入正常的支持/诊断报告流程，而不仅是 ADB 本地观察。
```

仍需保守：

```text
不声称账号接管。
不声称 session/token replay 已成立。
不声称 Crashlytics 或 Datadog 已上传这些 cookie 值。
不声称诊断文件被静默远程上传。
不声称诊断文件存放在公共外部存储或任意第三方 App 可被动读取。
```

## ReportEmailHelper 证据

静态代码位置：

```text
sources/defpackage/l2d.java
Class metadata: com.indeed.android.jobsearch.error.ReportEmailHelperKt$getErrorReportFile$2
```

该 helper 会读取 WebView cookies：

```text
sources/defpackage/l2d.java:153
indeed.com cookies: CookieManager.getCookie("https://indeed.com")

sources/defpackage/l2d.java:155
www.indeed.com cookies: CookieManager.getCookie("https://www.indeed.com")

sources/defpackage/l2d.java:164
创建 "--- Cookies Dump ---" section
```

该 helper 也会读取 logcat：

```text
sources/defpackage/l2d.java:251
创建 "--- Logcat Logs ---" section

sources/defpackage/l2d.java:253
Runtime.getRuntime().exec("logcat -d").getInputStream()
```

cookie 过滤逻辑不足：

```text
sources/defpackage/p2d.java:10
public static final String[] a = {"SHOE", "SOCK", "PPID"};
```

这意味着过滤规则没有覆盖运行时证据中出现的高敏感字段名：

```text
JSESSIONID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
```

## Refresh Token 敏感性

脱敏证据中出现：

```text
__Secure-PassportAuthProxy-RefreshToken
```

该字段名表现为 refresh-token-like cookie。OAuth 2.0 中，refresh token 用于在 access token 过期后获取新的 access token，因此通常比普通短期 token 或 tracking cookie 更敏感。

保守表述：

```text
本报告不证明 Indeed 的该 cookie 可 replay、有效期很长或可跨设备使用。
但 refresh-token-like 字段名的出现提高了被记录 cookie header 与诊断报告内容的敏感性。
```

## 文件位置复核

静态复核发现，ReportEmailHelper 创建诊断文件时没有显式指定外部存储路径：

```text
sources/defpackage/l2d.java:71
File.createTempFile("errorReport", ".txt")

sources/defpackage/n2d.java:44
File.createTempFile("eventLogFiles_", ".zip")
```

没有在该路径中发现：

```text
context.getExternalCacheDir()
context.getExternalFilesDir()
公共 external storage 目录参数
```

解释：

```text
File.createTempFile(prefix, suffix) 未传入 directory 参数时，会使用 Java 默认临时目录，即 java.io.tmpdir。
实际运行路径取决于 Android runtime/app 的 java.io.tmpdir 配置，需要动态测试确认。
```

因此不能声称：

```text
诊断报告默认写入公共外部存储。
任意拥有 READ_EXTERNAL_STORAGE 的 App 可自动读取诊断文件。
该问题已经构成无感、被动、本地文件泄露。
```

更稳妥的说法：

```text
App 可以生成包含 WebView cookies 与 logcat 输出的诊断报告文件。
如果该文件通过 Android Intent/FileProvider 作为邮件或分享附件发送，则被用户选择的接收 App 会获得临时读取权限。
这扩大了敏感数据的接触面，但仍属于用户触发的诊断/支持流程，除非进一步 runtime 证明存在静默上传或外部存储落盘。
```

## Firebase / Datadog 复核

Crashlytics / Firebase Sessions 存在：

```text
resources/AndroidManifest.xml:676
FirebaseCrashlyticsKtxRegistrar

resources/AndroidManifest.xml:679
CrashlyticsRegistrar

capture-output/logcat-20260509-002214.out.log:1196
Making request to: https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog
```

Datadog logging 存在：

```text
sources/defpackage/bg3.java:39
.setLogcatLogsEnabled(true)

sources/defpackage/j7.java:56
.setLogcatLogsEnabled(true)

capture-output/mitm-20260509-002214.out.log:11
server connect browser-intake-datadoghq.com:443
```

保守解释：

```text
这些证据证明 telemetry/logging SDK 存在且运行时活跃。
它们不能证明 Crashlytics 或 Datadog 已接收 IndeedCookieHelper 的敏感 cookie 行。
Datadog 的 setLogcatLogsEnabled(true) 不应被夸大为自动采集整个 Android 系统 logcat buffer。
```

## 对评分的影响

建议评分：

```text
USYD: S2 / Medium
Bugcrowd-style: P3 / Medium
```

理由：

```text
敏感 cookie/session/CSRF/authentication-token-like 字段写入生产 logcat 已确认。
认证状态下可复现。
ReportEmailHelper 静态代码显示 WebView cookies 与 logcat -d 可进入诊断报告文件。
refresh-token-like 字段名提高敏感性。
但 replay、账号接管、静默远程上传、公共外部存储暴露均未证明。
```

升级条件：

```text
如果证明泄露 cookie 或 refresh-token-like 值可跨客户端 replay 并访问用户数据，可升级到 High。
只有证明跨设备账号接管或执行高敏感账号操作，才支持更高等级。
```

## 建议后续验证

```text
1. 使用测试账号触发应用内 support/report/email flow。
2. 不发送邮件，仅观察附件名称、URI、FileProvider authority 或可见路径。
3. 如果能安全获取附件预览，检查是否包含 "--- Cookies ---"、"--- Cookies Dump ---"、"--- Logcat Logs ---"。
4. 只保存脱敏证据，不保存或上传真实 cookie/token。
5. 若路径显示 external cache 或公共外部存储，再补充路径与权限证据。
```

## 参考

```text
OAuth 2.0 RFC 6749, Refresh Tokens:
https://www.rfc-editor.org/rfc/rfc6749#section-1.5
https://www.rfc-editor.org/rfc/rfc6749#section-6

Java File.createTempFile:
https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/io/File.html#createTempFile(java.lang.String,java.lang.String)

AndroidX FileProvider:
https://developer.android.com/reference/androidx/core/content/FileProvider
```
