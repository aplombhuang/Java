/*
 * Aplomb TR Huang, ID#6856925
 * CSC201-01PR, SPRING 2016
 * VariableDefinitions
 * This program is for us to practise how to 
 * initialize and declear differnt variables like
 *interger, float point, etc.
 * 
 */


public class VariableDefinitions
{
  private static void printHeading ()
  {
	  System.out.println("My name is Aplomb TR Huang");
      System.out.println("My student ID is 6856925");
      System.out.println("My course is: CSC201-01PR, Spring 2016");
      System.out.println("My instructor is Debra Duke");
      System.out.println("Lab5");
      System.out.println("practise declearing and using variables");
      System.out.println("");
  }
    
    public static void main(String[] args)
    {
      printHeading();
      
      int numRoom = 207;
      
      double itmPrice = 32.32;
            
      short numPeople = 3;
      
      boolean false_Flag = false;
      
      char dataValue = 'a';
      
      float dinnerPrice = 30.0f;
      
      long numLong = 990123456789L;
      
      int numMid = 177609;
      
      int count = 42;
      
      double total = 48.69;
      
      char stopKey = 't';
      
      boolean stopFlag = true;
      
      float temperatureReading = 60.0f;
      
      byte numPets = 2;
      
      short littleNum = 10;
      
      long reallyBigNumber = 31415926754L;
          
      
     System.out.println("The numPeople variable has a value of " + numPeople + "\n");
     
     numPeople = 22;
     
     System.out.println("The numPeople variable has a value of " + numPeople + "\n");
          
     System.out.println("The itmPrice variable has a value of "+ itmPrice + "\n");
     
     itmPrice = 26.26;
     
     System.out.println("The itmPrice variable has a value of " + itmPrice + "\n");
     
     System.out.println("The false_Flag variable has a value of " + false_Flag + "\n");
     
     false_Flag = true;
     
     System.out.println("The false_Flag variable has a value of " + false_Flag + "\n");
     
      System.out.println("The dataValue variable has a value of " + dataValue + "\n");
      
      dataValue = 'h';
      
      System.out.println("The dataValue variable has a value of " + dataValue + "\n");
      
      System.out.println("The numRoom variable has a value of " + numRoom + "\n");
      
      numRoom = 107;
     
     System.out.println("The numRoom variable has a value of " + numRoom + "\n");
     
      System.out.println("The dinnerPrice variable has a value of " + dinnerPrice + "\n");
      
      dinnerPrice = 14.5f;
     
     System.out.println("The dinnerPrice variable has a value of " + dinnerPrice + "\n");
     
     System.out.println("The numLong variable has a value of " + numLong + "\n");
     
     numLong = 97846512313649L;
     
     System.out.println("The numLong variable has a value of " + numLong + "\n");
     
     System.out.println("The numMid variable has a value of " + numMid + "\n");
     
     numMid = 7984651;
     
     System.out.println("The numMid variable has a value of " + numMid + "\n");
     
            
       
    final byte CON0 = 1;
      
      final short CON1= 26 ;
      
      final int CON2 = 20160201;
      
      final long CON3 = 3146289461060L;
      
      final float CON4 = 3.4f;
      
      final double CON5 = 14.40;
      
      final char CON6 = 'T' ;
      
      final boolean CON7 = true;
      
      
      CON0 = CON0++; //When trying to assign value to constant, there's a compilation error, the program won't compile and you won't be able to run it.
    }
  }
