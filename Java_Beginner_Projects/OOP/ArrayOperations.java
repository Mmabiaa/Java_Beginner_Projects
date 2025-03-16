package OOP;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create 2D arrays of different sizes
        double[][] array1 = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6}
        };

        double[][] array2 = {
                {7.7, 8.8},
                {9.9, 10.1},
                {11.11, 12.12}
        };

        // Print arrays
        System.out.println("Array 1:");
        printArray(array1);

        System.out.println("\nArray 2:");
        printArray(array2);

        // Calculate and display sums
        System.out.println("\nSum of Array 1: " + ArraySumCalculator.calculateSum(array1));
        System.out.println("Sum of Array 2: " + ArraySumCalculator.calculateSum(array2));
    }

    // Method to print 2D array
    public static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double num : row) {
                System.out.printf("%-8.2f", num); // Format to 2 decimal places
            }
            System.out.println();
        }
    }
}
