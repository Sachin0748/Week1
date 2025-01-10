// Create class MultiplicationTable to find the multiplication table from 6 to 9
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Enter a number to find its multiplication table
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Using a for loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner to free resources
        input.close();
    }
}
