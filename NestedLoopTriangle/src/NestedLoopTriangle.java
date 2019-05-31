/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab9 part3
 * The program print2 triangles that are consist of * using nested loop
 * ********************************************************************
 */

/**Algorithms
 *input: there's no user input, but the number of rows that the triangle is consists of
 * output: printing the "*" in certain pattern such that the signs shows a triangle
 * 
 * first triangle
 * there are 10 rows of stars, so the loop will count from 1 to 10
 * the number of stars in each row increases in number of 2, loop added 2 more stars as row number increases
 * 
 * second triangle
 * there are spaces before each star at the beginning of each row
 * and the space decrease by one as row increases, loop will count down from 9 to 0 to reduce the space
 * there are 10 rows of stars, so the loop will count from 1 to 10
 * the number of stars in each row increases in number of 2, loop added 2 more stars as row number increases
 * 
 */

public class NestedLoopTriangle 
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is Lab 9 part 3 ");
	         System.out.println("Print 2 different triangles using nested loop skills");
	         System.out.println("");
	   }
	
    public static void main(String[] args) 
    {
        printHeading();
        
        int space; int star; int row = 1; 
        
        while(row <=10 )
        {
            int different = 2*row -1; 
            
            while(different >0){System.out.print("* "); different--;}
            
            System.out.println("");
            
            row++;
             
         }
        
        System.out.println("\n\n");    row = 1;
        
       while(row<=10 )
         {
             space = 10 - row;  
             
             while(space >0) {System.out.print("  "); space--; } 
             
             star = 2*row -1;
             
             while(star >0){System.out.print("* "); star--;}
            
            System.out.println("");
            
            row++;
             
         }  
        
    }
    
}
