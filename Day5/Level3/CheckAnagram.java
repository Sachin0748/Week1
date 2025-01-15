import java.util.Scanner;

public class CheckAnagram {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert both texts to lowercase to handle case sensitivity and ignore spaces
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // If lengths of both texts are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters for both texts
        int[] freq1 = new int[256]; // Array to store frequency of characters in text1
        int[] freq2 = new int[256]; // Array to store frequency of characters in text2

        // Loop through both texts and update their frequency arrays
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays of both texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // If frequencies are not equal, return false
            }
        }

        return true; // If frequencies are equal, the texts are anagrams
    }

    // Method to display the result
    public static void displayResult(String text1, String text2, boolean result) {
        if (result) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are not anagrams.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        displayResult(text1, text2, result);

        scanner.close();
    }
}
