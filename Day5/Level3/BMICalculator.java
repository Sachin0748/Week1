import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and determine the status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        int numPersons = data.length;
        String[][] bmiResults = new String[numPersons][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < numPersons; i++) {
            double weight = data[i][0]; // weight in kg
            double height = data[i][1] / 100; // Convert height from cm to meters

            double bmi = weight / (height * height);
            bmi = Math.round(bmi * 100.0) / 100.0; // Round BMI to 2 decimal places

            bmiResults[i][0] = String.valueOf(data[i][1]); // Height in cm
            bmiResults[i][1] = String.valueOf(weight);     // Weight in kg
            bmiResults[i][2] = String.valueOf(bmi);        // BMI
            bmiResults[i][3] = getStatus(bmi);             // BMI Status
        }

        return bmiResults;
    }

    // Method to determine BMI status based on the BMI value
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) {
            return "UnderWeight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "OverWeight";
        } else {
            return "Obese";
        }
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------");

        for (String[] result : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", result[0], result[1], result[2], result[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPersons = 10;
        double[][] data = new double[numPersons][2]; // First column: weight, second column: height

        // Input weight and height for 10 persons
        System.out.println("Enter weight (in kg) and height (in cm) for " + numPersons + " persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMIAndStatus(data);

        // Display the results
        displayResults(bmiResults);

        scanner.close();
    }
}
