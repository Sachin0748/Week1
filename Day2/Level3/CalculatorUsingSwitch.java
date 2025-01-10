// Create a calculator using switch-case to perform basic arithmetic operations
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {

        // Create a scanner object to take input
        Scanner input = new Scanner(System.in);

        // Enter the first number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        // Enter the second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
		
        // Enter the operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        // Perform the operation based on the operator using switch-case
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If operator is invalid
                System.out.println("Invalid operator.");
                break;
        }

        // Close the scanner object
        input.close();
    }
}
