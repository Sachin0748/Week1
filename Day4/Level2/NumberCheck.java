import java.util.Scanner;

public class NumberCheck {

    // Method to check whether a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Method to check whether a number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check if each number is positive/negative and even/odd
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + "): ");
            // Check if positive or negative
            String positivity = isPositive(numbers[i]);
            System.out.print(positivity);
            
            // If the number is positive, check if it's even or odd
            if (positivity.equals("Positive")) {
                System.out.println(" and " + isEven(numbers[i]));
            } else {
                System.out.println();
            }
        }

        // Compare the first and last element of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
