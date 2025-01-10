// Create a class FizzBuzz to implement the FizzBuzz logic
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5 (FizzBuzz)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3 (Fizz)
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5 (Buzz)
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it's not divisible by 3 or 5
                else {
                    System.out.println(i);
                }
            }
        } else {
            // Display message if number is not positive
            System.out.println("Please enter a positive integer.");
        }

        // Close scanner
        sc.close();
    }
}
