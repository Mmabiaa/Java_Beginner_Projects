package MathsFunctions;
// Program to round values using Ceil, Floor and Round
public class Round_number {
    public static void calculate(double num1, double num2) {
        System.out.println("Rounding results for "+num1 + ":");
        System.out.println("Ceil: " + Math.ceil(num1));
        System.out.println("Floor: " + Math.floor(num1));
        System.out.println("Round: " + Math.round(num1));

        System.out.println("\nRounding results for "+num1 + ":");
        System.out.println("Ceil: " + Math.ceil(num2));
        System.out.println("Floor: " + Math.floor(num2));
        System.out.println("Round: " + Math.round(num2));
    }

    public static void main(String[] args){
        double num1 = 4.53;
        double num2 = -3.1;
        calculate(num1, num2);
    }
}
