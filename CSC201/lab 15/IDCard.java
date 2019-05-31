/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 15: IDCard
 * This program is a sub-class of the class Card.
 * This lab is for us to practise using sub-class
 * ********************************************************************
 */

public class IDCard extends Card
{
  private String idNumber;
  
  public IDCard(){super(); idNumber = "";}
    
  public IDCard(String name, String id){super(name); idNumber = id;}
  
  public String getID(){return idNumber;}
  
  public String format()
  {
    String info = "ID Card: \n";
    
    info = info + "Card holder: " + getName() + "\n";
    
    info = info + "ID Number : " + getID() + "\n";
    
    return info ; 
  }  
    
}