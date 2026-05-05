# Part B 五人分工表

## 目标

以 Part B 高分/满分为目标，团队只提交一个最高影响、合法 scope 内、证据充分、最好具备 zero-day candidate 支撑的 finding。

核心原则：

- 每个人任务尽量低耦合
- 每个人都能并行开始工作
- 所有候选 finding 最终统一评分
- 最终 presentation 只围绕一个最强 finding 展开

---

## 成员 1：GitHub/npm 目标负责人

负责 GitHub Bug Bounty / npm 方向。

### 主要任务

- 阅读 GitHub/npm bug bounty scope
- 确认 in-scope assets 和 out-of-scope 行为
- 设计安全测试环境
- 使用自有测试账号进行低风险验证
- 寻找 GitHub/npm 权限边界相关问题

### 重点测试方向

- Repository 权限边界
- Organization invite / role 权限
- Private repository 可见性
- GitHub App / OAuth 权限
- Actions / workflow 权限边界
- npm package ownership / private package 访问控制

### 交付物

- `scope.md`
- `test-plan.md`
- `candidate-findings.md`
- 复现步骤、截图、日志等证据

---

## 成员 2：OpenAI / AI Safety 目标负责人

负责 OpenAI Security Bug Bounty / Safety Bug Bounty 方向。

### 主要任务

- 阅读 OpenAI bug bounty 规则
- 区分 Security Bug Bounty 与 Safety Bug Bounty 的 scope
- 确认哪些 AI safety / abuse 类问题可提交
- 避免普通 jailbreak、无实质影响的 policy bypass
- 寻找具备真实影响的 AI agent / platform integrity 问题

### 重点测试方向

- Agentic prompt injection
- Data exfiltration
- Cross-session / cross-user data exposure
- Platform integrity bypass
- Account boundary / feature access boundary
- MCP / third-party tool interaction 风险

### 交付物

- `scope.md`
- `test-plan.md`
- `candidate-findings.md`
- 复现步骤、截图、日志等证据

---

## 成员 3：第三方平台目标负责人

负责从 HackerOne、Bugcrowd、Intigriti、YesWeHack 等平台中挑选 2-3 个中小型项目。

### 主要任务

- 搜索合法 bug bounty programs
- 筛选适合课程项目的目标
- 阅读每个目标的 scope、severity、out-of-scope、测试限制
- 推荐 1 个最适合深挖的项目
- 进行低风险测试并记录可疑 finding

### 重点测试方向

- IDOR / Broken Access Control
- OAuth / SSO 权限边界
- Webhook / integration 权限
- File upload / preview / rendering
- Tenant isolation
- Invite / team / role 权限问题

### 交付物

- `targets-shortlist.md`
- `scope.md`
- `test-plan.md`
- `candidate-findings.md`
- 复现步骤、截图、日志等证据

---

## 成员 4：Novelty + Severity 负责人

负责所有候选 finding 的严重性评分、公开披露排查和最终优先级排序。

### 主要任务

- 对每个候选 finding 做 severity mapping
- 必要时使用 CVSS v3.1 fallback 评分
- 判断 finding 属于 Type 1、Type 2 或 duplicate
- 搜索是否已有公开披露
- 帮助团队选择最终提交的最高影响 finding

### 公开披露排查来源

- Google Search
- CVE / NVD
- GitHub Security Advisories
- GitHub Issues / Discussions
- HackerOne disclosed reports
- Bugcrowd / Intigriti disclosed reports
- Vendor changelog / release notes
- Official documentation / known limitations

### 交付物

- `severity-mapping.md`
- `novelty-check.md`
- `finding-ranking.md`
- Type 1 / Type 2 / duplicate 分类建议
- 最终推荐 finding

---

## 成员 5：Evidence + Presentation 负责人

负责统一证据格式、最终 presentation、Q&A、AI log 和 activity log。

### 主要任务

- 设计统一证据模板
- 规范截图、日志、录屏命名方式
- 收集团队成员贡献记录
- 整理 AI 使用记录
- 制作最终 5 分钟 presentation
- 准备 mock Q&A

### 重点工作

- Proof artifact 整理
- Presentation script
- Slide structure
- Timing control
- Q&A preparation
- Ethics / scope / safe testing explanation

### 交付物

- `evidence-template.md`
- `presentation-outline.md`
- `presentation-script.md`
- `mock-qna.md`
- `ai-log/`
- `activity-log.pdf`

---

## 第一轮并行工作要求

每位成员第一轮独立工作 1-2 天，至少提交以下内容：

- `scope.md`：目标是否在合法 scope 内，允许和禁止什么
- `test-plan.md`：准备测试哪些功能和权限边界
- `candidate-findings.md`：目前发现或怀疑的问题

---

## 第一轮同步会议目标

第一轮结束后，全组开一次 30 分钟同步会，只做一件事：

选择 1-2 个最有希望的 finding 继续深入验证。

筛选标准：

- 是否合法 in scope
- 是否可复现
- 是否影响真实资产或权限边界
- 是否可能达到 S3/S4
- 是否具备 zero-day candidate 可能
- 是否能在 5 分钟内讲清楚

---

## 最终 Presentation 分工建议

最终 presentation 只围绕一个最强 finding 展开。

| 成员 | 内容 | 时间 |
|---|---|---|
| 成员 1 | Target + scope proof | 40-50 秒 |
| 成员 2 | Root cause | 40-50 秒 |
| 成员 3 | Reproduction | 50-60 秒 |
| 成员 4 | Impact + severity + novelty | 70-80 秒 |
| 成员 5 | Mitigation + ethics + wrap-up | 40-50 秒 |

要求：

- 每位成员至少发言 40 秒
- 总时长不超过 5 分钟
- 避免讲多个 finding
- 所有结论必须有证据支撑
