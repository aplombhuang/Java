/*
 * Name: Vahob Shokirov and Aplomb Huang (Pair coding)
 * CSC201-01PR SPRING 2016
 * Lab 7, program name PhoneKey
 * This program is for us to use if condition statement, and || , && logical expressions
 * 
 * Algorithms:
 * 
 * input: upper case single letter
 * output: coresponding number on keypad according the letter
 * error catch: 
 * catch all the non-letter, and all lower case letters
 * conditions
 * for any letter A,B,C, system will print out number 2
 * for any letter D,E,F, system will print out number 3
 * for any letter G,H,I, system will print out number 4
 * for any letter J,K,L, system will print out number 5
 * for any letter M,N,O, system will print out number 6
 * for any letter P,Q,R,S, system will print out number 7
 * for any letter T,U,V, system will print out number 8
 * for any letter W,X,Y,Z, system will print out number 9
 */



import java.util.Scanner;
public class PhoneKey{
  private static void printHeading()
    
  {
    System.out.println("Name: Vahob Shokirov and Aplomb Huang (Pair coding)");
    System.out.println("CSC201-01PR SPRING 2016");
    System.out.println("Lab 7, program name PhoneKey");
    System.out.println("This program is for us to use if condition statement, and || , && logical expressions");
    System.out.println("\n");
    
  }
  
  public static void main(String[] args){
  
    printHeading();
    
  Scanner in  = new Scanner(System.in);
  System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone: ");
  String input = in.next();   //This is the variable the stores user input         
  
  if(input.length()>1){
	  System.out.println("Please just enter one upper case letter"); System.exit(0);
  }
  else{
  
  char letter = input.charAt(0); //The data in string variable will be transfer to this char variable letter
  
  if(!Character.isUpperCase(letter) && !Character.isLowerCase(letter)) //this statement will catch any non letter input
    System.out.println("You should enter a letter!"); System.exit(0);
  else if(!Character.isUpperCase(letter)) //this statement will catch any lower case letter input
    System.out.println("Error, enter Upper case letter"); System.exit(0);
  else{
    if(letter == 'A' || letter == 'B' || letter== 'C')
        System.out.println("The letter you entered corresponds to number 2.");
    else if (letter== 'D' || letter== 'E' || letter== 'F')
       System.out.println("The letter you have entered corresponds to number 3.");
    else if(letter== 'G' || letter== 'H' || letter== 'I')
       System.out.println("The letter you have entered corresponds to number 4.");
    else if(letter== 'J' || letter== 'K' || letter== 'L')
       System.out.println("The letter you have entered corresponds to number 5.");
    else if (letter == 'M' || letter== 'N' || letter== 'O')
       System.out.println("The letter you have entered corresponds to number 6.");
    else if (letter== 'P' || letter== 'Q' || letter== 'R' || letter == 'S')
       System.out.println("The letter you have entered corresponds to number 7.");
    else if(letter== 'T' || letter== 'U' || letter== 'V')
       System.out.println("The letter you have entered corresponds to number 8.");
    else if(letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
       System.out.println("The letter you have entered corresponds to number 9.") ;      
  }
   
  }
  
  }
}
                   
  
  
  
  
