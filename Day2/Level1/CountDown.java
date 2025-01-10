// Create class CountDown to count down from a user input value to 1 for a rocket launch using a for-loop
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Perform the countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            // Print the current counter value
            System.out.println(i + "\n");
        }

        // Print the message when the countdown reaches 0
        System.out.println("Launch!");

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
