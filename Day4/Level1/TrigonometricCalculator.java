import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an object of TrigonometricCalculator to calculate trigonometric functions
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Call the method to calculate sine, cosine, and tangent
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.printf("Sine of %.2f degrees: %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f%n", angle, results[2]);
    }
}
