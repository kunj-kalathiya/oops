 abstract class Figure { 
   double a,v;
   double pi= 3.1420;
    abstract void CalcArea();
    abstract void CalcVol();
    abstract void DispArea();
    abstract void DispVol(); 
}

  class Cone extends Figure {
    double r,h,s ;
   
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
  class Sphere extends Figure{
    double r,h;
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
  class Cylinder extends Figure{
    double r,h;
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


public class Demo {
    public static void main(String[] args) {
        Cone c =  new Cone() ;
        c.r=12;
        c.h=5;
        c.s=4;
        c.CalcArea();
        c.DispArea();
        c.CalcVol();
        c.DispVol();

        Sphere sp =new Sphere() ;
        sp.r=12;
        sp.h=5;
        sp.CalcArea();
        sp.DispArea();
        sp.CalcVol();
        sp.DispVol();
         
        Cylinder cy = new Cylinder();
        cy.r=12;
        cy.h=5;
        cy.CalcArea();
        cy.DispArea();
        cy.CalcVol();
        cy.DispVol();
        
    }
}
