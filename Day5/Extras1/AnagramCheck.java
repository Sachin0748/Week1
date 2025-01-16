import java.util.Scanner;

public class AnagramCheck {

  // Method to check if two strings are anagrams
  public static boolean areAnagrams(String str1, String str2) {
    // If the strings are of different lengths, they cannot be anagrams
    if (str1.length() != str2.length()) {
      return false;
    }

    // Convert both strings to lowercase to ensure case-insensitive comparison
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Convert strings to character arrays and sort them
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    // Sort both arrays
    java.util.Arrays.sort(arr1);
    java.util.Arrays.sort(arr2);

    // Compare the sorted arrays
    return java.util.Arrays.equals(arr1, arr2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input two strings from the user
    System.out.print("Enter the first string: ");
    String str1 = scanner.nextLine();
    System.out.print("Enter the second string: ");
    String str2 = scanner.nextLine();

    // Check if the strings are anagrams
    boolean result = areAnagrams(str1, str2);

    // Output the result
    if (result) {
      System.out.println("The strings are anagrams of each other.");
    } else {
      System.out.println("The strings are not anagrams of each other.");
    }

    scanner.close(); // Close the scanner
  }
}
