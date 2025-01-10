import java.util.Scanner;

// Creating Class with name IntOperation to compute and display integer operations
class IntOperation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        System.out.print("Enter the value of c: ");
        int c = input.nextInt();

        // Compute the integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Print the results
        System.out.println("The results of Int Operations are:" + "a + b * c = " + result1 + " a * b + c = " + result2 + " c + a / b = " + result3 + " a % b + c = " + result4);

        // Close the scanner
        input.close();
    }
}
