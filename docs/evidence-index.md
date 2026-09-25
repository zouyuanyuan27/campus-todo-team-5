# CampusTodo 团队证据索引

这张表是我们组这次 Git 协同实验的证据汇总，把 Issue、PR、提交、Actions 和 Release 的链接都放一起，方便老师逐项核对。

维护：成员5（wtr999-jpg）。三个功能 PR 已经全部按任务书顺序合并，索引表的链接已经补齐到最终状态。

## 一、仓库信息

- 仓库地址：https://github.com/zouyuanyuan27/campus-todo-team-5
- 默认分支：main
- 起始版本：v0.1.0，基线提交 68f73bd
- 基线测试结果：mvn -B test 通过，Tests run: 2, Failures: 0, Errors: 0
- main 当前最新提交：c01513d（PR #4 合并后）

## 二、Issue

| Issue | 标题 | 负责人 | 对应分支 | 状态 |
| --- | --- | --- | --- | --- |
| #1 | Priority filter | 开发者 A（qy2026932） | feature/1-priority-filter | 已关闭（PR #8 合并后自动关闭） |
| #2 | Complete task | 开发者 B（ember216） | feature/2-complete-task | 已关闭（PR #4 合并后自动关闭） |
| #3 | CI and guide | 质量负责人 Q（LZY901-art） | feature/3-ci-workflow | 已关闭（PR #6 合并后自动关闭） |

链接：

- #1 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/1
- #2 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/2
- #3 https://github.com/zouyuanyuan27/campus-todo-team-5/issues/3

关于 #3 说明一下：任务书只要求建 3 个 Issue，所以组里商量后让我和 Q 共用 #3。Q 负责 CI 工作流和协作说明，我负责这张索引表，各提各的 PR，互不冲突。

## 三、Pull Request

| PR | 标题 | 作者 | Reviewer | CI | 合并方式 | 结果 |
| --- | --- | --- | --- | --- | --- | --- |
| #6 | ci: verify Java project on pull requests | 质量负责人 Q（LZY901-art） | 开发者 B（ember216） | 通过 | Squash and merge | 已合并（f982748） |
| #8 | feat: 实现任务优先级筛选功能 | 开发者 A（qy2026932） | zouyuanyuan27 已 Approve | 通过 | Squash and merge | 已合并（45e5163） |
| #4 | feat: 按 Issue #2 完成任务功能 completeTask | 开发者 B（ember216） | 开发者 A（qy2026932）已 Approve | 通过 | Merge commit | 已合并（c01513d） |
| #5 | docs: add team evidence index（Refs #3） | 成员5（wtr999-jpg） | zouyuanyuan27 | 通过 | 待定 | 等评审 |
| #7 | feat: 实现任务优先级筛选功能 | 开发者 A（qy2026932） | — | 通过 | — | 已关闭未合并 |

链接：

- #4 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/4
- #5 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/5
- #6 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/6
- #7 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/7
- #8 https://github.com/zouyuanyuan27/campus-todo-team-5/pull/8

关于 #7 和 #8 说明一下：A 最早的分支名 feature/priority-new 不符合命名规范，评审时被指出，但这个分支名在 GitHub 上没法直接改，所以 A 关掉 #7、用合规分支名 feature/1-priority-filter 重建了 #8，评审意见在 #8 上完成并合并。原来在 #7 提的整改意见（PR 描述补 Closes #1、补测试证据）在 #8 里全部落实了。

合并顺序按任务书要求是 #3 → #1 → #2，实际对应 PR #6 → #8 → #4，已经按这个顺序完成。我这张索引表的 PR（#5）按要求放在这三个之后合并，避免打乱冲突练习的顺序。

## 四、关键提交

已进入 main 的提交：

- 68f73bd 基线 v0.1.0（Java 17 + Maven + JUnit5，2 个基线测试）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/68f73bd
- f982748 ci: verify Java project on pull requests（Q，PR #6 的 squash 合并提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/f982748
- 82cfa5e test: 为 Issue #2 completeTask 添加红测试（B，先红后绿第一步）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/82cfa5e
- ea45422 feat: complete a task by id（B，实现完成任务）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/ea45422
- 21c7e29 test: add blank title boundary case（B，补边界用例）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/21c7e29
- 45e5163 feat: 实现任务优先级筛选功能（A，PR #8 的 squash 合并提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/45e5163
- a1979c9 fix: resolve README capability conflict and taskList rename（B，任务 8 的冲突修复提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/a1979c9
- c01513d Merge pull request #4 from zouyuanyuan27/feature/2-complete-task（B，PR #4 合并提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/c01513d
- 30ccfad docs: add team evidence index（成员5，本文件首次提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/30ccfad
- b50ef01 docs: rewrite evidence index in plain wording（成员5，按评审意见改口语化）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/b50ef01

