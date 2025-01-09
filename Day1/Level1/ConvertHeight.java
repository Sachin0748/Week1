import java.util.Scanner;

public class ConvertHeight {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to feet
        double heightInFeet = heightInCm * 0.0328084;

         // Convert height from centimeters to inches
        double heightInInches = heightInCm * 0.393701;

        // Print the height in cm, feet, and inches
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and in inches is " + heightInInches);

        // Close the scanner
        input.close();
    }
}
