// Create class CalculateBonus to calculate the bonus based on years of service
import java.util.Scanner;

public class CalculateBonus {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter salary and years of service
        System.out.print("Enter the salary of the employee: ");
        double salary = input.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the years of service is greater than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = salary * 0.05;
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the scanner to free resources
        input.close();
    }
}
