package calculator;
import java.util.Scanner;

public class Opration{
      double a;
      double b;    
      public void inputnumer(){
      System.out.println("enter two number");  
      Scanner sc = new Scanner(System.in);
       a = sc.nextDouble();
       b = sc.nextDouble();
      sc.close();
      }

      public double sum()
      {
        return a+b;
        
      }
      public double diffrence()
      {
        return a-b;
      }
      public double multiplication()
      {
        return a*b;
      }
      public double division()
      {
        return a/b;
      }
    
}


