import java.util.Scanner;// A library that permits user input in java.
public class Calculator {// A simple calculator program.

    Scanner scanner = new Scanner(System.in);//A variable that holds user inputs.

    public void Menu(int Option){// A Menu method.
        System.out.println("\t A Simple Calculator program \n\t--Menu-- \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
        System.out.print("Enter an option: ");

    }
    //The Addition method
    public int Add(){
        System.out.println("\n \tAddition...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a + b));
        return a + b;
    }
    //The subtraction method.
    public int Sub(){
        System.out.println("\n \tSubtraction...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a - b));
        return a - b;
    }

    // The multiplication method.
    public int Mul(){
        System.out.println("\n \tMultiplication...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        System.out.println("Answer = " + (a * b));
        return a * b;
    }

    //The division method.
    public void Div(){
        System.out.println("\n \tDivision...");
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();
        if (b==0){
            String zero ="Division by zero is invalid";
            System.err.println(zero);
        }
        else{
            System.out.println("Answer = " + (a / b));
        }
    }

    //A method for exit.
    public void exit(){
    System.out.println("Exiting...");
}

int option;
//Main Method.
public void main(String [] args){
    option = scanner.nextInt();
    int c;
    do{
    Menu(option);//calling the menu method using the args option.

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
        System.out.println("Unknown option");
            break;   
    }
    System.out.println("Do you want to continue? \n (1. Yes 2. No)");
     c = scanner.nextInt();
    if (c== 2){exit();}
    else{
        System.out.println("\n\n\n");
    }
}while(c == 1);
}
}