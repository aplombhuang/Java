/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 15 : DebitCard
 * This program is a sub-class of a given class called Card.
 * This labe is to let us practice using sub-class
 **********************************************************************
 */

public class DebitCard extends Card
{
   private String pin, cardNumber;
  
  public DebitCard(){super(); cardNumber = ""; pin = "";}
    
  public DebitCard(String name, String number, String pin){super(name); cardNumber = number; this.pin = pin;}
  
  public String getPin(){return pin;}
  
  public String getCardNumber() {return cardNumber;} 
  
  public String format()
  {
    String info = "ID Card: \n";
    
    info = info + "Card holder: " + getName() + "\n";
    
    info = info + "Card Number: " + getCardNumber() + "\n";
    
    info = info + "Pin: " + getPin() + "\n";
    
    return info ; 
}

}