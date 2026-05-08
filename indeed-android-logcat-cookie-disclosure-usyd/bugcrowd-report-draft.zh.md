# Bugcrowd 提交草稿：Indeed Android App 将 Cookie、CSRF、Session 和设备标识写入 logcat

## 标题

Indeed Android App 将 Cookie、CSRF、Session 和设备标识写入 Android logcat

## 目标

```text
Android application: com.indeed.android.jobsearch
Tested deep link used as trigger: http://www.indeed.com/jobs?q=test
```

## 建议 Bugcrowd 优先级

建议初始优先级：

```text
P3 - Medium
```

理由：

```text
应用在正常流程中将 cookie/session/CSRF/device 相关值写入 Android logcat。这会通过 ADB/logcat 访问、诊断日志采集、崩溃/支持日志采集、特权日志访问、被入侵的测试/支持设备等路径造成敏感信息暴露风险。
```

潜在升级：

```text
如果泄露的 JSESSIONID、CSRF token、Cookie 或相关值被确认属于认证态、仍有效，并且可复用来访问用户数据或执行认证操作，则可升级为 P2 - High。
```

当前不声称：

```text
不声称账号接管。
不声称 session replay 已成功。
不声称可执行敏感账号操作。
不声称 HTTPS payload 被解密泄露。
不声称 deep link 本身是独立漏洞。
```

建议 VRT / 弱点映射：

```text
Sensitive Data Exposure: Varies
Mobile log information disclosure: Varies
CWE-532: Insertion of Sensitive Information into Log File
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
Android Log Info Disclosure
```

## 外部参考与相似案例

以下参考资料用于支撑漏洞类型成立，以及本报告采用保守评级的原因：

```text
Android 官方指南：Log Info Disclosure
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
MITRE CWE-532: Insertion of Sensitive Information into Log File
Bugcrowd VRT: Sensitive Data Exposure 的严重性取决于上下文
CVE-2024-6294: Android App 将 user session 存入 logcat
CVE-2020-6653: Android App 将 login credentials 存入 logcat
CVE-2025-4090: Firefox/Thunderbird for Android 将潜在敏感路径写入 Logcat
```

参考链接：

```text
Android Log Info Disclosure:
https://developer.android.com/privacy-and-security/risks/log-info-disclosure

OWASP MASWE-0001:
https://mas.owasp.org/MASWE/MASVS-STORAGE/MASWE-0001/

OWASP MASTG-TEST-0203:
https://mas.owasp.org/MASTG/tests/android/MASVS-STORAGE/MASTG-TEST-0203/

MITRE CWE-532:
https://cwe.mitre.org/data/definitions/532.html

Bugcrowd VRT:
https://bugcrowd.com/vulnerability-rating-taxonomy

CVE-2024-6294:
https://nvd.nist.gov/vuln/detail/CVE-2024-6294

CVE-2020-6653:
https://nvd.nist.gov/vuln/detail/CVE-2020-6653

CVE-2025-4090:
https://nvd.nist.gov/vuln/detail/CVE-2025-4090
```

这些参考资料的使用方式如下：

```text
它们支持 Android logcat 中记录敏感数据是被认可的漏洞类型。
它们不自动证明本报告应定为 P2/P1。
它们说明严重性取决于日志访问前提、可复用性、数据敏感度，以及是否能证明认证访问。
```

## 摘要

Indeed Android 应用在由外部 Indeed deep link 触发的正常应用流程中，会将 cookie/session 相关材料写入 Android logcat。

敏感日志来源：

```text
D/IndeedCookieHelper: cookies: ...
```

该 cookie 日志行包含以下字段名：

```text
Device-ID
CSRF
INDEED_CSRF_TOKEN
ENC_CSRF
SURF
CTK
JSESSIONID
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
__cf_bm
__cflb
_cfuvid
form_tk
surftok
appSignIn
PPID
Indeed-App-Proctor-Groups
```

该问题在真实非 root Android 设备上通过 ADB/logcat 复现。测试不需要 HTTPS 拦截。代理仅以 TLS passthrough 模式用于确认目标域名和一般网络活动。敏感数据由应用自身直接写入 logcat。

重要限制：

```text
本报告确认敏感认证/session 相关值被记录到日志中。当前不证明这些值可 replay、可访问账号或可执行敏感操作。
```

本报告草稿故意省略真实原始值。真实值存在于本地原始证据文件中，如需提供，应仅通过 Bugcrowd 私有报告附件流程提交，并尽量脱敏。

