import java.util.Scanner;

class  Drivingcost
{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter total mile driven per day");
    double mile=sc.nextDouble();

    System.out.println("enter cost per gallon");
    double cost=sc.nextDouble();

    System.out.println("enter mile per gallon");
    double mpg=sc.nextDouble();

    System.out.println("avarage fees per day");
    double avg_fee=sc.nextDouble();

    System.out.println("enter toll fee");
    double toll=sc.nextDouble();
    sc.close();

    double fuelcost=(mile/mpg)*cost;
    double totalcost=fuelcost+avg_fee+toll;

    System.out.println("user cost per day of driving to work :"+totalcost);
 }
}