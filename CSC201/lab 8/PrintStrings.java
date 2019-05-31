/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 8 part 1
 * The program will prompt user to enter 2 words, 
 * and then compare the words in the order like 
 * a dictionary, and display the words in that order
 * ********************************************************************
 */

/*Algorithm:
 * input: 2 words
 * output: the words that are re-organized using dictionary order
 * method:
 * promp the user for input, because the virtual machine can 
 * 	recognize space between words,  so there's no need to check
 *  if the user entered less than 2 words
 *  using compareTo method, if the first word is lower in order, 
 *  then display first word then second, or the second word is lower order
 *  display second word first, then the first word
 *   
 */

import java.util.Scanner;

public class PrintStrings
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is lab 8 part 1");
	         System.out.println("Promp the user to enter 2 words, compare and display the words in dictionary order.");
	         System.out.println("");
	   }
	
  public static void main(String[] args)
  {
	  printHeading();
	  
    Scanner input = new Scanner(System.in);
    
    String word_1st = ""; String word_2nd = "";
    
    System.out.println("Please enter 2 words with a space in between.");
             
      word_1st = input.next();
                
      word_2nd = input.next();
        
     int num = word_1st.compareTo(word_2nd);
    
    if(num >0)
    {
    System.out.println(word_2nd + " " + word_1st);
    }
    else if(num <0)
    {
      System.out.println(word_1st + " " + word_2nd);
    }
    else{System.out.println(word_1st + " " + word_2nd);}
      
       
  }
}