import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters

        // Loop to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop to find the first character with a frequency of 1
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return a special character if no non-repeating character is found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
