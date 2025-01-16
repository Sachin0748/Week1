import java.util.Scanner;

public class PalindromeChecker {

  // Method to get input string from the user
  public static String getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string to check if it's a palindrome: ");
    String str = scanner.nextLine();
    scanner.close();
    return str;
  }

  // Method to check if the string is a palindrome
  public static boolean isPalindrome(String str) {
    // Remove any non-alphanumeric characters and convert to lowercase for
    // comparison
    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int left = 0;
    int right = str.length() - 1;

    // Check if the string is the same forwards and backwards
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false; // If any characters don't match, it's not a palindrome
      }
      left++;
      right--;
    }

    return true; // If no mismatches are found, it's a palindrome
  }

  // Method to display the result
  public static void displayResult(boolean result) {
    if (result) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }
  }

  public static void main(String[] args) {
    // Get input from the user
    String inputString = getInput();

    // Check if the input string is a palindrome
    boolean result = isPalindrome(inputString);

    // Display the result
    displayResult(result);
  }
}
