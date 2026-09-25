package edu.hbuas.campustodo.model;

import java.util.Objects;

/**
 * 校园待办任务。
 */
public class Task {
    public enum Priority {
        HIGH, MEDIUM, LOW
    }

    private final long id;
    private final String title;
    private boolean completed;
    private final Priority priority;

    public Task(long id, String title) {
        this(id, title, Priority.MEDIUM);
    }

    public Task(long id, String title, Priority priority) {
        if (id <= 0) {
            throw new IllegalArgumentException("任务编号必须为正数");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("任务标题不能为空");
        }
        this.id = id;
        this.title = title.trim();
        this.completed = false;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        if (completed) {
            throw new IllegalStateException("任务已完成,不能重复完成");
        }
        completed = true;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && completed == task.completed && Objects.equals(title, task.title) && priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, completed, priority);
    }
}
