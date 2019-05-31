
/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 2: CircleOperations
 * The program will prompt user for a number input as radius, 
 * and then calculate and print the diameter, circumference or area
 * according to the radius user has entered.
 * ********************************************************************
 */

import java.util.Scanner;

public class CircleOperations 
{
    private static void printHeading()
   {
       System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("This is Programing Project 2");
         System.out.println("Calculating diameter, circumference or area according to user's numeric input of a radius.");
         System.out.println("");
   }
    
   
    public static void main(String[] args) 
    {
        printHeading();
    	
         int times = 0; int lp1 = 0; //These 2 variables are used in loops counting.
         
        do{
            Scanner timeIn = new Scanner(System.in); //the variable timeIn will store user input of times
            
            System.out.println("How many sets of radius do you have for this program to calculate? Please enter a number.");
            
            if(timeIn.hasNextInt()) //This statement checks if the user input is an interger or not
            {
                times = timeIn.nextInt(); System.out.println("");
            
                 if(times<0)//This statement checks if user input a negative number
                 { 
                                          
                     System.out.println("please enter a positive number.\n"); times = 0; }
                 
                 else{ lp1 = lp1 + 1; System.out.println("The program will run " +  times  + " times. \n"); } 
              
            }else
            {                   
                System.out.println("Please enter a whole number, not any other things.\n"  );
                
                times= 0;  lp1 = 0;
                    
            }
           
    }while(lp1 == 0);
    
   do{              
       int lp2 =0; // This variable is used in loop count
       
       double radius = 0; // This variable stores radius
       
       while(lp2 == 0)
       {
           Scanner radIn = new Scanner(System.in); //The variable radIn will store user input of radius
           
            System.out.println("Please enter the radius you want to calculate.");
           
           if(radIn.hasNextDouble()) //This statement checks if the user enter double or not.
           {
               radius = radIn.nextDouble(); // This statement transfer the radius stored in radIn to radius
               
                System.out.println("");
                              
               if(radius<0) //This statement checks if user input a negative number
               {
                    System.out.println("Please enter a positive radius. \n");
                    
                    lp2 = 0;
               }
               else
               {
                     System.out.println("The radius you entered is " + radius + ".\n" );
                    
                     lp2 = 1;
               }
             
           }           
           else
           {
            System.out.println("Please enter a number, not anything else.\n");
            
            radius = 0; lp2 = 0;
           }
               
       }
            
        int lp5 = 0; // this variable is used in loop counting
        
         double diameter = radius * 2; // This variable stores diameter
       
       double circom = diameter * Math.PI; // This variable stores circomference
       
       double area = radius * radius * Math.PI; //This variable stores area
        
        while(lp5 == 0){
        
         int lp3 = 0; int lp4 = 0; //These two variables are used in loop counting               
                           
       String dime = "D";    String crcmf = "C"; String rea = "A"; //These variables are used to compare user choice input
       
       String choice = ""; // This variable is used to store user choice input
       
       String ans = ""; // This variable is used to store user answer input
       
       String ans1 = "YES"; String ans2 = "NO"; // These variables are used to compare user answer input
              
           while(lp3 ==0)
           {
           Scanner chsIn = new Scanner(System.in); // chsIn stores user's choices input
           
           System.out.println("Please choose what to calculate with the radius " + radius + ". \n Enter A for area, C for circomference or D for diameter.");
           
           choice = chsIn.next(); // This statement transfer user choice data from chsIn to choice
           
           System.out.println("");
           
           if(choice.equalsIgnoreCase(rea)) //This statement compares user choice input to choice A
           {
           System.out.printf("The area of the circle with radius " + radius + " is %.4f .\n", area); lp3 = 1; //the printf method limits calculation result to 4 decemal places 
           }
           else if(choice.equalsIgnoreCase(crcmf)) //This statement compares user choice input to choice C
               {
               System.out.printf("The circumference of the circle with radius " + radius + " is %.4f .\n", circom); lp3 = 1; //the printf method limits calculation result to 4 decemal places 
               }
           else if(choice.equalsIgnoreCase(dime)) //This statement compares user choice input to choice D
                {
                System.out.println("The diameter of the circle with radius " + radius + " is " + diameter + ". \n"); lp3 = 1;
                }
           else
                {
                System.out.println("Please choose from A, C or D. Let's choose again.\n"); lp3 = 0; choice = "";
                }
           
           }
           
           System.out.println("");
           
           while(lp4 == 0)
           {
           Scanner ansIn = new Scanner(System.in); //ansIn stores user answer input
           
           System.out.println("Do you want to perform any other calculations with radius " + radius + "? Please enter YES or NO.");
           
           ans = ansIn.next(); //this statement transfer data from ansIn to ans
           
           if(ans.equalsIgnoreCase(ans1)) //This statement compares user answer input to the value YES
           {
           System.out.println(""); lp4 = 1; lp5 = 0;
           }
           else if(ans.equalsIgnoreCase(ans2)) // This statement compares user answer input to value NO
           {
           System.out.println(""); lp4 = 1; lp5 = 1; 
           }
           else
           {
           System.out.println("Please enter YES or NO. \n"); lp4 =0;
           
           }
           /*
            * For the above 2 sting inputs, I did not use hasNext method 
            * because no matter the input, whether it's a number, an alphabet, or a special character,
            * hasNext() will store the input as a string, so this method can't rule out any bad enter
            * 
            */
           }
           
       }
       
       times = times - 1;
       
   }while(times>0);
        
   System.out.println("Thank you for using program CircleOperations, the program will exit now. Bye. :-)");
        
}
}