 class Figure {

    double r,v,a;
     void dispArea()
    {
        System.out.println("area :"+a);
    }
     void dispVolume()
    {
        System.out.println("volume :"+v);
    }
}

class Cone extends Figure {

    double h,s;
     void calcArea()
    {
      a=(Math.PI*r*s)+(Math.PI*r*r);
    }
     void calcVol()
    {
      v=(Math.PI*r*s)/3;
    }
    
}
public class InheritenceDemo {

    public static void main(String[] args) {
    
    Cone c = new Cone();
    c.r=-12;
    c.s=6;
    c.h=13;
    
    c.calcArea();
    c.calcVol();

    c.dispArea();
    c.dispVolume();
    }
}