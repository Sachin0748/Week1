// Create class SumOfNaturalNumbersUsingForLoop to calculate the sum of n natural numbers using both formula and for loop
import java.util.Scanner;

public class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number (n)
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare both results and print the result
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Check if both results are correct
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}