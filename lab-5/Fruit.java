class Fruit {
    // 1. Attributes
    String name;
    String type; // Single or Bunch
    double price;

    // 2. Constructor
    public Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // 3. Method to display attributes
    public void displayFruit() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Type: " + type);
        System.out.println("Price:      " + price);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // Creating 2 objects of Fruit class
        Fruit f1 = new Fruit("Apple", "Single", 120.00);
        Fruit f2 = new Fruit("Banana", "Bunch", 40.00);

        // Displaying their attributes
        f1.displayFruit();
        f2.displayFruit();
    }
}