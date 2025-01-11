import java.util.Scanner;

// Class to calculate the mean height of players in a football team.

public class MeanOfHeight {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights of the players
        System.out.println("Enter the heights of 11 players :");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.printf("\nThe mean height of the football team is: " + mean);

        // Close Scanner object
        input.close();
    }
}
