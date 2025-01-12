import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeight {

    // Method to generate random heights for 11 players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();
        
        // Generate random heights between 150 cm and 250 cm for each player
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(101) + 150; // Heights between 150 and 250
        }
        
        return heights;
    }

    // Method to find the sum of all the heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 11; // Number of players in the team
        
        // Generate the heights for 11 players
        int[] heights = generateHeights(size);
        
        // Calculate the sum, mean, shortest, and tallest
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        // Display the results
        System.out.println("Heights of the 11 football players: " + Arrays.toString(heights));
        System.out.println("Sum of all heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
