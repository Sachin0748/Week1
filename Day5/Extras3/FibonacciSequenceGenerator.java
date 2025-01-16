import java.util.Scanner;

public class FibonacciSequenceGenerator {

  // Method to generate and print the Fibonacci sequence up to a specified number
  // of terms
  public static void generateFibonacci(int terms) {
    // The first two terms of the Fibonacci sequence
    int num1 = 0, num2 = 1;

    // Print the first two terms if the number of terms is greater than or equal to
    // 1 and 2
    if (terms >= 1) {
      System.out.print(num1 + " ");
    }
    if (terms >= 2) {
      System.out.print(num2 + " ");
    }

    // Generate and print the Fibonacci sequence for the remaining terms
    for (int i = 3; i <= terms; i++) {
      int nextTerm = num1 + num2;
      System.out.print(nextTerm + " ");

      // Update num1 and num2 for the next iteration
      num1 = num2;
      num2 = nextTerm;
    }

    System.out.println(); // Move to the next line after printing the sequence
  }

  // Method to get the number of terms from the user
  public static int getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of terms for Fibonacci sequence: ");
    return scanner.nextInt();
  }

  public static void main(String[] args) {
    // Get the number of terms from the user
    int terms = getInput();

    // Generate and print the Fibonacci sequence
    generateFibonacci(terms);
  }
}
