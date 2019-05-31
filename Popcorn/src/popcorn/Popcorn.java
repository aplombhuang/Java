/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 4:Popcorn
 * The program will prompt user for the name of the file that the program will read, 
 * and then the program will extract all the data within the file,
 * does some simple calculation, and then display a chart like result.
 * ********************************************************************
 */

/** Algorithm
 * This program contains several methods:
 * getFile method will prompt user to enter the file name until the file can be accessed by the program
 * programHead will display the heading of the chart
 * getName will extract names from each line
 * getAker will extract double data from each line
 * getCorn will extract int data from each line
 * after the acre and corn data is extracted, corn divided by acre and the result is cast to int
 * some loop and if-else statement will catch potential errors in the file
 * an if-else statement will separate those who produced over 400 and those who did not
 */


import java.io.*;
import java.util.Scanner;

public class Popcorn 
{

    public static void main(String[] args) throws IOException
    {
      printHeading();
    	
      Scanner inPut =  new Scanner(getFile()); 
      
      System.out.println("\n");
      
      if(inPut.hasNextLine()){//This statement catches the error caused by empty file.
      
      programHead();
      
      do
      {
    	  String lineContent = inPut.nextLine();
          
          while(lineContent.length()==0) 
          {
        	  if(inPut.hasNextLine()){lineContent = inPut.nextLine();}
      	   
      	   else{System.exit(0);} 
          
          }//This while loop will skip blink lines in the file
          
          if(lineContent.length()<=4) 
          
          {
       	   System.out.println(lineContent+ ( " (Data error)")); 
       	   
       	   if(inPut.hasNextLine()){lineContent = inPut.nextLine();}
       	   
       	   else{System.exit(0);}
       	   
          }//This if statement will catch errors caused by too short a data.
          else{
       
       String name = getName(lineContent);  double aker = getAker(lineContent);  int corn = getCorns(lineContent);
             
       double division = corn/(25 * aker); int stars = (int)division;
        
       if(name.equals("") || aker == 0|| corn == 0) //This if statement catches any error on numbers or names 
       {
           String display = lineContent + " (data error)";
           
           System.out.printf("%-30s", display );
           
           System.out.println(" ");
       }
       else if(stars < 16) // this if statement draws the mark on those farm that didn't produce 400 jars
       {
         System.out.printf("%-30s", name );
         
         for(int i =0; i< stars; i++)
         {
         System.out.print("*");
         }
         
         for(int i = 0; i <(15-stars); i++){
            System.out.print(" "); 
         }
         
         System.out.println("|");
         
       }
       
       else  //This statement will draws the 400 mark
       { System.out.printf("%-30s", name );
         
         for(int i =1; i< 16; i++)
         {
         System.out.print("*");
         }
         
         System.out.print("#");
         
         for(int i = 16; i <= stars; i++)
         {
             System.out.print("*");
         }
         
         System.out.println();}
       
          }
       
           
      }while(inPut.hasNextLine());
            
      }
      
      else{System.out.println("The file is blank."); System.exit(0);}
      
    }
    
    public static File getFile()
    {
    File inFile;    
    do{
      
      System.out.println("Please enter the correct file name together with the file type extention.");
        
      Scanner inPut1 = new Scanner(System.in);
      
      String fileName = inPut1.next();
      
      inFile = new File(fileName);
     
      }while(!inFile.exists());
      
      return inFile;
	}
    
    public static void programHead()
    {
    	int i;
        System.out.printf("%-20s", " "); System.out.println("Popcorn Co-op \n");
        System.out.printf("%-30s", " "); System.out.println("Production in Hundreds");
        System.out.printf("%-30s", " "); System.out.println("of Pint Jars per Acre");
        System.out.printf("%-30s", "Farm Name");
        for(i = 1; i <= 8; i++ ){System.out.print("   " + i);}
        System.out.println(""); System.out.printf("%-30s", " ");
        for(i = 1; i <= 8; i++ ){System.out.print("---|");}
        System.out.println("");
        
    }
    
    public static String getName(String lineContent)
    {
    String ownerName = ""; 
          
     Scanner content = new Scanner(lineContent);
    
    if(content.hasNextDouble())
     {
      ownerName = "";
     }
    
     else
     {
      
      do{
         if(content.hasNext())
         {
          ownerName = ownerName  + content.next() + " "; 
         }
         
         }while(!content.hasNextDouble() && !content.hasNextInt());
         
         int index = ownerName.indexOf(','); ownerName = ownerName.substring(0,index);
     }
          
    return ownerName ;
	}

    public static double getAker(String lineContent)
    {
    double aker1; Scanner content = new Scanner(lineContent);
    
     while(!content.hasNextDouble()){
         
         String name = content.next();
     }
       if(content.hasNextInt())
       {
         aker1 = 0;
       }
       else if(content.hasNextDouble()) 
       {
           aker1 = content.nextDouble();
       }
        
       else {aker1 = 0;}
       return aker1;
    
	}

    public static int getCorns(String lineContent)
    {
    int corn1; Scanner content = new Scanner(lineContent);
    
     while(!content.hasNextInt()){
         
         String name = content.next();
     }
     
        if(content.hasNextInt()){
       
         corn1 = content.nextInt();
        
        }
        else {corn1 = 0;}
         
         return corn1;
    
	}
    
    private static void printHeading()
    {
     System.out.println("My name is Aplomb TR Huang");
        System.out.println("My student ID is 6856925");
        System.out.println("My course is: CSC201-01PR, Spring 2016");
        System.out.println("My instructor is Debra Duke");
        System.out.println("This is Programing Project 4");
        System.out.println("Ask user for the name of the data file. Display calculated result in a nice format.");
        System.out.println("");
    }

}

