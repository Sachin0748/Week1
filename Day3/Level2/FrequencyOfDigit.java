import java.util.Scanner;

public class FrequencyOfDigit {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Extract digits from the number and update their frequency
        int temp = number; // Use a temporary variable to process the number
        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit of the number
            frequency[digit]++;     // Increment the frequency of the digit
            temp /= 10;             // Remove the last digit from the number
        }

        // Display the frequency of each digit in the number
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Check if the digit appears in the number
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
    }
}
