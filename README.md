# Android Assignment Case 1


### 项目概览
这个仓库当前是一个 Android 作业案例交付目录，而不是完整源码仓库。目录中包含：

- `a1_case1.apk`：可安装的 Android 应用程序包
- `assignment1-spec-1.pdf`：作业说明文档
- `assignment1-rubric-1.pdf`：评分标准文档

基于 APK 中可见的字符串信息，这个案例与 Android 登录流程有关，至少包含 `Login`、`Main`、`Profile` 三个页面，并且测试重点很可能是“不安全的登录会话机制”，其中明确出现了 `java.util.Random` 相关描述。

### 作业目标
根据作业说明，本次作业要求学生分析一个给定的 Android APK。核心目标不是开发 App，而是将 INFO5995 的安全分析方法应用到一个陌生平台中，完成以下任务：

- 识别系统中的关键资产
- 建立清晰的系统模型与威胁模型
- 分析与安全敏感“随机值”相关的实现方式
- 找出至少一个漏洞
- 解释漏洞成因、攻击影响与修复建议
- 以简洁、结构化的方式汇报结果

作业默认不要求先有 Android 开发经验，但要求能建立一套可执行的 APK 分析流程。

### 作业任务分解
作业被拆分为 5 个步骤：

1. 反编译 APK，并建立可工作的分析流程
2. 理解应用行为，并建立一个简化系统模型
3. 找出至少一个漏洞
4. 解释漏洞为什么成立，以及攻击者如何利用
5. 清晰整理并提交分析结果

### 详细任务
#### Task 1: 解包与反编译 APK
- 用自己的话解释什么是 APK，以及为什么审计时需要反编译
- 可使用 AI 帮助选择和配置反编译工具，例如 `jadx`、`apktool`
- 需要记录至少一次“逐步式”的 AI 工具使用过程
- 反编译 APK，并确认你能定位到：
  - 包名
  - 主 Activity
  - Manifest
  - 至少一个登录或注册相关类
- 在报告中加入至少一张相关反编译代码截图，例如登录逻辑

#### Task 2: 理解应用并建立简单模型
- 尽量在模拟器或真机中运行应用，并进行交互，例如注册、登录、退出
- 如果无法运行，则使用 tutor demo 和静态分析补足
- 用自己的话在 3 到 5 句话中总结应用用途和主要功能
- 画一个简单系统模型，展示主要组件，例如：
  - UI
  - 本地存储
  - 外部服务
  - 关键资产，如 credentials、tokens
  - 数据流
- 说明核心假设和攻击者目标，例如攻击者可观察什么、控制什么、目标是什么

#### Task 3: 找到至少一个漏洞
- 重点提示是 `Randomness and Crypto`
- 通过静态分析定位那些被当作“随机数”“code”“token”或类似安全敏感值的地方
- 对每个定位点，记录：
  - 类和方法
  - 生成器 API 或辅助函数
  - 该值的安全角色，例如 UI-only、identifier、token、key
- 如有需要可借助 AI 判断该生成方式是否不适合安全用途，例如输出可预测
- 至少选择一个与安全直接相关的弱用法作为核心漏洞

#### Task 4: 解释问题与威胁模型
- 说明该值在哪里生成
- 解释为什么当前方法不适合它承担的安全角色
- 说明攻击者需要具备哪些知识、观测能力或前置条件
- 描述一个现实的攻击者模型，例如：
  - 网络观察者
  - 另一款 App
  - root 设备用户
- 给出一个简短、可执行的攻击场景，例如预测或影响随机值，最终导致认证绕过或身份冒充

#### Task 5: 撰写结果
- 使用官方 USENIX paper template，格式可为 LaTeX 或 Word
- 报告长度上限为 `2 pages max`，且包含图表和参考文献
- 报告中必须覆盖：
  - 简短介绍：目标以及为什么要做 APK 分析
  - 系统/威胁模型：保护资产、攻击者、攻击能力
  - 漏洞发现过程：工具链与 AI 使用情况
  - 漏洞细节：代码位置、风险、利用路径
  - 修复或缓解方案，以及为什么有效
- 另附一份 AI 使用日志，单独成文件，记录工具与文档引用
- 提交前至少做一次“按 rubric 驱动的 LLM 模拟问答”，并把关键问题与改进点记入 AI log
- 准备一个不超过 5 分钟的录屏展示，总结模型、漏洞与主要结论

### 建议实施方法
结合当前仓库内容，推荐按下面顺序执行：

1. 安装并运行 `a1_case1.apk`，记录应用的基本流程、页面和输入项
2. 使用 `jadx` 或 `apktool` 反编译 APK，确认包结构、Manifest、入口 Activity 和登录相关类
3. 搜索与 `random`、`token`、`session`、`code`、`auth`、`login` 等关键词相关的实现
4. 找出安全敏感值的生成方式，并判断是否使用了不安全或可预测的随机源
5. 建立系统模型和攻击者模型，明确资产、数据流和攻击面
6. 围绕一个核心漏洞整理证据，包括代码位置、触发逻辑、可利用性和影响
7. 写 2 页 USENIX 风格报告，并准备 AI log、POC 说明和展示视频

