package Factorial_Finder;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Finder {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("#,###");

    Finder(){
        get_user_option();
    }

    int get_user_option(){
        System.out.print("Do you want to continue (1. Yes 2. No):  ");
        int option = scanner.nextInt();

        validate_user_option(option);

        return option;
    }

    void validate_user_option(int option){
        if(option != 1 && option != 2){
            System.out.println("Please enter a valid option 1 or 2");
            get_user_option();
        }

        else{
            if(option == 1){
                get_user_number();
            }
            else{
                System.out.println("Thanks for using the program...Bye!");
            }
        }
    }

    void get_user_number() {
        System.out.print("Enter the number to find the factorial: ");
        int number = scanner.nextInt();

        validate_number(number);


    }

    void validate_number(int number){
        if (number <= 0) {
            System.out.println("Number must be greater than zero! ");
            get_user_number();
        }
        else{
            String answer = format.format(factorial(number));
            System.out.println(number + "! = "+answer);

            get_user_option();
        }
    }

    int factorial(int number){
        if (number == 1){
            return 1;
        }
        else{
            return number * factorial(number-1);
        }
    }
}
