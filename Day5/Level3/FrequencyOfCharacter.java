import java.util.Scanner;

public class FrequencyOfCharacter {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters

        // Loop to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charFrequency[currentChar]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = String.valueOf(charFrequency[i]); // Frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
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

        // Find character frequency
        String[][] frequencyData = findCharacterFrequency(input);

        // Display the result
        displayFrequency(frequencyData);

        scanner.close();
    }
}
