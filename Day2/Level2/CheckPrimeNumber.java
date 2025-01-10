// Create a class CheckPrimeNumber to check if the number is prime or not
import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        
        // Creating Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Enter a number to check if it's prime
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Assume the number is prime until proven otherwise
        boolean isPrime = true;

        // Prime number checks for numbers greater than 1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to the number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;  // If the number is divisible by i, it's not prime
                    break;  // Exit the loop as we have already confirmed the number is not prime
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close scanner
        scanner.close();
    }
}
