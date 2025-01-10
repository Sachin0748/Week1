import java.util.Scanner;

// Creating Class with name TemperatureConversion to convert Celsius to Fahrenheit
class TemperatureConversion {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner
        input.close();
    }
}
