public class Circle {
    private double radius;
    
    public Circle(){radius = 0.0;}
    
    public Circle (double aRadius){ setRadius(aRadius); }
    
    public double getRadius(){return radius;}
    
    public void setRadius(double newRadius)
    {
        if(newRadius <0)
        {
            throw new IllegalArgumentException("Radius can not be negative.");
        }
        radius = newRadius;
    }
   
    public double getDiameter(double radius){double diameter = radius * 2; return diameter; }
    
    public double getCircomference(double radius){double Circom = 2 * radius * Math.PI; return Circom;}
    
    public double getArea(double radius){double area = radius * radius * Math.PI; return area;}
    
    public String toString()
    {
        String output;
        
        output = "Radius is: " + radius;
        
        output = output + "\nDiameter is: " + getDiameter(radius);
        
        output = output + "\nCircomference is: " + getCircomference(radius);
        
        output = output + "\nArea is: " + getArea(radius);
        
        return output;
    }
    
}
