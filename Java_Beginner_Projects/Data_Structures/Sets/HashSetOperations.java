package Data_Structures.Sets;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create the first set
        HashSet<String> set1 = new HashSet<>();
        set1.add("John");
        set1.add("Mike");
        set1.add("Clement");
        set1.add("20.5");
        set1.add("Isaac");

        // Create the second set
        HashSet<String> set2 = new HashSet<>();
        set2.add("John");
        set2.add("Alice");
        set2.add("Mary");
        set2.add("Clement");
        set2.add("Ama");

        // (a) Remove "20.5" from the first set
        set1.remove("20.5");
        System.out.println("First set after removal: " + set1);

        // (b) Print the union of the two sets
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("\nUnion of sets: " + union);

        // (c) Print the intersection of the two sets
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("\nIntersection of sets: " + intersection);

        // (d) Print the subtraction (set1 - set2)
        HashSet<String> subtraction = new HashSet<>(set1);
        subtraction.removeAll(set2);
        System.out.println("\nSubtraction (set1 - set2): " + subtraction);
    }
}

