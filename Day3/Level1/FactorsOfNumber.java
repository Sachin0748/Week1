import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number to find its factors
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check for valid input (positive integer)
        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            return; // Exit the program if the number is invalid
        }

        // Initialize the array to store factors
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0; // To keep track of the current index in the factors array

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor of the number
                // Check if the array is full
                if (index == maxFactor) {
                    // Double the size of the array if it is full
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy the old array to the new one
                    factors = temp; // Update the reference to the new array
                }
                factors[index++] = i; // Add the factor to the array and increment index
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " "); // Print each factor
        }
        System.out.println(); // New line after printing all factors
    }
}
