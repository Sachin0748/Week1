import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess between the lower and upper bounds
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Method to get the user's feedback on the guess
    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess (H)igh, (L)ow, or (C)orrect? ");
        String str = scanner.nextLine();
        scanner.close();
        return str.toUpperCase();
    }

    // Main game method
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        // Display the game instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");

        // Set the initial bounds
        int lowerBound = 1;
        int upperBound = 100;

        int guess = 0;
        int attempts = 0;

        while (true) {
            // Generate the computer's guess
            guess = generateGuess(lowerBound, upperBound);
            attempts++;

            // Display the guess and ask for feedback
            System.out.println("My guess is: " + guess);
            String feedback = getFeedback();

            // Process the feedback and adjust the bounds accordingly
            if (feedback.equals("C")) {
                System.out.println("Yay! I guessed your number in " + attempts + " attempts!");
                break; // End the game if the guess is correct
            } else if (feedback.equals("H")) {
                upperBound = guess - 1; // Adjust the upper bound if the guess is too high
            } else if (feedback.equals("L")) {
                lowerBound = guess + 1; // Adjust the lower bound if the guess is too low
            } else {
                System.out.println("Invalid feedback! Please enter H, L, or C.");
            }
        }
        scanner.close();

    }

    public static void main(String[] args) {
        playGame(); // Start the game
    }
}