## 测试环境

```text
Host OS: Windows
Tools: adb, mitmproxy/mitmdump, Python 3, PowerShell, JADX output
Device: Real Android device, non-root
Target package: com.indeed.android.jobsearch
Proxy mode: adb reverse + Android manual Wi-Fi proxy
TLS mode: passthrough, no HTTPS decryption
```

## 范围与评级说明

已查看 Indeed Bugcrowd 公开 engagement 页面，但当前环境未登录 Bugcrowd，无法查看完整 engagement brief。因此本报告遵循 Bugcrowd 标准提交结构和 VRT 风格评级语言。

本报告有意采用保守评级：

```text
初始提交优先级为 P3 - Medium。
只有在进一步测试或 Indeed triage 确认 replay 或认证账号访问后，才建议升级为 P2 - High。
当前证据不支持 P1 / Critical。
```

### 基于公开参考的严重性说明

Android 官方指南将 Log Info Disclosure 描述为应用将敏感数据输出到设备日志中的漏洞类型。该指南也说明 Android `Log.*` 会写入共享的 `logcat` 缓冲区，直接写入 logcat 不被推荐，并建议在非 debug 生产版本中对日志进行清理或移除。官方还建议使用脱敏和 R8 去除日志等缓解手段。

OWASP MASWE-0001 同样将敏感数据写入日志列为移动端弱点。OWASP MASTG-TEST-0203 描述了 Android logging APIs 的运行时测试方法，并指出如果日志中发现敏感数据，则测试失败。

MITRE CWE-532 与本问题直接对应，因为应用将敏感信息写入日志。CWE-200 可作为影响层面的辅助分类。

相似公开 CVE 支持漏洞类型成立，但也支持保守评级：

```text
CVE-2024-6294 描述某 Android App 将 user session 存入 logcat，恶意 App 或具备物理访问能力的攻击者可获取 session。其 CVSS v3.1 为 3.9 Low。

CVE-2020-6653 描述某 Android Mobile App 将 user login credentials 存入 logcat，并映射到 CWE-532/CWE-200。由于本地/物理/高权限前提，其 CVSS v3.1 也约为 Low。

CVE-2025-4090 表明 Firefox/Thunderbird for Android 的 Logcat 暴露也被认可为有效问题类型，但其泄露数据类型弱于 session/cookie 材料。
```

由于本报告尚未证明 replay、认证账号访问或敏感操作执行，建议初始优先级仍为：

```text
P3 - Medium
```

适当升级条件仍为：

```text
如果 Indeed 确认或进一步测试证明泄露的 cookie/session/CSRF 材料属于认证态、仍有效，并可复用访问用户数据或执行认证操作，则升级为 P2 - High。
```

## 复现步骤

### 1. 准备 Android 设备

连接开启 ADB 的 Android 设备：

```powershell
adb devices
```

确认目标应用已安装：

```powershell
adb shell pm list packages | Select-String "com.indeed.android.jobsearch"
```

### 2. 运行抓包脚本

在仓库根目录运行：

```powershell
python .\security-tests\deeplink_capture.py
```

脚本执行：

```text
启动 mitmdump
配置 adb reverse
清空 logcat
使用 deep link 触发应用流程
采集 mitm/logcat 输出
生成 summary 文件
检测敏感日志
```

### 3. 按提示配置 Android 手动代理

脚本提示：

```text
host: 127.0.0.1
port: 8080
```

将当前 Android Wi-Fi 代理设置为：

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

然后在终端按 Enter。

### 4. Deep Link 仅作为触发条件

脚本触发：

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

该 deep link 仅作为稳定触发受影响代码路径的方法。本报告不声称应用接受该 Indeed deep link 本身是独立漏洞。

### 5. 观察脚本输出

较早一次未登录/基线测试的代表性输出：

```text
[+] summary: capture-output\summary-20260508-235036.txt
[+] mitm log: capture-output\mitm-20260508-235036.out.log
[+] logcat: capture-output\logcat-20260508-235036.out.log
[*] mitm keyword hits: 114
[*] mitm server connect hits: 51
[*] TLS trust failure hits: 0
[*] logcat URL hits: 20
[*] sensitive log hits: 68
```

最新一次登录态测试的代表性输出：

```text
[+] summary: capture-output\summary-20260509-002214.txt
[+] mitm log: capture-output\mitm-20260509-002214.out.log
[+] logcat: capture-output\logcat-20260509-002214.out.log
[*] mitm keyword hits: 121
[*] mitm server connect hits: 47
[*] TLS trust failure hits: 0
[*] logcat URL hits: 15
[*] sensitive log hits: 10
```

