import java.util.Scanner;

public class ConvertWeight {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create a variable weightInPounds to take input from user
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert pounds to kilograms
        double weightInKg = weightInPounds * 2.2;

        // Display the result
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);

        // Close the Scanner
        input.close();
    }
}