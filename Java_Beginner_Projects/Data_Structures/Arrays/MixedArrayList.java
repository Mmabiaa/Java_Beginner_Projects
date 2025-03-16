package Data_Structures.Arrays;

import java.util.ArrayList;

public class MixedArrayList {
    public static void main(String[] args) {
        ArrayList<Object> mixedList = new ArrayList<>();
        mixedList.add("John");
        mixedList.add("Mike");
        mixedList.add("Ama");
        mixedList.add(20.34);
        mixedList.add("Daniel");

        System.out.println("Initial size of the list: " + mixedList.size());
        System.out.println("Initial content of the list: " + mixedList);

        // Remove 20.34 from the list
        mixedList.remove(20.34);

        System.out.println("Size of the list after removal: " + mixedList.size());
        System.out.println("Content of the list after removal: " + mixedList);
    }
}

