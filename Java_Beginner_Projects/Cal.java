import javax.swing.JOptionPane;
//A dialog calculator program.
public class Cal {
    int input; // Class variable
    double x, y, z; // Class variable

    public void Menu(){//Class Menu method
        JOptionPane.showMessageDialog(null, "A Simple Calculator using Dialog." );
         input = Integer.parseInt(JOptionPane.showInputDialog("\t Menu: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit \n Enter an option: "));
    }

    public void Add(){//Class Addition Method.
        JOptionPane.showMessageDialog(null, "\t Addition");
         x = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
         y = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
         z = x+y;
        JOptionPane.showMessageDialog(null, x + " + " + y + " = " + (z));
    }

    public void Sub(){//Class Subtraction method
        JOptionPane.showMessageDialog(null, "\t Subtraction");
         x = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
         y = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
         z = x-y;
        JOptionPane.showMessageDialog(null, x + " - " + y + " = " + (z));
    }

    public void Mul(){//Class Multiplication method
        JOptionPane.showMessageDialog(null, "\t Addition");
         x = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
         y = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
         z = x*y;
        JOptionPane.showMessageDialog(null, x + " x " + y + " = " + (z));
    }

    public void Div(){//Class Division method.
        JOptionPane.showMessageDialog(null, "\t Addition");
         x = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
         y = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
         z = x/y;
        //Validating the division method, incase user input for y = 0;
        if(y ==0){
            JOptionPane.showMessageDialog(null, "Division by zero is invalid!");
        }
        else{
            JOptionPane.showMessageDialog(null, x + " / " + y + " = " + (z));
        }
    }
    public void exit() {//A class method to quit the program.
        JOptionPane.showMessageDialog(null, "You closed the program, goodbye!");
    }
    public static void main(String[] args) {
        int next;
        
        do{//A do-while loop for program reusability.

        Cal h = new Cal();//An object for the class.
        h.Menu();//Calling te menu Menu.
        //A list of conditions to validate user inputs for menu options.
        if (h.input==1){
            h.Add();
        }
        else if (h.input==2){
            h.Sub();
        }
        else if (h.input==3){
            h.Mul();
        }
        else if (h.input==4){
            h.Div();
        }
        else if (h.input==5) {
            h.exit();
        }
        else{//An else statement for error handling.
            JOptionPane.showMessageDialog(null, "Your input was invalid. Please try again.");
        }
    
        //Global variable for program continuation.
        next = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to continue: (1.Yes / 2.No)"));
        if(next == 2){h.exit();}//for quitting when a user choise is 2(No).
            
    }while(next == 1);//Continue while user input is yes for next.
    }
}
