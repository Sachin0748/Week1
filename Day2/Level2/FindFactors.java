// Create a class FindFactors to find the factors of a number taken as user input
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the number to find its factors
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 1 to number-1 to find the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }

        // Close the scanner
        input.close();
    }
}
