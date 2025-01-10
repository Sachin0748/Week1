// Create class PrintOddEvenNumbers to print odd and even numbers between 1 to the entered number
import java.util.Scanner;

public class PrintOddEvenNumbers {
    public static void main(String[] args) {
    
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    // If not even, it must be odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        input.close();
    }
}
