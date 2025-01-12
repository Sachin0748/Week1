import java.util.Scanner;

public class CheckNumber {

    // Method to check whether a number is positive, negative, or zero
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1; 
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check the number's sign
        int result = checkNumberSign(number);

        // Display the result based on the returned value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
