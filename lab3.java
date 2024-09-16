import java.util.ArrayList;
import java.util.Collections;
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
        int groupSize = 2; // Change this to set the size of each group
        List<List<String>> groups = createRandomGroups(students, groupSize);
        
        System.out.println("Random Groups of Students:");
        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
    public static List<List<String>> createRandomGroups(List<String> students, int groupSize) {
        Collections.shuffle(students);
        List<List<String>> groups = new ArrayList<>();
        for (int i = 0; i < students.size(); i += groupSize) {
            groups.add(new ArrayList<>(students.subList(i, Math.min(i + groupSize, students.size()))));
        }
        return groups;
    }
}