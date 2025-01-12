import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        // Base case: if n is 1, return 1 (as sum of first 1 natural number is 1)
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum of n natural numbers is n + sum of first (n-1) numbers
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n * (n + 1) / 2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for n
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check if n is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0). Exiting...");
            return;
        }

        // Calculate sum using recursion
        int sumRecursion = sumUsingRecursion(n);

        // Calculate sum using formula
        int sumFormula = sumUsingFormula(n);

        // Compare and display the results
        System.out.println("\nSum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Check if both methods give the same result
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}
