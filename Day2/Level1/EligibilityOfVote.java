// Create class EligibilityOfVote to check if a person can vote based on age
import java.util.Scanner;

class EligibilityOfVote {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);

        // Enter the person's age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            // Person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
		
		// Close the Scanner
        input.close();
    }
}
