package Selections_And_Loops;

public class SumOfIntegersFor {
    public static void main(String[] args) {
        int sum = 0; // Initialize sum
        for (int i = 1; i <= 10; i++) {
            sum += i; // Add current integer to sum
            System.out.println("Added " + i + " to sum. Current sum: " + sum);
        }
        System.out.println("Final sum of first 10 integers: " + sum);
    }
}

