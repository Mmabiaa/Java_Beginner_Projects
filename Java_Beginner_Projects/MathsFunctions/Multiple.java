package MathsFunctions;

import java.util.Scanner;
public class Multiple {

    public static void numMultiple() {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter first Number");
        int firstNum=scanner.nextInt();

        System.out.print("Enter second Number");
        int secondNum=scanner.nextInt();

        if (firstNum%secondNum ==0 )
            System.out.println(firstNum + " is a multiple of " + secondNum);
        else
            System.out.println(firstNum + " is not a multiple of " + secondNum);

        scanner.close();
    }
    public static void main(String[] args) {
    numMultiple();
    }
}

