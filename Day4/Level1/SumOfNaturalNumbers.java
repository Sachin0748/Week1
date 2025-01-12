import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        // Loop to calculate the sum of first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add current number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the value for n (number of natural numbers)
        System.out.print("Enter the number n: ");
        int n = scanner.nextInt();

        // Call the method to calculate the sum
        int result = sumOfNaturalNumbers(n);

        // Output the result
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
    }
}
