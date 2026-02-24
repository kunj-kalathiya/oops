import java.util.Scanner;
class Point3D {
    int x, y, z;   // Data members
    // Constructor 1: Origin (0,0,0)
    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Constructor 2: Arbitrary point
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method to input coordinates
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.print("Enter z: ");
        z = sc.nextInt();
        sc.close();
    }

    // Method to display coordinates
    void display() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }

    // Method to calculate distance between two points
    double distance(Point3D p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        int dz = this.z - p.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {

        // Origin point
        Point3D p1 = new Point3D();

        // Arbitrary point
        Point3D p2 = new Point3D(3, 4, 5);
        p2.input();
        p1.display();
        p2.display();

        // Distance between p1 and p2
        double dist = p1.distance(p2);
        System.out.println("Distance between points: " + dist);
    }
}