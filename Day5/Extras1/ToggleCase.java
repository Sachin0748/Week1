import java.util.Scanner;

public class ToggleCase {
  // Method to toggle the case of each character in the string
  public static String toggleCase(String input) {
    StringBuilder result = new StringBuilder(); // StringBuilder to build the resulting string

    // Loop through each character in the string
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i); // Get the character at position i

      // Check if the character is uppercase
      if (Character.isUpperCase(ch)) {
        result.append(Character.toLowerCase(ch)); // Convert to lowercase
      }
      // Check if the character is lowercase
      else if (Character.isLowerCase(ch)) {
        result.append(Character.toUpperCase(ch)); // Convert to uppercase
      } else {
        result.append(ch); // If it's neither, just append the character (like spaces, punctuation, etc.)
      }
    }

    return result.toString(); // Return the modified string
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a string from the user
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    // Toggle the case using the custom method
    String result = toggleCase(input);

    // Display the result
    System.out.println("String after toggling case: " + result);

    scanner.close(); // Close the Scanner
  }
}
