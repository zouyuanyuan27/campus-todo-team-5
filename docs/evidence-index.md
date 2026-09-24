# 团队证据索引表（CampusTodo 协同实验）

> 本文件对应《实验任务书》第六节验收标准“团队交付物清单 → 团队证据索引表：Issue/PR/Commit/Actions/Release 的链接”。
> 维护人：成员5（wtr999-jpg，S 测试-证据专员）
> 使用方式：链接随实验进度逐步补齐；每次补齐后新建一个小提交，提交信息格式 `docs: update evidence index (<内容>)`。

## 仓库与基线

| 项目 | 内容 |
| --- | --- |
| 仓库地址 | https://github.com/zouyuanyuan27/campus-todo-team-5 |
| 仓库类型 | Public |
| 默认分支 | `main` |
| 起始版本 | v0.1.0（基线提交 `68f73bd`） |
| 基线测试 | `mvn -B test` → `Tests run: 2, Failures: 0, Errors: 0, Skipped: 0` |

## 1. Issue 索引

| Issue | 标题 | 负责人 | 对应分支 | 状态 | 链接 |
| --- | --- | --- | --- | --- | --- |
| #1 | Priority filter | 开发者 A（qy2026932） | `feature/1-priority-filter` | 待填 | https://github.com/zouyuanyuan27/campus-todo-team-5/issues/1 |
| #2 | Complete task | 开发者 B（ember216） | `feature/2-complete-task` | 待填 | https://github.com/zouyuanyuan27/campus-todo-team-5/issues/2 |
| #3 | CI and guide（成员5 的 docs PR 共用本 Issue） | 质量负责人 Q（LZY901-art）/ 成员5 | `feature/3-ci-guide` / `feature/3-evidence-index` | 待填 | https://github.com/zouyuanyuan27/campus-todo-team-5/issues/3 |

## 2. Pull Request 索引

| PR | 标题 | 作者 | Reviewer | CI 结果 | 合并方式 | 合并提交 | 链接 |
| --- | --- | --- | --- | --- | --- | --- | --- |
| #4 | feat: 按 Issue #2 完成任务功能 completeTask | 开发者 B（ember216） | 待填 | 待填 | 待定 | 待填 | https://github.com/zouyuanyuan27/campus-todo-team-5/pull/4 |
| #? | ci: verify Java project on pull requests | 质量负责人 Q | 待填 | 待填 | Squash and merge | 待填 | 待填 |
| #? | feat: priority filter | 开发者 A | 待填 | 待填 | Squash and merge | 待填 | 待填 |
| #? | docs: add team evidence index（Refs #3） | 成员5（wtr999-jpg） | 待填 | 待填 | Squash and merge | 待填 | 待填 |

> 合并顺序约束（任务书要求）：`#3 → #1 → #2`。成员5 的 docs PR 建议在这三个 PR 全部合并之后再合并，避免干扰预定的冲突练习顺序。

## 3. 关键提交（Commit）索引

| 提交 | 说明 | 作者 | 链接 |
| --- | --- | --- | --- |
| `68f73bd` | v0.1.0: CampusTodo baseline (Java 17 + Maven + JUnit5, 2 baseline tests) | zouyuanyuan27 | https://github.com/zouyuanyuan27/campus-todo-team-5/commit/68f73bd |
| 待填 | feat: add priority filter and Priority enum | 开发者 A | 待填 |
| 待填 | test: specify duplicate completion rule | 开发者 B | 待填 |
| 待填 | fix: resolve README capability conflict | 开发者 B | 待填 |
| 待填 | ci: verify Java project on pull requests | 质量负责人 Q | 待填 |
| 待填 | docs: add team evidence index | 成员5 | 待填 |

## 4. GitHub Actions（CI）运行记录

| 触发来源 | 工作流 | 运行编号 | 结果 | 链接 |
| --- | --- | --- | --- | --- |
| PR #?（#3） | maven.yml | 待填 | 待填 | 待填 |
| PR #?（#1） | maven.yml | 待填 | 待填 | 待填 |
| PR #4（#2，冲突修复后重跑） | maven.yml | 待填 | 待填 | 待填 |
| main 分支 push | maven.yml | 待填 | 待填 | 待填 |

## 5. Release 索引

| 版本 | 说明 | 链接 |
| --- | --- | --- |
| v0.1.0 | 起始基线版本 | https://github.com/zouyuanyuan27/campus-todo-team-5/releases/tag/v0.1.0 |
| v1.0.0 | 迭代完成版本（待发布） | 待填 |

## 6. PR 截图证据清单（任务 6 要求：每个 PR 各 3 张）

| PR | Conversation 页 | Files changed 页 | Checks 结果 |
| --- | --- | --- | --- |
| #3 CI and guide | 待截 | 待截 | 待截 |
| #1 Priority filter | 待截 | 待截 | 待截 |
| #2 Complete task | 待截 | 待截 | 待截 |
| #? docs（成员5，共用 Issue #3） | 待截 | 待截 | 待截 |

截图要求：须显示仓库名、PR 编号与结果；不得出现访问令牌、密码等凭据。

## 7. 团队分工与实际账号对照

| 角色 | 账号 | 对应 Issue |
| --- | --- | --- |
| M 仓库管理员 | zouyuanyuan27 | 建仓库、创建 Issue、发布 v0.1.0 / v1.0.0 |
| 开发者 A | qy2026932 | #1 Priority filter |
| 开发者 B | ember216 | #2 Complete task |
| 质量负责人 Q | LZY901-art | #3 CI and guide |
| 成员5 S 测试-证据专员 | wtr999-jpg | 任务 6 证据收集与规范性核查、任务 8 冲突结果校验、本索引表 |
