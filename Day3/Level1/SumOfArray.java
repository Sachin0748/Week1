import java.util.Scanner;

// Class to store up to 10 values in an array and calculate their sum.

public class SumOfArray {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize an array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or a negative number to stop):");

        // Infinite loop to take user input
        while (true) {
            // Prompt user for input
            System.out.print("Enter number " + (index + 1) + ": ");
            double userInput = input.nextDouble();

            // Break if input is 0, negative, or the array is full
            if (userInput <= 0 || index == 10) {
                break;
            }

            // Store the input in the array and increment index
            numbers[index] = userInput;
            index++;
        }

        // Calculate the total and display all entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("\nTotal sum of numbers: " + total);

        // Close Scanner object
        input.close();
    }
}
