
import java.io.*;
import java.util.Scanner;

public class Popcorn 
{

    public static void main(String[] args) throws IOException
    {
      Scanner inPut =  new Scanner(getFile()); 
      
      System.out.println("\n");
      
      programHead();
      
      do
      {
       String lineContent = inPut.nextLine(); 
       
       while(lineContent.length()==0) {lineContent = inPut.nextLine(); }
       
       String name = getName(lineContent);  double aker = getAker(lineContent);  int corn = getCorns(lineContent);
       
       double division = corn/(25 * aker); int stars = (int)division;
        
       if(name.equals("") || aker == 0|| corn == 0)
       {
           String display = lineContent + " (data error)";
           
           System.out.printf("%-30s", display );
           
           System.out.println(" ");
       }
       else if(stars < 16)
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
       
       else 
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
           
      }while(inPut.hasNextLine());
      
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
    
    public static void programHead()
    {
        System.out.printf("%-20s", " "); System.out.println("Popcorn Co-op \n");
        System.out.printf("%-30s", " "); System.out.println("Production in Hundreds");
        System.out.printf("%-30s", " "); System.out.println("of Pint Jars per Acre");
        System.out.printf("%-30s", "Farm Name");
        for(int i = 1; i <= 6; i++ ){System.out.print("   " + i);}
        System.out.println(""); System.out.printf("%-30s", " ");
        for(int i = 1; i <= 6; i++ ){System.out.print("---|");}
        System.out.println("");
        
    }
    
    public static String getName(String lineContent)
{
    String ownerName = ""; Scanner content = new Scanner(lineContent);
    
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

}

