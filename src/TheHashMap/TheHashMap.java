package TheHashMap;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

public class TheHashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add key-value pairs to the map
        studentGrades.put("John", 85);
        studentGrades.put("Alice", 92);
        studentGrades.put("Bob", 76);

        // Retrieve and print the value for a specific key
        int aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Update the value for an existing key
        studentGrades.put("Bob", 80);

        // Check if a key exists in the map
        boolean isBobPresent = studentGrades.containsKey("Bob");
        System.out.println("Is Bob present in the map? " + isBobPresent);

        // Remove a key-value pair from the map
        studentGrades.remove("John");

        // Iterate over the map and print all key-value pairs
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            int grade = entry.getValue();
            System.out.println(student + ": " + grade);
        }

        // Get the size of the map
        int mapSize = studentGrades.size();
        System.out.println("Map size: " + mapSize);

        // Clear all elements from the map
        studentGrades.clear();

        // Check if the map is empty
        boolean isEmpty = studentGrades.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        System.out.println(studentGrades);
    }
}
