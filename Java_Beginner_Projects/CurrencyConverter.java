import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    
    // Exchange rates stored in a map
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Example exchange rates
        exchangeRates.put("USD", 1.0); // Base currency
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GHS", 16.02); // Example rate for GHS to USD
        exchangeRates.put("NGN", 1666.39); // Example rate for NGN to USD
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("CAD", 1.25);
    }
    
    // Function to convert any currency to USD
    public static double convertToUsd(double amount, String currency) {
        return amount / exchangeRates.get(currency);
    }
    
    // Function to convert USD to any currency
    public static double convertFromUsd(double amount, String currency) {
        return amount * exchangeRates.get(currency);
    }
    
    // Function to get user input as a string
    public static String getUserInputString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
    
    // Function to get user input as a double
    public static double getUserInputDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter!");
        System.err.println("----------------------------------------------------");
        
        System.out.println("Available currencies: USD, EUR, GHS, NGN, GBP, CAD");
        System.err.println("----------------------------------------------------");
        
        String fromCurrency = getUserInputString("Enter the currency you want to convert from (e.g., USD): ").toUpperCase();
        double amount = getUserInputDouble("Enter amount in " + fromCurrency + ": ");
        System.err.println("----------------------------------------------------");
        
        String toCurrency = getUserInputString("Enter the currency you want to convert to (e.g., EUR): ").toUpperCase();
        System.err.println("----------------------------------------------------");
        
        if (exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
            double amountInUsd = convertToUsd(amount, fromCurrency);
            double convertedAmount = convertFromUsd(amountInUsd, toCurrency);
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } else {
            System.out.println("Invalid currency! Please ensure you enter a valid currency code.");
        }
        System.err.println("----------------------------------------------------");
    }
}