import java.util.Scanner;

public class WordReplace {

  // Method to replace a word in the sentence
  public static String replaceWord(String sentence, String oldWord, String newWord) {
    // Using the replaceAll method to replace all occurrences of oldWord with
    // newWord
    return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the sentence, old word, and new word
    System.out.print("Enter the sentence: ");
    String sentence = scanner.nextLine();
    System.out.print("Enter the word to replace: ");
    String oldWord = scanner.nextLine();
    System.out.print("Enter the new word: ");
    String newWord = scanner.nextLine();

    // Call the replaceWord method
    String modifiedSentence = replaceWord(sentence, oldWord, newWord);

    // Output the modified sentence
    System.out.println("Modified Sentence: " + modifiedSentence);

    scanner.close(); // Close the scanner
  }
}
