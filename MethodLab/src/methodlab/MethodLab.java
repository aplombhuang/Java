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

package methodlab;

import java.util.Scanner;

public class MethodLab 
{
    private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 10 MethodLab");
         System.out.println("Calculating diameter, circumference or area according to user's numeric input of a radius.");
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
        
        System.out.println("\n" + title +" "+ firstName +" " + lastName + "\n");
        
        
    }
     
    public static int Max(int num1, int num2)
    {
        int Max = Math.max(num2, num1);
        
        return Max;
    }
    
    public static void main(String[] args) 
    {
        printHeading();
        
        greeting();
        
        
        
    }
    
}
