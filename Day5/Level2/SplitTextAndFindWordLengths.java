import java.util.Scanner;

public class SplitTextAndFindWordLengths {

    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Length calculation complete
        }
        return length;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] customSplit(String str) {
        // Add a trailing space to process the last word
        str += " ";
        int length = findLength(str);

        // Count the number of words
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        // Extract words from the string
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += str.charAt(i);
            }
        }

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        int wordCount = words.length; // Use the length property of the array
        String[][] result = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Split the string into words using the custom method
        String[] words = customSplit(text);

        // Get a 2D array of words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the results in tabular format
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("----------------------------");
        for (String[] entry : wordsWithLengths) {
            String word = entry[0];

            // Convert String length to Integer for display
            int length = Integer.parseInt(entry[1]);
            System.out.printf("%-15s %-10d%n", word, length);
        }

        // Close the scanner
        input.close();
    }
}
