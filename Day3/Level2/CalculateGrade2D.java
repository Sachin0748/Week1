import java.util.Scanner;

public class CalculateGrade2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create a 2D array to store marks of students
        // Rows represent students, columns represent subjects (Physics, Chemistry, Maths)
        int[][] marks = new int[numberOfStudents][3];  
        
        // Arrays to store calculated data for each student
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Input marks for Physics
            System.out.print("Enter marks in Physics: ");
            marks[i][0] = scanner.nextInt();

            // Input marks for Chemistry
            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = scanner.nextInt();

            // Input marks for Maths
            System.out.print("Enter marks in Maths: ");
            marks[i][2] = scanner.nextInt();
        }

        // Process marks to calculate percentages, grades, and remarks
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks for the current student
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];

            // Calculate percentage based on total marks (out of 300)
            percentages[i] = (totalMarks / 300.0) * 100;

            // Determine grade and remarks based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";  // Grade A for percentages 80 and above
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";  // Grade B for percentages between 70 and 79
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";  // Grade C for percentages between 60 and 69
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";  // Grade D for percentages between 50 and 59
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";  // Grade E for percentages between 40 and 49
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";  // Grade R for percentages below 40
                remarks[i] = "Remedial standards";
            }
        }

        // Display the results for each student
        System.out.println("\nResults:");

        for (int i = 0; i < numberOfStudents; i++) {
            // Print results for the current student
            System.out.printf("\nStudent %d:%n", i + 1);  // Display student number
            System.out.printf("Percentage: %.2f%%%n", percentages[i]);  // Display percentage
            System.out.println("Grade: " + grades[i]);  // Display grade
            System.out.println("Remarks: " + remarks[i]);  // Display remarks
        }
    }
}
