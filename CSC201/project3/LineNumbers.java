/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 3:LineNumbers
 * The program will prompt user for the name of the file that the program will read, 
 * and then put a number in increasing order in front of each line
 * and skip the space when necessary
 * ********************************************************************
 */

 /**Algorithm:
 *input: full file name including extension, from user
 *output: display the content of the file, with number in front of each line, space will be skipped
 *prompt the user for the file name
 *read the file using File method
 *set a loop to make sure the user enters a correct file name, 
 *set a loop to count of how many lines are read, 
 *print the count number and the content of the line
 *check ahead to see if thers's blank , and skip the blank
 *at the end of file where there's no line,
 * jump out of the loop and exit
 */

 import java.io.*;
import java.util.Scanner;


public class LineNumbers {

    private static void printHeading()
    {
     System.out.println("My name is Aplomb TR Huang");
        System.out.println("My student ID is 6856925");
        System.out.println("My course is: CSC201-01PR, Spring 2016");
        System.out.println("My instructor is Debra Duke");
        System.out.println("This is Programing Project 3");
        System.out.println("Ask user for the name of the file. Put a number in each line from the file, empty line will be skipped.");
        System.out.println("");
    }
 
    public static void main(String[] args) throws IOException
    {
     printHeading();
     
     System.out.println("Please enter the full file name including file type extention.");
     
     Scanner inPut = new Scanner(System.in);
     
     String fileName = inPut.next();
     
     File inReader = new File(fileName);
     
     while(!inReader.exists())
     {
      System.out.println("Program cannot find the file according to the file name, please re-enter the correct file name.");
       
       fileName = inPut.next();
       
       inReader = new File(fileName);
     }
        
         Scanner inFile = new Scanner(inReader);
         
         int count = 1;  boolean flag = true;
         
         while(flag){ 
        
         if(inFile.hasNextLine())
         {
             String InFo = inFile.nextLine();
             
             if(InFo.length()==0){System.out.println(InFo);}//this reads a blank line and diplays the blank
             
             else{
             
             System.out.println(count + "." + InFo);
             
             count++;
             
             }
         }
         else { if(inFile.hasNextLine()){} else{flag = false;}//this checks if the file is ended.
         
         }
         
             
            }
         }
         
       
    }
    

