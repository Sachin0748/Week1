import java.util.Arrays;

public class NumberChecker3 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sumOfDigits = sumOfDigits(digits);
        return originalNumber % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 possible digits (0-9)
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Store digit in the first column
            frequency[i][1] = 0; // Initialize frequency to 0
        }
        
        for (int digit : digits) {
            frequency[digit][1]++; // Increment frequency for the digit
        }
        
        // Return only digits that appear (skip rows with frequency 0)
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                count++;
            }
        }
        
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index++] = frequency[i];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int number = 21;  // Sample number, can be taken as user input
        
        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        
        // Display the count of digits
        System.out.println("Number of digits: " + countDigits(number));
        
        // Find and display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        
        // Find and display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        
        // Check if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(digits, number));
        
        // Find and display the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit Frequency: ");
        for (int[] entry : digitFrequency) {
            System.out.println("Digit: " + entry[0] + ", Frequency: " + entry[1]);
        }
    }
}
