import java.util.Scanner;

// Create a class UniversityFee to calculate the discount amount and discounted price
public class UniversityFee {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the university fee
        System.out.print("Enter the university fee for the course (INR): ");
		
		// Create a variable fee to take input university fee for the course from the user
        int fee = input.nextInt();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
		
		// Create a variable discountPercent  take inpute discount percentage
        int discountPercent = input.nextInt();

        // Calculate the discount amount
        int discount = fee * discountPercent / 100;

        // Calculate the discounted fee the student has to pay
        int discountedFee = fee - discount;

        // Print the discount amount and final discounted fee
        System.out.println("The discount amount is INR " + discount + " and the final discounted fee is INR " + discountedFee);

        // Close the scanner
        input.close();
    }
}
