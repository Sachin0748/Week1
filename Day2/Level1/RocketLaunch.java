// Create class RocketLaunch to count down from a user input value to 1 for a rocket launch
import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
    
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        // Perform the countdown using a while loop
        while (counter >= 1) {
            // Print the current counter value
            System.out.println(counter + "\n");

            // Decrement the counter
            counter--;
        }

        // Print the message when the countdown reaches 0
        System.out.println("Launch!");

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
