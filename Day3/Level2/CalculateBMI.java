// Create a class CalculateBMI to calculate BMI and determine weight status
import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get user's weight in kilograms (kg)
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        // Get user's height in centimeters (cm)
        System.out.print("Enter your height in centimeters (cm): ");
        double heightInCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine weight status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the calculated BMI and the weight status
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Your weight status is: " + status);

        // Close the scanner to free resources
        scanner.close();
    }
}
