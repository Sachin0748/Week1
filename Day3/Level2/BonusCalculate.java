import java.util.Scanner;

// Create a class BonusCalculate to perform the calculation of employee bonus
public class BonusCalculate {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salary, years of service, bonus, and new salary for 10 employees
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to input salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    // Input salary for employee
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] <= 0) {
                        System.out.println("Salary must be a positive number. Please enter again.");
                        continue;
                    }

                    // Input years of service for employee
                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Years of service cannot be negative. Please enter again.");
                        continue;
                    }

                    break; // Break the loop if input is valid
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                    scanner.nextLine(); // Clear the buffer
                }
            }
        }

        // Loop to calculate bonus, new salary, and total amounts
        for (int i = 0; i < 10; i++) {
            double bonus = 0;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = salaries[i] * 0.02; // 2% bonus for employees with 5 or fewer years of service
            }

            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;

            // Accumulate total values
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the scanner object
        scanner.close();
    }
}
