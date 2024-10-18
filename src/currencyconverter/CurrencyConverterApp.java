package currencyconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdRate = getExchangeRate(scanner, "USD");
        double eurRate = getExchangeRate(scanner, "EUR");
        double gbpRate = getExchangeRate(scanner, "GBP");
        double jpyRate = getExchangeRate(scanner, "JPY");
        double audRate = getExchangeRate(scanner, "AUD");

        ExchangeRates exchangeRates = new ExchangeRates(usdRate, eurRate, gbpRate, jpyRate, audRate);
        CurrencyConverter converter = new CurrencyConverter(exchangeRates);

        double amount = getAmount(scanner);

        System.out.println("\nConversion results:");
        System.out.println("USD: " + converter.convertToUSD(amount));
        System.out.println("EUR: " + converter.convertToEUR(amount));
        System.out.println("GBP: " + converter.convertToGBP(amount));
        System.out.println("JPY: " + converter.convertToJPY(amount));
        System.out.println("AUD: " + converter.convertToAUD(amount));

        scanner.close();
    }

    // Method to get valid exchange rate
    private static double getExchangeRate(Scanner scanner, String currency) {
        double rate = -1;
        while (rate <= 0) {
            try {
                System.out.print("Enter exchange rate for " + currency + " (positive value): ");
                rate = scanner.nextDouble();
                if (rate <= 0) {
                    System.out.println("Exchange rate must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return rate;
    }

    // Method to get valid amount
    private static double getAmount(Scanner scanner) {
        double amount = -1;
        while (amount <= 0) {
            try {
                System.out.print("\nEnter amount in base currency (positive value): ");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("Amount must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return amount;
    }
}
