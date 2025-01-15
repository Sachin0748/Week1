import java.util.Scanner;

public class CharacterType {

    // Method to classify a character as Vowel, Consonant, or Not a Letter
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

    // Method to classify all characters in a string
    public static String[][] classifyCharacters(String str) {
        int length = str.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacter(ch); // Store the classification
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayClassification(String[][] classifiedData) {
        System.out.printf("%-15s %-15s%n", "Character", "Type");
        System.out.println("----------------------------------");

        for (String[] entry : classifiedData) {
            System.out.printf("%-15s %-15s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Classify the characters
        String[][] classifiedData = classifyCharacters(text);

        // Display the classification results
        displayClassification(classifiedData);

        input.close(); // Close the scanner
    }
}
