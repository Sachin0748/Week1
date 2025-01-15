import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
        char[] characters = str.toCharArray(); // Convert string to character array
        int[] frequency = new int[characters.length]; // Array to store frequency
        boolean[] processed = new boolean[characters.length]; // Array to track processed characters

        // Calculate frequency using nested loops
        for (int i = 0; i < characters.length; i++) {
            if (!processed[i]) { // If character is not yet processed
                frequency[i] = 1; // Initialize frequency to 1
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j] && characters[j] != '0') {
                        frequency[i]++;
                        processed[j] = true; // Mark duplicate as processed
                    }
                }
            }
        }

        // Count non-duplicate characters
        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (!processed[i]) {
                count++;
            }
        }

        // Store results in a 1D String array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (!processed[i]) {
                result[index++] = characters[i] + " -> " + frequency[i];
            }
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayFrequency(String[] frequencyData) {
        System.out.println("Character Frequencies:");
        for (String entry : frequencyData) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find character frequencies
        String[] frequencyResults = findCharacterFrequency(input);

        // Display the results
        displayFrequency(frequencyResults);

        scanner.close();
    }
}
