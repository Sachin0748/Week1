
// Create a class PowerCalculator to find the power of a number
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the base number and power
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize result variable to 1
        int result = 1;

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with the number
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        input.close();
    }
}

