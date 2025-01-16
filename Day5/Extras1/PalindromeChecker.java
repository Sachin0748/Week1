import java.util.Scanner;

public class PalindromeChecker {
  // Method to check if a string is a palindrome
  public static boolean isPalindrome(String input) {
    int left = 0; // Pointer to the start of the string
    int right = input.length() - 1; // Pointer to the end of the string

    // Loop until the pointers meet in the middle
    while (left < right) {
      // Check if characters at the two pointers are equal
      if (input.charAt(left) != input.charAt(right)) {
        return false; // Not a palindrome
      }
      left++;
      right--;
    }
    return true; // Is a palindrome
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a string from the user
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    // Check if the string is a palindrome
    boolean result = isPalindrome(input);

    // Display the result
    if (result) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }

    scanner.close(); // Close the Scanner
  }
}
