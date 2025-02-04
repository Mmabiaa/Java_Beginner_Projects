/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator_program;

import java.util.Scanner;// A library that permits user input in java.

public class calculator_Program {// A simple calculator program.



    //The Addition method
    public int Add(int a , int b){
        System.out.println("\n \tAddition...");        return a + b;
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