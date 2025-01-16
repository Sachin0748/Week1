import java.util.Scanner;

public class VowelConsonantCounter {
    // Method to count vowels in the string
    public static int countVowels(String input) {
        input = input.toLowerCase(); // Convert to lowercase for consistency
        int count = 0;

        // Check each character for vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count; // Return the number of vowels
    }

    // Method to count consonants in the string
    public static int countConsonants(String input) {
        input = input.toLowerCase(); // Convert to lowercase for consistency
        int count = 0;

        // Check each character for consonants
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count; // Return the number of consonants
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call methods to count vowels and consonants
        int vowelCount = countVowels(input);
        int consonantCount = countConsonants(input);

        // Display the results
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);

        scanner.close(); // Close the Scanner
    }
}