这次登录态测试很关键，因为它确认：在用户已登录 APP 后，`IndeedCookieHelper` 的 cookie 日志行为仍然可以触发。命中数减少主要是因为测试前清空了 logcat、采集窗口更干净；主证据仍然是 `D/IndeedCookieHelper: cookies: ...` 日志行。

### 6. 确认 Deep Link 到达应用流程

命令：

```powershell
Select-String -Path ".\capture-output\logcat-20260508-235036.out.log" -Pattern "DeeplinkStore|LaunchActivity|http://www\.indeed\.com|jobs\?q="
```

代表性证据：

```text
START ... act=android.intent.action.VIEW dat=http://www.indeed.com/... cmp=com.indeed.android.jobsearch/.LaunchActivity
DeeplinkStore: Emitting LinkClick(uri=http://www.indeed.com/jobs?q=test&utm_eao_tk=<uuid>, referrer=null)
```

### 7. 确认网络活动，而不是 Payload 泄露

命令：

```powershell
Select-String -Path ".\capture-output\mitm-20260508-235036.out.log" -Pattern "server connect|indeed.com|secure.indeed.com|mobile-app-backend.indeed.com|collector"
```

观察到的目标域名：

```text
apis.indeed.com
mobile-app-backend.indeed.com
www.indeed.com
secure.indeed.com
profile.indeed.com
au.indeed.com
encserv.indeed.com
autocomplete.indeed.com
t.indeed.com
s.indeed.com
c03.s3.indeed.com
prod.statics.indeed.com
com-indeed-prod1.collector.snplow.net
```

说明：

```text
代理使用 TLS passthrough 模式。该证据仅确认目标域名，不证明 HTTPS payload 泄露。
```

### 8. 确认敏感 logcat 泄露

命令：

