// Create class CheckLargest to check which number is the largest among three
import java.util.Scanner;

class CheckLargest {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
		// Enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Enter the third number
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check which number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Print the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    
		// Close the Scanner
        input.close();
	
	}
}
