# Android Assignment Case 1

## 项目定位

这个仓库是 `INFO5995 Assignment 1` 的分析型作业目录，不是完整的 Android 源码工程。当前仓库主要用于：

- 保存待分析 APK
- 保存最新版作业说明与评分标准
- 组织后续报告、AI log、PoC、展示视频和贡献记录

当前文件：

- `a1_case1.apk`
- `assignment1-spec-2.pdf`
- `assignment1-rubric-2.pdf`

从 APK 可见字符串来看，这个案例与 Android 登录流程有关，至少包含 `Login`、`Main`、`Profile` 页面，并且重点很可能是与 `java.util.Random` 相关的登录会话或认证弱点。

## 最新要求摘要

以下内容以 `assignment1-spec-2.pdf` 和 `assignment1-rubric-2.pdf` 为准。

### 评分范围

Assignment 1 只评分与 `randomness` 和 `cryptography` 相关的漏洞。

- 不需要也不建议把时间花在无关漏洞上
- 更适合选择一个强、证据充分、能被清晰解释的核心漏洞
- AI 可以辅助分析、写报告和生成 PoC，但所有提交内容必须由小组自行验证

### 评分项

总分 `15 marks`，主要由四个评分桶组成：

1. `System & Threat Model`：`4 marks`
2. `Vulnerability Discovery & Explanation`：`6 marks`
3. `Fix / Mitigation`：`2 marks`
4. `Recorded Presentation & Q&A`：`3 marks`

其中新版 rubric 明确强调：

- 老师会同时看提交材料和录屏/教程 Q&A
- 展示与答辩是判断小组是否真正理解并验证了工作的强证据
- 若提交内容无法被解释或辩护，对应评分项可能被扣分

### 想拿高分的关键

`Vulnerability Discovery & Explanation` 想拿高分时，需要做到：

- 正确识别一个与随机性或密码学误用直接相关的安全漏洞
- 解释发现方法，包含工具和 AI 的使用方式
- 解释风险
- 给出具体、可信、分步骤的攻击路径

这意味着“只发现弱随机数调用”还不够，必须把它和安全角色、攻击前提、利用方式连起来。

## 作业任务

### Task 1: 解包与反编译 APK

- 用自己的话解释 APK 是什么，以及为什么审计需要反编译
- 可使用 AI 帮助选择或配置 `jadx`、`apktool` 等工具
- 记录至少一次逐步式 AI 交互
- 反编译 APK，并确认能找到：
  - 包名
  - 主 Activity
  - Manifest
  - 至少一个登录/注册相关类
- 报告中至少放一张相关反编译代码截图

### Task 2: 理解应用并建立简单模型

- 尽量在真机或模拟器中运行 APK
- 若无法运行，可结合 tutor demo 和静态分析
- 用 `3-5` 句话概括 app 的用途和核心功能
- 画出简单系统模型，包含：
  - UI
  - 本地存储
  - 外部服务
  - 关键资产，例如 credentials、tokens
  - 数据流
- 说明核心假设与攻击者目标

### Task 3: 找到至少一个与 Randomness/Crypto 相关的漏洞

- 只聚焦与 `randomness` 或 `cryptography` 相关的问题
- 搜索被当作随机值、验证码、token、session、auth code 等使用的值
- 对每个候选点记录：
  - 类和方法
  - 生成器 API 或 helper
  - 安全角色，例如 UI-only、identifier、token、key
- 判断该生成方式是否不适合安全敏感用途
- 选出一个核心漏洞作为主线

### Task 4: 解释问题与威胁模型

- 说明值在哪里生成
- 解释为什么当前方法不适合其安全角色
- 描述攻击者需要哪些知识、观测能力或前置条件
- 选择现实攻击者模型，例如：
  - network observer
  - another app
  - rooted-device user
- 给出简短但具体的攻击路径

### Task 5: 写报告与准备展示

- 使用官方 USENIX paper template
- 报告限制为 `2 pages max`，包含图和参考文献
- 报告必须覆盖：
  - 简短介绍
  - system/threat model
  - 漏洞发现过程，包括 tooling 与 AI use
  - 漏洞细节，包括代码位置、风险、利用路径
  - 具体 fix/mitigation 及其有效性
- 单独提交 AI usage log
- 提交前至少做一次基于 rubric 的 LLM mock Q&A
- 准备一段 `<= 5 minutes` 的录屏展示

## 必交件与扣分规则

### Required submissions

新版 rubric 明确要求以下项目：

- `report.pdf`
- `ai-log/`
- `pocs/`，其中包含视频与 `README`
- `presentation.mp4`
- `activity-log.pdf`

缺少任一必交件，`Assignment 1 total` 直接扣 `5 marks`。

