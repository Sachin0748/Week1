import java.util.Scanner;

// Creating Class with name DoubleOperation to compute and display double operations
class DoubleOperation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
       double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Compute the integer operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print the results
        System.out.println("The results of double Operations are:" + "a + b * c = " + result1 + " a * b + c = " + result2 + " c + a / b = " + result3 + " a % b + c = " + result4);

        // Close the scanner
        input.close();
    }
}
