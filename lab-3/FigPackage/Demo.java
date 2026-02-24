package FigPackage;

public class Demo {
 public static void main(String[] args) {
     Cone c =  new Cone(4,5) ;
     c.CalcArea();
     c.DispArea();
     c.CalcVol();
     c.DispVol();

     Cylinder cy = new Cylinder(6,7);
     cy.CalcArea();
     cy.DispArea();
     cy.CalcVol();
     cy.DispVol();

     Sphere sp =new Sphere(8,9) ;
     sp.CalcArea();
     sp.DispArea();
     sp.CalcVol();
     sp.DispVol();


 }
}
