import java.util.Scanner;

public class NumberOfHandshake {
    public static void main(String[] args) {
        //Taking user input
        Scanner input = new Scanner(System.in);

        //taking total number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + maximumHandshakes);

        
        input.close();
    }
}