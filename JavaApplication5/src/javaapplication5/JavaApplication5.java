
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) 
    {
        
         int tm = 0; int lp1 = 0;
         
        do{
            Scanner timeIn = new Scanner(System.in);
            
            System.out.println("Please enter how many times you want this program to run?");
            
            if(timeIn.hasNextInt())
            {
                tm = timeIn.nextInt();
            
                 if(tm<0){ 
                     System.out.println("");
                     
                     System.out.println("please enter a positive number.\n"); tm = 0; }
                 
                 else{ lp1 = lp1 + 1; System.out.println(""); } 
              
            }else
            {    System.out.println("");
                
                System.out.println("Please enter a whole number, not any other things.\n"  );
                
                tm= 0;  lp1 = 0;
                    
            }
           
    }while(lp1 == 0);
    
     System.out.println("The program will run " +  tm  + " times. \n");    
        
   do{
       
       
       int lp2 =0; double radius = 0;
       
       while(lp2 == 0)
       {
           Scanner radIn = new Scanner(System.in);
           
            System.out.println("Please enter the radius you want to calculate.");
           
           if(radIn.hasNextDouble())
           {
               radius = radIn.nextDouble();
               
                System.out.println("");
                              
               if(radius<0)
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
            
        int lp5 = 0; 
        
         double diameter = radius * 2;
       
       double circom = diameter * Math.PI;
       
       double area = radius * radius * Math.PI;
        
        while(lp5 == 0){
        
         int lp3 = 0; int lp4 = 0;                
                           
       String dime = "D";    String crcmf = "C"; String rea = "A";
       
       String choice = "";  String ans = ""; String ans1 = "YES"; String ans2 = "NO";
              
           while(lp3 ==0)
           {
           Scanner chsInput = new Scanner(System.in);
           
           System.out.println("Please choose what to calculate with the radius " + radius + ". \n Enter A for area, C for circomference or D for diameter.");
           
           choice = chsInput.next();
           
           System.out.println("");
           
           if(choice.equalsIgnoreCase(rea))
           {
           System.out.printf("The area of the circle with radius " + radius + " is %.4f .\n", area); lp3 = 1;
           }
           else if(choice.equalsIgnoreCase(crcmf))
               {
               System.out.printf("The circumference of the circle with radius " + radius + " is %.4f .\n", circom); lp3 = 1;
               }
           else if(choice.equalsIgnoreCase(dime))
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
           Scanner ansIn = new Scanner(System.in);
           
           System.out.println("Do you want to perform any other calculations with radius " + radius + "? Please enter YES or NO.");
           
           ans = ansIn.next();
           
           if(ans.equalsIgnoreCase(ans1))
           {
           System.out.println(""); lp4 = 1; lp5 = 0;
           }
           else if(ans.equalsIgnoreCase(ans2))
           {
           System.out.println(""); lp4 = 1; lp5 = 1; 
           }
           else
           {
           System.out.println("Please enter YES or NO. \n"); lp4 =0;
           
           }
           
           }
           
       }
       
       tm = tm - 1;
       
   }while(tm>0);
        
   System.out.println("Thank you for using this program, the program will exit now. Bye.");
        
}
}
