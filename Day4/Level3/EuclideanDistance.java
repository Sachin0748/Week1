import java.util.Scanner;

public class EuclideanDistance {

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using Math.pow() and Math.sqrt() to calculate the distance
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of the line using two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];

        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b)
        double b = y1 - (m * x1);

        // Store slope and y-intercept in the array
        equation[0] = m; // Slope
        equation[1] = b; // Y-Intercept

        return equation;
    }

    public static void main(String[] args) {
        // Create scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two points (x1, y1) and (x2, y2)
        System.out.println("Enter the coordinates of the first point (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Call method to calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the two points: " + distance);

        // Call method to calculate the line equation (slope and y-intercept)
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double m = lineEquation[0];  // Slope
        double b = lineEquation[1];  // Y-Intercept

        // Display the equation of the line in the form y = mx + b
        System.out.println("Equation of the line: y = " + m + "x + " + b);

        // Close the scanner
        scanner.close();
    }
}
