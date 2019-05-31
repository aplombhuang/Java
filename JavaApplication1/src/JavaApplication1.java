

import java.io.*;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;

public class JavaApplication1 
{
    
    public static void main(String[] args) 
    { String Symbols; int Types, Shares;
    
      Symbols = checkSymbols();
      
      Types = checkType();
        
      Shares = checkShares();
        
      Equities eq1 = new Equities(Symbols, Types, Shares);
        
        
        
    }
    
    public static String checkSymbols()
    {String Symbol = ""; String str = ""; boolean check = false;
    
     while(check = false)
        {   System.out.println("Please enter the Symbol for the stock you want to check.");
            
            Scanner inPut = new Scanner(System.in); str = inPut.next();
        
            if(str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else if (str.equals("")){Symbol = str; check = true;}
            else {System.out.println("Unexpected Sysmbol."); check = false;}
            
        }
               
        return Symbol;
    }
  
    public static int checkType()
    {
       int Type = -1; boolean check = false;
    
     while(check = false)
        {   System.out.println("Please choose what type of stock you want to check. \n 0,1,2");
            
            Scanner inPut = new Scanner(System.in); 
        
            if(inPut.hasNextInt()){
                Type = inPut.nextInt(); 
                 if (Type == 0){check = true;}
                  else if (Type == 1){check = true;}
                  else if (Type == 2){check = true;}
                  else{ System.out.println("Please choose from 0,1,or 2.");check = false;}
            }
            else{System.out.println("Please enter an interger."); check = false;}
        }
     
     return Type;
           
    }
    
    public static int checkShares()
    {
       int Shares = 0; boolean check = false;
    
     while(check = false)
        {   System.out.println("Please enter the shares you hold.");
            
            Scanner inPut = new Scanner(System.in); 
        
            if(inPut.hasNextInt()){
                Shares = inPut.nextInt(); 
                 if (Shares >=0){check = true;}
                 else{ System.out.println("Shares can not be negative");check = false;}
            }
            else{System.out.println("Please enter an interger."); check = false;}
        }
     
     return Shares;
           
    }
 
}
