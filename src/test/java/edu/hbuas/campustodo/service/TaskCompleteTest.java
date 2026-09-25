package edu.hbuas.campustodo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Issue #2:任务完成规则的规格说明。
 * 本测试先于实现提交(红),用于触发 Draft PR 的 CI 失败记录。
 */
class TaskCompleteTest {

    @Test
    void shouldCompleteTaskById() {
        TaskService service = new TaskService();
        var task = service.addTask("完成需求评审");

        service.completeTask(task.getId());

        assertTrue(task.isCompleted());
    }

    @Test
    void shouldThrowWhenIdNotFound() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class,
                () -> service.completeTask(999L), "不存在的任务编号应报错");
    }

    @Test
    void shouldRejectDuplicateCompletion() {
        TaskService service = new TaskService();
        var task = service.addTask("完成需求评审");
        service.completeTask(task.getId());

        assertThrows(IllegalStateException.class,
                () -> service.completeTask(task.getId()), "重复完成应报错");
    }

    @Test
    void shouldRejectBlankTitle() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class,
                () -> service.addTask("   "), "空标题任务应报错");
    }
}