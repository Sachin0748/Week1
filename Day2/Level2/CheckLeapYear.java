// Create a class CheckLeapYear to check whether a year is a leap year or not
import java.util.Scanner;

public class CheckLeapYear { 

    public static void main(String[] args) {
        // Create Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Enter the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // First part: Using multiple if-else statements
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582, the start of the Gregorian calendar.");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Second part: Using a single if statement with logical operators
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close scanner
        scanner.close();
    }
}
