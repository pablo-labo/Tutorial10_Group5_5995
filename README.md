# Android Assignment Case 1


### 项目概览
这个仓库当前是一个 Android 作业案例交付目录，而不是完整源码仓库。目录中包含：

- `a1_case1.apk`：可安装的 Android 应用程序包
- `assignment1-spec-1.pdf`：作业说明文档
- `assignment1-rubric-1.pdf`：评分标准文档

基于 APK 中可见的字符串信息，这个案例与 Android 登录流程有关，至少包含 `Login`、`Main`、`Profile` 三个页面，并且测试重点很可能是“不安全的登录会话机制”，其中明确出现了 `java.util.Random` 相关描述。

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
