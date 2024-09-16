import java.util.ArrayList;
import java.util.List;

public class lab3 {
    public static List<String> getStudents() {
        List<String> students = new ArrayList<>();
        students.add("Mohammed");
        students.add("Omar");
        students.add("Ali");
        students.add("Hassan");
        return students;
    }
    public static void main(String[] args) {
        List<String> students = getStudents();
        
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}