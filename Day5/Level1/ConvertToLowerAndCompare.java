import java.util.Scanner;

public class ConvertToLowerAndCompare {

    // Method to manually convert text to lowercase using ASCII values
    public static String convertToLowercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is uppercase ('A' to 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings character by character using charAt
    public static boolean compareStrings(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert text to lowercase using the built-in method
        String builtInLowercase = text.toLowerCase();

        // Convert text to lowercase manually using the custom method
        String manuallyConvertedText = convertToLowercase(text);

        // Compare the two converted strings
        boolean areEqual = compareStrings(builtInLowercase, manuallyConvertedText);

        // Display the results
        System.out.println("Text converted using toLowerCase(): " + builtInLowercase);
        System.out.println("Text converted manually: " + manuallyConvertedText);
        System.out.println("Are the two converted strings equal? " + areEqual);

        // Close the scanner
        input.close();
    }
}
