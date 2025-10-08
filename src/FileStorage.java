import java.io.*;
import java.util.ArrayList;
import Dashboard.model.Student;

public class FileStorage {

    // save method — writes the ArrayList of Student objects to a file
    public static void saveStudents(ArrayList<Student> students, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(students);
            System.out.println("✅ Students saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("⚠️ Error saving students: " + e.getMessage());
        }
    }

    // load method — reads the ArrayList of Student objects from a file
    @SuppressWarnings("unchecked")
    public static ArrayList<Student> loadStudents(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("⚠️ Error loading students: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}