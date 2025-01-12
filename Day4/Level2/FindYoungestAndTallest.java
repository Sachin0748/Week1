import java.util.Scanner;

public class FindYoungestAndTallest {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }

        // Return the name of the youngest friend based on the index
        String[] friends = {"Amar", "Akbar", "Anthony"};
        return friends[youngestIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights) {
        int tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Return the name of the tallest friend based on the index
        String[] friends = {"Amar", "Akbar", "Anthony"};
        return friends[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for ages
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + (i == 0 ? "Amar: " : i == 1 ? "Akbar: " : "Anthony: "));
            ages[i] = scanner.nextInt();
        }

        // Take input for heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the height of " + (i == 0 ? "Amar: " : i == 1 ? "Akbar: " : "Anthony: "));
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest friend
        String youngest = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
