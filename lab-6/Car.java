class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }

    void show() {
        System.out.println("Vehicle type: " + type);
    }
}

public class Car extends Vehicle {
    String type;
    int speed;

    Car(String vehicleType, String carType, int speed) {
        super(vehicleType);     // "Four Wheeler"
        this.type = carType;    // "SUV"
        this.speed = speed;
    }

    void display() {
        System.out.println("Car type : " + this.type);       // prints SUV
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "SUV", 120);
        c.display();
        c.show(); // calls method from Vehicle class
    }
}