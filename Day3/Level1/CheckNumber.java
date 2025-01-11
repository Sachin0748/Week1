import java.util.Scanner;

// Create Class CheckNumber to determine the type and comparison of numbers entered by the user.

public class CheckNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define an array to store 5 numbers
        int[] arr = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // Analyze each number in the array
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Negative number
                System.out.println("The number " + arr[i] + " is negative.");
            } else if (arr[i] == 0) {
                // Zero
                System.out.println("The number " + arr[i] + " is zero.");
            } else {
                // Positive number
                if (arr[i] % 2 == 0) {
                    System.out.println("The number " + arr[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + arr[i] + " is positive and odd.");
                }
            }
        }

        // Compare the first and last elements of the array
        System.out.println("\nComparison of First and Last Elements:");
        if (arr[0] == arr[4]) {
            System.out.println("The first number (" + arr[0] + ") is equal to the last number (" + arr[4] + ").");
        } else if (arr[0] > arr[4]) {
            System.out.println("The first number (" + arr[0] + ") is greater than the last number (" + arr[4] + ").");
        } else {
            System.out.println("The first number (" + arr[0] + ") is less than the last number (" + arr[4] + ").");
        }

        // Close Scanner object
        input.close();
    }
}
