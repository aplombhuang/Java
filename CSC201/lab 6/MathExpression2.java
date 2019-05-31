/*
 * Aplomb TR Huang, ID#6856925
 * CSC201-01PR, SPRING 2016
 * MathExpressions2
 * This program is for us to practise how to 
 * use the calculation operators to perform 
 * unit conversion from C to F
 * 
 */

import java.util.Scanner;

public class MathExpression2
{
  private static void printHeading ()
  {
	  System.out.println("My name is Aplomb TR Huang");
      System.out.println("My student ID is 6856925");
      System.out.println("My course is: CSC201-01PR, Spring 2016");
      System.out.println("My instructor is Debra Duke");
      System.out.println("Lab6");
      System.out.println("use alculation operators to perform unit conversion C to F");
      System.out.println("");
  }
    
  public static void main(String[] args)
   {
	  
      Scanner inPut = new Scanner(System.in);
	  
	  int cel = 0; double fah = 0; //these are variable for the 2 degrees, celsius is interger as required
	  
	  System.out.println("Please enter the temperature of Celsius and be sure it's a whole number.");
      
      if(inPut.hasNextInt())
      {
        cel = inPut.nextInt();
        
        System.out.println("");
      }
      else
      {
      System.out.println("You did not enter a whole number, which is not valid, the program can't help you for now, sorry. BYE. ");
      
      System.exit(0);
      }
      
      /* the if else statements are used to prevent invalid entries from user from crashing the program.
       * the inPut.hasNextInt will check whether the input is an interger or not.
       * since temperatures can be negative, there's no need to check if the user enters a negative number.
       */
      
      fah = ((double)cel)*9 /5 + 32; //cast method is used to turn the interger celsius to double for calculation use.
      
      System.out.println("You entered " + cel + " degree celsius, which equals to " + fah + " degree Fahrenheit. \n");
              
	  System.out.println("The program will end now, thank you.");
	  
   }
   
}
   
   