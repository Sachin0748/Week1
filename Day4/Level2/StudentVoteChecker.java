import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        // Validate if the age is negative
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        // Check if the age is 18 or above
        if (age >= 18) {
            return true; // Can vote
        } else {
            return false; // Cannot vote
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        // Define an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take input for the age of all 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote and display the result
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}