分支上的开发提交（squash 合并后不单独出现在 main 历史里，但链接可查）：

- 71fa14d ci: verify Java project on pull requests（Q，PR #6）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/71fa14d
- c5c4546 ci: add workflow dispatch and review-resolution checklist（Q，按评审意见改的）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/c5c4546
- cd10e3e feat: add priority filter and Priority enum（A，PR #8 分支上的提交）
  https://github.com/zouyuanyuan27/campus-todo-team-5/commit/cd10e3e

## 五、Actions 运行记录

| 运行 | 分支 | 触发方式 | 结果 |
| --- | --- | --- | --- |
| run#1 | feature/3-evidence-index | PR #5 | 通过 |
| run#2、run#3 | feature/3-ci-workflow | PR #6（第二次是改完评审意见后重跑） | 通过 |
| run#4 | main | push（#6 合并后） | 通过 |
| run#5 | feature/2-complete-task | PR #4 | 失败（红测试阶段，先红） |
| run#6 | feature/2-complete-task | PR #4 | 通过（补实现后转绿） |
| run#7 | feature/3-evidence-index | PR #5 | 通过 |
| run#8、run#9、run#10 | feature/priority-new | PR #7 | 通过 |
| run#11 | feature/1-priority-filter | PR #8 | 通过 |
| run#12 | main | push（#8 合并后） | 通过 |
| run#13 | feature/2-complete-task | PR #4（解决 README 冲突后重跑） | 通过 |
| run#14 | main | push（#4 合并后） | 通过 |

合计 14 次运行，除 run#5 是先红后绿里的"红"，其余全部 success。

运行记录页面：https://github.com/zouyuanyuan27/campus-todo-team-5/actions

## 六、Release

- v0.1.0 起始版本（2026-09-25 发布）https://github.com/zouyuanyuan27/campus-todo-team-5/releases/tag/v0.1.0
- v1.0.0 待发布，发布后补链接

## 七、PR 截图清单

任务 6 要求每个 PR 的 Conversation、Files changed、Checks 各留一张截图，我这边的记录：

- #6 CI 工作流：三张已存（Conversation / Files changed / Checks）
- #5 证据索引表：三张已存
- #8 优先级筛选（#1）：三张已存
- #4 完成任务（#2）：三张已存

#7 已关闭未合并，只保留其 Conversation 截图作为"评审意见→整改→重建 PR"的过程证据。

截图都要求能看到仓库名和 PR 编号，不能出现访问令牌或者密码。

## 八、任务 8 冲突校验记录（成员5）

PR #4 合并前与 main 产生冲突，由 B 解决，我负责校验，结论如下：

- 冲突文件：README.md（第 5 行"当前版本"固定实验锚点），Task.java / TaskService.java / TaskServiceTest.java 自动合并无冲突。
- 冲突内容：main 侧（#8 带入）为"支持新增、列出和按优先级筛选任务"，B 侧为"支持新增、列出和完成任务"，两侧功能描述必须都保留。
- 解决结果：a1979c9 合并为"当前版本：支持新增、列出、按优先级筛选和完成任务。"，两侧文字均保留，无残留冲突标记。
- 本地校验：拉取该分支执行 mvn -B test，Tests run: 8, Failures: 0, Errors: 0, BUILD SUCCESS。
- CI 校验：a1979c9 对应的 run#13 结果为 success。
- 校验结论：冲突解决正确，可以合并；PR #4 已于 2026-09-25 14:21（北京时间）合并为 c01513d。

## 九、人员对照

- M 仓库管理员：zouyuanyuan27，负责建仓库、建 Issue、发布版本、按顺序合并 PR
- 开发者 A：qy2026932，任务书任务 3，Issue #1
- 开发者 B：ember216，任务书任务 4，Issue #2
- 质量负责人 Q：LZY901-art，任务书任务 5，Issue #3
- 成员5（我）：wtr999-jpg，负责任务 6 的 PR 规范性核查与截图归档、任务 8 的冲突结果校验，以及这张索引表
