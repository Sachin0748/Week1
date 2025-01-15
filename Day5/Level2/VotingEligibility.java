import java.util.Scanner;

public class VotingEligibility {

    // Method to take user input for ages of students
    public static int[] getAgesFromUser(int numStudents) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[numStudents];
        System.out.println("Enter the ages of " + numStudents + " students:");

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D array with age and eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        int numStudents = ages.length;
        String[][] results = new String[numStudents][2];

        for (int i = 0; i < numStudents; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);

            if (age < 0) {
                results[i][1] = "Invalid";
            } else if (age >= 18) {
                results[i][1] = "Can vote"; 
            } else {
                results[i][1] = "Cannot vote";
            }
        }

        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote");
        System.out.println("-------------------------");

        for (String[] result : results) {
            System.out.printf("%-10s %-15s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10; // Fixed number of students as per the prompt

        // Enter age
        int[] ages = getAgesFromUser(numStudents);

        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display the results in tabular format
        displayResults(eligibilityResults);
    }
}
