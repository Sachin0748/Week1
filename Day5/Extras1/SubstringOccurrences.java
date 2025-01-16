import java.util.Scanner;

public class SubstringOccurrences {
  // Method to count occurrences of a substring in a string
  public static int countOccurrences(String str, String substring) {
    int count = 0; // Initialize the count to 0
    int index = 0; // Start from the beginning of the string

    // Loop to search for the substring in the string
    while ((index = str.indexOf(substring, index)) != -1) {
      count++; // Increment the count
      index++; // Move the index to the next character after the current match
    }

    return count; // Return the count of occurrences
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the main string and the substring
    System.out.print("Enter the main string: ");
    String str = scanner.nextLine();
    System.out.print("Enter the substring: ");
    String substring = scanner.nextLine();

    // Count the occurrences using the custom method
    int occurrences = countOccurrences(str, substring);

    // Display the result
    System.out.println("The substring '" + substring + "' occurs " + occurrences + " times.");

    scanner.close(); // Close the Scanner
  }
}
