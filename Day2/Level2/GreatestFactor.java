// Create a class GreatestFactor to find the greatest factor of a number excluding itself
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the number to find its greatest factor
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize greatestFactor variable to 1
        int greatestFactor = 1;

        // Loop from number-1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " excluding itself is: " + greatestFactor);

        // Close the scanner
        input.close();
    }
}
