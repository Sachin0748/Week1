import java.util.Scanner;

public class DistributionOfChocolate {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;  // Division for chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren;  // Modulus for remaining chocolates

        // Return both the quotient (chocolates per child) and remainder (remaining chocolates)
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find chocolates per child and remaining chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output the results
        System.out.println("Each child gets: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
