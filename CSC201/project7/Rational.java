/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 7: Rational
 * The program is a class for RationalDriver, 
 * It is a class to take in numerator and denominator of rational number
 * This class contains method to carry out calculation with the rational numbers
 *      like addition, subtraction, multiplication, division
 * all results of the calculation will convert to string for main class to display
 * This class also contains method to check if 2 rational numbers are equal
 * ********************************************************************
 */

public class Rational
{
  private int numerator, denominator; //instance variable
  
  /**
   * Default constructor for Rational that sets numerator to 0, denominator to 1
   */
  
  public Rational(){numerator = 0; denominator = 1;} //default constructor
  
  /**
   * Parameterized constructor for a rational number
   * @para numer   numerator
   * @para denom   denominator
   */
  
  public Rational(int numer, int denom){setNumer(numer); setDenom( denom);} //constructor with parameter
  
  public int getNumer(){return numerator;} // accessor method(getter)
  
  public int getDenom(){return denominator;}
  
  /**
   * sets numerator of the Rational number
   * @para aNumer  a Rational number's numerator
   */ 
  
  public void setNumer(int aNumer){numerator = aNumer; } // mutator method(setter)
  
  /**
   * sets denominator of the Rational number
   * @para aDenom  a Rational number's denominator
   */ 
  
  public void setDenom(int aDenom){normalize(aDenom); }
  
  public void normalize(int denom) // another mutator method that move the "-" from the denominator to numerator
  { 
    if(denom<0){ denominator = denom*(-1); numerator = numerator*(-1);}
    
    else{denominator = denom; }
  }
  
  public String add(Rational r2) //this is a method to carry out addition of the 2 rational numbers
  {
    int denom, numer; 
    
    if(this.getDenom() == r2.getDenom()){numer = this.getNumer() + r2.getNumer(); denom = this.getDenom();}
    
    else{    denom = this.getDenom() * r2.getDenom();
    
      numer =( this.getDenom() * r2.getNumer()) + (r2.getDenom() * this.getNumer()) ;}
    
    if(denom<0){ denom = denom*(-1); numer = numer*(-1);}
    
    String str  = "Result of addition is: " + numer + "/" + denom;
    
      if(Math.abs(numer)>= denom) 
    {
      int remains = numer % denom;
       
      if(remains == 0){str = str + ", which equals to " + numer/denom;}
      
    }else if(numer == 0){str = str + ", which equals to 0"; }
    return str;
  }
  
  public String subtract(Rational r2) //this is a method to carry out subtraction of the 2 rational numbers
  {
   int denom,numer;
    
    if(this.getDenom() == r2.getDenom()){numer = this.getNumer() - r2.getNumer(); denom = this.getDenom();}
    
    else{    denom = this.getDenom() * r2.getDenom();
    
    numer = (r2.getDenom() * this.getNumer()) - ( this.getDenom() * r2.getNumer()) ;}
    
    if(denom<0){ denom = denom*(-1); numer = numer*(-1);}
     
    String str = "Result of subtraction is: " + numer + "/" + denom;
    
      if(Math.abs(numer)>= denom) 
    {
      int remains = numer % denom;
       
      if(remains == 0){str = str + ", which equals to " + numer/denom;}
      
    }
      else if(numer == 0){str = str + ", which equals to 0"; }
    
    return str;
   }
  
  public String multiply( Rational r2) //this is a method to carry out multiplication of the 2 rational numbers
  {
     int denom = this.getDenom() * r2.getDenom();
    
    int numer =  this.getNumer() * r2.getNumer () ;
    
    if(denom<0){ denom = denom*(-1); numer = numer*(-1);}
     
    String str = "Result of multiplication is: " + numer + "/" + denom;
    
    if(Math.abs(numer)>= denom) 
    {
      int remains = numer % denom;
       
      if(remains == 0){str = str + ", which equals to " + numer/denom;}
      
    }else if(numer == 0){str = str + ", which equals to 0";}
        
    return str;
  }
  
  public String divide(Rational r2) //this is a method to carry out division of the 2 rational numbers
  {
    String str = "";
    
    if(r2.getNumer() !=0){
    int denom = (this.getDenom() * r2.getNumer());
    
    int numer =  (this.getNumer() * r2.getDenom ()) ;
    
    if(denom<0){ denom = denom*(-1); numer = numer*(-1);}
    
    str = "Result of multiplication is: " + numer + "/" + denom;
    
      if(Math.abs(numer)>= denom) 
    {
      int remains = numer % denom;
       
      if(remains == 0){str = str + ", which equals to " + numer/denom;}
      
    }else if(numer == 0){str = str + ", which equals to 0";}
    
    return str; 
  }
    else{return str = "Due to a 0 numerator, this calculation cannot be completed."; }
  }
  
  public boolean equals(Object obj) // this is the method to check if 2 rational numbers are equal
  {
    if(this == obj){return true;} // Reference equality
    
    if(!(obj instanceof Rational)){ return false;} // not object of the same class.
    
    Rational other = (Rational)obj;
    
       if((this.getNumer()* other.getDenom())==(this.getDenom()*other.getNumer())) {return true;}  
      
       else{ return false;}
  }
  
  /* 
  * @return The rational number information for this Rational
  */
  
  public String toString()
  {
     String str  = "The rationnal number is: " + numerator + "/" + denominator;
    
    if(numerator>= denominator) 
    {
      int remains = numerator % denominator;
       
      if(remains == 0){str = str + ", which equals to " + numerator/denominator;}
      
    }else if(numerator == 0){str = str + ", which equals to 0";}
    return  str;
  }
  
}