package FigPackage;

public class Sphere extends Figure {
double r,h;
    Sphere(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    void CalcArea()
    { 
     a=2*pi*r*r;
    }
    void DispArea()
    {
     System.out.println("area of sphere :"+a);
    }
    void CalcVol()
    {
    v=(4*pi*r*r*h)/3;
    }
    void DispVol()
    {
     System.out.println("volume of sphere :"+v);
    }
}
