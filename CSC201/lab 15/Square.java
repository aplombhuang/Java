public class Square extends Rectangle
{
  public Square(){super();}
  
  public Square (double side)  {    super(side, side);  }
  
  public double getSide(){return super.getLength();}
  
  public void setSide(double aSide){super.setLength(aSide); super.setWidth(aSide);}
  
  public String toString(){return "Side: " + getSide();}
  
  
}