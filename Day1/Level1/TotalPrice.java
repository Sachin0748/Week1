import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unitPrice
        System.out.print("Enter the unit price : ");
        double unitPrice = input.nextDouble();

        // Prompt the user to enter the quantity
        System.out.print("Enter the quantity : ");
        int quantity = input.nextInt();

        // Calculate the total purchase price
        double totalPurchasePrice = unitPrice * quantity;

        // Display the result
        System.out.printf("The total purchase price is INR "+ totalPurchasePrice +" if the quantity "+ quantity +" and unit price is INR " + unitPrice);

        // Close the Scanner
        input.close();
    }
}