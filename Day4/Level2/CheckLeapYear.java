import java.util.Scanner;

public class CheckLeapYear {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4 but not divisible by 100, or if it is divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;  // It's a leap year
        }
        return false;  // It's not a leap year
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (should be >= 1582 for Gregorian calendar)
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582 (Gregorian calendar). Exiting...");
            return;
        }

        // Check if the year is a leap year
        boolean isLeap = isLeapYear(year);

        // Output the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
