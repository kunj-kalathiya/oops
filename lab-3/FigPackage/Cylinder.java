package FigPackage;

public class Cylinder extends Figure {
  double r,h;
    Cylinder(double r,double h)
    {
    this.r=r;
    this.h=h;
    }
    void CalcArea()
    { 
     a=2*pi*r*(h+r);
    }
    void DispArea()
    {
     System.out.println("area of cylinder :"+a);
    }
    void CalcVol()
    {
     v=pi*r*r*h;
    }
    void DispVol()
    {
     System.out.println("volume of cylinder :"+v);
    }
}
