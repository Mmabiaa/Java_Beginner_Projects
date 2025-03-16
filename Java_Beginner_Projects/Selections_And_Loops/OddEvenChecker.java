package Selections_And_Loops;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check even
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }
        // Check odd
        if (number % 2 != 0) {
            System.out.println("The number is odd.");
        }
        scanner.close();
    }
}

