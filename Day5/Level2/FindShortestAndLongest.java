import java.util.Scanner;

public class FindShortestAndLongest {

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
        str += " "; // Add a trailing space to process the last word
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

    // Method to find the shortest and longest strings using a 1D array
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];
        int shortestLength = findLength(words[0]);
        int longestLength = findLength(words[0]);

        for (String word : words) {
            int length = findLength(word);

            if (length < shortestLength) {
                shortest = word;
                shortestLength = length;
            }

            if (length > longestLength) {
                longest = word;
                longestLength = length;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Split the string into words using the custom method
        String[] words = customSplit(text);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(words);

        // Display the results
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        input.close(); // Close the scanner
    }
}
