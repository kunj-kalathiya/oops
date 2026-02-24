import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r,d;
        double a,circumference;
        System.out.println("enter radius");
        r=sc.nextInt();
        sc.close();
        d=2*r;
        a=3.14159*r*r;
        circumference =2*3.14159*r;
         System.out.println("diameter:"+d);
         System.out.println("area:"+a);
         System.out.println("circumference"+circumference);
    }   
}
