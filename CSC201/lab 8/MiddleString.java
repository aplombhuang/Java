/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 8 part 3
 * The program will prompt user to enter 3 words, 
 * and then compare the words in the order like 
 * a dictionary, and display the word that is in the middle
 * ********************************************************************
 */

/*Algorithm:
 * input: 3 words
 * output: the word that is in the middle using dictionary order
 * method:
 * promp the user for input, because the virtual machine can 
 * 	recognize space between words,  so there's no need to check
 *  if the user entered less than 3 words
 *  using compareTo method, first compare the first 2 words, 
 *  then compare the second and third words
 *  and then compare the third and first word, 
 *  eventually all 3 words will be in order like the dictionary
 *  then display the word in the middle 
 * 
 */

/*Testing data:
 * Group 1 : !@#$%    #$%^&   ?~*&^
 * Group 2 : 12345    34567   09876
 * Group 3 : Aplomb   TR      Huang
 */

import java.util.Scanner;

public class MiddleString
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is lab 8 part 3");
	         System.out.println("Promp the user to enter 3 words, compare and display the one in the middle.");
	         System.out.println("");
	   }
	
  public static void main(String[] args)
    {
	  printHeading();
	  
    Scanner input = new Scanner(System.in);
    
    String word_1st = ""; String word_2nd = ""; String word_3rd = "";
    
    System.out.println("Please enter 3 words with space in between.");
    
    word_1st = input.next();
      
    word_2nd = input.next();
                   
    word_3rd = input.next();
       
    int num1 = word_1st.compareTo(word_2nd);
    
    int num2 = word_2nd.compareTo(word_3rd);
    
    int num3 = word_3rd.compareTo(word_1st);
    
    if(num1 <= 0)
    {
      if(num2 <=0)
      {
      System.out.println("The middle-value String is " + word_2nd);
      }
      else
      {
        if(num3 <= 0)
        {
          System.out.println("The middle-value String is " + word_1st);
        }
        else
        {
          System.out.println("The middle-value String is " + word_3rd);
        }
        
      }
      
    }
    else
    {
    	if(num2 >0)
        {
        System.out.println("The middle-value String is " + word_2nd);
        }
        else
        {
          if(num3 <= 0)
          {
            System.out.println("The middle-value String is " + word_3rd);
          }
          else
          {
            System.out.println("The middle-value String is " + word_1st);
          }
    }
        
  }
}
}