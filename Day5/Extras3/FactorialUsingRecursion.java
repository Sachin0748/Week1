import java.util.Scanner;

public class FactorialUsingRecursion {

  // Method to get input from the user
  public static int getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number to calculate its factorial: ");
    int num = scanner.nextInt();
    scanner.close();
    return num;
  }

  // Recursive method to calculate factorial
  public static int calculateFactorial(int n) {
    if (n == 0 || n == 1) {
      return 1; // Base case: factorial of 0 or 1 is 1
    } else {
      return n * calculateFactorial(n - 1); // Recursive case
    }
  }

  // Method to display the result
  public static void displayResult(int result) {
    System.out.println("The factorial is: " + result);
  }

  public static void main(String[] args) {
    // Get input from the user
    int number = getInput();

    // Calculate the factorial
    int factorial = calculateFactorial(number);

    // Display the result
    displayResult(factorial);
  }
}
