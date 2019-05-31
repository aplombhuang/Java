
package drawing;

import java.awt.*;
import javax.swing.*;

public class Drawing {
   
     
    
    public static void main(String[] args) 
    {
        int space; int star; int row = 1; 
                       
        while(row <=10 )
        {
            int different = 2*row -1; 
            
            while(different >0){System.out.print("* "); different--;}
            
            System.out.println("");
            
            row++;
             
         }
        
        System.out.println("\n\n");    row = 1;
        
       while(row<=10 )
         {
             space = 10 - row;  
             
             while(space >0) {System.out.print("  "); space--; } 
             
             star = 2*row -1;
             
             while(star >0){System.out.print("* "); star--;}
            
            System.out.println("");
            
            row++;
             
         }  
                
        
        }
    
    //Please ignore the following, I was trying to use the drawing method
      public void drawTrig(Graphics triangle)
    {
        int x1 = 0; int y1 = 0; int row = 1; 
        
        int x2_1 = 10; int y2 = 11;
        
        while(row <=10 )
        {
            int difference = 2*row +1; int columm1 = 3; int columm2 = 3;
            
            while(columm1 <= difference)
            {  
                triangle.drawString("*" , x1 ,y1);
                
                 x1 ++; columm1 ++;
            }
             
            int x2 = x2_1;
             
             while(columm2 <= difference)
            {  
                
                triangle.drawString("*" , x2 ,y2);
                
                 x2 ++; columm2 ++;
            }
            
        y1 ++; y2 ++;  row ++; x1 = 0; x2_1 --;
        
        
        }
        
    }
    
}
