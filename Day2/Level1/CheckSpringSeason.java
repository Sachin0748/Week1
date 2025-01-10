// Create class CheckSpringSeason to check if a date falls within the Spring season
import java.util.Scanner;

public class CheckSpringSeason {
    public static void main(String[] args) {
    
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the month (1-12)
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        // Ask the user to enter the day (1-31)
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Check if the date falls in the Spring Season
        boolean isSpring = false;

        // Check if the month and day fall between March 20 and June 20 (Spring season)
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) ||   
            (month == 5 && day >= 1 && day <= 31) ||   
            (month == 6 && day >= 1 && day <= 20)) 
        {   
            isSpring = true;
        }

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the scanner
        input.close();
    }
}
