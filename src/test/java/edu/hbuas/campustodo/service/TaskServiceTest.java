package edu.hbuas.campustodo.service;

import edu.hbuas.campustodo.model.Task;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void shouldAddTask() {
        TaskService service = new TaskService();
        Task task = service.addTask("写软件工程作业");
        assertEquals(1, task.getId());
        assertEquals("写软件工程作业", task.getTitle());
        assertFalse(task.isCompleted());
        assertEquals(Task.Priority.MEDIUM, task.getPriority());
    }

    @Test
    void shouldRejectBlankTitle() {
        TaskService service = new TaskService();
        assertThrows(IllegalArgumentException.class,
                () -> service.addTask("   "));
    }

    @Test
    void filterByPriority_shouldReturnMatchedTasks() {
        TaskService service = new TaskService();
        service.addTask("高优先级任务", Task.Priority.HIGH);
        service.addTask("普通任务", Task.Priority.MEDIUM);
        service.addTask("低优先级任务", Task.Priority.LOW);
        service.addTask("另一个高优先级", Task.Priority.HIGH);

        List<Task> highList = service.filterByPriority(Task.Priority.HIGH);
        assertEquals(2, highList.size());

        List<Task> lowList = service.filterByPriority(Task.Priority.LOW);
        assertEquals(1, lowList.size());

        List<Task> mediumList = service.filterByPriority(Task.Priority.MEDIUM);
        assertEquals(1, mediumList.size());
    }

    @Test
    void filterByPriority_noMatch_returnEmpty() {
        TaskService service = new TaskService();
        service.addTask("普通任务", Task.Priority.MEDIUM);
        List<Task> highList = service.filterByPriority(Task.Priority.HIGH);
        assertTrue(highList.isEmpty());
    }
}
