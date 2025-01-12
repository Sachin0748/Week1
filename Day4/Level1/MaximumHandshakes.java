import java.util.Scanner;

public class MaximumHandshakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maximumHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maximumHandshakes);
    }

    // Method to calculate the maximum number of handshakes using the formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
