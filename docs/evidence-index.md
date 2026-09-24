# CampusTodo 团队证据索引

这张表是我们组这次 Git 协同实验的证据汇总，把 Issue、PR、提交、Actions 和 Release 的链接都放一起，方便老师逐项核对。

维护：成员5（wtr999-jpg）。实验还没做完，功能 PR 一个都还没合，所以有些格子先空着或者写"待补"，后面每走完一步我再补进来。

## 一、仓库信息

- 仓库地址：https://github.com/zouyuanyuan27/campus-todo-team-5
- 默认分支：main
- 起始版本：v0.1.0，基线提交 68f73bd
- 基线测试结果：mvn -B test 通过，Tests run: 2, Failures: 0, Errors: 0

## 二、Issue

| Issue | 标题 | 负责人 | 对应分支 |
| --- | --- | --- | --- |
| #1 | Priority filter | 开发者 A（qy2026932） | feature/1-priority-filter |
| #2 | Complete task | 开发者 B（ember216） | feature/2-complete-task |
| #3 | CI and guide | 质量负责人 Q（LZY901-art） | feature/3-ci-workflow |

链接：

- #1 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/1
- #2 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/2
- #3 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/3

关于 #3 说明一下：任务书只要求建 3 个 Issue，所以组里商量后让我和 Q 共用 #3。Q 负责 CI 工作流和协作说明，我负责这张索引表，各提各的 PR，互不冲突。

## 三、Pull Request

| PR | 标题 | 作者 | Reviewer | CI | 当前状态 |
| --- | --- | --- | --- | --- | --- |
| #4 | feat: 完成任务功能 completeTask | 开发者 B（ember216） | 还没定 | 无记录 | 还是 draft |
| #5 | docs: add team evidence index | 成员5（wtr999-jpg） | zouyuanyuan27 | 通过 | 等评审 |
| #6 | ci: verify Java project on pull requests | 质量负责人 Q（LZY901-art） | 开发者 B（ember216） | 通过 | 已 Approve，可以合并 |
| 待建 | feat: priority filter | 开发者 A（qy2026932） | 还没定 | 待补 | 分支已推送，PR 还没建 |

链接：

- #4 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/4
- #5 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/5
- #6 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/6

合并顺序按任务书要求固定是 #3 → #1 → #2。我这张索引表的 PR 建议放在这三个合并完之后再合，不然会打乱后面冲突练习的顺序。

## 四、关键提交

- 68f73bd 基线 v0.1.0（Java 17 + Maven + JUnit5，2 个基线测试）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/68f73bd
- 71fa14d ci: verify Java project on pull requests（Q，PR #6 第一个提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/71fa14d
- c5c4546 ci: add workflow dispatch and review-resolution checklist（Q，按评审意见改的）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/c5c4546
- 30ccfad docs: add team evidence index（成员5，就是本文件）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/30ccfad
- cd10e3e 开发者 A 分支上的优先级筛选提交
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/cd10e3e
- 82cfa5e 开发者 B 分支上的完成任务提交
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/82cfa5e
- 待补 fix: resolve README capability conflict（B 解决 README 冲突那个提交）

## 五、Actions 运行记录

| 分支 | 触发方式 | 结果 |
| --- | --- | --- |
| feature/3-ci-workflow | PR #6 | 通过（跑了两次，第二次是改完评审意见后重跑） |
| feature/3-evidence-index | PR #5 | 通过 |
| feature/2-complete-task | PR #4 | 暂无记录（B 的还是 draft） |
| main | push | 暂无（还没合并过东西） |

运行记录页面：https://github.com/zouyuanyuan27/campus-todo-team-5/actions

## 六、Release

- v0.1.0 起始版本 https://github.com/zouyuanyuan27/campus-todo-team-5/releases/tag/v0.1.0
- v1.0.0 待发布，发布后补链接

## 七、PR 截图清单

任务 6 要求每个 PR 的 Conversation、Files changed、Checks 各留一张截图，我这边的记录：

- #6 CI 工作流：三张已存（Conversation / Files changed / Checks）
- #5 证据索引表：三张已存
- #4 完成任务：待截（B 还没转 Ready for review）
- #1 优先级筛选：待截（A 的 PR 还没建）

截图都要求能看到仓库名和 PR 编号，不能出现访问令牌或者密码。

## 八、人员对照

- M 仓库管理员：zouyuanyuan27，负责建仓库、建 Issue、发布版本、按顺序合并 PR
- 开发者 A：qy2026932，任务书任务 3，Issue #1
- 开发者 B：ember216，任务书任务 4，Issue #2
- 质量负责人 Q：LZY901-art，任务书任务 5，Issue #3
- 成员5（我）：wtr999-jpg，负责任务 6 的 PR 规范性核查与截图归档、任务 8 的冲突结果校验，以及这张索引表
