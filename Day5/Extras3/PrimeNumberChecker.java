import java.util.Scanner;

public class PrimeNumberChecker {

  // Method to check if a number is prime
  public static boolean isPrime(int number) {
    // A prime number is greater than 1 and has no divisors other than 1 and itself
    if (number <= 1) {
      return false;
    }

    // Only check for divisors up to the square root of the number
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false; // If divisible by i, it's not a prime
      }
    }
    return true; // If no divisors are found, it's a prime number
  }

  // Method to get integer input from the user
  public static int getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number to check if it is prime: ");
    return scanner.nextInt();
  }

  public static void main(String[] args) {
    // Get the number from the user
    int number = getInput();

    // Check if the number is prime
    if (isPrime(number)) {
      System.out.println(number + " is a prime number.");
    } else {
      System.out.println(number + " is not a prime number.");
    }
  }
}
