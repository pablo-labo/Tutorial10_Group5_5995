# Android 应用安全风险报告

## 1. 测试范围

目标应用：

```text
com.indeed.android.jobsearch
```

测试重点：

```text
Deep link 处理流程
外部 URL 启动后的网络影响面
运行时日志泄露
导出的 debug/test 组件
调试设置与实验覆盖能力
```

主要测试 deep link：

```text
http://www.indeed.com/jobs?q=test
```

测试环境：

```text
Windows PC
PowerShell
ADB
mitmproxy / mitmdump
Python 3
JADX 反编译代码目录
真实 Android 设备，非 root
```

由于真实设备未 root，HTTPS 拦截使用 TLS passthrough 模式。该模式不会解密 HTTPS 内容，但仍可验证目标域名、网络连接行为和 logcat 输出。

## 2. 测试方法

### 2.1 静态分析

基于 JADX 反编译输出，对 APK 进行了静态检查，重点关注：

```text
AndroidManifest.xml
network_security_config.xml
exported Activity 声明
debug UI 类
SharedPreferences / debug flag / proctor 相关代码
运行时日志行为
```

重点检查的文件和类：

```text
resources/AndroidManifest.xml
resources/res/xml/network_security_config.xml
sources/com/wlappdebug/DebugActivity.java
sources/com/wlappdebug/DebugFlagsActivity.java
sources/com/wlappdebug/DebugProctorActivity.java
sources/com/wlappdebug/o.java
sources/com/wlappdebug/q.java
sources/com/wlappdebug/l.java
sources/defpackage/ai3.java
sources/defpackage/ed4.java
sources/defpackage/om0.java
sources/defpackage/q87.java
sources/androidx/compose/ui/tooling/PreviewActivity.java
```

### 2.2 导出组件与调试面检查

Manifest 中发现多个 debug/test 相关组件在生产包中存在或疑似导出：

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

运行时测试确认 debugger/debug UI 页面可以被成功打开。

### 2.3 Deep Link 测试

使用以下 ADB 命令触发目标 deep link：

```powershell
adb shell am start -a android.intent.action.VIEW `
  -d "http://www.indeed.com/jobs?q=test" `
  com.indeed.android.jobsearch
```

后续将该流程封装进 PowerShell 和 Python 测试脚本。

### 2.4 PowerShell 抓包测试

创建了 PowerShell 辅助脚本：

```text
security-tests/deeplink_http_capture.ps1
```

该脚本执行：

```text
启动 mitmdump
尽可能配置 Android 代理
无法自动配置时提示手动设置代理
触发 deep link
采集 logcat
将 mitm/logcat 输出写入 capture-output
```

测试中遇到的问题：

```text
Start-Process 不能将 stdout/stderr 重定向到同一个文件
ADB 因 WRITE_SECURE_SETTINGS 无法写入 global http_proxy
使用 PC Wi-Fi IP 作为代理导致手机断网
未信任 mitmproxy CA 时 HTTPS 拦截失败
```

已修复：

```text
拆分 stdout/stderr 日志文件
增加手动代理提示
增加 ADB reverse 模式
默认使用 TLS passthrough
每轮测试前清空 logcat
生成 summary 摘要文件
```

### 2.5 Python 抓包测试

创建了 Python 辅助脚本：

```text
security-tests/deeplink_capture.py
```

默认运行命令：

```powershell
python .\security-tests\deeplink_capture.py
```

默认行为：

```text
在 127.0.0.1:8080 启动 mitmdump
使用 adb reverse tcp:8080 tcp:8080
提示用户将 Android Wi-Fi 代理设为 127.0.0.1:8080
清空 logcat
触发 deep link
采集 mitm 文本日志和 logcat
生成 summary-*.txt
检测敏感日志
在 summary 中对已知敏感值脱敏
```

测试中使用的 Android 手动代理设置：

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

默认使用 TLS passthrough：

```text
不解密 HTTPS 内容
不需要安装 mitmproxy CA
仍可采集目标域名和 logcat 数据
```

可选 HTTPS 拦截模式：

```powershell
python .\security-tests\deeplink_capture.py --intercept-tls
```

