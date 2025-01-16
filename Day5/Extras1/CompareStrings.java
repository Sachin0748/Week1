import java.util.Scanner;

public class CompareStrings {
  // Method to compare two strings lexicographically
  public static int compareStrings(String str1, String str2) {
    // Find the length of the shorter string
    int length = Math.min(str1.length(), str2.length());

    // Compare character by character
    for (int i = 0; i < length; i++) {
      char char1 = str1.charAt(i);
      char char2 = str2.charAt(i);

      // If characters are different, return the difference
      if (char1 != char2) {
        return char1 - char2; // Difference between ASCII values
      }
    }

    // If all characters are the same, compare the length of the strings
    return str1.length() - str2.length();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input two strings from the user
    System.out.print("Enter string 1: ");
    String str1 = scanner.nextLine();
    System.out.print("Enter string 2: ");
    String str2 = scanner.nextLine();

    // Compare the strings lexicographically
    int result = compareStrings(str1, str2);

    // Output the result based on comparison
    if (result < 0) {
      System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
    } else if (result > 0) {
      System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
    } else {
      System.out.println("Both strings are equal");
    }

    scanner.close(); // Close the scanner
  }
}
