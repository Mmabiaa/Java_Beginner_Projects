// Simple java program to find the sides of triangles.
import java.util.Scanner;

// Class or Blu print of the program.
public class SOH_CAH_TOA {

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

	public int get_side(){ // A method to return the side to be calculated.

		System.out.println("Enter the side you want to find: ");
		int side = scanner.nextInt();
		System.out.println("------------------------------------------------------------------------");

		if (side < 1 || side > 3){ // Validating the sides.
			System.out.println("Enter a valid side(1-3): ");
			System.out.println("------------------------------------------------------------------------");
		}
		else{
			calculate_side(side); // calling the calculate_side method to calculate for the side.
		}

		return side; // returns the side.
	}

	public  void calculate_side(int side){ // A method to perform side calculations.
		if (side == 1){
			System.out.println("Finding the Adjacent Side");
			System.out.println("------------------------------------------------------------------------");

			System.out.println("Enter the opposite side: ");
			double opp = scanner.nextInt();
			System.out.println("Enter the hypotenuse: ");
			double hyp = scanner.nextInt();
			System.out.println("------------------------------------------------------------------------");

			double adj = Math.sqrt((hyp*hyp)+(opp*opp));
			System.out.println("Adjacent = " + Math.round(adj));
			System.out.println("------------------------------------------------------------------------");
		}
		else if (side == 2){

			System.out.println("Finding the Opposite Side");
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Enter the Adjacent side: ");
			double adj = scanner.nextInt();
			System.out.println("Enter the Hypotenuse: ");
			double hyp = scanner.nextInt();
			System.out.println("------------------------------------------------------------------------");

			double opp = Math.sqrt((hyp*hyp)+(adj*adj));
			System.out.println("Opposite = " + Math.round(opp));
			System.out.println("------------------------------------------------------------------------");
		}

		else{
			System.out.println("Finding the Hypotenuse Side");
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Enter the opposite side: ");
			double opp = scanner.nextInt();
			System.out.println("Enter the adjacent: ");
			double adj = scanner.nextInt();
			System.out.println("------------------------------------------------------------------------");
			double hyp = Math.sqrt((adj*adj)+(opp*opp));
			System.out.println("Hypotenuse = " + Math.round(hyp));
			System.out.println("------------------------------------------------------------------------");
		}


	}

	public void  check_menu_option(int option){ // A method to validate user menu options.
		

		if (option == 2){
			System.err.println("Exiting...\nThanks for using the program...");
			System.out.println("------------------------------------------------------------------------");
		}
		else{
			System.out.println("1. Adjacent 2. Opposite 3. Hypotenuse");
			System.out.println("------------------------------------------------------------------------");
   get_side();
		}
		

	}





    public  void main(String[] args){ // main method
		SOH_CAH_TOA obj = new SOH_CAH_TOA(); // Creating an object for the class
		obj.menu(); // Calling the menu method to run the program.
    }
}
