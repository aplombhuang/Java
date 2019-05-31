public class Rectangle
{
  private double length, width;
  
  public Rectangle(){length = 1.0; width = 1.0;}
  
  public Rectangle(double aLength, double aWidth)
  {
    setLength(aLength); setWidth(aWidth);
  }
  
  public double getLength()  { return length; }
  
  public double getWidth() {return width;}
  
  public void setLength(double aLength)
  {
    if(aLength<0){throw new IllegalArgumentException("Length cannot be zero.");}
    
    else{length = aLength;} 
  }
  
  public void setWidth(double aWidth)
  {
    if(aWidth<0){throw new IllegalArgumentException("Length cannot be zero.");}
    
    else{width = aWidth;} 
  }
  
  public double getArea(){double area = length* width; return area;}
  
  public double getPerimeter(){double perimeter = 2*(length+width); return perimeter;}
  
  public String toString()
  {
    String output;
        
        output = "Length is: " + length + " and width is: " + width;
        
        output = output + "\nArea is: " + getArea();
        
        output = output + "\nPerimeter is: " + getPerimeter() + "\n";
        
        return output;
  }
}