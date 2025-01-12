import java.util.Arrays;

public class CheckNumber {

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

    // Method to check if a number is a Duck Number (contains a non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // If a non-zero digit is found
            }
        }
        return false;  // All digits are zero
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int power = digits.length;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;  // Sample number, can be taken as user input

        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        
        // Display the count of digits
        System.out.println("Number of digits: " + countDigits(number));
        
        // Check if it's a Duck Number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        
        // Check if it's an Armstrong Number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));
        
        // Find largest and second largest elements in the digits array
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest: " + largestAndSecondLargest[1]);
        
        // Find smallest and second smallest elements in the digits array
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}
