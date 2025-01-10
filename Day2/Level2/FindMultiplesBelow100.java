// Create a class FindMultiplesBelow100 to find all multiples of a number below 100
import java.util.Scanner;

public class FindMultiplesBelow100 {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the number to find its multiples
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 100 down to 1 to find multiples of the number
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i); 
            }
        }

        // Close the scanner
        input.close();
    }
}
