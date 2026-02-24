public class Vehicle {
    int speed;
    String type;
    int milage;

    Vehicle(int speed, String type,int milage) {
        this.speed = speed;
        this.type = type;
        this.milage=milage;
    }

    void displaycar()
    {
     System.out.println("car speed :"+speed);
     System.out.println("car type:"+type);
     System.out.println("car milage:"+milage);
    }
}
