/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 10: MethodLab
 * This program contains 3 methods besides the main method
 * one is printHeading, one is greeting and the other is Max
 * The purpose is for us to practice creating and calling method
 * ********************************************************************
 */

//import java.io.*;
import java.util.Scanner;

public class MethodLab {
  
  private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 10 MethodLab");
         System.out.println("To practice creating and calling method");
         System.out.println("");
    }
  
   public static void main(String[] args) {
     
     printHeading();
     
     // variable declarations for part 1
     String title;
     String firstName;
     String lastName;
     Scanner in = new Scanner(System.in);
     
     // prompt for input for part 1
     System.out.print("Enter a title:");
     title = in.next();
     System.out.print("Enter your first name:");
     firstName = in.next();     
     System.out.print("Enter a your last name:");
     lastName = in.next();
     
     // call the method for part 1
     greeting(title, firstName, lastName);
     
     // variable declarations for part 2
     int number1;
     int number2;
     
     /* user prompts for part 2
     System.out.print("Enter first number:");
     number1 = in.nextInt();
     System.out.print("Enter second number:");
     number2 = in.nextInt();
     */
     
     System.out.println("Please enter an interger.");
        
        Scanner inPut = new Scanner(System.in);
        
         while(!inPut.hasNextInt())
         { 
          System.out.println("Error, you did not enter an interger,please re-enter an interger.");
          
          inPut = new Scanner(System.in);
         }
        
        number1 = inPut.nextInt(); 
        
        System.out.println("Please enter another interger.");
        
        inPut = new Scanner(System.in);
        
         while(!inPut.hasNextInt())
         { 
          System.out.println("Error, you did not enter an interger,please re-enter an interger.");
          
          inPut = new Scanner(System.in);
         }
         
        number2 = inPut.nextInt();
     
     // call the method for part 2 inside the println statement
     System.out.println("The largest number is " + max(number1, number2));
 }
   
 /******************** greeting method goes here*********************/
  
  public static void greeting(String title, String firstName, String lastName)
    {
        System.out.println("\n Dear " + title + " "+ firstName + " " + lastName + "\n");
        
     }   
  
  /***********************end of method*************************/
  
  /******************** max method goes here*********************/
  
  public static int max(int num1, int num2)
    {
        int greater = Math.max(num1, num2);
        
        return greater;
    }
  
  /***********************end of method*************************/
   
}