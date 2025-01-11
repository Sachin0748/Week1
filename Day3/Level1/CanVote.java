import java.util.Scanner;

//Class to determine if students are eligible to vote based on their age.
 
public class CanVote {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define an array to store the ages of 10 students
        int[] studentAge = new int[10];

        // Input the ages of 10 students
        for (int i = 0; i < studentAge.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAge[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAge.length; i++) {
            if (studentAge[i] < 0) {
                // Invalid age case
                System.out.println("Invalid age");
            } else if (studentAge[i] >= 18) {
                // Eligible to vote
                System.out.println("The Student with the age " + studentAge[i] + " can vote.");
            } else {
                // Not eligible to vote
                System.out.println("The Student with the age " + studentAge[i] + " cannot vote.");
            }
        }

        // Close Scanner object
        input.close();
    }
}
