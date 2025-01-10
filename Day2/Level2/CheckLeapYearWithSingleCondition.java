// Create a class CheckLeapYearWithSingleCondition to determine if a year is a leap year using a single if condition
import java.util.Scanner;

public class CheckLeapYearWithSingleCondition {

    public static void main(String[] args) {
        // Create Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Enter the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using a single if condition
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be greater than or equal to 1582, the start of the Gregorian calendar.");
        }

        // Close scanner
        scanner.close();
    }
}
