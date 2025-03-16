package Exception_Handling.File_Reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadIntegersToFile {
    public static void main(String[] args) {
        String filename = "integers.txt";
        int[] integers = readIntegersFromFile(filename);
        if (integers != null) {
            for (int integer : integers) {
                System.out.println(integer);
            }
        }
    }

    private static int[] readIntegersFromFile(String filename) {
        ArrayList<Integer> integerList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                integerList.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }

        // Convert the list to an array
        int[] integers = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            integers[i] = integerList.get(i);
        }
        return integers;
    }
}
