import java.util.Scanner; // Import Scanner class for taking user input

class Compare2Strings {

    // Custom method to compare two strings character by character
    static boolean compareString(String str1, String str2) {
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            // If any character does not match, return false
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // If all characters match, return true
        return true;
    }

    // Method to compare strings using the built-in equals() method
    static boolean compareStringUsingBuiltIn(String str1, String str2) {
        // Check if the two strings are equal and return the result
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Prompt the user to enter the first string
        System.out.print("Enter 1st string: ");
        String str1 = input.next();

        // Prompt the user to enter the second string
        System.out.print("Enter 2nd string: ");
        String str2 = input.next();

        // Variables to store comparison results
        boolean result1 = false;
        boolean result2 = false;

        // Check if the lengths of the strings are equal
        if (str1.length() == str2.length()) {
            // Call custom method to compare strings
            result1 = compareString(str1, str2);

            // Call built-in method to compare strings
            result2 = compareStringUsingBuiltIn(str1, str2);
        } else {
            // If lengths are different, output an appropriate message
            System.out.println("Strings are of different length");
        }

        // Check if the results from both methods are the same
        if (result1 == result2) {
            // Output if both methods produced the same result
            System.out.println("Both results are same");
        } else {
            // Output if the methods produced different results
            System.out.println("Both results are not same");
        }

        input.close(); // Close the Scanner
    }
}
