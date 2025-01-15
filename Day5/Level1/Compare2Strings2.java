import java.util.Scanner;

class Compare2Strings2 {

    // Method to create a substring from a string using the charAt() method
    static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i)); 
        }
        return substring.toString();
    }

    // Method to compare two strings using the charAt() method
    static boolean compareStringsUsingCharAt(String str1, String str2) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using the charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(originalString, startIndex, endIndex);
        System.out.println("Substring using charAt(): " + substringUsingCharAt);

        // Create substring using the built-in substring() method
        String substringUsingBuiltIn = originalString.substring(startIndex, endIndex);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);

        // Compare the two substrings using the custom method
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display the result of the comparison
        if (areEqual) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("The substrings are not equal.");
        }

        scanner.close();
    }
}
