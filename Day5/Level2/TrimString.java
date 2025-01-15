import java.util.Scanner;

public class TrimString {

    // Method to find the start and end indices for trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eter string
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = input.nextLine();

        // Find trim indices
        int[] indices = findTrimIndices(text);
        int start = indices[0];
        int end = indices[1];

        // Trim spaces using the custom method
        String trimmedTextCustom = createSubstring(text, start, end);

        // Trim spaces using the built-in trim() method
        String trimmedTextBuiltIn = text.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedTextCustom, trimmedTextBuiltIn);

        // Display the results
        System.out.println("Original String: \"" + text + "\"");
        System.out.println("Trimmed String (Custom): \"" + trimmedTextCustom + "\"");
        System.out.println("Trimmed String (Built-In): \"" + trimmedTextBuiltIn + "\"");
        System.out.println("Are both methods equal? " + isEqual);

        input.close();
    }
}
