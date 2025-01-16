import java.util.Scanner;

public class TemperatureConverter {

  // Method to get input from the user
  public static double getInput(String scale) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter temperature in " + scale + ": ");
    return scanner.nextDouble();
  }

  // Function to convert Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9; // Formula: (F - 32) * 5/9
  }

  // Function to convert Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32; // Formula: (C * 9/5) + 32
  }

  // Method to display the result
  public static void displayResult(double temperature, String scale) {
    System.out.println("Converted temperature is: " + temperature + " " + scale);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Temperature Converter");
    System.out.println("1. Fahrenheit to Celsius");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.print("Choose an option (1 or 2): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      // Fahrenheit to Celsius
      double fahrenheit = getInput("Fahrenheit");
      double celsius = fahrenheitToCelsius(fahrenheit);
      displayResult(celsius, "Celsius");
    } else if (choice == 2) {
      // Celsius to Fahrenheit
      double celsius = getInput("Celsius");
      double fahrenheit = celsiusToFahrenheit(celsius);
      displayResult(fahrenheit, "Fahrenheit");
    } else {
      System.out.println("Invalid option. Please choose either 1 or 2.");
    }

    scanner.close();
  }
}
