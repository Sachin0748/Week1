import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Using the given wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Create an object of WindChillCalculator class to calculate wind chill
        WindChillCalculator calculator = new WindChillCalculator();
        
        // Call the method to calculate wind chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Output the wind chill temperature
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
    }
}
