import java.util.Scanner;

public class UnitConverter6 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input value for Fahrenheit, Celsius, pounds, kilograms, gallons, and liters
        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.print("Enter value in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.print("Enter value in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.print("Enter value in kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.print("Enter value in gallons: ");
        double gallons = scanner.nextDouble();
        System.out.print("Enter value in liters: ");
        double liters = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusFromFahrenheit = convertFahrenheitToCelsius(fahrenheit);
        // Convert Celsius to Fahrenheit
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsius);
        // Convert pounds to kilograms
        double kilogramsFromPounds = convertPoundsToKilograms(pounds);
        // Convert kilograms to pounds
        double poundsFromKilograms = convertKilogramsToPounds(kilograms);
        // Convert gallons to liters
        double litersFromGallons = convertGallonsToLiters(gallons);
        // Convert liters to gallons
        double gallonsFromLiters = convertLitersToGallons(liters);

        // Display the results of conversions
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsiusFromFahrenheit + " Celsius.");
        System.out.println(celsius + " Celsius is equal to " + fahrenheitFromCelsius + " Fahrenheit.");
        System.out.println(pounds + " pounds is equal to " + kilogramsFromPounds + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + poundsFromKilograms + " pounds.");
        System.out.println(gallons + " gallons is equal to " + litersFromGallons + " liters.");
        System.out.println(liters + " liters is equal to " + gallonsFromLiters + " gallons.");
    }
}
