import java.util.*;
import java.io.*;

public class MemopadReader 
{
    public static void main(String[] args)throws IOException 
    {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Input file: ");
        
        String inputFileName = console.nextLine();
        
        File inFile = new File(inputFileName); //
        
        Scanner in =  new Scanner(inFile);
        
        boolean done = false;
        
        while(in.hasNextLine() && !done)
        {
            String topic = in.nextLine();//
            
            String dateStamp = in.nextLine();//
            
            String message = in.nextLine();//
            
            System.out.println(topic + "\n" + dateStamp + "\n" + message);
            
            if(in.hasNextLine())//
            {
                System.out.println("Do you want to read the next memo?");
                
                String ans = console.nextLine();
                
                if(ans.equalsIgnoreCase("n"))
                {
                    done = true;
                }
            }
            
            
        }
        
    }
    
}
