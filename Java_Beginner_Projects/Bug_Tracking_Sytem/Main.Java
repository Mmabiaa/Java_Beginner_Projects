import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BugTracker bugTracker = new BugTracker();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Bug Tracking System ---");
            System.out.println("1. Add Bug");
            System.out.println("2. View Bugs");
            System.out.println("3. Update Bug Status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter bug description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter severity (Low/Medium/High): ");
                    String severity = scanner.nextLine();
                    bugTracker.addBug(description, severity);
                    break;
                case 2:
                    bugTracker.viewBugs();
                    break;
                case 3:
                    System.out.print("Enter bug ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new status (Open/In Progress/Resolved): ");
                    String newStatus = scanner.nextLine();
                    bugTracker.updateBugStatus(idToUpdate, newStatus);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}