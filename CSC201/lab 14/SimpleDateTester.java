/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 14 : SimpleDateTester
 * This program is to practice implementing and using class.
 * ********************************************************************
 */

/**Algorithms:
 * The body of the program was created by Professor Duke.
 */

import java.util.ArrayList;

public class SimpleDateTester
{
  public static void main (String [] args)
  {
    printHeading();
    
    ArrayList <SimpleDate> dates = new ArrayList <SimpleDate>();
    
    SimpleDate Bday = new SimpleDate(06, 11, 1989);
    
    SimpleDate Boarder1 = new SimpleDate(1, 1, 1);
    
    SimpleDate Boarder2 = new SimpleDate(12, 31, 9999);
    
    SimpleDate defaultDay = new SimpleDate();
    
    try{   SimpleDate false1 = new SimpleDate(13, 12, 11);}
    
    catch(IllegalArgumentException ex1){System.out.println(ex1.getMessage());}
     
    try{SimpleDate false2 = new SimpleDate(2, 32,2032);}
    
    catch(IllegalArgumentException ex2){System.out.println(ex2.getMessage());}
    
    try{ SimpleDate false3 = new SimpleDate(2, 10, 0);}
    
    catch(IllegalArgumentException ex3){System.out.println(ex3.getMessage());}
    
    dates.add(Bday);
    
    dates.add(Boarder1); dates.add(Boarder2);
    
    dates.add(defaultDay);
    
    dates.add(new SimpleDate(4,6,2016));
    
    for(SimpleDate d : dates) {System.out.println(d.toString());}
    
    System.out.println("\nThe following is the increment of month.");
    
    for(int i = 0; i < dates.size(); i++ )
    {
      if (i !=2){  dates.get(i).setMonth(dates.get(i).getMonth() +1);}
    }
       
    for(SimpleDate d : dates) {System.out.println(d.toString());}

    
     System.out.println("\nThe following is the increment of day.");
    
    for(int i = 0; i < dates.size(); i++ )
    {
      if (i !=2){  dates.get(i).setDay(dates.get(i).getDay() +1);}
    }
       
    for(SimpleDate d : dates) {System.out.println(d.toString());}
    
     System.out.println("\nThe following is the increment of year.");
    
    for(int i = 0; i < dates.size(); i++ )
    {
      if (i !=2){  dates.get(i).setYear(dates.get(i).getyr() +1);}
    }
       
    for(SimpleDate d : dates) {System.out.println(d.toString());}
  }
  
  private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 14 SimpleDateTester");
         System.out.println("To practice creating class.");
         System.out.println("");
    }
}