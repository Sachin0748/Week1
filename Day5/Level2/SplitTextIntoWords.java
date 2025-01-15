import java.util.Scanner;

public class SplitTextIntoWords {

    // Method to find the length of a string without using length()
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

    // Method to split text into words without using split()
    public static String[] customSplit(String str) {
        int length = findLength(str);
        str += " "; // Add space at the end to handle the last word
	length += 1;
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

        // Extract words
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = word;
                word = ""; // Reset the word
            } else {
                word += str.charAt(i);
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Use custom split method
        String[] customWords = customSplit(str);

        // Use built-in split() method
        String[] builtInWords = str.split(" ");

        // Compare results
        boolean isEqual = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("Words using custom method: ");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("Words using split() method: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Are both methods equal? " + isEqual);

        input.close();
    }
}
