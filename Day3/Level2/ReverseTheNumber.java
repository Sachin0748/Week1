import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Create an array to store the digits
        int[] digits = new int[count];
        temp = number;

        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display the digits in reverse order
        System.out.print("The digits of the number in reverse order are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
