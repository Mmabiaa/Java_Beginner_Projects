package MathsFunctions;

import java.util.Scanner;
// Boateng Prince Agyenim - SRI.41.008.071.23
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a Celsius temperature
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        // Display the result
        System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);

        scanner.close();
    }
}
