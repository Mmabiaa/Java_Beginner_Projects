package MathsFunctions;
 // Java code to Display maximum, minimum and absolute values in a list.
public class Max_Min_Abs {
    public static double Max_value(double[] numbers) {
        double max = numbers[0];

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static double Min_value(double[] numbers) {
        double min = numbers[0];

        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static double Abs_value(double[] numbers){
        double abs = numbers[0];
        for(double num : numbers){
            if (num == abs){
                abs = num;
            }
        }
        return abs;
    }

    public static void main(String[] args){
        double[] numbers = {-2.1,-1.5,-0.6};
        double max = Max_value(numbers);
        double min = Min_value(numbers);
        double[] values = {-1.5,-1.5};
        double abs = Abs_value(values);

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Abs: "+abs);
    }

}
