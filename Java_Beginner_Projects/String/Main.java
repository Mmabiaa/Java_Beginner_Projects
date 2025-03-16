package String;

public class Main {
    public static void main(String[] args) {
        // 1. Printing Statements
        System.out.println("John said 'Java is fun and easy'");
        System.out.println("John said \"Java is fun and easy\"");

        // 2. Converting Numeric Types to Characters
        char char1 = (char) 99; // 'c'
        char char2 = (char) 225; // 'á'

        System.out.println("\nCharacter for 99: " + char1);
        System.out.println("Character for 225: " + char2);

        // 3. Converting Characters to Integers
        char ch1 = 'A';
        char ch2 = '!';
        char ch3 = '*';
        char ch4 = 'i';

        int int1 = (int) ch1; // ASCII value of 'A'
        int int2 = (int) ch2; // ASCII value of '!'
        int int3 = (int) ch3; // ASCII value of '*'
        int int4 = (int) ch4; // ASCII value of 'i'

        System.out.println("\nASCII value of 'A': " + int1);
        System.out.println("ASCII value of '!': " + int2);
        System.out.println("ASCII value of '*': " + int3);
        System.out.println("ASCII value of 'i': " + int4);

        // Optional: Get numeric value of a character
        char ch = '5';
        int numericValue = Character.getNumericValue(ch); // 5

        System.out.println("\nNumeric value of '5': " + numericValue);
    }
}
