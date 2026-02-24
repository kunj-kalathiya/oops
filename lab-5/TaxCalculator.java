import java.util.Scanner;

public class TaxCalculator {

    // Method to calculate tax (15% of gross pay)
    public static double calculateTax(double grossPay) {
        double taxRate = 0.15;
        return grossPay * taxRate;
    }

    // Method to calculate net pay based on hours worked
    public static double calculateNetPay(double hoursWorked) {
        double hourlyRate = 12.0;
        double grossPay = hoursWorked * hourlyRate;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double hourlyRate = 12.0;
        double grossPay = hoursWorked * hourlyRate;
        double tax = calculateTax(grossPay);
        double netPay = calculateNetPay(hoursWorked);

        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Tax: $" + tax);
        System.out.println("Net Pay: $" + netPay);

        scanner.close();
    }
}
