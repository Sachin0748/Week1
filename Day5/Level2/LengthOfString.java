import java.util.Scanner;

public class LengthOfString {

    // Method to find the length of a string
    public static int findLengh(String str) {
		// Initialize variables to track index and count
        int i = 0, count = 0; 

        try {
			// Infinite loop to check each character
            while (true) { 
				// Access the character at index 'i'
                str.charAt(i);
                i++;
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // This block will execute when the index goes out of bounds
            System.out.println("Length calculated..");
        }

		 // Return the total count as the length of the string
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter string : ");
        String str = input.nextLine(); 

        // Call the method to find the length of the string
        int length = findLengh(str);

        // Print the length of the string
        System.out.println("Length of string is : " + length);
    }
}
