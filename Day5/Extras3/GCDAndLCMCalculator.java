import java.util.Scanner;

public class GCDAndLCMCalculator {

  // Method to get input from the user
  public static int[] getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    return new int[] { num1, num2 };
  }

  // Function to calculate the Greatest Common Divisor (GCD) using Euclid's
  // algorithm
  public static int calculateGCD(int num1, int num2) {
    while (num2 != 0) {
      int temp = num2;
      num2 = num1 % num2;
      num1 = temp;
    }
    return num1; // The GCD is the last non-zero remainder
  }

  // Function to calculate the Least Common Multiple (LCM)
  public static int calculateLCM(int num1, int num2, int gcd) {
    return (num1 * num2) / gcd; // LCM formula: LCM(a, b) = (a * b) / GCD(a, b)
  }

  // Method to display the results
  public static void displayResult(int gcd, int lcm) {
    System.out.println("The GCD is: " + gcd);
    System.out.println("The LCM is: " + lcm);
  }

  public static void main(String[] args) {
    // Get input from the user
    int[] numbers = getInput();
    int num1 = numbers[0];
    int num2 = numbers[1];

    // Calculate GCD
    int gcd = calculateGCD(num1, num2);

    // Calculate LCM using the GCD
    int lcm = calculateLCM(num1, num2, gcd);

    // Display the results
    displayResult(gcd, lcm);
  }
}
