import java.util.Random;

public class CalculateBonus {

    // Method to generate random salary and years of service for each employee
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2]; // 2D array to store salary and years of service

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate random salary between 10000 and 99999
            employeeData[i][0] = random.nextInt(90000) + 10000;
            // Generate random years of service between 1 and 15
            employeeData[i][1] = random.nextInt(15) + 1;
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus based on the years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] result = new double[employeeData.length][3]; // 2D array to store old salary, new salary, and bonus

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for employees with less than or equal to 5 years of service
            }

            double newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus in the result array
            result[i][0] = oldSalary; // old salary
            result[i][1] = newSalary; // new salary
            result[i][2] = bonus; // bonus
        }

        return result;
    }

    // Method to calculate total sum of old salary, new salary, and total bonus
    public static void calculateTotalSalariesAndBonus(double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculate the totals
        for (int i = 0; i < result.length; i++) {
            totalOldSalary += result[i][0];
            totalNewSalary += result[i][1];
            totalBonus += result[i][2];
        }

        // Display the results in tabular format
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10d%-15.2f%-15.2f%-15.2f\n", i + 1, result[i][0], result[i][1], result[i][2]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        // Number of employees
        int numberOfEmployees = 10;

        // Step 1: Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Step 2: Calculate new salary and bonus
        double[][] result = calculateNewSalaryAndBonus(employeeData);

        // Step 3: Calculate and display total salary and bonus
        calculateTotalSalariesAndBonus(result);
    }
}
