/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linenumbers;
 import java.io.*;

import java.util.Scanner;

/**
 *
 * @author Mandy
 */
public class LineNumbers {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        //System.out.println("Please enter file name, including extention type.");
        
       // Scanner fileName = new Scanner(System.in);
        
        //String name = fileName.next();
        
       // File inReader = new File(name);
        
        
        
         Scanner inFile = new Scanner(getFile());
         
         int count = 1;  boolean flag = true;
         
         while(flag){ 
        
         if(inFile.hasNextLine())
         {
             String InFo = inFile.nextLine();
             
             if(InFo.length()==0){System.out.println(InFo);}
             
             else{
             
             System.out.println(count + "." + InFo);
             
             count++;
             
             }
         }
         else { if(inFile.hasNextLine()){} else{flag = false;}
         
         }
         
             
            }
         
         
         
         FileWriter outFile = new FileWriter("Testing2.txt");
         
         outFile.write("Test this out.");
         
         outFile.flush();
         outFile.close();
         
         }
         
    public static File getFile()
{
    File inFile;    
    do{
      
      System.out.println("Please enter the correct file name together with the extention.");
        
      Scanner inPut1 = new Scanner(System.in);
      
      String fileName = inPut1.next();
      
      inFile = new File(fileName);
     
      }while(!inFile.exists());
      
      return inFile;
}
       
    }
    

