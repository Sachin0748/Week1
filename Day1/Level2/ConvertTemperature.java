import java.util.Scanner;

// Creating Class with name ConvertTemperature to convert Fahrenheit to Celsius
class ConvertTemperature {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        // Close the scanner
        input.close();
    }
}
