/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Project Program 5: MatchUp
 * The program will prompt user for the name of the file that the program will read, 
 *    if the file name user entered in the command prompt is not correct.
 * Then the program will read each line within the file, if there's any
 * find { or } and numbered them in pairs and then display the edited lines.
 * ********************************************************************
 */

/** Algorithm
 * This program contains several methods:
 * getFile method will prompt user to enter the file name until the file can be accessed by the program
 * findMatch method will find all the "{" and "}" in the line passed by the main method, if there's any, 
 *    and nunmber them in pairs until there is "}" left alone, and those lone "}" will be assign with 0
 * After the line is edited, the main method will print the edited line and pass a new line to the findMatch method
 *    until the program reach the end of the file.
 */

import java.io.*;
import java.util.Scanner;

public class MatchUp 
{
    public static void main(String[] args) throws IOException
    {
    	printHeading();
    	
        File inFile = getFile(args);
        
        Scanner fileIn =  new Scanner (inFile);
        
        int[]count = {0};
        
        if(fileIn.hasNextLine()){
            
            do{
                String line = fileIn.nextLine();
            
            line = findMatch(line, count);
            
            System.out.println(line);
        
            }while(fileIn.hasNextLine());
            
            System.out.println("\n This is the end of the file, program will exit now, thank you for using.");
        
        }else{System.out.println("The file is empty");}
        
    }
    
    public static File getFile(String [] file_name)
    {
    	int length = file_name.length; String name = "";
    	
    	if(length == 0){name = "";}
    	
    	else if (length==1) {name = file_name[0];}
    	
    	else{ for(int i = 0; i<length;i++)  { name = name + file_name[i]; } }
    	
        Scanner inPut = new Scanner(System.in); File inFile = new File(name);
        
        if(!inFile.exists()){ do{
            
        System.out.println("Please enter the correct file name together with file type extention.");
        
        String fileName =  inPut.next();
        
        inFile = new File(fileName);
                
        }while(!inFile.exists());   return inFile;}
        
        else {return inFile;}
    }

    public static String findMatch(String line, int count[])
    {
      String full_Line = ""; int length = line.length(); int subCount = count[0];
            
      	  for(int i = 0; i < length; i++)
            {
                String match = line.substring(i,i+1);
                
                if(match.equals("{")) {subCount++; full_Line  = full_Line + match + subCount + " "; }
                
                else if(match.equals("}"))
                {
                    if(subCount <=0){ full_Line  = full_Line + match + subCount + " ";}
                    
                    else{full_Line  = full_Line + match + subCount + " "; subCount --;}
                }
                
                else{full_Line  = full_Line + match;}
                
            }
        count [0] = subCount;       return full_Line;
    }
    
    private static void printHeading()
    {
     System.out.println("My name is Aplomb TR Huang");
        System.out.println("My student ID is 6856925");
        System.out.println("My course is: CSC201-01PR, Spring 2016");
        System.out.println("My instructor is Debra Duke");
        System.out.println("This is Programing Project 5");
        System.out.println("find and match all the {} in the file, then display the edited lines of the file");
        System.out.println("");
    }
}
