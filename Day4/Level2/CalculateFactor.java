import java.util.Scanner;

public class CalculateFactor {

    // Method to find the factors of the number and store them in an array
    public static int[] findFactors(int number) {
        // First loop to find the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors using Math.pow() method
    public static double findSumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Find and display the sum of factors
        int sum = findSumOfFactors(factors);
        System.out.println("\nSum of factors: " + sum);

        // Find and display the product of factors
        int product = findProductOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Find and display the sum of squares of factors
        double sumOfSquares = findSumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}
