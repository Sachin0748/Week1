import java.util.Scanner;

// Class to display the multiplication table of a given number.

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number for which the multiplication table is to be generated
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Define an array to store the multiplication results
        int[] arr = new int[11];

        // Populate the array with the multiplication results
        for (int i = 1; i <= 10; i++) {
            arr[i] = num * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + arr[i]);
        }

        // Close Scanner object
        input.close();
    }
}
