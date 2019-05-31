/*
 * Aplomb TR Huang, ID#6856925
 * CSC201-01PR, SPRING 2016
 * MathExpressions1
 * This program is for us to practise using
 * calculation operators, /, %, etc
 * also the program will let us use cast metho in order to 
 * perform certain calculation using constants
 */

public class MathExpression1
{
  
  
  private static void printHeading ()
  {
	  System.out.println("My name is Aplomb TR Huang");
      System.out.println("My student ID is 6856925");
      System.out.println("My course is: CSC201-01PR, Spring 2016");
      System.out.println("My instructor is Debra Duke");
      System.out.println("Lab6");
      System.out.println("practise using calculation operators and cast method");
      System.out.println("");
  }
  
  public static void sevenFour()//Because the instruction involves 2 sets of constants with the same set of variable names, I need to set up another method
  
  {
	  final int NUM = 7;
	   
	   final int DEM = 4; //these two are constants that the instruction is given
	   
	   System.out.println(NUM + "/" + DEM + " using interger division equals " + NUM/DEM); //this is simple interger division which would return just the quotient
	   
	   System.out.println(NUM + "/" + DEM + " using float-point division equals " + ((double) NUM)/DEM + "\n"); //this is double division which would return quotient with float points, casting method is used to change one of the constants to double
	   
	   System.out.println(NUM + "/" + DEM + " using modulo operator, and the remainder equals " + NUM%DEM + "\n"); //this would show the remainder from the interger division
	   
  }
    
  public static void main(String[] args)
   {
	  
	  printHeading();
	  
	  sevenFour();// this calls the methods that contains the constants 7 and 4
   
   final int NUM = 14;
   
   final int DEM = 5; //these two are constants that the instruction is given for change
   
   System.out.println(NUM + "/" + DEM + " using interger division equals " + NUM/DEM + "\n"); //this is simple interger division which would return just the quotient
   
   System.out.println(NUM + "/" + DEM + " using float-point division equals " + ((double) NUM)/DEM + "\n"); //this is double division which would return quotient with float points, casting method is used to change one of the constants to double
   
   System.out.println(NUM + "/" + DEM + " using modulo operator, and the remainder equals " + NUM%DEM + "\n"); //this would show the remainder from the interger division
   
   }


   }


