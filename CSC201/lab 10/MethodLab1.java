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


import java.util.Scanner;

public class MethodLab1 
{
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
    
    public static void greeting()
    {
        Scanner inPut = new Scanner(System.in);
        
        String title, firstName, lastName;
        
        System.out.println("Please enter your tiltle, first name and last name.");
                
        title = inPut.next();
        firstName = inPut.next(); 
        lastName = inPut.next();
        
        System.out.println("\n" + title + " "+ firstName + " " + lastName + "\n");
        
        
    }
     
    public static int Max(int num1, int num2)
    {
        int Max = Math.max(num1, num2);
        
        return Max;
    }
    
    public static void main(String[] args) 
    {
        printHeading();
        
        greeting();
        
        int number1, number2;
        
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
        
        int greater = Max(number1,number2);
                       
        System.out.println("The greater integer is " + greater);
    }
    
}
