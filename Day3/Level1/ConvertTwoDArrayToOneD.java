import java.util.Scanner;

public class ConvertTwoDArrayToOneD {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns for the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Validate the input
        if (rows <= 0 || columns <= 0) {
            System.out.println("Error: Rows and columns must be positive integers.");
            return;
        }

        // Create a 2D array and take user input for its elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; 
            }
        }

        // Display the elements of the 1D array
        System.out.println("Elements of the 1D array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}
