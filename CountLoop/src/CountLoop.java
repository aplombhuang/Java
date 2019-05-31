/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 9 part 2 CountLoop
 * The program will calculate the sum of integers from 1 to the number from user input 
 * this is training to use the while loop
 * ********************************************************************
 */

/**Algorithm:
 *input: a positive integer picked by the user
 *output: the sum of all integers from 1 to the number that the user picked.
 *first prompt the user the enter an integer, make sure it is positive integer.
 *second, initiate the starting integer 1
 *and then the loop is to add the integer 1 by 1 until the number of time this loop 
 *runs equals the number user entered
 *return sum
 */

import java.util.Scanner;

public class CountLoop 
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is Lab 9 part 2");
	         System.out.println("Calculate the sum from 1 to the number user inputs");
	         System.out.println("");
	   }
    
    public static void main(String[] args) 
    {
        printHeading();
        
        int times = 0; int loop1 = 0; //These 2 variables are used in loops counting. 
        
        int addNumber = 1; int sum = 0; int endNumber;
        
        do{
            Scanner timeIn = new Scanner(System.in); //the variable timeIn will store user input of number
            
            System.out.println("Please enter a number so that the program will calculate the sum from 1 to the number you entered. \n Please be sure the number you enter is an integer.");
            
            if(timeIn.hasNextInt()) //This statement checks if the user input is an integer or not
            {
                times = timeIn.nextInt(); System.out.println(""); 
            
                 if(times <= 0)//This statement checks if user input a negative number
                 { 
                                         
                     System.out.println("please enter a positive integer.\n"); times = 0; }
                 
                 else{ loop1 = loop1 + 1; System.out.println("The program will calculate the sum of all the integers from 1 to " +  times ); } 
              
            }else
            {                   
                System.out.println("Please enter an integer number, not any other things.\n"  );
                
                times= 0;  loop1 = 0;
                    
            }
           
    }while(loop1 == 0);
        
        endNumber = times; System.out.println(""); 
                        
        while(times > 0)
        {
        	sum = sum + addNumber; 
        	
        	addNumber ++;
        	
        	times--;
        }
                
        System.out.println("Using while-loop, the program calculates that the sum of all integers from 1 to " + endNumber + " is " + sum );
        
        addNumber = 1; sum = 0; times = 1; System.out.println(""); 
        
        for(times = 0; times < endNumber; times ++)
        {
            sum = sum + addNumber; 
        	
        	addNumber ++;
        	
        }
        
        System.out.println("Using for-loop, the program calculates that the sum of all integers from 1 to " + endNumber + " is " + sum );
        
        addNumber = 1; sum = 0; System.out.println(""); 
        
        do{
        	
        	sum = sum + addNumber; 
        	
        	addNumber ++;
        	
        	times--;
        	
        }while(times >0);
        
        System.out.println("Using do-while-loop, the program calculates that the sum of all integers from 1 to " + endNumber + " is " + sum );
        
    }
    
}
