/*
 * Aplomb TR Huang, ID#6856925
 * CSC201-01PR, SPRING 2016
 * VariableDefinitions
 * This program is for us to practise how to 
 * initial and declear differnt variables like
 *interger, float point, etc.
 * 
 */

import java.util.Scanner;

public class VariableDefinitions
{
  private static void printHeading ()
  {
  System.out.println("Aplomb Huang");
    System.out.println("CSC201 SPRING 2016");
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
          
      
     System.out.println("The numPeople variable has a value of " + numPeople);
     
     numPeople = 22;
     
     System.out.println("The numPeople variable has a value of " + numPeople);
          
     System.out.println("The itmPrice variable has a value of "+ itmPrice);
     
     itmPrice = 26.26;
     
     System.out.println("The itmPrice variable has a value of " + itmPrice);
     
     System.out.println("The false_Flag variable has a value of " + false_Flag);
     
     false_Flag = true;
     
     System.out.println("The false_Flag variable has a value of " + false_Flag);
     
      System.out.println("The dataValue variable has a value of " + dataValue);
      
      dataValue = 'h';
      
      System.out.println("The dataValue variable has a value of " + dataValue);
      
      System.out.println("The numRoom variable has a value of " + numRoom);
      
      numRoom = 107;
     
     System.out.println("The numRoom variable has a value of " + numRoom);
     
      System.out.println("The dinnerPrice variable has a value of " + dinnerPrice);
      
      dinnerPrice = 14.5f;
     
     System.out.println("The dinnerPrice variable has a value of " + dinnerPrice);
     
     System.out.println("The numLong variable has a value of " + numLong);
     
     numLong = 97846512313649L;
     
     System.out.println("The numLong variable has a value of " + numLong);
     
     System.out.println("The numMid variable has a value of " + numMid);
     
     numMid = 7984651;
     
     System.out.println("The numMid variable has a value of " + numMid);
     
            
       
    final byte CON0 = 1;
      
      final short CON1= 26 ;
      
      final int CON2 = 20160201;
      
      final long CON3 = 3146289461060L;
      
      final float CON4 = 3.4f;
      
      final double CON5 = 14.40;
      
      final char CON6 = 'T' ;
      
      final boolean CON7 = true;
      
      
      CON0 = CON0++; //When trying to assign value to constant, there's a compilation error. 
    }
  }
