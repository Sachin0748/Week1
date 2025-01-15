import java.util.Scanner;

class DemonstrateIllegalArgumentException {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        // This will throw an IllegalArgumentException because the start index is greater than the end index
        // Calling substring() with start index greater than end index
        System.out.println(str.substring(5, 2)); // Invalid range, start index (5) > end index (2)
    }

    // Method to demonstrate handling IllegalArgumentException
    public static void IllegalArgumentExceptionDemonstrate(String str) {
        try {
            // This will throw IllegalArgumentException because the start index is greater than the end index
            System.out.println(str.substring(5, 2)); // Invalid range, start index (5) > end index (2)
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("IllegalArgumentException Demonstrated: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other runtime exception
            System.out.println("RuntimeException Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter string: ");
        String str = input.nextLine(); // Use nextLine() to capture the entire string

        // Call the method to generate the IllegalArgumentException
        try {
            generateException(str);
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException generated in the method
            System.out.println("IllegalArgumentException generated: " + e.getMessage());
        }

        // Call the method to demonstrate handling the RuntimeException
        IllegalArgumentExceptionDemonstrate(str);

        // Close the Scanner object to prevent resource leak
        input.close();
    }
}