```powershell
Select-String -Path ".\capture-output\logcat-20260508-235036.out.log" -Pattern "IndeedCookieHelper|cookies:|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

代表性脱敏证据：

```text
D/IndeedCookieHelper: cookies: Device-ID=<redacted>; CSRF=<redacted>; INDEED_CSRF_TOKEN=<redacted>; ENC_CSRF=<redacted>; JSESSIONID=<redacted>; __Secure-PassportAuthProxy-BearerToken=<redacted>; __Secure-PassportAuthProxy-RefreshToken=<redacted>; CTK=<redacted>; ...
```

较早一次基线测试输出：

```text
sensitive log hits: 68
```

最新一次登录态测试输出：

```text
sensitive log hits: 10
```

在登录态测试中，报告应聚焦 `D/IndeedCookieHelper: cookies: ...` 作为主漏洞证据。其他关键词命中可能包含非主线诊断日志，不应被用来放大影响。

## PoC

### PoC 脚本

辅助脚本：

```text
security-tests/deeplink_capture.py
```

最小复现：

```powershell
python .\security-tests\deeplink_capture.py
```

预期指标：

```text
logcat URL hits: greater than 0
sensitive log hits: greater than 0
```

预期漏洞证据：

```text
logcat 包含 D/IndeedCookieHelper: cookies: ...
该 cookies 行包含 session/CSRF/device/login-flow 相关值。
```

PoC 不需要：

```text
测试设备 root
HTTPS 解密
安装 mitmproxy CA
修改 APK
```

说明：

```text
通过 ADB/logcat 复现该问题不需要 root 测试设备，但第三方实际利用取决于能否访问受影响日志。
```

## 影响

已确认影响：

```text
敏感 cookie/session/CSRF/device/login-flow 相关值被写入 Android logcat。
问题可在正常应用流程中复现。
观察该问题不需要 HTTPS 拦截。
```

如果额外服务端条件成立，潜在影响包括：

```text
如果服务端保护不足，可能辅助 session replay。
如果泄露 CSRF 值可与泄露 cookies 一起使用，可能辅助 CSRF bypass。
脱敏 logcat 证据中还出现了类似认证 token 的 cookie 名称，例如 __Secure-PassportAuthProxy-BearerToken 和 __Secure-PassportAuthProxy-RefreshToken。本报告不声称这些值可 replay，但它们的存在提高了被记录 cookie header 的敏感性。
可能向能访问受影响日志的人员暴露 tracking 或 device identifiers。
可能向能访问受影响日志的人员暴露登录或注册流程参数。
```

未确认：

```text
本报告不确认泄露值属于认证态用户。
本报告不确认可从另一设备或客户端 replay。
本报告不确认可访问用户数据。
本报告不确认可执行敏感操作。
```

## 访问模型

现代 Android 限制普通第三方 App 读取其他 App 的 logcat。因此本报告不声称任意普通已安装 App 都可读取这些日志。

现实暴露路径包括：

```text
ADB / 调试会话
开发或支持日志采集
具有 log 访问权限的特权/OEM/系统应用
包含 logcat 的崩溃或遥测管道
共享 bug report 或设备日志
被入侵的开发、测试或支持设备
```

## 额外观察，不作为主影响声明

静态分析期间，在反编译应用中识别到多个 debug/test 面：

```text
com.wlappdebug.DebugActivity
com.wlappdebug.DebugFlagsActivity
com.wlappdebug.DebugProctorActivity
androidx.compose.ui.tooling.PreviewActivity
androidx.fragment.app.testing.EmptyFragmentActivity
androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity
androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity
androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity
```

代码中识别到的 debug 菜单功能：

```text
Preferences
Remote Config
Last Crash
Debug Flags
App Proctor / experiment overrides
App and Device info
```

本报告不声称这些 debug 组件已经造成影响。只有在独立复现证明具体影响后，它们才适合作为单独报告，例如：

```text
在生产 App 中打开 exported debug 组件
读取敏感 SharedPreferences 值
修改 debug flags
修改 proctor/experiment overrides
切换 backend endpoints 或 environment
导出 crash dumps 或内部配置
```

## 修复建议

### 删除敏感日志

删除以下位置的完整 cookie 字符串日志：

```text
IndeedCookieHelper
```

不要记录：

```text
Cookie headers
JSESSIONID
CSRF / INDEED_CSRF_TOKEN
ENC_CSRF
Device-ID
CTK
SURF
__Secure-PassportAuthProxy-BearerToken
__Secure-PassportAuthProxy-RefreshToken
__Secure-PassportAuthProxy-OauthHMAC
__Secure-PassportAuthProxy-OauthExpires
PPID
Cloudflare/security cookies
form_tk
surftok
preExtAuthParams
authentication state
experiment/proctor group values
```

### 增加统一脱敏

如确需诊断日志，在记录前脱敏：

```text
cookies: [Device-ID=<redacted>, CSRF=<redacted>, CTK=<redacted>]
```

优先只记录：

```text
cookie key names
cookie count
boolean presence flags
non-sensitive status codes
```

### 加固生产构建

建议：

```text
release 构建禁用 debug/info 日志
使用 R8/ProGuard 规则移除 verbose/debug log 调用
阻止敏感值进入 crash/telemetry 管道
检查 support-log 和 diagnostic-log 采集中的敏感字段
```

### 服务端验证

用于判断是否应升级严重性：

```text
确认泄露 session cookies 是否为认证态
确认泄露值是否可从另一个客户端 replay
确认 sessions 是否绑定 device/IP/User-Agent/app 信号
确认 CSRF 值是否可在预期上下文外复用
确认敏感账号操作是否要求重新认证
```

## 建议报告附件

建议私有附件：

```text
summary-clean-20260509-002214.txt
redacted-logcat-indeed-cookiehelper-20260509-002214.txt
capture-output\summary-20260508-235036.txt
security-tests\deeplink_capture.py
```

如 triage 要求，可选附件：

```text
capture-output\logcat-20260509-002214.out.log
capture-output\mitm-20260509-002214.out.log
capture-output\logcat-20260508-235036.out.log
capture-output\mitm-20260508-235036.out.log
```

重要说明：

```text
原始 logcat 包含真实敏感值。在 Bugcrowd 私有报告以外分享前必须脱敏。
```

## 最终评估

建议初始严重性：

```text
P3 - Medium
```

原因：

```text
应用记录 cookie/session/CSRF/device/login-flow 相关值。
已通过 ADB/logcat 在真实非 root Android 设备上复现。
不需要 HTTPS 解密或 APK 修改。
第三方实际利用取决于能否访问受影响日志。
未测试或确认 replay / account access。
```

潜在升级：

```text
如果泄露值被确认仍有效、属于认证态，并可复用来访问用户数据或执行认证操作，可升级为 P2 - High。
```

当前证据不支持：

```text
P1 / Critical
Account takeover
Confirmed session replay
Confirmed sensitive action execution
Decrypted HTTPS payload leakage
Standalone deep link vulnerability
```
