import java.util.Scanner;

public class LongestWordFinder {
  // Method to find the longest word in a sentence
  public static String findLongestWord(String sentence) {
    // Split the sentence into words using spaces as the delimiter
    String[] words = sentence.split(" ");

    String longestWord = ""; // Initialize the longest word as an empty string

    // Iterate through each word
    for (String word : words) {
      // Update longestWord if the current word is longer
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    return longestWord; // Return the longest word
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input a sentence from the user
    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();

    // Find the longest word using the custom method
    String longestWord = findLongestWord(sentence);

    // Display the longest word
    System.out.println("The longest word in the sentence is: " + longestWord);

    scanner.close(); // Close the Scanner
  }
}
