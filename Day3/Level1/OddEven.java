import java.util.Scanner;

// Class to store and display odd and even numbers in an array up to a given number.

public class OddEven {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input a natural number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check for valid input (greater than 0)
        if (number <= 0) {
            System.out.println("Error: The number must be a natural number (greater than 0).");
            return; // Exit the program if the number is invalid
        }

        // Initialize arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the input number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Add even numbers to the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // Add odd numbers to the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Display the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Display the even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the Scanner object
        scanner.close();
    }
}
