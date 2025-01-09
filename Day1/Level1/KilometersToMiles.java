import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
		
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create a variable named as km to store the distance in kilometers
        double km;

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers : ");
        km = input.nextInt();

        // Create a variable named as miles to convert the distance in miles
        double miles = km / 1.6;

        // Print the result
        System.out.printf("The total miles is " + miles +" mile for the given " + km + " km");

        // Close the scanner
        input.close();
    }
}
