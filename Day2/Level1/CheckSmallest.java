// Create class CheckSmallest to check if the first number is the smallest among three
import java.util.Scanner;

class CheckSmallest {
    public static void main(String[] args) {
        // Enter the first number
        System.out.print("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();

        // Enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Enter the third number
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isSmallest);
    
		// Close the Scanner
        input.close();
	
	}
}
