// Create class CheckHarshadNumber to check if a number is a Harshad Number
import java.util.Scanner;

public class CheckHarshadNumber {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create a variable sum to store the sum of digits, initialize it to 0
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to calculate the sum of the digits
        while (number != 0) {
            // Find the last digit of the number
            int digit = number % 10;

            // Add the digit to sum
            sum += digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Close the scanner to free resources
        input.close();
    }
}
