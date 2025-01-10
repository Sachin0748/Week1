// Create class DigitCount to count the number of digits in an integer
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create a variable to count digits, initialize to 0
        int count = 0;

        // Use a loop to iterate until the number becomes 0
        while (number != 0) {
            // Remove the last digit from the number
            number = number / 10;

            // Increase count by 1 for each digit
            count++;
        }

        // Display the count of digits
        System.out.println("The number " + number + " has " + count + " digits.");

        // Close the scanner to free resources
        input.close();
    }
}
