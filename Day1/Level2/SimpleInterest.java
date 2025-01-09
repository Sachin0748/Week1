import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        // Enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        // Enter the time in years
        System.out.print("Enter the time in years: ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.printf("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + " and Time " + time);

        // Close the scanner
        input.close();
    }
}
