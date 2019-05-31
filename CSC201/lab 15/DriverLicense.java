/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 15: DriverLicense
 * This program is a sub-class of the IDCard class.
 * This lab is to let us practice creating sub-class
 * ********************************************************************
 */

import java.util.*;

public class DriverLicense extends IDCard
{
   
  Calendar date = Calendar.getInstance();
  
  private int currentYr = date.get(Calendar.YEAR);
  
  private int year;
  
  public DriverLicense(){super(); year = 2016;}
    
  public DriverLicense(String name, String id, int aYear){super(name, id); setYear(aYear);}
  
  public int getYear(){return year;}
  
  public void setYear(int aYear)
  {
    if(aYear < 0){throw new IllegalArgumentException("Year cannot be nagative.");}
    
    else{year = aYear;}
  }
  
  public boolean isExpired()
  {
    if(year < currentYr){return true;} 
    
    else {return false;} 
  }
  
  
  public String format()
  {
    String info = "ID Card: \n";
    
    info = info + "Card holder: " + getName() + "\n";
    
    info = info + "ID Number: " + getID() + "\n";
    
    info = info + "Expiration: " + getYear() + "\n";
    
    return info ; 
  }  
    
}


  