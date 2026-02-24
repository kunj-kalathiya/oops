import java.util.Scanner;

public class TheaterProfit {
  static int Ticketincome=5;
  static  int PerformanceCost=20;
  static  double CostPerPerson=0.5;
    static public int person;
    
   // make static to use directly without crating object of class
   static int CalculateIncome(int person)
    {
      return person*Ticketincome;
    }
  static  Double CalculateProfit()
    {
      return CalculateIncome(person)-PerformanceCost-person*CostPerPerson;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of number of attendees");
        person=sc.nextInt();
      System.out.println("Income :"+CalculateIncome(person));
      System.out.println("Net profit:"+ CalculateProfit());
      sc.close();
    }
}
