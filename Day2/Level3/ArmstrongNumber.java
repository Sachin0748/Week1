// Create class ArmstrongNumber to check if a number is Armstrong or not
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define variables
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            // Find the last digit using modulus operator
            int digit = originalNumber % 10;

            // Find the cube of the digit and add to the sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            originalNumber = originalNumber / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner to free resources
        input.close();
    }
}
