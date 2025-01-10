// Create a class FindYoungestAndTallest to find the youngest and tallest among three friends
import java.util.Scanner;

public class FindYoungestAndTallest {
    public static void main(String[] args) {
        
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the age and height of Amar
        System.out.print("Enter the age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = input.nextInt();

        // Enter the age and height of Akbar
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();

        // Enter the age and height of Anthony
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend (minimum age)
        String youngestFriend = "";
        int youngestAge = ageAmar;
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        } else if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        } else {
            youngestFriend = "Amar";
        }

        // Find the tallest friend (maximum height)
        String tallestFriend = "";
        int tallestHeight = heightAmar;
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        } else if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        } else {
            tallestFriend = "Amar";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        // Close the scanner
        input.close();
    }
}
