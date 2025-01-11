import java.util.Scanner;

// Create a class FindYoungestAndTallest to find youngest and tallest friends.
public class FindYoungestAndTallest {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Input the age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter the height of " + friends[i] + " in meters: ");
            heights[i] = scanner.nextDouble();
        }

        // Variables to keep track of the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find the youngest friend and the tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; 
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; 
            }
        }

        // Output the youngest and tallest friends
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " meters.");

        // Close the scanner object
        scanner.close();
    }
}
