/*
 * Aplomb TR Huang, ID#6856925
 * CSC201-01PR, SPRING 2016
 * Expressions
 * This program is for us understand what those calculation operators mean and what they do.
 * We supposed to add commons to describe what each statement does.
 */

public class Expressions 
{
	private static void printHeading ()
	  {
		 System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab5");
	     System.out.println("identify what the operation in the statement does");
	    
	    System.out.println("");
	  }
	
  public static void main(String[] args)
 
  {
	printHeading();  
  
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    System.out.println((a + b) / c);   
// 3 and 4 are added with sum 7       
// 7 is divided by 5 with quotient 2 
    
    System.out.println(a + b / c);       
// 4 is divided by 5 with quotient 0       
// 3 is added to 0 with sum 3
    
    System.out.println(a++); //3 is displaced  then 3+1 =4, and 4 is stored in a   
    System.out.println(a--); //3 is displaced  then 3 -1 =2, and 2 is stored in a    
    System.out.println(a + 1); //  3 + 1 =4,4 is stored in a,  then 4 is displaced     
    System.out.println(d % c); //17 divided by 5, reminder 2, and 2 is displaced      
    System.out.println(d / c); // 17 divided by 5 with quotient 3, 3 is displaced      
    System.out.println(d % b);//17 divided by 4, reminder 1, and 1 is displaced       
    System.out.println(d / b); // 17 divided by 4 with quotient 4, and 4 is displaced       
    System.out.println(d + a / d + b); // 17 add the quotient of 3 divided by 17 which = 0, then add 4, the sum is 21, 21 is displaced     
    System.out.println((d + a) / (d + b));  // the sum of  17 add 3, divided by the sum of 17+4, with quotient 0, and 0 is displaced     
    System.out.println(Math.sqrt(b)); // the square root of 4, which is 2, and 2 is displaced      
    System.out.println(Math.pow(a, b));//3 to the power of 4,  which is 81, and 81 is displaced      
    System.out.println(Math.abs(-a));//absulute value of -3 ,which is 3, and 3 is displaced
    System.out.println(Math.max(a, b)); // the maximum number amoung 3 and 4, 4 is displaced    
  } 
} 
