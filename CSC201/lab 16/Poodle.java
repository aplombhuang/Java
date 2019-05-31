/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 16: Poodle
 * This program is a sub-class of the Dog class.
 * This lab is to let us practice implementing interface.
 * ********************************************************************
 */

public class Poodle extends Dog implements Fancy, Pet
{
  private String color; private String myName = "Programming student Name: Aplomb Huang";
  
  public Poodle(String str1, String str2, double num1, double num2){super(str2, num1, num2); color = str1; }
  
  public void sleep(){System.out.println(super.getName() + "is sleeping.");}
  
  public void groom(){System.out.println(super.getName() + "should be groomed.");}
  
  public void feed(){System.out.println(super.getName() + "is hungry.");}
  
  public void walk(){System.out.println(super.getName() + "is ready to go outside!!!.");}
 
  public String toString(){String str1 = myName + "\nDog " + super.toString() + "\nColor: " + color; return str1;}
}