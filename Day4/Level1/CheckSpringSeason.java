import java.util.Scanner;

public class CheckSpringSeason {

    // Method to check if the given date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season: March 20 to June 20
        if ((month == 3 && day >= 20) ||  
            (month == 4) ||               
            (month == 5) ||               
            (month == 6 && day <= 20)) {  
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter month
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Enter day
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        // Call the method to check if it's Spring season
        boolean result = isSpringSeason(month, day);

        // Output based on the result
        if (result) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
