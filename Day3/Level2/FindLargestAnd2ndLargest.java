import java.util.Scanner;

// Create a class FindLargestAnd2ndLargest to find the largest and second largest digits from a number
public class FindLargestAnd2ndLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Maximum digits to store
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract the digits from the number and store them in the array
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;  // Remove the last digit
            index++;  // Increment the index
        }

        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        if (largest != -1 && secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
    }
}
