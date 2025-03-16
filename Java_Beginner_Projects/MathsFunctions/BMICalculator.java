package MathsFunctions;

import java.util.Scanner;
// Boateng Prince Agyenim - SRI.41.008.071.23
public class BMICalculator {

    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for weight and height
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / Math.pow(height, 2);

        // Determine health indication
        String healthIndication;
        if (bmi < 18.5) {
            healthIndication = "Underweight";
        } else if (bmi < 25.0) {
            healthIndication = "Normal";
        } else if (bmi < 30.0) {
            healthIndication = "Overweight";
        } else {
            healthIndication = "Obese";
        }

        // Display BMI and health indication
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Your health indication is: " + healthIndication);

        scanner.close();
    }
}

