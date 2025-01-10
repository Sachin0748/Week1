// Create class TotalSum to find the sum of numbers until the user enters 0
import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable total of type double to store the sum, initialized to 0.0
        double total = 0.0;

        // Enter the first number to start the sum
        System.out.print("Enter a number (enter 0 to stop): ");
        double number = input.nextDouble();

        // Use a while loop to add numbers until the user enters 0
        while (number != 0) {
            total += number;  // Add the entered number to total

            // Ask the user to enter another number
            System.out.print("Enter a number (enter 0 to stop): ");
            number = input.nextDouble();  // Take next input
        }

        // Display the total sum after the loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
