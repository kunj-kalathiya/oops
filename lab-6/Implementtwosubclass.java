// Abstract class
abstract class Car {

    int speed = 100;   // instance variable

    // Concrete method
    void displaySpeed() {
        System.out.println("Car Speed: " + speed);
    }

    // Abstract methods
    abstract void avg();
    abstract void model();
}


// Subclass 1
class Maruti extends Car {

    void avg() {
        System.out.println("Maruti Average: 20 km/l");
    }

    void model() {
        System.out.println("Model: Maruti Swift");
    }
}


// Subclass 2
class Santro extends Car {

    void avg() {
        System.out.println("Santro Average: 18 km/l");
    }

    void model() {
        System.out.println("Model: Hyundai Santro");
    }
}


// Main class
public class Implementtwosubclass {

    public static void main(String[] args) {

        Car c;   // Reference of abstract class

        // Referring to Maruti object
        c = new Maruti();
        c.displaySpeed();
        c.avg();
        c.model();

        System.out.println("-------------------");

        // Referring to Santro object
        c = new Santro();
        c.displaySpeed();
        c.avg();
        c.model();
    }
}