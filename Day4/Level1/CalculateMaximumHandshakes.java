import java.util.Scanner;

public class CalculateMaximumHandshakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the number of possible handshakes
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maximumHandshakes);
    }
}
