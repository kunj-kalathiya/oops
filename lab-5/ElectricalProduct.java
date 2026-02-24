class Product
{
    int ProductId;
    String Name;
    String CategoryId;
    int price;

    Product(int productId, String name, String categoryId, int unitPrice) {
        this.ProductId = productId;
        this.Name = name;
        this.CategoryId = categoryId;
        this.price = unitPrice;
    }

}
class ElectricalProduct extends Product
{
    ElectricalProduct(int productId, String name, String categoryId, int unitPrice) {
         super(productId, name, categoryId, unitPrice);
    }
    int Voltagerange;
    int Wattage;

     void updateSpecs(int newWattage, int newPrice) {
        this.Wattage = newWattage;
        this.price = newPrice;
     }

      public  void displayDetails() {
        System.out.println("----- Electrical Product Details -----");
        System.out.println("ID:         " + ProductId);
        System.out.println("Name:       " + Name);
        System.out.println("Categor     " + CategoryId);
        System.out.println("Wattage:    " + Wattage + "W");
        System.out.println("Unit Price:   $" + price);
    }
    public static void main(String[] args) {
       
      ElectricalProduct ep= new ElectricalProduct(01,"fan" , "A01", 1200);
      ep.updateSpecs(400,1000);
      ep.displayDetails();
      ep.updateSpecs(350, 1100);
      System.out.println("after update detail");
      ep.displayDetails();
 }
}










