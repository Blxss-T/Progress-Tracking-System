package Dashboard;

import Dashboard.model.*;
import Dashboard.storage.FileStorage;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create sample Task and Grade
        Task task1 = new Task("Finish Math homework", LocalDate.now().plusDays(2), false);
        Grade grade1 = new Grade("Math", "Algebra test", 85);

        // Create Student with Task + Grade
        Student student = new Student(1, "Bless Teta",
                Arrays.asList(grade1),
                Arrays.asList(task1));

        // Save to JSON
        FileStorage.saveStudents(List.of(student));
        System.out.println("✅ Student data saved!");

        // Load from JSON
        List<Student> loaded = FileStorage.loadStudents();
        loaded.forEach(s -> {
            System.out.println("📌 Student: " + s.getName());
            System.out.println("   Grades: " + s.getGrades().size());
            System.out.println("   Tasks: " + s.getTasks().size());
        });
    }
}
