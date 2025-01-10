import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take weight and height input from the user
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double height = scanner.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine weight status based on BMI value
        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
