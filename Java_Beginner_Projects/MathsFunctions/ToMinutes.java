package MathsFunctions;

import java.util.Scanner;

public class ToMinutes {

    public static void tominutes() {
        Scanner scanner = new Scanner(System.in);
        int minutes = 0, seconds = 0;

        System.out.println("Enter the time in seconds: ");
        int a = scanner.nextInt();

        minutes = a / 60;
        seconds = a % 60;

        System.out.println("The time is " + minutes + " mins " + seconds + " seconds.");
    }

        public static void main(String[] args){
            tominutes();
        }

    }