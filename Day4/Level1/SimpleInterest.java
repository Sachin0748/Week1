import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Enter the Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        // Enter the Time in years
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f years.%n", 
                          simpleInterest, principal, rate, time);
    }
}
