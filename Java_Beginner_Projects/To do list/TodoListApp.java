import java.util.*;;

public class TodoListApp {
    Scanner scanner = new Scanner(System.in);

    TaskManager taskManager = new TaskManager();

    void menu(){
            System.out.println("TO-DO-LIST-PROGRAM");
            System.out.println("-------------------------------------------------"); 
            System.out.println("1. ADD \n2. DELETE \n3. DISPLAY \n4. TOGGLE TASK COMPLETION \n5. SAVE AND EXIT");
            System.out.println("-------------------------------------------------");
            System.out.print("Plese enter an option(1-5): ");
            validateChoice();
    }


    void ADD(){
        System.err.print("Enter task description: ");
        System.out.println("--------------------------------------------------------");
        String description = scanner.nextLine();
        System.out.println("--------------------------------------------------------");

        taskManager.addTask(description);
    };

    int ID(){
        System.out.print("Enter task ID: ");
        int id = scanner.nextInt();
        System.out.println("--------------------------------------------------------");
        return id;
    }

    private static final String FILENAME = "tasks.dat";
    public int getChoice(){
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    void validateChoice(){
        int option = getChoice();
        switch (option) {
            case 1:
                ADD();
                break;

            case 2:
                int id = ID();
                taskManager.deleteTask(id);
                break;
            case 3:
                taskManager.displayTask();
                break;
            case 4:
                id = ID();
                taskManager.toggleTaskCompletion(id);
                break;
            case 5:
            taskManager.saveTasks(FILENAME);
            System.err.println("Task saved successfully. Exiting....");
            scanner.close();
            return;
            default:
            System.out.println("Invalid Input.");
    
        }
    }

    public void main(String[] args) {
       

       

        //Load exiting tasks from file
        taskManager.loadTasks(FILENAME);

        while(true){
            menu();
            System.out.println();
            System.out.println("---------------------------------------------");



        }
    }
}
