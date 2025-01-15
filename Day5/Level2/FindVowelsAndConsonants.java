import java.util.Scanner;

public class FindVowelsAndConsonants {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) { // Check if it's a letter
            char lowerChar = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch; // Convert to lowercase
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the result
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        input.close(); // Close the scanner
    }
}
