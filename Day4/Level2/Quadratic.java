import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculate delta (discriminant)
        double[] roots = new double[2]; // Array to store the roots
        
        // Case 1: If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
            roots[0] = root1;
            roots[1] = root2;
        } 
        // Case 2: If delta is zero, there is one real root
        else if (delta == 0) {
            double root = -b / (2 * a);  // Single root
            roots = new double[1];  // Only one root
            roots[0] = root;
        } 
        // Case 3: If delta is negative, there are no real roots
        else {
            roots = new double[0];  // Empty array for no real roots
        }
        
        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the result
        if (roots.length == 2) {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}
