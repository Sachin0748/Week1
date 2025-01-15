import java.util.Scanner;

class DemonstrateStringIndexOutOfBoundsException {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // This line will throw StringIndexOutOfBoundsException
        // We are trying to access an index equal to the length of the string,
        // which is out of bounds as valid indices range from 0 to str.length() - 1.
        System.out.println(str.charAt(str.length()));
    }

    // Method to demonstrate handling StringIndexOutOfBoundsException
    public static void StringIndexOutOfBoundsExceptionDemonstrate(String str) {
        try {
            // This line will throw StringIndexOutOfBoundsException
            // Again, we try to access an index that is out of bounds (str.length())
            System.out.println(str.charAt(str.length())); 
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception and display a message when it is thrown
            System.out.println("StringIndexOutOfBoundsException Demonstrated");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Enter a string
        System.out.print("Enter string: ");
        String str = input.nextLine();

        // Try to generate the exception by calling generateException()
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            // This block will be executed if a StringIndexOutOfBoundsException is thrown
            System.out.println("StringIndexOutOfBoundsException generated");
        }

        // Demonstrate handling of StringIndexOutOfBoundsException by calling StringIndexOutOfBoundsExceptionDemonstrate()
        StringIndexOutOfBoundsExceptionDemonstrate(str);

        // Close the Scanner
        input.close();
    }
}
