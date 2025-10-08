package Dashboard.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private LocalDate dob;
    private ArrayList<Grade> grades;
    private ArrayList<Task> tasks;
    private int ID;

    public Student() {}

    public Student(String name, String email, LocalDate dob, Grade[] grades, int ID, Task[] tasks) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.ID = ID;
        this.grades = new ArrayList<>();
        if (grades != null) Collections.addAll(this.grades, grades);
        this.tasks = new ArrayList<>();
        if (tasks != null) Collections.addAll(this.tasks, tasks);
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }

    public ArrayList<Grade> getGrades() { return grades; }
    public void setGrades(ArrayList<Grade> grades) { this.grades = grades; }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public ArrayList<Task> getTasks() { return tasks; }
    public void setTasks(ArrayList<Task> tasks) { this.tasks = tasks; }

    // Grade operations
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void updateGrade(String gradeName, int newScore) {
        for (Grade g : grades) {
            if (g.getName().equalsIgnoreCase(gradeName)) {
                g.setScore(newScore);
                break;
            }
        }
    }

    public boolean deleteGrade(String gradeName) {
        return grades.removeIf(g -> g.getName().equalsIgnoreCase(gradeName));
    }

    // Task operations
    public void addTask(Task task) {
        tasks.add(task);
    }

    public void updateTask(String taskTitle, boolean completed) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(taskTitle)) {
                t.setCompleted(completed);
                break;
            }
        }
    }

    public boolean deleteTask(String taskTitle) {
        return tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(taskTitle));
    }

    public void sortTasksByDeadline() {
        Collections.sort(tasks, Comparator.comparing(Task::getDeadline));
    }

    // Filtering tasks
    public ArrayList<Task> getCompletedTasks() {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Task> getPendingTasks() {
        return tasks.stream()
                .filter(t -> !t.isCompleted())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", ID=" + ID +
                ", grades=" + grades +
                ", tasks=" + tasks +
                '}';
    }
}
