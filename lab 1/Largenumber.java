
import java.util.Scanner;

public class Largenumber {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter two number");
     int a= sc.nextInt();
     int b = sc.nextInt();  
      sc.close();
      
     if(a>b) 
     {
      System.out.println(a+" is larger");      
     }
     if(a<b) 
     {
      System.out.println(b+" is larger");      
     }
     if(a==b) 
     {
      System.out.println("the number are equal");      
     }
  }
}