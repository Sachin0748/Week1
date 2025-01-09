import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = input.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = input.nextDouble();

		//convert height in centimeters
		double heightInCm = heightInInches * 0.393701;
		
		//convert height in feet
		double heightInFeet = heightInInches * 0.03328084;

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * baseInInches * heightInInches;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaInCm = areaInInches * 2.54 * 2.54;

        // Print the area in square inches and square centimeters
        System.out.printf("Your Height in cm is " + heightInCm + "While in feet is " + heightInFeet + " ad inches is " + heightInInches);

        // Close the scanner
        input.close();
    }
}
