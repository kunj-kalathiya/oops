class X
{
    int i,j;
    X(int i,int j)
    {
     this.i=i;
     this.j=j;
    }
    int Finalsum()
    {
        return i+j;
    }
}

class Y extends X
{
  Y(int i,int j)
  {
    super(i, j);
  }
  int Findproduct()
  {
    return i*j;
  }
}

class Z extends Y
{
  Z(int i,int j)
  {
    super(i,j);
  }
  int Diffrence()
  {
    return i-j;
  }
}

public class MultilevelInheritenceDemo {
    public static void main(String[] args) {
        
        Z z=new Z(3, 4);
       System.out.println("diffrence :"+ z.Diffrence());
       System.out.println("sum :"+z.Finalsum()); 
       System.out.println("product :"+z.Findproduct()); 
    }
}
