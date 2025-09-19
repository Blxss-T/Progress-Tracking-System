package Dashboard.model;

import java.time.LocalDate;

public class Task {
    String description;
    LocalDate deadline;
    boolean completed;

    public Task() {};

    public Task(String description, LocalDate deadline, boolean completed) {
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
    }

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public Task(String description, LocalDate deadline) {
        this.description = description;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
