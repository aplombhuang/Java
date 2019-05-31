import java.io.*;
import java.util.Scanner;

public class MatchUp 
{
    public static void main(String[] args) throws IOException
    {
        File inFile = getFile(args.toString());
        
        Scanner fileIn =  new Scanner (inFile);
        
        int[]count = {0};
        
        if(fileIn.hasNextLine()){
            
            do{
                String line = fileIn.nextLine();
            
            line = findMatch(line, count);
            
            System.out.println(line);
        
            }while(fileIn.hasNextLine());
        
        }else{System.out.println("The file is empty");}
        
    }
    
    public static File getFile(String name)
    {
        Scanner inPut = new Scanner(System.in); File inFile = new File(name);
        
        if(!inFile.exists()){
        
        do{
            
        System.out.println("Please enter the correct file name together with file type extention.");
        
        String fileName =  inPut.next();
        
        inFile = new File(fileName);
                
        }while(!inFile.exists());
        
        return inFile;}
        
        else {return inFile;}
    }

    public static String findMatch(String line, int count[])
    {
      String full_Line = ""; int length = line.length(); int subCount = count[0];
            
        for(int i = 0; i < length; i++)
            {
                String match = line.substring(i,i+1);
                
                if(match.equals("{"))
                    
                {subCount++; full_Line  = full_Line + match + subCount + " "; }
                
                else if(match.equals("}"))
                {
                    if(subCount <=0){ full_Line  = full_Line + match + subCount + " ";}
                    
                    else{full_Line  = full_Line + match + subCount + " "; subCount --;}
                }
                
                else{full_Line  = full_Line + match;}
                
            }
        count [0] = subCount;
        
        return full_Line;
    }
}
