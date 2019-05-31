/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 9 part 1 SimpleLoop
 * The program will produce output in certain times 
 * this is training to use the while loop
 * ********************************************************************
 */
 
/*Answers to part a and b
 * a) the program will show the following: 
 * i = 0   i = 1    i = 2    i = 3    i = 4   i = 5 
 * when I run the program, the output is as predicted
 * 
 * b) if I comment out the line that increment i, 
 * the program will run infinitely with the same output : i = 0
 *  
 */

/**Algorithms
 * 
 *In this case the body of the program is given
 *The following variable will be modified
 *i change from 0 to 6
 *limit changed from 6 to 100
 *
 *i increment statement changed
 * 
 */
public class SimpleLoop 
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is Lab 9 part 1");
	         System.out.println("Change some variables in the loop and produce the desire output");
	         System.out.println("");
	   }
	    
    public static void main(String[] args) 
    {
        printHeading();
        
        int i = 6;      int limit = 100;
        
        while (i < limit)
        {
        	System.out.println("i = " + i);
        	
        	i = 2 * i;
        }
        
        
    }
    
}
