// Invoice.java
 class Invoice {

    // Instance variables
     String partNumber;
     String partDescription;
     int quantity;
     double pricePerItem;

    // Constructor
     Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // Setters
     void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

     void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

     void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

     void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

     String getPartNumber() {
        return partNumber;
    }

     String getPartDescription() {
        return partDescription;
    }

     int getQuantity() {
        return quantity;
    }

    double getPricePerItem() {
        return pricePerItem;
    }

    // Calculate invoice amount
      double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {

        // Create Invoice object
        Invoice invoice = new Invoice("P101", "Hammer", 5, 100.0);

        // Display invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        // Test invalid values
        invoice.setQuantity(-3);
        invoice.setPricePerItem(-50);

        System.out.println("\nAfter setting invalid values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
