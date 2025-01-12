import java.util.Scanner;

public class UnitConverter5 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input value for yards, feet, meters, and inches for conversion
        System.out.print("Enter value in yards: ");
        double yards = scanner.nextDouble();
        System.out.print("Enter value in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();
        System.out.print("Enter value in inches: ");
        double inches = scanner.nextDouble();

        // Convert yards to feet
        double feetFromYards = convertYardsToFeet(yards);
        // Convert feet to yards
        double yardsFromFeet = convertFeetToYards(feet);
        // Convert meters to inches
        double inchesFromMeters = convertMetersToInches(meters);
        // Convert inches to meters
        double metersFromInches = convertInchesToMeters(inches);
        // Convert inches to centimeters
        double cmFromInches = convertInchesToCentimeters(inches);

        // Display the results of conversions
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");
        System.out.println(inches + " inches is equal to " + cmFromInches + " centimeters.");
    }
}
