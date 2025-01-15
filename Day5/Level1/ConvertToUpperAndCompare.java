import java.util.Scanner;

public class ConvertToUpperAndCompare {

    // Method to manually convert text to uppercase using ASCII values
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is lowercase ('a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char) (ch - 32);
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
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Convert text to uppercase using the built-in method
        String builtInUppercase = text.toUpperCase();

        // Convert text to uppercase manually using the custom method
        String manuallyConvertedText = convertToUppercase(text);

        // Compare the two converted strings
        boolean areEqual = compareStrings(builtInUppercase, manuallyConvertedText);

        // Display the results
        System.out.println("Text converted using toUpperCase(): " + builtInUppercase);
        System.out.println("Text converted manually: " + manuallyConvertedText);
        System.out.println("Are the two converted strings equal? " + areEqual);

        // Close the scanner
        input.close();
    }
}
