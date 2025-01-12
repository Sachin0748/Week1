import java.util.Arrays;

public class RandomNumber {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        // Generate 4-digit random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;  // Generate numbers between 1000 and 9999
        }
        
        return numbers;
    }

    // Method to find the average, minimum, and maximum of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        double sum = 0;
        
        int min = numbers[0];
        int max = numbers[0];
        
        // Calculate sum and find min/max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        // Calculate average
        result[0] = sum / numbers.length;  // Average
        result[1] = min;  // Minimum
        result[2] = max;  // Maximum
        
        return result;
    }

    public static void main(String[] args) {
        int size = 5; // Generate 5 random 4-digit numbers
        
        // Generate the array of 4-digit random numbers
        int[] numbers = generate4DigitRandomArray(size);
        
        // Find average, min, and max
        double[] stats = findAverageMinMax(numbers);
        
        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(numbers));
        System.out.println("Average value: " + stats[0]);
        System.out.println("Minimum value: " + stats[1]);
        System.out.println("Maximum value: " + stats[2]);
    }
}
