package FigPackage;

public class Cone extends Figure{
  double r,h,s ;
  public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }
   
     void CalcArea()
    { 
     s= Math.sqrt(r*r+h*h);
     a=pi*r*(r+s);
    }
    void DispArea()
    {
     System.out.println("area of cone :"+a);
    }
    void CalcVol()
    {
     v=(pi*r*r*h)/3;
    }
    void DispVol()
    {
     System.out.println("volume of cone :"+v);
    }
}

