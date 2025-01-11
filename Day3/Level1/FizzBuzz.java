import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number up to which FizzBuzz should be calculated
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input to ensure the number is positive
        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            return; 
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Populate the array with FizzBuzz logic
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz"; 
            } else if (i % 5 == 0) {
                results[i] = "Buzz"; 
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the scanner object
        scanner.close();
    }
}
