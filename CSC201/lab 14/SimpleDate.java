/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 14 : SimpleDate
 * This program is to practice implementing and using class.
 * ********************************************************************
 */

/**Algorithms:
 * The body of the program was pre-created by Professor Duke. we just fill in the blanks 
 */

/** 
 * A class to represent a date.
*/

public class SimpleDate
{
  private int month, day, year; //instance variables
  
  /** 
  * Default constructor for a SimpleDate that sets the date to 1/1/2000
  */

  public SimpleDate()// this is a Construcotr (pre-assigned)
  {
    month = 1; day = 1; year = 2000;
  }
  
  /** 
  * Parameterized constructor for a SimpleDate 
  * @param aMonth month 
  * @param aDay   day
  * @param yr   year 
  */                     

  public SimpleDate(int aMonth, int aDay, int yr)// This is also a Constructor with parameter; 
  {
    setMonth(aMonth); setDay(aDay); setYear(yr);
  }
  
  public int getMonth()//accessor methods (getter)
  {
    return month;
  }
  
  public int getDay(){return day;}
  
  public int getyr(){return year;}
  
  /**
  * Sets the month of the SimpleDate
  * @param aMonth  a SimpleDate month
  * @throws IllegalArgumentException invalid month arguments
  */
  
  public void setMonth(int aMonth)// Mutator method(setter)
  {
    if(aMonth <1 || aMonth >12)
    {throw new IllegalArgumentException("Invalid month");}
    
    month = aMonth;
   }
   
  /**
  * Sets the day of the SimpleDate
  * @param aDay  an day name
  * @throws IllegalArgumentException invalid day arguments
  */

   public void setDay(int aDay)
  {
    if(aDay <1 || aDay >31)
    {throw new IllegalArgumentException("Invalid day");}
    
    day = aDay;
   }
   
   /**
  * Sets the year of the SimpleDate
  * @param newYear  an year name
  * @throws IllegalArgumentException year arguments less than 1
  */

   public void setYear(int newYear)
  {
    if(newYear <1)
    {throw new IllegalArgumentException("Invalid year");}
    
    year = newYear;
   }
   
   /* 
  * @return The month, day, and year information for this SimpleDate
  */
   
   public String toString()
   {
     String output;
     
     output = "\nSimpleDate: " + month + "\\" + day;
     
     output = output + "\\" + year + "\n";
     
     return output;
   }
}