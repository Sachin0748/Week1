import java.util.Scanner;

class DemonstrateArrayIndexOutOfBoundsException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing an index larger than the length of the array will cause ArrayIndexOutOfBoundsException
        System.out.println(names[5]);  // Array length is less than 6, this will throw the exception
    }

    // Method to demonstrate handling of ArrayIndexOutOfBoundsException
    public static void ArrayIndexOutOfBoundsExceptionDemonstrate(String[] names) {
        try {
            // Trying to access an index larger than the array size
            System.out.println(names[5]);  // This will generate ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException Demonstrated: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("RuntimeException Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Define an array of names with a fixed size
        String[] names = new String[3];

        // Take user input to populate the array
        System.out.println("Enter 3 names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        // Call the method to generate the ArrayIndexOutOfBoundsException
        try {
            generateException(names); // This will generate an exception since we're accessing index 5
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException generated in the method
            System.out.println("ArrayIndexOutOfBoundsException generated: " + e.getMessage());
        }

        // Call the method to demonstrate handling the ArrayIndexOutOfBoundsException
        ArrayIndexOutOfBoundsExceptionDemonstrate(names);

        // Close the Scanner
        input.close();
    }
}
