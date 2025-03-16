package Selections_And_Loops;

import java.util.Scanner;

public class MarksClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double mark = scanner.nextDouble();

        if (mark >= 80.0) {
            System.out.println("First class");
        } else if (mark >= 70.0) {
            System.out.println("Second class Upper");
        } else if (mark >= 60.0) {
            System.out.println("Second class lower");
        } else if (mark >= 50.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        scanner.close();
    }
}

