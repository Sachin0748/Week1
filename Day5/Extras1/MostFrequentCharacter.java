import java.util.Scanner;

public class MostFrequentCharacter {
  // Method to find the most frequent character in the string
  public static char findMostFrequentCharacter(String str) {
    int[] frequency = new int[256]; // Array to store frequency of each character (ASCII range)
    int maxFrequency = 0;
    char mostFrequentChar = '\0'; // Initialize with null character

    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i); // Get the character at position i
      frequency[ch]++; // Increment the frequency count for the character

      // If the frequency of the current character is higher, update the result
      if (frequency[ch] > maxFrequency) {
        maxFrequency = frequency[ch];
        mostFrequentChar = ch;
      }
    }

    return mostFrequentChar; // Return the most frequent character
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a string from the user
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    // Find the most frequent character using the custom method
    char mostFrequent = findMostFrequentCharacter(str);

    // Display the result
    System.out.println("Most Frequent Character: '" + mostFrequent + "'");

    scanner.close(); // Close the Scanner
  }
}