### Presentation rules

- 录屏展示必须 `<= 5 minutes`
- 每超时 `10 seconds`，从总分中扣 `1 mark`
- tutorial 总时长上限 `10 minutes`
  - `5 minutes` 播放展示
  - `up to 5 minutes` Q&A

### Individual fairness

- 5 分钟展示中，每位成员至少发言 `40 seconds`
- 若某成员发言时间少于 `40 seconds`，其个人分会按 rubric 指定公式折减
- tutors 可以根据 `activity-log.pdf` 调整个人分

### Report compliance

- 若报告超过 `2 pages`
- 或未使用官方 USENIX conference paper template

则额外扣 `3 marks`

## Activity Log 要求

新版 rubric 明确要求 `activity-log.pdf` 使用 `N x N contribution matrix`。

对于 5 人小组，意味着：

- 每位成员都要写自己对每一位成员贡献的简短描述
- 总共是 `5 x 5 = 25` 条短记录
- tutors 可能使用矩阵中的不一致之处判断个人贡献是否失衡

因此最稳妥的做法不是“大家都模糊参与所有事情”，而是：

- 每人有清晰主责
- 每人有少量、明确的协作接口
- 矩阵里写成 `主导 + 支持`，而不是“所有人共同完成一切”

## 推荐分析流程

1. 安装并运行 `a1_case1.apk`，记录页面、输入项和认证流程
2. 用 `jadx` 或 `apktool` 反编译，定位 Manifest、入口 Activity 和登录相关类
3. 搜索 `random`、`token`、`session`、`code`、`auth`、`login` 等关键词
4. 建立候选点清单，并标注每个值的安全角色
5. 选出一个最强、最能解释清楚的 randomness/crypto 核心漏洞
6. 建 system model、threat model 和 attack scenario
7. 形成报告、AI log、PoC 材料、展示视频和 activity log

## 当前仓库结构

```text
.
├── README.md
├── a1_case1.apk
├── assignment1-rubric-2.pdf
└── assignment1-spec-2.pdf
```

## 当前已知信息

- APK 是完整安装包，包含 `classes.dex`
- APK 元数据中可见较新的 Android 构建链痕迹
- 可见资源/界面名包括 `activity_login`、`activity_main`、`activity_profile`
- APK 中存在可读字符串，指出案例聚焦于通过 `Java.Util.Random` 实现不安全登录会话机制
- 仓库当前不包含 Java/Kotlin 源码、Gradle 工程文件或自动化测试

## 当前限制

- 无法直接重新构建 app，因为没有源码工程
- 更适合做 APK 静态分析和行为分析，而不是修复源码
- 若要补齐高质量作业交付，后续还需要新增报告、AI log、PoC 和展示材料

## 五人低耦合分工表

新版 rubric 更适合按“评分证明责任”分工，而不是按“谁等谁”的串行流程分工。

### A：漏洞主张与报告总控

主责：

- 锁定唯一核心漏洞，确保严格在 `randomness/crypto` 范围内
- 维护最终主张：漏洞是什么、风险是什么、攻击如何成立
- 负责 2 页报告结构和终稿整合

独立产物：

- `claim-sheet`
- 报告骨架
- 最终风险表述

轻协作接口：

- 从 B 获取风险路径优先级
- 从 C 获取代码证据包
- 从 D 获取攻击路径可行性说明
- 从 E 获取修复口径与验收标准

### B：System & Threat Model 负责人

主责：

- 识别资产、攻击者能力、攻击目标和 trust boundary
- 形成 system model 与 threat model
- 保证攻击假设现实、不过度夸大

独立产物：

- `system-model`
- `threat-model`
- attacker assumptions

轻协作接口：

- 从 C 获取数据流与代码层对应证据
- 向 A 提供风险排序建议
- 向 D 提供攻击前提和现实限制

### C：静态分析与证据包负责人

主责：

- 反编译 APK
- 搜索随机数、token、session、auth 等关键路径
- 输出代码位置、截图、方法清单和调用点列表

独立产物：

- `evidence-pack`
- 随机数/认证相关调用点表
- 截图证据

轻协作接口：

- 向 A 提交候选漏洞点
- 向 B 提供模型所需数据流证据
- 向 D 提供方法级证据
- 向 E 标记修复落点

### D：攻击路径与 PoC 负责人

主责：

- 将核心漏洞转化为具体利用路径
- 产出 PoC、复现说明、攻击步骤和边界条件
- 准备教程 Q&A 中“攻击为什么成立”的回答

独立产物：

- `poc-notes`
- 攻击步骤
- 复现说明或 PoC 材料

轻协作接口：

- 从 B 获取现实攻击者模型
- 从 C 获取代码调用链证据
- 向 A 反馈漏洞是否足够可利用、可解释
- 向 E 反馈修复前后攻击难度变化

