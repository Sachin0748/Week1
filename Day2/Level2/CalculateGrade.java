// Create a class CalculateGrade to determine the grade and remarks based on the percentage
import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        
        // Creating Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Enter marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();

        // Calculating total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;

        // Initializing grade and remarks based on percentage
        String grade;
        String remarks;

        // Checking the percentage to assign grade and remarks
        if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70 && percentage < 80) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if(percentage >= 40 && percentage < 50) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        // Print results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Closing scanner
        scanner.close();
    }
}
