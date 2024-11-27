package Random_Guessing_Game;

import java.util.Random;// import java module for random
import java.util.Scanner; // import java module for user input

public class Game { // the Game class

    Scanner scanner = new Scanner(System.in); // object for the Scanner class
    Random random = new Random(); // object for the Random Class

    Game(){ // A default constructor to initialize the Game class.
        System.out.println("---Menu---");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Play");
        System.out.println("2. Quit");
        System.out.println("---------------------------------------------------------");

        get_user_option();// Calling the get_user_option method to return user option value
    }

    int get_user_option(){ // A method to return and validate user option value.
        System.out.println("Enter a choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("---------------------------------------------------------");
        
        if (choice != 1 && choice != 2){ // A condition to check user option is in range.
            System.out.println("Please enter a valid choice (1 or 2).");
            System.out.println("---------------------------------------------------------");
        }
        else{
            check_choice(choice);// Calling the check_choice method with the parameter choice.
        }

        return choice;
    }

    void check_choice(int choice){ // A method that checks the choices of user input.
        if (choice == 1){
            play_game(); // Calling the play game function
        }
        else{
            System.out.println("---------------------------------------------------------");
            System.out.println("Thanks for using the program...");
            System.out.println("---------------------------------------------------------");
        }
    }

    void play_game(){ 
        
        
        get_user_guess();

    }

    int get_user_guess(){ // A method that returns user guesses.
        
        System.out.println("Please guess a number from (1 - 50) or (0 to quit)");
        int user_guess = scanner.nextInt(); // Using scanner to accept user input.
        System.out.println("---------------------------------------------------------");

        if (user_guess < 0 || user_guess > 50){ // Checking if user guess is in range.
            System.err.println("Guess must be between 1 to 50");
        }
        else{
           int guess = random_guess(); // Assigning the random_guess method to a variable.
           check_guess(user_guess, guess); // Calling the check_guess method
        }
        return user_guess;
    }

    

    void check_guess(int user_guess, int guess){
        while (true) {// While all conditions are true.

        if (user_guess == 0){ // Quit the game if user_choice == 0
                System.err.println("Thanks for playing....");
                break;
            }

        // Conditions to check if user guess is equal to the actual number.
        else if (user_guess < guess){ 
            System.err.println("Your guess is low. Try again!");
        }
        else if (user_guess > guess){
            System.err.println("Your guess is high. Try again!");
        }
        else{
            System.err.println("Your guess was correct!");
            break;
        }
        System.out.println("---------------------------------------------------------");

        System.err.println("The number was "+ guess); // Display the guess after everything
        System.out.println("---------------------------------------------------------");

        get_user_guess();// Calling the get_user_guess method again for reusability.

        
    }
    }

    int random_guess(){ // A method that returns the random guess.
        int guess = random.nextInt(1, 50); // Using the random object to generate a random guess..
        return guess;
    }
}
