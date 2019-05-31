/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 7: RationalDriver
 * The program will prompt user for 2 sets of rational numbers, 
 * if the user entered anything but interger, whom will be prompt to re-enter.
 * if the user entered a zero denominater, whom will be prompt to re-enter.
 * after that user is given several choices of what to do with the 2 sets of numbers
 * This program is for us to practice using class.
 * ********************************************************************
 */

/** Algorithm
 * This program contains several methods:
 * getNumber method will prompt user to enter interger for numerator and denominator, also performs check for any potential errors.
 * getRational 1&2 methods will call the getNumber method, construct object from the Rational class 
 *     and pass data from the get number method to object 
 * displayOptions and printHeading method just display some lines of words.
 * choice method would call a variaty of methods from the Rational class, according to the user's choice.
 */

import java.util.Scanner;

public class RationalDriver
{
  public static void main(String[] args)
  {     printHeading();
    
    Rational rational1 = new Rational(); Rational rational2 = new Rational(); //instanciate new object with default value.
    
    getRation1(rational1); getRation2(rational2); int number = 0;
    
    do{  displayOptions();
     
    number = choice(rational1, rational2);
    
    }while(number !=8 );
   }
  
  public static void getNumber(int [] aNumber)
  {
    String [] str = { "numerator", "denominator"};  Scanner input;
    
    for(int i=0; i<2; i++){
    
    System.out.println("Please enter an interger for the "+ str[i]);
    
    input = new Scanner(System.in);
    
    if(!input.hasNextInt()){ System.out.println("Error, please enter an interger."); i--;   }
    
    else{aNumber[i] = input.nextInt();}
    }
    
    while(aNumber[1]==0)
    {
      System.out.println("Error, denominator can't be zero.  Please re-enter an interger for denominator." );
      
      input = new Scanner(System.in);
      
      if(!input.hasNextInt()){ System.out.println("Error, please enter an interger.");  }
    
      else{ aNumber[1] = input.nextInt();}
    }
  }
  
  public static void getRation1(Rational r1)
  {
    System.out.println("You are about to enter data for your first rational number.");
    
   int numbers []  = new int [2];
   
   getNumber(numbers);
    
    int number1 = numbers[0]; int number2 = numbers[1];
        
    r1.setNumer(number1); r1.setDenom(number2);
    
    System.out.println(r1.toString());
  }
  
   public static void getRation2(Rational r2)
  {
    System.out.println("You are about to enter data for your second rational number."); 
     
   int numbers [] = new int [2];
   
   getNumber(numbers);
     
   int number1 = numbers[0]; int number2 = numbers[1];
   
   r2.setNumer(number1); r2.setDenom(number2);
   
   System.out.println( r2.toString());
  }
   
   private static void displayOptions()
   {
     System.out.println("Please choose the desired action from below and enter the corresponding number.");
     System.out.println("1.Addition");
     System.out.println("2.Subtraction");
     System.out.println("3.Multiplication");
     System.out.println("4.Division");
     System.out.println("5.Test for Equality");
     System.out.println("6.Change 1st rational number");
     System.out.println("7.Change 2nd rational number");
     System.out.println("8.Exit\n");
   }
   
   public static int choice(Rational r1, Rational r2)
   {
     int number = 0;   String output = ""; 
     
     Scanner choices = new Scanner(System.in);
     
     while(!choices.hasNextInt() )
       { 
       displayOptions(); choices = new Scanner(System.in);
       }      
       
         number = choices.nextInt();
                    
          if(number ==1){  output = r1.add(r2);}
                    
          else if (number == 2){  output = r1.subtract(r2);}
                     
          else if(number == 3){  output = r1.multiply(r2);}
                  
          else if(number == 4){  output = r1.divide(r2);}                     
            
          else if(number == 5){  output = "The result of equality test for the 2 rational numbers: "
                                           + r1.getNumer() + "/" + r1.getDenom() +" and " 
                                           + r2.getNumer() + "/" + r2.getDenom() + " is " + r1.equals(r2);}
                
          else if(number == 6){  output = "Please enter new number for your first ration.";}
                  
          else if(number == 7){ output = "Please enter new number for your second ration.";}
                 
          else if(number == 8){  output = "The program will exit now.";}
           
        
        System.out.println(output);
        
        if(number == 6){getRation1(r1);}
        
        else if(number == 7 ){getRation2(r2);}   else{System.out.print("");}
             
     return number;
   }
   
   private static void printHeading()
    {
     System.out.println("My name is Aplomb TR Huang");
        System.out.println("My student ID is 6856925");
        System.out.println("My course is: CSC201-01PR, Spring 2016");
        System.out.println("My instructor is Debra Duke");
        System.out.println("This is Programing Project 7 RationalDriver");
        System.out.println("take inputs of rational numbers and do some calculation. Practise using classes");
        System.out.println("");
    }
}