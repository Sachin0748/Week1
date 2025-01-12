public class NumberChecker4 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }

    // Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // The number is a Duck number if it contains any non-zero digit
            }
        }
        return false; // If all digits are zero, it's not a Duck number
    }

    public static void main(String[] args) {
        int number = 12021;  // Sample number, can be taken as user input
        
        // Store digits of the number in an array
        int[] digits = storeDigits(number);
        
        // Display the count of digits
        System.out.println("Number of digits: " + countDigits(number));
        
        // Reverse the digits and display the reversed number
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();
        
        // Check and display if the number is a palindrome
        if (isPalindrome(digits)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
        // Check and display if the number is a duck number
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck number.");
        } else {
            System.out.println("The number is not a Duck number.");
        }
    }
}