### E：修复方案与提交质控负责人

主责：

- 设计 fix/mitigation，例如 `SecureRandom`、token 长度、轮换和失效策略
- 检查修复方案是否真正阻断当前攻击路径
- 负责最终提交物完整性、格式、命名和时间限制检查

独立产物：

- `fix-plan`
- submission checklist
- presentation compliance checklist

轻协作接口：

- 从 A 获取最终漏洞定义
- 从 C 获取修复落点
- 从 D 获取攻击验证结果
- 检查全组提交物是否满足 rubric

## 建议同步机制

为了降低耦合，不建议一直实时等待彼此结果，而是只设置两个同步点。

### 同步点 1：锁定核心漏洞

输入：

- B 的 threat model v1
- C 的 evidence pack v1
- D 的 exploit idea v1

输出：

- A 拍板最终核心漏洞

### 同步点 2：锁定最终提交包

输入：

- report
- ai-log
- pocs
- presentation
- activity-log

输出：

- E 完成最终合规检查

## Activity Log 文案模板

下面是一套适合 `5 x 5 contribution matrix` 的短文案模板。写法建议尽量保持：

- 一句话
- 明确主导动作
- 明确支持动作
- 不夸大

### A 写

- `A -> A`: Led vulnerability scoping, selected the final randomness/crypto issue, and integrated the final report argument.
- `A -> B`: B built the system and threat model, including assets, attacker assumptions, and risk paths linked to the chosen vulnerability.
- `A -> C`: C produced the decompilation evidence pack, including code locations, method traces, and screenshots used to validate the finding.
- `A -> D`: D developed the attack path and PoC explanation, confirming the vulnerability was practically exploitable under stated assumptions.
- `A -> E`: E designed the fix/mitigation plan and checked that our submission package and presentation met rubric requirements.

### B 写

- `B -> A`: A narrowed the analysis to one in-scope randomness/crypto vulnerability and kept the final report aligned with the rubric.
- `B -> B`: Led the system model and threat model, defining assets, attacker capabilities, trust boundaries, and realistic attack goals.
- `B -> C`: C mapped the model to code-level evidence by locating token/session/randomness-related classes and methods.
- `B -> D`: D translated the attacker model into a concrete exploitation scenario and documented realistic attack preconditions.
- `B -> E`: E evaluated whether the proposed mitigation would block the main attack path identified in the threat model.

### C 写

- `C -> A`: A selected the final core vulnerability from the candidate findings and unified the report narrative around it.
- `C -> B`: B used the app behavior and architecture evidence to produce a clear and consistent system/threat model.
- `C -> C`: Led APK static analysis, extracted the relevant classes and methods, and prepared screenshots and evidence for the final report.
- `C -> D`: D used the code-level evidence I collected to build the exploitation steps and PoC explanation.
- `C -> E`: E mapped the mitigation to the likely code locations and ensured the proposed fix addressed the identified weak randomness usage.

### D 写

- `D -> A`: A prioritised the final issue and shaped the vulnerability claim so it stayed focused on the rubric's randomness/crypto scope.
- `D -> B`: B defined the attacker assumptions and model constraints that I used to keep the PoC realistic and defensible.
- `D -> C`: C provided the decompiled logic and method-level evidence needed to support the attack path and reproduction notes.
- `D -> D`: Led exploitation analysis, wrote the PoC or reproduction steps, and documented attack conditions, limits, and expected outcomes.
- `D -> E`: E reviewed whether the mitigation would materially reduce predictability, forgery, or session abuse in the attack scenario.

### E 写

- `E -> A`: A kept the final vulnerability statement focused, consistent, and aligned with the final report and rubric.
- `E -> B`: B explained how the attacker model and protected assets changed before and after mitigation.
- `E -> C`: C supplied the exact code evidence and likely fix locations that made the mitigation proposal concrete rather than generic.
- `E -> D`: D showed how the vulnerability could be exploited in practice and helped verify whether the proposed fix would raise attack difficulty.
- `E -> E`: Led the mitigation design, submission compliance checks, and final verification of required files, timing, and presentation constraints.

## 使用建议

如果后续继续在这个仓库里完成作业，建议补充：

- `report.pdf`
- `ai-log/`
- `pocs/README.md`
- `presentation.mp4`
- `activity-log.pdf`
- `notes/` 或 `analysis/` 目录，用于保存候选漏洞点、截图索引和草稿

也建议在组内先统一：

- 只打一个核心漏洞
- 所有叙述都围绕 randomness/crypto
- 每个人都准备至少 `40 seconds` 的讲述内容
- 每个人都能回答自己主责部分的 Q&A
