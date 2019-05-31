/*Team FUL
* Memeber, Aplomb Huang, Aaron Kim, Paige Fuller
*CMSC 409 PROJECT01 INSTRUCTOR DR. Manic
* This program will randomly generate heights and weights for both Male and Female
*and writes that to the txt file.
 */


import java.io.*;
import java.math.*;
import java.util.Random;

public class Project01 
{

    public static void main(String[] args) throws IOException
    {
        File f = new File("data.txt");
        double height;
        double weight;
       
        PrintWriter writer = new PrintWriter(new FileWriter(f));
       
        
        for(int i = 0; i <2000; i++)
        {
            //2 std. dev. left
            if (i<50)
            {
                Random random = new Random();
                height = random.nextInt(2) + 60;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(28) + 85;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 0");
                writer.printf(height + ", " +  weight + ", 0 \n");
            }
            
            // 1 std. dev. left
            else if (i <270)
            {
                Random random = new Random();
                height = random.nextInt(2) + 63;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(28) + 114;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 0");
                writer.printf(height + ", " +  weight + ", 0 \n");
            }    
                
            //std. dev. center
            
            else if (i<1680){
                Random random = new Random();
                height = random.nextInt(5) + 66;
                
                height /= 12; 
                height += (random.nextDouble())/2;
                
                weight = random.nextInt(57) + 143;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 0");
                writer.printf(height + ", " +  weight + ", 0 \n");
               
            }
            // 1 std. dev. right
            else if (i<1950)
            {
                Random random = new Random();
                height = random.nextInt(2) + 72;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(28) + 201;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 0");
                
                writer.printf(height + ", " +  weight + ", 0 \n");
            }
            
            //2 std. dev. right
            else
            {
                Random random = new Random();
                height = random.nextInt(2) + 75;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(28) + 230;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 0");
                
                 writer.printf(height + ", " +  weight + ", 0 \n");
            }
            
            
        }
        
         writer.printf(" \n");
        
        //Female Statistics
         for(int i = 0; i <2000; i++)
        {
             //2 std. dev. left
            if(i<50)
            {
                Random random = new Random();
                height = random.nextInt(2) + 56;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(30) + 73;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 1");
                 writer.printf(height + ", " +  weight + ", 1 \n");
            }
            
             // 1 std. dev. left
            else if (i <270)
            {
                Random random = new Random();
                height = random.nextInt(2) + 58;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(30) + 104;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 1");
                 writer.printf(height + ", " +  weight + ", 1 \n");
            }
            
            
            //std. dev. center
            else if (i<1680)
            {
                Random random = new Random();
                height = random.nextInt(4) + 61;
                height /= 12;
                height += (random.nextDouble())/2;
                weight = random.nextInt(61) + 135;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 1");
                
                 writer.printf(height + ", " +  weight + ", 1 \n");
               
            }
            // 1 std. dev. right
            else if (i<1950)
            {
                Random random = new Random();
                height = random.nextInt(2) + 66;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(30) + 197;
                weight += (random.nextDouble())/2; //Water Weight
                //System.out.println (height + ", " +  weight + ", 1");
                 writer.printf(height + ", " +  weight + ", 1 \n");
            }
           
            //2 std. dev. right
            else 
            {
                Random random = new Random();
                height = random.nextInt(2) + 69;
                height /= 12; 
                height += (random.nextDouble())/2;
                weight = random.nextInt(30) + 228;
                weight += (random.nextDouble())/2; //Water Weight
               // System.out.println (height + ", " +  weight + ", 1");

                 writer.printf(height + ", " +  weight + ", 1 \n");
                
            }
        }
         
         writer.close();
    }
    
}
