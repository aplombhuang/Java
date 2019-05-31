/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 8 part 2
 * The lines of code is already given
 * the purpose is to compare 2 strings and see if they are equal
 * using the right method, so there's some changes made
 * ********************************************************************
 */

public class StringEqual
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is lab 8 part 2");
	         System.out.println("Make changes in the given lines so that the correct method is used to compare 2 strings, and display");
	         System.out.println("");
	   }
	
  public static void main(String[] args)
    {
	  printHeading();
	  
    String str1 = "abcd";
    String str2 = "abcdefg";
    String str3 = str1 + "efg";
    System.out.println("str2 = " + str2);
    System.out.println("str3 = " + str3);
    if (str2.equals(str3)){ //str2 == str3 is changed to str2.equals(str3) because this is the correct way to compare 2 strings
      System.out.println("The Strings str2 and str3 are the same.");
    }
    else {
      System.out.println("The Strings str2 & str3 are not the same.");
    }
  }
}