/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 13 part 2 : MemoPadReader
 * This program is to practice reading input from a file.
 * ********************************************************************
 */

/**Algorithms:
 * The body of the program was pre-created, there are comments that indicate where the blanks were.
 */

import java.util.Scanner;
import java.io.*; //blank 1: import java util.Scanner and io because the program  reads file input and user keyboard input;

public class MemopadReader 
{

    public static void main(String[] args) throws IOException
    {
     printHeading();
     
Scanner console = new Scanner(System.in);
        
        System.out.println("Input file: ");
        
        String inputFileName = console.nextLine();
        
        File inFile = new File(inputFileName); //blank 2 : instantiating file reader
        
        Scanner in =  new Scanner(inFile);
        
        boolean done = false;
        
        while(in.hasNextLine() && !done)
        {
            String topic = in.nextLine();// blank 3 : stores the first line in the file to topic 
            
            String dateStamp = in.nextLine();//blank 4 : stores the second line in the file to dateStamp
            
            String message = in.nextLine();// blank 5 : stores the third line in the file to topic 
            
            System.out.println(topic + "\n" + dateStamp + "\n" + message);
            
            if(in.hasNextLine())// blank 6: determines if the file has more memo
            {
                System.out.println("Do you want to read the next memo?");
                
                String answer = console.nextLine();
                             
                String ans = answer.substring(0,1);
                
                if(ans.equalsIgnoreCase("n"))
                {
                    done = true;
                }
            }
            
            
        }
        
        
    }
    private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 13 part 2 : MemoPadReader");
         System.out.println("To practice using reading file as input.");
         System.out.println("");
    }
}
