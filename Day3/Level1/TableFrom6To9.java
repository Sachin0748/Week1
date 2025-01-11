import java.util.Scanner;

// Class to generate the multiplication table of a number from 6 to 9.

public class TableFrom6To9 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take integer input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate the multiplication table from 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display the multiplication results
        System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = 6 + i;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        // Close Scanner object
        input.close();
    }
}
