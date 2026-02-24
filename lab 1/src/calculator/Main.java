package calculator;

public class Main {
    public static void main(String[] args) {
    Opration op = new Opration();
    op.inputnumer();
  
    System.out.println("sum"+op.sum());
    System.out.println("diffrence"+op.diffrence());
    System.out.println("division"+op.division());
    System.out.println("multiplication"+op.multiplication());
    }
}
