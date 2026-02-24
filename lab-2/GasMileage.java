import java.util.Scanner;

public class GasMileage {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMiles = 0.0;
        double totalGallons = 0.0;

        // Sentinel-controlled loop
        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();

            if (miles == -1) {
                break; 
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            // Calculate miles per gallon for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate combined MPG
            double combinedMPG = totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", combinedMPG);
        }

        System.out.println("Program terminated.");
        input.close();
    }
}
