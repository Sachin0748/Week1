import java.util.Scanner;

public class FindUniqueCharacters {

    // Method to find the length of the string without using the length() method
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return length;
    }

    // Method to find characters that appear only once in the string
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);
        char[] tempUniqueChars = new char[length]; // Temporary array for unique characters
        int[] charCounts = new int[length]; // Array to count occurrences of each character
        int uniqueCount = 0;

        // Count occurrences of each character
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean alreadyCounted = false;

            // Check if the character is already counted
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUniqueChars[j] == currentChar) {
                    charCounts[j]++;
                    alreadyCounted = true;
                    break;
                }
            }

            // If the character is not yet counted, add it
            if (!alreadyCounted) {
                tempUniqueChars[uniqueCount] = currentChar;
                charCounts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Find characters that occur only once
        int finalUniqueCount = 0;
        for (int i = 0; i < uniqueCount; i++) {
            if (charCounts[i] == 1) {
                finalUniqueCount++;
            }
        }

        // Create an array to store unique characters
        char[] uniqueChars = new char[finalUniqueCount];
        int index = 0;
        for (int i = 0; i < uniqueCount; i++) {
            if (charCounts[i] == 1) {
                uniqueChars[index++] = tempUniqueChars[i];
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        System.out.println("Characters that occur only once in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
