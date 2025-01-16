import java.util.Scanner;

public class MaximumOfThree {

  // Method to take integer input from the user
  public static int getInput(String prompt) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(prompt);
    return scanner.nextInt();
  }

  // Method to calculate the maximum of three numbers
  public static int findMaximum(int num1, int num2, int num3) {
    int max = num1;

    // Check if num2 is greater than the current max
    if (num2 > max) {
      max = num2;
    }

    // Check if num3 is greater than the current max
    if (num3 > max) {
      max = num3;
    }

    return max;
  }

  public static void main(String[] args) {
    // Get three numbers from the user
    int num1 = getInput("Enter the first number: ");
    int num2 = getInput("Enter the second number: ");
    int num3 = getInput("Enter the third number: ");

    // Find the maximum value among the three numbers
    int max = findMaximum(num1, num2, num3);

    // Display the maximum value
    System.out.println("The maximum of the three numbers is: " + max);
  }
}
