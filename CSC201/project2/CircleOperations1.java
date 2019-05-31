
/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 2: CircleOperations
 * The program will prompt user for a number input as radius, 
 * and then calculate and print the diameter, circumference or area
 * according to the radius user has entered.
 * ********************************************************************
 */

import java.util.Scanner;

public class CircleOperations 
{
    private static void printHeading()
   {
       System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("This is Programing Project 2");
         System.out.println("Calculating diameter, circumference or area according to user's numeric input of a radius.");
         System.out.println("");
   }
    
    
    public static void main(String[] args) 
    {
       printHeading();
       
       Scanner inPut = new Scanner(System.in); //this is the method for recording user input
       
       double radius = 0.0;
       
       System.out.println("Please enter the radius.");
       
       if(inPut.hasNextDouble())
       {
         radius = inPut.nextDouble();
         
         System.out.println("");
       }
       else
       {
       System.out.println("You did not enter a number, which is not valid, the program can't help you for now, sorry. BYE. ");
       
       System.exit(0);
       }
       
       /* the if else statements are used to prevent invalid entries from user from crashing the program.
        * the inPut.hasNextDouble will check whether the input is number or not.
        */
       
       if(radius < 0)
       {
       System.out.println("You entered a negative number, to prevent error and crashing the program is forced to quit. BYE. ");
       
       System.exit(0);
       }
       
       else{
       
       System.out.println("The radius you entered is " + radius + "\n" );
       
       	}
       
       /* 
        * this if else statements are used to prevent logical errors, since a radius can't be negative
        */
       
       double diameter = 2*radius; 
       
       double crcmf = diameter*Math.PI;//crcmf is circumference
       
       double area = radius*radius* Math.PI;
       
       
       String rea = "A"; String circom = "C"; String diam = "D";
       
       String choice = ""; // this variable stores user choice letter input
       
      
       System.out.println("Please choose what you want to calculate: type in A for area, C for circomference, or D for diameter:");
       
       choice = inPut.next();//I did not use has.Next() because whatever the input, the program will store as a string, so it won't find out what is wrong.
           
       System.out.println("");
           
             
       if(choice.equalsIgnoreCase(rea))
       {
         System.out.printf("According to the radius you entered, the area of the circle with radius " + radius + " is %.3f \n ", area ); //I used the printf method to limit the result to 3 decimal places 
            
       }else if(choice.equalsIgnoreCase(circom))
        
            {
              System.out.printf("According to the radius you entered, the circumference of the circle with radius " + radius + " is %.3f \n ", crcmf); //I used the printf method to limit the result to 3 decimal places
       
            }else if(choice.equalsIgnoreCase(diam))
            
            {
                System.out.printf("According to the radius you entered, the diameter of the circle with radius " + radius + " is %.2f \n", diameter); //I used the printf method to limit the result to 2 decimal places
            
            }else
            {
            	System.out.println("You did not picked any of those three choices, the program doesn't know what to do, bye now.");
            	
            	System.exit(0);
            
            	}
            
       
       System.out.println("");
       System.out.println("The program will end now. Thank you for using CircleOperation. Goodbye. :-) ");
       
       
       
    } 
              
    }
    

