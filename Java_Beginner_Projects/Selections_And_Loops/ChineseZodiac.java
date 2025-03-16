package Selections_And_Loops;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        int remainder = year % 12;

        String animal;
        switch (remainder) {
            case 0:  animal = "monkey"; break;
            case 1:  animal = "rooster"; break;
            case 2:  animal = "dog"; break;
            case 3:  animal = "pig"; break;
            case 4:  animal = "rat"; break;
            case 5:  animal = "ox"; break;
            case 6:  animal = "tiger"; break;
            case 7:  animal = "rabbit"; break;
            case 8:  animal = "dragon"; break;
            case 9:  animal = "snake"; break;
            case 10: animal = "horse"; break;
            case 11: animal = "sheep"; break;
            default: animal = "unknown (invalid input)";
        }
        System.out.println("Zodiac animal: " + animal);
        scanner.close();
    }
}

