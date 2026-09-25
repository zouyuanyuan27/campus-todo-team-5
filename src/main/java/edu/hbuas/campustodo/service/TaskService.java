package edu.hbuas.campustodo.service;

import edu.hbuas.campustodo.model.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService {
    private final List<Task> taskList = new ArrayList<>();
    private long nextId = 1;

    public Task addTask(String title) {
        Task task = new Task(nextId, title);
        taskList.add(task);
        nextId++;
        return task;
    }

    public Task addTask(String title, Task.Priority priority) {
        Task task = new Task(nextId, title, priority);
        taskList.add(task);
        nextId++;
        return task;
    }

    public List<Task> listAll() {
        return new ArrayList<>(taskList);
    }

    public List<Task> filterByPriority(Task.Priority priority) {
        return taskList.stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public Task completeTask(long id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.complete();
                return task;
            }
        }
        throw new IllegalArgumentException("任务不存在: " + id);
    }
}
