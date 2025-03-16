package MathsFunctions;
// Code to display
/*
* Natural Log of 45
* Square root of 29
* 5 Exponent of 65
* */
public class Log45_Sqrt29_Pow {
    public static double natural_log(double value){
        return Math.log(value);
    }
    public static double square_root(double value){
        return Math.sqrt(value);
    }
    public static double power_of(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double value1 = 45, value2 = 29, base = 5, exponent = 65;
        double log_value = natural_log(value1); // value = 45
        double root_value = square_root(value2); // value = 29
        double power_value = power_of(base, exponent); // base = 5, exponent = 65

        // displaying the various answers
        System.out.printf("Natural log of ("+value1+") = %.4f\n",log_value);
        System.out.printf("Square root of ("+value2+") = %.4f\n",root_value);
        System.out.printf(base+" exponent "+exponent+ " = %.2f",power_value);
    }
}
