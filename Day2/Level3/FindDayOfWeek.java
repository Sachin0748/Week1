// Create class FindDayOfWeek to determine the day of the week based on date
import java.util.Scanner;

public class FindDayOfWeek {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Enter the month (1 for January, 2 for February, etc.)
        System.out.print("Enter month: ");
        int m = input.nextInt();

        // Enter the day of the month
        System.out.print("Enter day: ");
        int d = input.nextInt();

        // Enter the year
        System.out.print("Enter year: ");
        int y = input.nextInt();

        // Apply the Zeller's congruence formula for the Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result: 0 for Sunday, 1 for Monday, etc.
        System.out.println("The day of the week is: " + d0);

        // Close the Scanner
        input.close();
    }
}
