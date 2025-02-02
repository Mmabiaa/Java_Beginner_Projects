package Triangle_sides_finder;
import java.util.Scanner;
import Triangle_sides_finder.SOH_CAH_TOA;


public class Main {
    SOH_CAH_TOA object = new SOH_CAH_TOA();
    Scanner scanner = new Scanner(System.in); // Scanner to help accept user input.

    public void menu(){ // A function to display menu
		System.out.println("---Menu ---");
		System.out.println("1. Find Sides");
		System.out.println("2. Exit");
		System.out.println("------------------------------------------------------------------------");

		get_menu_option(); // Calling the get_menu_option method in the menu method to get the menu option.

	}

    public int get_menu_option(){ // A function to return user menu option.
		System.out.println("Enter a menu option (1 or 2): ");
		int option = scanner.nextInt();
		System.out.println("------------------------------------------------------------------------");

		if (option < 1 || option > 2){ // Checking if user menu option is appropriate.
			System.out.println("Please enter a valid option (1 or 2).");
		}

		else {
			check_menu_option(option); // calling check_menu_option method after validating user option.
		}

		return option; // Returns the user option value
	}

    public void  check_menu_option(int option){ // A method to validate user menu options.


		if (option == 2){
			System.err.println("Exiting...\nThanks for using the program...");
			System.out.println("------------------------------------------------------------------------");
		}
		else{
			object.get_side();
		}


	}
    public void main(String[] args) {
        menu();
    }
}
