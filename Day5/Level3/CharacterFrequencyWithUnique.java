import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Method to find characters that appear only once in the string
    public static String[][] findUniqueCharacters(String str) {
        int length = str.length();
        int[] frequency = new int[256]; // ASCII character set
        
        // Calculate frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[str.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] == 1) {
                uniqueCount++;
            }
        }

        // Store unique characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) {
                result[index][0] = String.valueOf(currentChar);
                result[index][1] = String.valueOf(1); // Frequency of unique character is always 1
                frequency[currentChar] = 0; // Mark character as processed
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency table
    public static void displayFrequency(String[][] frequencyData) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("------------------------");

        for (String[] entry : frequencyData) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters and their frequencies
        String[][] uniqueCharacters = findUniqueCharacters(input);

        // Display the unique characters
        if (uniqueCharacters.length > 0) {
            displayFrequency(uniqueCharacters);
        } else {
            System.out.println("No unique characters found.");
        }

        scanner.close();
    }
}
