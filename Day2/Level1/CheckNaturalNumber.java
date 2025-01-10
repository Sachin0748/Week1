// Create class CheckNaturalNumber to check if the number is natural and calculate the sum of n natural numbers
import java.util.Scanner;

class CheckNaturalNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);

        // Enter the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number >= 0) {
            // Calculate the sum of first n natural numbers using the formula
            int sum = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner
        input.close();
    }
}