### 待完成目标
如果这个仓库用于完成本次作业，那么最终应补齐以下成果：

- 一份 2 页以内的正式分析报告
- 一份 AI 使用日志
- 一份 `pocs/` 目录，包含视频和说明文档
- 一份不超过 5 分钟的展示视频
- 每位成员的贡献记录 `activity-log.pdf`
- 分析过程中使用到的脚本、配置和辅助文件

### 当前仓库结构

```text
.
├── a1_case1.apk
├── assignment1-spec-1.pdf
└── assignment1-rubric-1.pdf
```

### 我能从仓库中确认的信息
- 这是一个 Android 应用交付包，使用了较新的 Android Gradle 构建链，APK 内可见 `androidGradlePluginVersion=8.1.1`
- APK 中可见界面/资源名称包括 `activity_login`、`activity_main`、`activity_profile`
- APK 中存在一段可读文本，指出该案例聚焦于“通过 `Java.Util.Random` 实现登录会话的非安全机制”
- 仓库内目前不包含 Java/Kotlin 源码、Gradle 工程文件、测试代码或文档化的构建脚本

### 如何使用
如果你的目标是运行这个项目，而不是修改源码，可以直接安装 APK：

1. 准备 Android 真机或模拟器
2. 通过 Android Studio、`adb install` 或拖拽方式安装 `a1_case1.apk`
3. 结合 `assignment1-spec-1.pdf` 和 `assignment1-rubric-1.pdf` 对照测试、分析或验收

示例命令：

```bash
adb install a1_case1.apk
```

### 适合的使用场景
- 课程作业提交归档
- Android 安全案例分析
- 登录会话机制审查
- 结合评分标准进行演示或复核

### 提交包要求
作业说明中的提交包至少应包含：

- `report.pdf`：使用 USENIX conference paper template 排版
- `ai-log/`：提示词、回应摘要、验证记录
- `pocs/`：视频与 README
- `presentation.mp4`：录屏展示，不超过 5 分钟
- `activity-log.pdf`：每位成员贡献总结
- 分析用到的脚本或配置文件

### 展示要求
- 教程中每组最多 10 分钟，其中 5 分钟播放展示，最多 5 分钟问答
- 展示视频不得超过 5 分钟
- 超时每 10 秒，会从本次作业分数中扣 1 分
- 每位成员在 5 分钟展示中至少发言 40 秒，否则个人分数会按规则折减

### 当前限制
- 没有源码，无法直接进行二次开发或重新构建
- 没有 `README` 之外的项目文档，功能细节需要参考 PDF 或反编译 APK
- 没有测试脚本，自动化验证能力有限

### 如果后续要把它补成完整项目仓库
建议补充以下内容：

- Android Studio 工程源码
- 构建与运行说明
- 功能说明与测试账号
- 安全问题说明与修复方案
- 截图、版本记录和提交说明

---


### Overview
This repository is currently a delivery/archive folder for an Android assignment case rather than a full source repository. It contains:

- `a1_case1.apk`: installable Android application package
- `assignment1-spec-1.pdf`: assignment specification
- `assignment1-rubric-1.pdf`: grading rubric

Based on readable strings found inside the APK, this case appears to focus on an Android login workflow. The app includes at least `Login`, `Main`, and `Profile` screens, and the test case likely centers on an insecure login session mechanism involving `java.util.Random`.

### Assignment Goals
According to the assignment brief, the purpose of this work is to analyse one provided Android APK rather than build a new app. The expected learning outcome is to apply INFO5995 security analysis skills to an unfamiliar platform by:

- identifying important assets
- building a simple system and threat model
- assessing security-sensitive uses of “random” values
- finding at least one vulnerability
- explaining impact, attacker capability, and mitigation
- reporting the findings clearly and concisely

No prior Android experience is assumed, but students are expected to set up a workable APK analysis workflow.

### Assignment Workflow
The assignment is structured into five steps:

1. Decompile the APK and set up an analysis workflow
2. Understand app behaviour and build a simple model
3. Find at least one vulnerability
4. Explain what went wrong and how an attacker could exploit it
5. Report the findings clearly

### Detailed Tasks
#### Task 1: Unpack and Decompile the APK
- Explain in your own words what an APK is and why decompilation is needed for auditing
- AI support may be used to choose or configure tooling such as `jadx` or `apktool`
- Record at least one step-by-step AI interaction
- Decompile the APK and confirm access to:
  - package name
  - main activity
  - manifest
  - at least one login or registration class
- Include one screenshot of a relevant decompiled class, such as login logic

#### Task 2: Understand the App and Build a Simple Model
- Ideally run the app on a device or emulator and interact with it, such as register, log in, and log out
- If that is not possible, use tutor demos and static analysis
- Summarise the app purpose and main features in 3 to 5 sentences
- Draw a simple system model showing:
  - main components
  - UI
  - storage
  - external services
  - important assets such as credentials or tokens
  - data flows
