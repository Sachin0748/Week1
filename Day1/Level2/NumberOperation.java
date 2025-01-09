import java.util.Scanner;

// Creating Class with name NumberOperation to calculate and display the quotient and remainder
class NumberOperation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate the quotient
        int quotient = number1 / number2;

        // Calculate the remainder
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2 + ".");

        // Close the scanner
        input.close();
    }
}
