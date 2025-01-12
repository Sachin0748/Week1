import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder of a division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Division operator for quotient
        int remainder = number % divisor;  // Modulus operator for remainder

        // Return the quotient and remainder in an array
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter two numbers
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
