package com.mycompany.calculator_program;
import java.util.Scanner;

public class User_Utils {
    Scanner scanner = new Scanner(System.in);
    Calculations calculate = new Calculations();


    public double[] Accept_Values(){
        System.err.println("Enter First Number: ");
        double x = scanner.nextInt();
        scanner.nextLine();

        System.err.println("Enter Second Number: ");
        double y = scanner.nextInt();

        return new double[] {x, y};
    }

    public void display_Menu(){
        System.out.println("---Welcome to the Calculator System---");
        System.out.println("--Menu--");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
    }

    public void accept_menu_option(){
        System.out.println("Enter a menu option(1-5): ");
        int menu_option = scanner.nextInt();
        scanner.nextLine();
        validate_menu_option(menu_option);
    }

    public void validate_menu_option(int menu_option){
        if (menu_option <= 5 && menu_option >=1){

            double values[] = Accept_Values();
            double x = values[0];
            double y = values[1];

            switch (menu_option) {
                case 1:
                    double add = calculate.Addition(x, y);
                    System.out.println("Answer = " + add);
                    break;
                case 2:
                    double sub = calculate.Subtraction(x, y);
                    System.out.println("Answer = " + sub);
                    break;
                case 3:
                    double mul = calculate.Multiplication(x, y);
                    System.out.println("Answer = " + mul);
                    break;
                case 4:
                    double div = calculate.Division(x, y);
                    System.out.println("Answer = " + div);
                    break;
                default:
                    System.out.println("Thanks for using the program.");
                    break;
            }
        }else{
            System.out.println("Invalid input...try again");
        }
    }
}