- State core assumptions and attacker goals, including what can be observed, controlled, and targeted

#### Task 3: Find at Least One Vulnerability
- The main hint is `Randomness and Crypto`
- Use static analysis to locate values treated as random numbers, codes, tokens, or similar security-sensitive values
- For each location, record:
  - class and method
  - generator API or helper
  - security role such as UI-only, identifier, token, or key
- With AI help if needed, assess whether the generator or pattern is unsuitable for a security role, for example because outputs are predictable
- Select at least one security-relevant weak usage as the core vulnerability

#### Task 4: Explain What Went Wrong and the Threat Model
- Explain where the value is generated
- Explain why the method is unsuitable for its security role
- Describe what attacker knowledge, observations, or prerequisites are needed
- Describe a realistic attacker model, such as:
  - network observer
  - another app
  - rooted-device user
- Provide a short step-by-step attack scenario, such as prediction or influence leading to auth bypass or impersonation

#### Task 5: Write Up Your Findings
- Use the official USENIX paper template in LaTeX or Word
- Limit the report to `2 pages max`, including figures and references
- The report must cover:
  - a short introduction explaining the goal and why APK analysis is used
  - the system and threat model
  - how the vulnerability was found, including tooling and AI usage
  - vulnerability details, code location, risk, and exploitation path
  - a concrete fix or mitigation and why it works
- Add an AI usage log as a separate file, including references to tools and docs used
- Before submission, run at least one rubric-driven LLM mock Q&A and record key questions and improvements in the AI log
- Prepare a recorded presentation of no more than 5 minutes summarising the model, vulnerability, and key lessons

### Recommended Execution Method
Given the current repository contents, a practical approach is:

1. Install and run `a1_case1.apk` to observe the app flow, screens, and inputs
2. Use `jadx` or `apktool` to decompile the APK and confirm manifest, entry activity, and login-related classes
3. Search for logic related to `random`, `token`, `session`, `code`, `auth`, or `login`
4. Identify how security-sensitive values are generated and assess whether the source is predictable or otherwise unsafe
5. Build the system model and attacker model, including assets, data flows, and attack surfaces
6. Organise evidence around one core vulnerability: code location, exploitability, and impact
7. Produce the 2-page USENIX-style report, AI log, POC notes, and presentation video

### Expected Deliverables
If this repository is used to complete the assignment, it should eventually contain:

- a formal report within 2 pages
- an AI usage log
- a `pocs/` directory with videos and README
- a presentation video no longer than 5 minutes
- an `activity-log.pdf` file summarising each member’s contribution
- any scripts, configs, or helper files used during analysis

### Repository Layout

```text
.
├── a1_case1.apk
├── assignment1-spec-1.pdf
└── assignment1-rubric-1.pdf
```

### What Can Be Verified From This Repository
- This is an Android app delivery package, and the APK metadata shows `androidGradlePluginVersion=8.1.1`
- The APK contains resource or screen names such as `activity_login`, `activity_main`, and `activity_profile`
- A readable APK string explicitly says the case focuses on an insecure login session mechanism using `Java.Util.Random`
- The repository does not currently include Java/Kotlin source code, Gradle project files, tests, or build scripts

### How To Use
If your goal is to run the app rather than modify the source, install the APK directly:

1. Prepare an Android device or emulator
2. Install `a1_case1.apk` via Android Studio, `adb install`, or drag-and-drop
3. Use `assignment1-spec-1.pdf` and `assignment1-rubric-1.pdf` as the reference for testing, analysis, or assessment

Example:

```bash
adb install a1_case1.apk
```

### Suitable Use Cases
- Course assignment archival
- Android security case analysis
- Review of login session handling
- Demonstration or reassessment against the rubric

### Submission Package
The assignment brief requires at least the following submission items:

- `report.pdf`: formatted using the USENIX conference paper template
- `ai-log/`: prompt/response summaries and validation notes
- `pocs/`: videos and README
- `presentation.mp4`: recorded presentation, up to 5 minutes
- `activity-log.pdf`: summary of each team member’s contribution
- any supporting scripts or configuration used in the analysis

### Presentation Requirements
- Each group gets up to 10 minutes in the tutorial: 5 minutes for presentation playback and up to 5 minutes for Q&A
- The presentation itself must not exceed 5 minutes
- Every additional 10 seconds over the limit deducts 1 mark from Assignment 1
- In the 5-minute presentation, each team member must speak for at least 40 seconds or their individual mark may be reduced under the stated formula

### Current Limitations
- No source code is included, so the app cannot be directly rebuilt or extended
- Functional details are only partially visible and should be confirmed from the PDFs or by APK reverse engineering
- No automated test scripts are included

### If You Want To Turn This Into a Complete Project Repo
Recommended additions:

- Android Studio source project
- Build and run instructions
- Feature summary and test credentials
- Security issue description and remediation notes
- Screenshots, version history, and submission notes
