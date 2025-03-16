package Data_Structures.Maps;

import java.util.HashMap;

public class StudentMarksMap {
    public static void main(String[] args) {
        // Create a HashMap to store student index numbers and marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Insert student index numbers and marks into the HashMap
        studentMarks.put("42200213", 89);
        studentMarks.put("42225413", 65);
        studentMarks.put("42234513", 89);
        studentMarks.put("42233413", 78);

        // Print out the content of the HashMap
        System.out.println("Student Marks:");
        for (String index : studentMarks.keySet()) {
            System.out.println("Index: " + index + ", Mark: " + studentMarks.get(index));
        }
    }
}
