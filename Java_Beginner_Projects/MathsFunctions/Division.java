package MathsFunctions;
// Java program to find the division of two numbers and return their results in 2 dm
public class Division {
    public static double Divide(double num1, double num2){
        if (num2 == 0){
            System.out.println("Division by zero is invalid");
        }
        return num1/num2;
    }
    public static void main(String[] args){
        double num1 = 2.0, num2 = 6.0;
        double result = Divide(num1, num2);

        System.out.printf(num1+"/"+num2+"= %.2f", result);

    }
}
