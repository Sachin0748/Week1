// Create class TotalSumUntilZeroOrNegative to find the sum until the user enters 0 or a negative number
import java.util.Scanner;

public class TotalSumUntilZeroOrNegative {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a variable total of type double to store the sum, initialized to 0.0
        double total = 0.0;

        // Infinite while loop to keep asking the user for input
        while (true) {
            // Enter the number to start the sum
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = input.nextDouble();

            // Check if the entered number is 0 or negative, and if so, break the loop
            if (number <= 0) {
                break;  // Exit the loop if the number is 0 or negative
            }

            // Add the entered number to total if it's positive
            total += number;
        }

        // Display the total sum after the loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
