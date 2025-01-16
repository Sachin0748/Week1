import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date format patterns
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display the current date in different formats
        System.out.println("Current Date in Format 1 (dd/MM/yyyy): " + currentDate.format(format1));
        System.out.println("Current Date in Format 2 (yyyy-MM-dd): " + currentDate.format(format2));
        System.out.println("Current Date in Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}