该模式要求测试设备或模拟器信任 mitmproxy CA，更适用于已 root 模拟器或配置为信任用户 CA 的测试包。

## 3. 使用的命令

### 3.1 直接触发 Deep Link

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

### 3.2 运行 PowerShell 抓包脚本

```powershell
powershell -ExecutionPolicy Bypass -File .\security-tests\deeplink_http_capture.ps1
```

### 3.3 运行 Python 抓包脚本

```powershell
python .\security-tests\deeplink_capture.py
```

### 3.4 检查 mitm 证据

```powershell
Select-String -Path ".\capture-output\mitm-*.out.log" -Pattern "indeed.com|GET|POST|CONNECT|jobs|server connect"
```

### 3.5 检查 logcat URL 证据

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "DeeplinkStore|IndeedWebViewClient|BaseWebViewClient|http://www\.indeed\.com|https://www\.indeed\.com|jobs\?q="
```

### 3.6 检查 logcat 敏感信息证据

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "IndeedCookieHelper|cookies:|Cookie:|Authorization|Bearer|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

## 4. 测试结果

### 4.1 App 接收了外部 Deep Link

应用成功接收外部 deep link 并启动：

```text
START ... act=android.intent.action.VIEW dat=http://www.indeed.com/... cmp=com.indeed.android.jobsearch/.LaunchActivity
```

应用内部也产生了 link click 事件：

```text
DeeplinkStore: Emitting LinkClick(uri=http://www.indeed.com/jobs?q=test&utm_eao_tk=<uuid>, referrer=null)
```

结果：

```text
已确认。外部 deep link 输入进入了应用 LaunchActivity 和内部 deeplink 处理流程。
```

### 4.2 观察到网络影响面

Python 抓包脚本较早一次基线测试的代表性输出：

```text
mitm keyword hits: 114
mitm server connect hits: 51
TLS trust failure hits: 0
logcat URL hits: 20
sensitive log hits: 68
```

在登录 APP 后，再次运行测试得到以下输出：

```text
summary: capture-output\summary-20260509-002214.txt
mitm log: capture-output\mitm-20260509-002214.out.log
logcat: capture-output\logcat-20260509-002214.out.log
mitm keyword hits: 121
mitm server connect hits: 47
TLS trust failure hits: 0
logcat URL hits: 15
sensitive log hits: 10
```

这次登录态测试确认：用户登录 APP 后，敏感日志行为仍然存在。

观察到的目标域名包括：

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
browser-intake-datadoghq.com
crashlyticsreports-pa.googleapis.com
firebaseremoteconfig.googleapis.com
app-measurement.com
```

结果：

```text
已确认。外部 deep link 会触发 Indeed 业务、Web、静态资源、埋点和后端域名的网络连接。
```

### 4.3 HTTPS 内容未被解密

真实非 root 设备上使用 TLS passthrough 模式。

结果：

```text
未声称 mitmproxy 捕获到 HTTPS 明文内容。
mitmproxy 仅用于确认目标域名和连接行为。
```

### 4.4 敏感数据被写入 logcat

最重要的发现是：应用将敏感 Cookie/session 材料写入了 logcat。

敏感日志来源：

```text
D/IndeedCookieHelper: cookies: ...
```

代表性泄露字段：

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

较早一次基线 Python 测试输出：

```text
sensitive log hits: 68
```

最新一次登录态 Python 测试输出：

```text
sensitive log hits: 10
```

登录态测试中最相关的证据是 `D/IndeedCookieHelper: cookies: ...` 日志行。其他关键词命中可能包含诊断日志或框架日志，应作为辅助上下文，而不是主影响证据。

结果：

```text
已确认。会话、CSRF、追踪、设备和登录流程相关值被写入 Android logcat，并且在登录态应用会话中仍可复现。
```

原始 logcat 文件包含真实敏感值，未脱敏前不应外发。

### 4.5 存在 Debug 组件和调试功能

静态分析和运行时测试显示应用中存在调试面。

代码中识别到的 debug 菜单：

```text
App
Device
Preferences
Remote Config
Last Crash
Debug Flags
App Proctor
```

这些调试功能的潜在风险：

```text
Preferences 页面读取 SharedPreferences.getAll()
Remote Config 页面展示 Firebase Remote Config 的 key/value/source
Last Crash 读取 debug_last_exception_dump.txt
Debug Flags 存储和修改 debug flags
Proctor 页面允许实验 override value 和 payload
endpoint resolver 可能受到 debug flag 值影响
```

结果：

```text
静态分析已确认。运行时也观察到 debug UI 可访问。
```

## 5. PoC

### 5.1 PoC A：触发 Deep Link 并采集运行证据

运行：

```powershell
python .\security-tests\deeplink_capture.py
```

按提示设置 Android Wi-Fi 代理：

```text
Proxy host: 127.0.0.1
Proxy port: 8080
```

然后在终端按 Enter。

预期输出：

```text
mitm server connect hits: > 0
logcat URL hits: > 0
sensitive log hits: > 0
```

生成证据：

```text
capture-output\summary-*.txt
capture-output\mitm-*.out.log
capture-output\logcat-*.out.log
```

### 5.2 PoC B：确认 Deep Link 被处理

运行：

```powershell
adb shell am start -a android.intent.action.VIEW -d "http://www.indeed.com/jobs?q=test" com.indeed.android.jobsearch
```

然后验证：

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "DeeplinkStore|LaunchActivity|http://www\.indeed\.com|jobs\?q="
```

预期证据：

```text
LaunchActivity 收到 VIEW intent
DeeplinkStore 产生包含 deeplink URL 的 LinkClick 事件
```

### 5.3 PoC C：确认敏感日志泄露

运行：

```powershell
Select-String -Path ".\capture-output\logcat-*.out.log" -Pattern "IndeedCookieHelper|cookies:|JSESSIONID|CSRF|INDEED_CSRF_TOKEN|SURF=|CTK=|Device-ID=|form_tk|surftok"
```

预期证据：

```text
logcat 中出现 IndeedCookieHelper，并打印 cookie 材料。
```

不要公开原始值，报告中应使用脱敏输出。

### 5.4 PoC D：无需 HTTPS 解密确认网络影响面

运行：

```powershell
Select-String -Path ".\capture-output\mitm-*.out.log" -Pattern "server connect|indeed.com|secure.indeed.com|mobile-app-backend.indeed.com|collector"
```

预期证据：

```text
mitmproxy 日志中出现到 Indeed 域名的 CONNECT/server connect 记录。
```

这只能证明目标域名和网络影响面，不代表已解密 HTTPS 请求内容。

## 6. 风险分析

### 6.1 主要风险：日志中的敏感数据泄露

风险等级：

```text
High
```

原因：

```text
Cookie/session 材料被记录
CSRF 值被记录
设备和追踪标识被记录
登录流程参数被记录
问题可复现
不需要 HTTPS 解密
```

潜在影响：

```text
会话材料泄露
CSRF token 泄露
设备/用户追踪标识泄露
登录或注册流程 token 泄露
脱敏证据中还出现了类似认证 token 的 cookie 名称，例如 __Secure-PassportAuthProxy-BearerToken 和 __Secure-PassportAuthProxy-RefreshToken。本报告不声称这些值可 replay，但这些字段的存在提高了被记录 cookie header 的敏感性。
如果服务端保护不足，可能导致 session replay 或越权访问
可能通过诊断日志、崩溃报告、厂商日志或授权 ADB 采集暴露
```

### 6.2 潜在越权访问风险

如果泄露值能在原客户端上下文之外被接受，可能导致越权访问。

影响可利用性的服务端控制包括：

```text
Cookie 生命周期
Session 是否绑定设备、IP、地区、User-Agent、App 签名或设备证明
CSRF 校验模型
敏感操作是否要求重新认证
HttpOnly / Secure / SameSite Cookie 策略
异常检测和 session 撤销机制
```

当前状态：

```text
已确认敏感 session/authentication 相关材料泄露。
尚未确认能否直接账号接管或越权访问。
```

建议等级：

```text
High
```

升级条件：

```text
如果泄露 cookie 可被复用来访问用户数据或执行账号操作，应升级为 Critical。
```

### 6.3 Debug 和测试组件暴露

风险等级：

```text
High
```

原因：

```text
debug 组件和 AndroidX test/preview 组件存在
DebugActivity 暴露内部诊断菜单
Preferences、Remote Config、Debug Flags、Proctor 页面可能泄露或修改运行状态
```

潜在影响：

```text
内部配置泄露
Feature flag 操作
实验/proctor override
Endpoint/环境切换
Crash/内部堆栈泄露
本地敏感偏好泄露
攻击面扩大
```

### 6.4 Deep Link 处理风险

风险等级：

```text
单独看为 Medium
与敏感日志泄露结合时为 High
```

原因：

```text
外部输入被接受并进入 App/Web/后端流程
deeplink 触发日志和网络行为
查询参数和生成的追踪参数出现在日志中
```

## 7. CWE / OWASP 映射

相关映射：

```text
CWE-532: Insertion of Sensitive Information into Log File
CWE-200: Exposure of Sensitive Information to an Unauthorized Actor
CWE-359: Exposure of Private Personal Information to an Unauthorized Actor
CWE-489: Active Debug Code
CWE-926: Improper Export of Android Application Components
OWASP MASWE-0001: Insertion of Sensitive Data into Logs
OWASP MASTG-TEST-0203: Runtime Use of Logging APIs
Android Log Info Disclosure
```

同类公开漏洞参考：

```text
CVE-2017-9615: verbose logging stores admin credentials
CVE-2018-1999036: SSH private key password stored in build log
```

这些 CVE 仅作为敏感信息写入日志的同类案例，并非该应用自身 CVE。

## 8. 修复建议

### 8.1 日志

删除或脱敏以下内容的所有日志输出：

```text
Cookie headers
Session identifiers
CSRF tokens
Device IDs
Tracking IDs
Cloudflare/security cookies
Login/authentication parameters
Experiment/proctor assignments
```

明确建议：

```text
删除 IndeedCookieHelper 对完整 cookie 的日志输出。
```

如确需日志，仅记录元数据：

```text
cookie 数量
cookie key 名称
布尔型存在标记
脱敏后的值
```

安全示例：

```text
cookies: [Device-ID=<redacted>, CSRF=<redacted>, CTK=<redacted>]
```

### 8.2 Release 构建加固

建议：

```text
生产环境禁用 debug/info 日志
使用 R8/ProGuard 移除日志调用
确保生产环境不能远程开启 debug logging
崩溃或遥测上传前过滤敏感值
```

### 8.3 组件暴露

建议：

```text
从生产构建移除 com.wlappdebug.*
从生产构建移除 AndroidX testing 和 preview activities
将 debug/test 组件设置为 android:exported="false"
无法移除的内部组件使用 signature-level permission 保护
```

### 8.4 Debug 功能

建议：

```text
生产环境禁用 Preferences / Remote Config / Last Crash / Debug Flags / Proctor 页面
生产环境禁止 endpoint override
生产环境禁止 experiment override
生产环境不展示 SharedPreferences 值
```

### 8.5 服务端补偿控制

建议验证：

```text
确认泄露 cookie 无法在不同客户端复用
将敏感 session 绑定适当风险信号
尽可能使用短生命周期 token
敏感操作要求重新认证
疑似日志泄露后轮换/撤销 session
监控 replay 和异常行为
```

## 9. 最终评估

最终严重性：

```text
High
```

理由：

```text
应用记录敏感 Cookie/session/CSRF/device/login-flow 值
该问题可在非 root 真实设备上复现
不需要 HTTPS 拦截
外部 deep link 会触发应用和网络流程
debug/test 面存在并扩大攻击面
```

潜在升级：

```text
如果泄露 cookie 或 token 可复用来访问用户数据或执行账号操作，应升级为 Critical。
```

证据文件：

```text
capture-output\summary-*.txt
capture-output\mitm-*.out.log
capture-output\logcat-*.out.log
security-tests\deeplink_capture.py
security-tests\deeplink_http_capture.ps1
```

重要处理说明：

```text
原始 logcat 文件包含真实敏感值，未脱敏前不要外发。
```
