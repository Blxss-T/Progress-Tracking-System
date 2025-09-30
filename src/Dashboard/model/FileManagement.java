//package Dashboard.model;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.ArrayList;
//
//public class DataManager {
//    private static final Gson gson = new GsonBuilder()
//            .setPrettyPrinting()
//            .create();
//
//    private static final String STUDENT_FILE = "students.json";
//    private static final String GRADE_FILE = "grades.json";
//    private static final String TASK_FILE = "tasks.json";
//
//    // Save
//    public static void saveStudents(ArrayList<Student> students) throws Exception {
//        try (FileWriter writer = new FileWriter(STUDENT_FILE)) {
//            gson.toJson(students, writer);
//        }
//    }
//
//    public static void saveGrades(ArrayList<Grade> grades) throws Exception {
//        try (FileWriter writer = new FileWriter(GRADE_FILE)) {
//            gson.toJson(grades, writer);
//        }
//    }
//
//    public static void saveTasks(ArrayList<Task> tasks) throws Exception {
//        try (FileWriter writer = new FileWriter(TASK_FILE)) {
//            gson.toJson(tasks, writer);
//        }
//    }
//
//    // Load
//    public static ArrayList<Student> loadStudents() throws Exception {
//        try (FileReader reader = new FileReader(STUDENT_FILE)) {
//            return gson.fromJson(reader, new TypeToken<ArrayList<Student>>(){}.getType());
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
//
//    public static ArrayList<Grade> loadGrades() throws Exception {
//        try (FileReader reader = new FileReader(GRADE_FILE)) {
//            return gson.fromJson(reader, new TypeToken<ArrayList<Grade>>(){}.getType());
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
//
//    public static ArrayList<Task> loadTasks() throws Exception {
//        try (FileReader reader = new FileReader(TASK_FILE)) {
//            return gson.fromJson(reader, new TypeToken<ArrayList<Task>>(){}.getType());
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
//}
