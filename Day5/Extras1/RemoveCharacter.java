import java.util.Scanner;

public class RemoveCharacter {
  // Method to remove all occurrences of a specific character from the string
  public static String removeCharacter(String str, char charToRemove) {
    // Initialize an empty string to store the modified result
    String result = "";

    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i); // Get the character at position i

      // If the character is not the one to remove, add it to the result
      if (ch != charToRemove) {
        result += ch; // Append character to result string
      }
    }

    return result; // Return the modified string
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the string and the character to remove
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();
    System.out.print("Enter the character to remove: ");
    char charToRemove = scanner.next().charAt(0);

    // Remove the character using the custom method
    String modifiedString = removeCharacter(str, charToRemove);

    // Display the result
    System.out.println("Modified String: " + modifiedString);

    scanner.close(); // Close the Scanner
  }
}
