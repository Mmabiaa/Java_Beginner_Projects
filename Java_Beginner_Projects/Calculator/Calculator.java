import java.util.concurrent.Callable;
import java.util.Scanner;// A library that permits user input in java.

public class Calculator {// A simple calculator program.

    static Scanner scanner = new Scanner(System.in);// A variable that holds user inputs.

    public static void Menu() {// A Menu method.
        System.out.println(
                "\t A Simple Calculator program \n\t--Menu-- \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
        System.out.print("Enter an option: ");
    }

    // The Addition method
    public static int Add() {
        System.out.println("\n \tAddition...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a + b));
        return a + b;
    }

    // The subtraction method.
    public static int Sub() {
        System.out.println("\n \tSubtraction...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a - b));
        return a - b;
    }

    // The multiplication method.
    public static int Mul() {
        System.out.println("\n \tMultiplication...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a * b));
        return a * b;
    }

    // The division method.
    public static void Div() {
        System.out.println("\n \tDivision...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        if (b == 0) {
            String zero = "Division by zero is invalid";
            System.err.println(zero);
        } else {
            System.out.println("Answer = " + (a / b));
        }
    }

    // A method for exit.
    public static void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    static int option;

    // Main Method.
    public static void main(String[] args) {
        int c = 0;
        while (c == 0) {
            Menu();
            option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        Add();
                        break;
                    case 2:
                        Sub();
                        break;
                    case 3:
                        Mul();
                        break;
                    case 4:
                        Div();
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.err.println("Unrecognized input");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Unrecognized input");
            }
            System.out.println("Enter an option: Do you want to continue?\n(1. Yes\n2. No)");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Continuing\n\n\n");
                    c--;
                    break;
                default:
                    exit();
                    break;
            }

        }
        System.err.println("Reached end of main method");
        System.exit(1);
    }
}
// modified 6/25/2026