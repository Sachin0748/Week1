import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards, 1 yard = 3 feet)
        double distanceInMiles = distanceInFeet / (1760 * 3);

		// Convert feet to centimeters
        double distanceInCm = distanceInFeet * 30.48;

        // Convert feet to inches
        double distanceInInches = distanceInFeet * 12;
		
        // Print the distance in feet, yards, and miles
        System.out.printf("Your Height in cm is " + distanceInCm + " while in feet is " + distanceInFeet + " and inches is " + distanceInInches);

        // Close the scanner
        input.close();
    }
}
