package First_Test;


/*@author: Aplomb TR Huang; V00800816
 *@Course Info: CMSC 355 Spring 2017 
 *@Program project3: To learn how to use J-Unit testing
 * 
 * This class contains methods to:
 * normalize a rational number, 
 * check if user entered a zero for denominator,
 * rational number operations: add, subtract, multiply, divide
 * check if divide by zero error occurs
 * 
 */

public class Rational {

	private int numerator;
	private int denominator;
	
	/**
	 * default constructor
	 */
	public Rational (){} 
	
	/**
	 * constructor with parameters
	 * @param numer takes in an integer and store as numerator,
	 * @param denom takes in an integer and store as denominator;
	 */
	public Rational (int numer, int denom){	setNumer(numer); setDenom(denom); Checker(); }
		
	/**
	 * 	
	 * @param numer the numerator to set
	 */
	public void setNumer(int numer){numerator = numer;}
	
	
	/**
	 * 
	 * @param denom the denominator to set
	 */
	public void setDenom(int denom){denominator = denom;}
	
	
	/**
	 * 
	 * @return numerator
	 */
	public int getNumer(){return numerator;}
	
	
	/**
	 * 
	 * @return denominator
	 */
	public int getDenom(){return denominator;}
	
	
	/**
	 *  this method normalize the sign of the rational number
	 *  and check, if denominator would be zero, Illegal argument exception would be thrown
	 */
	public void Checker()
	{
		if(denominator == 0){throw new IllegalArgumentException("Denominator cannot be zero.");}
		
		else if(denominator < 0 && numerator > 0 ){denominator = (-1)*denominator; numerator = (-1)* numerator;}
		
		else if(numerator < 0 && denominator < 0 ){denominator = (-1)*denominator; numerator = (-1)* numerator;}
		
		else if(denominator < 0 && numerator == 0){ denominator = (-1)* denominator;}
	}
		
	/**
	 * @param rtnl is the rational number as an object
	 * operation is addition, 
	 */
	public void add(Rational rtnl)
	{  
		int denom1 = rtnl.getDenom(); int numer1 = rtnl.getNumer();
		
		this.numerator = ((this.numerator * rtnl.getDenom()) + (rtnl.getNumer() * this.denominator));
				
		this.denominator = this.denominator * rtnl.getDenom(); 
	
		}
	/**
	 * @param rtnl is the rational number as an object
	 * operation is subtraction, 
	 */
	public void subtract(Rational rtnl)
	{ 	
		int denom1 = rtnl.getDenom(); int numer1 = rtnl.getNumer();
		
		this.numerator = ((this.numerator * rtnl.getDenom()) - (rtnl.getNumer() * this.denominator));
				
		this.denominator = this.denominator * rtnl.getDenom(); 
	
		}
	
	/**
	 * @param rtnl is the rational number as an object
	 * operation is multiplication, 
	 */
	public void multiply(Rational rtnl)
	{ 	
		int denom1 = rtnl.getDenom(); int numer1 = rtnl.getNumer();
		
		this.numerator = this.numerator * rtnl.getNumer();
				
		this.denominator = this.denominator * rtnl.getDenom(); 
		
		
		}
	/**
	 * 
	 * @param rtnl is the rational number as an object
	 * operation is division, 
	 * if denominator would be zero, Illegal argument exception would be thrown
	 * 
	 */
	public void divide(Rational rtnl)
	{ 	
		int denom1 = rtnl.getDenom(); int numer1 = rtnl.getNumer();
		
		if(numer1 == 0){throw new IllegalArgumentException("Cannot perform calculation: divide by zero.");}
		
	    else{ this.numerator = (this.numerator * rtnl.getDenom());
				
	    this.denominator = this.denominator *rtnl.getNumer() ; }
		
		}
	/**
	 * 
	 * @param rtnl is the rational number as an object
	 * @return true if two rational numbers are equal, false if not equal
	 * 
	 */
	public boolean equals(Rational rtnl)
	{boolean equal = false; 
	
	    
	    int left = this.numerator * rtnl.getDenom();
	    
	    int right = rtnl.getNumer() * this.denominator;
	    
	    if(left == right){equal = true;}
	
		return equal;
	}
	/**
	 * @ return a string showing the rational number
	 */
	public String toString()
	{String str = getNumer() + "/" + getDenom();
	
	return str;
		
	}
		
		
	}
	
	
