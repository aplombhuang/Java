/**********************************************************************
 * @Author: Aplomb TR Huang
 * student ID: 6856925
 * CSC201-01PR
 * Spring 2016
 * instructor: Debra Duke
 * Project Program 6: Circle
 * This program is a self-created class. 
 * According to the code in CircleDriver.java, which is precreated by
 * instructor,the Circle class should contain the following methods:
 * getRadius, getDiameter, getCircumference, getArea, setRadius, toString;
 * 
 */

public class Circle {
    private double radius;// instance variable
    
    /**
     * Default constructor of Circle is set to be 0.0;
     */
    
    public Circle(){radius = 0.0;}
    
    public Circle (double aRadius){ setRadius(aRadius); }
   
    public double getRadius(){return radius;} //accessor method (getter)
        /**
  * this getter returns the radius of this Circle
  * @return double
  */
    
    public void setRadius(double newRadius) // mutator method (setter)
    {
        if(newRadius <0)
        {
            throw new IllegalArgumentException("Radius can not be negative.");
        }
        radius = newRadius;
    }
  /**
  * Sets the radius of the Circle
  * @param newRadius  is whatever number passes to this method
  * @throws IllegalArgumentException invalid radius arguments
  *      if radius is negative
  */

   
    public double getDiameter(){double diameter = radius * 2; return diameter; }
    /**
  * this getter returns the diameter of this Circle
  * @return double
  */
    
    public double getCircumference(){double Circom = 2 * radius * Math.PI; return Circom;}
    /**
  * this getter returns the circumference of this Circle
  * @return double
  */
    
    public double getArea(){double area = radius * radius * Math.PI; return area;}
        /**
  * this getter returns the area of this Circle
  * @return double
  */
    
    public String toString()
    {
        String output;
        
        output = "Radius is: " + radius;
        
        output = output + "\n\tDiameter is: " + getDiameter();
        
        output = output + "\n\tCircomference is: " + getCircumference();
        
        output = output + "\n\tArea is: " + getArea() + "\n";
        
        return output;
    }
  /** 
  * @return The radius, diameter, circumference, and area for this Circle
  */

}
