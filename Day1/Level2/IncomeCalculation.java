import java.util.Scanner;

// Creating Class with name IncomeCalculation to calculate total income
class IncomeCalculation {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Enter the salary
        System.out.print("Enter the salary in INR: ");
        double salary = input.nextDouble();

        // Enter the bonus
        System.out.print("Enter the bonus in INR: ");
        double bonus = input.nextDouble();

        // Compute the total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);

        // Close the scanner
        input.close();
    }
}
