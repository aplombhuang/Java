/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 13 part 1 : MemoPadCreator
 * This program is to practice outputting file.
 * ********************************************************************
 */

/**Algorithms:
 * The body of the program was pre-created, there are comments that indicate where the blanks were.
 */

import java.io.*;
import java.util.*; //Blank 1: import file writing io, and Scanner and Date from util.

public class MemoPadCreator 
{
    public static void main(String[] args)throws FileNotFoundException 
    {
     printHeading();
     
        Date dateStamp; //highlighted;
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the name of the output file.");
        
        String fileName = console.nextLine();
        
        PrintWriter out = new PrintWriter (fileName); //blank 2: instantiate the file writer;
        
        boolean done = false;
        
        while(!done)
        {
            System.out.println("Memo topic (enter -1 to end) :");
            
            String topic = console.nextLine();
            
            if(topic.equals("-1")){done = true;}
            
            else{
                System.out.println("Memo text:");
                
                String message = console.nextLine();
                
                dateStamp = new Date(); //Blank 3: instantiate the date object;
                               
                out.println(topic + "\n" + dateStamp + "\n" + message); 
            
                }
            
            }
            out.close(); // Blank 4: closing the file.
        }
    
    private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 13 part 1 : MemoPadCreator");
         System.out.println("To practice using output to file.");
         System.out.println("");
    }
    
    }

