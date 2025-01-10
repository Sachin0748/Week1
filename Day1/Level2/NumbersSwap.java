import java.util.Scanner;

// Creating Class with name NumbersSwap to swap two numbers
class NumbersSwap {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
