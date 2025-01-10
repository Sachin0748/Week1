// Create class CheckNumber to check if a number is positive, negative, or zero
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Create a Scanner for taking input
        Scanner input = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Close the Scanner
        input.close();
    }
}
