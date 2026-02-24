import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sentinel-controlled loop
        while (true) {
            System.out.print("Enter account number (-1 to quit): ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break; 
            }

            System.out.print("Enter beginning balance: ");
            double beginningBalance = input.nextDouble();

            System.out.print("Enter total charges for the month: ");
            double charges = input.nextDouble();

            System.out.print("Enter total credits for the month: ");
            double credits = input.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = input.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.printf("New balance is: %.2f%n", newBalance);

            // Check credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.println();
        }

        input.close();
    }
}
