// Create class DivisibilityCheck to check if a number is divisible by 5
import java.util.Scanner;

class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the number
		System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    
		// Close the Scanner
        input.close();
	
	}
}
