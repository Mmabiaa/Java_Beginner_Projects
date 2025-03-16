package Selections_And_Loops;

public class SumOfIntegers {
    public static void main(String[] args) {
        int sum = 0; // Initialize sum
        int i = 1; // Counter for integers
        do {
            sum += i; // Add current integer to sum
            System.out.println("Added " + i + " to sum. Current sum: " + sum);
            i++;
        } while (i <= 8);
        System.out.println("Final sum of first 8 integers: " + sum);
    }
}

