package OOP;

public class ArraySumCalculator {
    // Method to calculate sum of 2D array
    public static double calculateSum(double[][] array) {
        double sum = 0.0;
        for (double[] row : array) {
            for (double num : row) {
                sum += num;
            }
        }
        return sum;
    }
}
