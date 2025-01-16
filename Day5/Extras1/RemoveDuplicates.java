import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
  // Method to remove duplicate characters from a string
  public static String removeDuplicates(String input) {
    // Use a LinkedHashSet to maintain the order of characters and eliminate
    // duplicates
    LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

    // Add each character to the set
    for (char ch : input.toCharArray()) {
      uniqueChars.add(ch);
    }

    // Build the modified string from the set
    StringBuilder result = new StringBuilder();
    for (char ch : uniqueChars) {
      result.append(ch);
    }

    return result.toString(); // Return the modified string
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a string from the user
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    // Remove duplicates using the custom method
    String result = removeDuplicates(input);

    // Display the result
    System.out.println("String after removing duplicates: " + result);

    scanner.close(); // Close the Scanner
  }
}
