import java.util.Scanner;

public class Rounds {

    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3) {
        // Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Calculate total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;
        
        // Calculate the number of rounds (rounding up to the nearest whole number)
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three sides of the triangle
        System.out.print("Enter the length of the first side (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side (in meters): ");
        double side3 = scanner.nextDouble();

        // Call the method to calculate rounds
        int rounds = calculateRounds(side1, side2, side3);

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
    }
}
