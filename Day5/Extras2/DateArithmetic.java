import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Formatter for input and output dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);
        System.out.println("Original Date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + modifiedDate.format(formatter));

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 Weeks: " + finalDate.format(formatter));

        // Close the scanner
        scanner.close();
    }
}
