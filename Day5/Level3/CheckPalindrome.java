import java.util.Scanner;

public class CheckPalindrome {

    // Logic 1: Using loop to compare characters from start and end
    public static boolean isPalindromeLoop(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // Palindrome
    }

    // Logic 2: Using recursion to compare characters from start and end
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: string is palindrome
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Not a palindrome
        }
        return isPalindromeRecursive(str, start + 1, end - 1); // Recursive call
    }

    // Logic 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingCharArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[str.length()];

        // Reverse the string
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < str.length(); i++) {
            if (original[i] != reversed[i]) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome
    }

    // Method to display the result
    public static void displayResult(String str, boolean result, String logic) {
        if (result) {
            System.out.println("The text \"" + str + "\" is a palindrome (checked using " + logic + ").");
        } else {
            System.out.println("The text \"" + str + "\" is not a palindrome (checked using " + logic + ").");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text to check if it is a palindrome: ");
        String text = scanner.nextLine();

        // Trim and convert to lower case to handle case sensitivity
        text = text.replaceAll("\\s", "").toLowerCase(); // Remove spaces and handle case sensitivity

        // Check palindrome using three logics
        boolean resultLoop = isPalindromeLoop(text);
        displayResult(text, resultLoop, "Loop");

        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        displayResult(text, resultRecursive, "Recursion");

        boolean resultCharArray = isPalindromeUsingCharArray(text);
        displayResult(text, resultCharArray, "Character Array");

        scanner.close();
    }
}
