import java.util.Scanner;

public class Numberopration {
    public static void main(String[] args) {
       
      Scanner sc=new Scanner(System.in);
       System.out.println("enter three integer");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       sc.close();
      
       System.out.println("sum: "+(a+b+c));
       System.out.println("average: "+(a+b+c)/3);
       System.out.println("product: "+a*b*c);

       if(a>b)
       {
        if(a>c) System.out.println(a+" is biggest");
        else    System.out.println(c+" is biggest");
        if(b>c) System.out.println(c+" is smallest");
        else    System.out.println(b+" is smallest");
       }
       else
       {
        if(b>c) System.out.println(b+" is biggest");
        else    System.out.println(c+" is biggest");
        if(a>c) System.out.println(c+" is smallest");
        else    System.out.println(a+" is smallest");
       }
   }
}
