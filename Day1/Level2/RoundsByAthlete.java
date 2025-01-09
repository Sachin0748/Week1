import java.util.Scanner;

public class RoundsByAthlete {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the lengths of the sides of the triangle
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Distance the athlete wants to complete in meters (5 km)
        double totalDistance = 5 * 1000;

        // Calculate the number of rounds to complete the total distance
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.printf("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        // Close the scanner
        input.close();
    }
}
