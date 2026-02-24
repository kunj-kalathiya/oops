import java.util.Scanner;

public class Intrest {
    static double principal;
    static double intrestrate;
    static int month;
    static double intrest;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount of principal: ");
        principal=sc.nextDouble();
        System.out.println("enter interest rate");
        intrestrate = sc.nextDouble();
        System.out.println("enter time period(in month)");
        month=sc.nextInt();
        intrest=((principal*intrestrate*month)/12)/100;
        System.out.println("total intrest:"+intrest);
        System.out.println("total amount :"+(intrest+principal));
        sc.close();
    }
    
    
}
