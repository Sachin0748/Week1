import java.util.Scanner;

class StringCharacterComparison {

    // Method to return the characters in a string as a character array without using toCharArray()
    static char[] getCharactersWithoutToCharArray(String str) {
        char[] characters = new char[str.length()]; // Create a character array of the same length as the string
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i); // Copy each character from the string to the array
        }
        return characters;
    }

    // Method to compare two character arrays
    static boolean compareCharacterArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Get characters using the user-defined method
        char[] userDefinedCharacters = getCharactersWithoutToCharArray(inputString);
        System.out.println("Characters using user-defined method: " + new String(userDefinedCharacters));

        // Get characters using the built-in toCharArray() method
        char[] builtInCharacters = inputString.toCharArray();
        System.out.println("Characters using built-in toCharArray(): " + new String(builtInCharacters));

        // Compare the two character arrays
        boolean areEqual = compareCharacterArrays(userDefinedCharacters, builtInCharacters);

        // Display the result of the comparison
        if (areEqual) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("The character arrays are not equal.");
        }

        scanner.close(); 
    }
}
