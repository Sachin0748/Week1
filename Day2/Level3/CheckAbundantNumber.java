// Create class CheckAbundantNumber to check if a number is Abundant or not
import java.util.Scanner;

public class CheckAbundantNumber {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create a variable sum to store the sum of divisors, initialize it to 0
        int sum = 0;

        // Run a for loop
        for (int i = 1; i <= number/2; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i; // Add i to the sum of divisors
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner to free resources
        input.close();
    }
}
