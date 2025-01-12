import java.util.Scanner;

public class FindSmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Find the smallest number
        smallest = (number1 < number2 && number1 < number3) ? number1 : (number2 < number3 ? number2 : number3);

        // Find the largest number
        largest = (number1 > number2 && number1 > number3) ? number1 : (number2 > number3 ? number2 : number3);

        // Return the results as an array
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find the smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
