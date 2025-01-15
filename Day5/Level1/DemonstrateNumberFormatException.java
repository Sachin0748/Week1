import java.util.Scanner;

class DemonstrateNumberFormatException {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw a NumberFormatException because the text is not a valid number
        // We are trying to parse a non-numeric string to an integer
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }

    // Method to demonstrate handling of NumberFormatException
    public static void NumberFormatExceptionDemonstrate(String text) {
        try {
            // This will throw NumberFormatException if the text is not a valid number
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("NumberFormatException Demonstrated: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("RuntimeException Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter a string to parse as a number: ");
        String text = input.nextLine();

        // Call the method to generate the NumberFormatException
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException generated in the method
            System.out.println("NumberFormatException generated: " + e.getMessage());
        }

        // Call the method to demonstrate handling the NumberFormatException
        NumberFormatExceptionDemonstrate(text);

        // Close the Scanner
        input.close();
    }
}
