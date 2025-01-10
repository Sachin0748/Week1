// Create class CalculateFactorial to compute the factorial of an integer
import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Compute the factorial using a while loop
            int factorial = 1;
            int i = 1;

            // While loop to compute factorial
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
