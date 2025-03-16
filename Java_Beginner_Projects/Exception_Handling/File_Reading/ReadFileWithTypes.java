package Exception_Handling.File_Reading;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileWithTypes {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    String type = getDataType(token);
                    System.out.println(type + ": " + token);
                }
                System.out.println(); // Separator between lines
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getDataType(String token) {
        // Check for boolean
        if (token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false")) {
            return "boolean";
        }
        // Check for double/integer
        try {
            Double.parseDouble(token);
            return "double";
        } catch (NumberFormatException e) {
            // Not a number
        }
        return "String";
    }
}
