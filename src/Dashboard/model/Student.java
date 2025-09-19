package Dashboard.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private String email;
    private LocalDate dob;
    private int grade;
    private int ID;
    private String task;
    public Student(){};

    public Student(String name, String email, LocalDate dob, int grades, int ID, String task) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
        this.ID = ID;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        if(email)
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}



