import java.io.*;
import java.util.*;

public class MemoPadCreator 
{
    public static void main(String[] args)throws FileNotFoundException 
    {
        Date dateStamp;
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter the name of the output file.");
        
        String fileName = console.nextLine();
        
        PrintWriter out = new PrintWriter (fileName);
        
        boolean done = false;
        
        while(!done)
        {
            System.out.println("Memo topic (enter -1 to end) :");
            
            String topic = console.nextLine();
            
            if(topic.equals("-1")){done = true;}
            
            else{
                System.out.println("Memo text:");
                
                String message = console.nextLine();
                
                dateStamp = new Date();
                
                //String DateStamp  = dateStamp.toString();
                
                out.println(topic + " \n " + dateStamp.toString() + " \n " + message);
                /*out.println(topic + "\n");
                
                out.println(dateStamp.toString() + "\n");
                
                out.println(message + "\n");
                */
                }
            
            }
            out.close();
        }
    }

