import java.util.Scanner;

public class ParkingGarageCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;

        // Sentinel-controlled loop
        while (true) {
            System.out.print("Enter hours parked (-1 to quit): ");
            double hours = input.nextDouble();

            if (hours == -1) {
                break; 
            }

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Charge for this customer: $%.2f%n", charge);
            System.out.printf("Total receipts so far: $%.2f%n%n", totalReceipts);
        }

        System.out.println("Program terminated.");
        input.close();
    }

    // Method to calculate parking charges
     static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += (hours - 3) * 0.50;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }
}

