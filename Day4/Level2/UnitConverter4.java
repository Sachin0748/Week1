import java.util.Scanner;

public class UnitConverter4 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input value for kilometers, miles, meters, and feet
        System.out.print("Enter value in kilometers: ");
        double km = scanner.nextDouble();
        System.out.print("Enter value in miles: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();
        System.out.print("Enter value in feet: ");
        double feet = scanner.nextDouble();

        // Convert kilometers to miles
        double milesFromKm = convertKmToMiles(km);
        // Convert miles to kilometers
        double kmFromMiles = convertMilesToKm(miles);
        // Convert meters to feet
        double feetFromMeters = convertMetersToFeet(meters);
        // Convert feet to meters
        double metersFromFeet = convertFeetToMeters(feet);

        // Display the results of conversions
        System.out.println(km + " kilometers is equal to " + milesFromKm + " miles.");
        System.out.println(miles + " miles is equal to " + kmFromMiles + " kilometers.");
        System.out.println(meters + " meters is equal to " + feetFromMeters + " feet.");
        System.out.println(feet + " feet is equal to " + metersFromFeet + " meters.");
    }
}
