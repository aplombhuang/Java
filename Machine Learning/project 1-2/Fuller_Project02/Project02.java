


/*@author: Paige Fuller, Aplomb Huang
 *CMSC 409 Project 02
 *Our first program with learning abilities 
 */

import java.io.*;
import static java.lang.Math.*;
import java.util.*;



public class Project02 
{

    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String temp = "";
    	//RUN HARD WITH 75% of 4000 = 3000
    	temp = hardActivation75();
    	        
        tester(temp, 1000); // test result previous result with remaining 25% data = remaining 1000
        
    	//RUN HARD WITH 25% of 4000 = 1000
    	temp = hardActivation25();
    	        
        tester(temp, 3000);// test result previous result with remaining 75% data = remaining 3000
        
    	//RUN SOFT WITH 75% of 4000 = 3000
    	temp = softActivation75();
    	        
        tester(temp, 1000);// test result previous result with remaining 25% data = remaining 1000
        
    	//RUN SOFT WITH 75% of 4000 = 1000
    	temp = softActivation25();
                
        tester(temp, 3000);// test result previous result with remaining 75% data = remaining 3000
        
    	
    }
    
    public static void tester (String str, int count) throws FileNotFoundException
    {
        Scanner rdStr = new Scanner(str);
        
        double x = rdStr.nextDouble();// retreaving results 
        double y = rdStr.nextDouble();
        double b = rdStr.nextDouble();//b is result of bias;
        
        Scanner readFile = new Scanner (new File("new data.txt"));
        
        String temp = ""; int error = 0;
        
        double height =  0.0;
        double weight =  0.0;
        int gender = 0;
        
        for(int i = 0; i < 4000 ; i ++)
        {
            temp = readFile.nextLine();
            
            Scanner readLine = new Scanner (temp);
            
            if(i >= 4000-count)
            { height = readLine.nextDouble();
              weight = readLine.nextDouble();
              gender = readLine.nextInt();
              
              if (((weight*x) + (height*y) + b) < 0 && gender ==1){error ++;}
              else if (((weight*x) + (height*y) + b) >= 0 && gender ==0){error ++;}
              
            }
            
        }
        
        readFile.close();
        
        double RRate = (double)error /  count;
        
        System.out.println("Tested error = " + RRate + ".\n");
        
    }
    
    public static String softActivation75() throws FileNotFoundException
    {
    	
    	double height, weight;
	    int gender;
	    double error=1;
	    double learnCof = 0.6;
	    double weightChange=0;
    
	    double x, y, bias;
	    Random random = new Random();
	    x = random.nextDouble();
	    y = random.nextDouble();
	    bias = random.nextDouble();
    
    
	    String[] strArray= new String[3];
	   
	    String temp;
	    
	    double out = 0.0;
	    int n = 0;
	    while (error>0.00001 && n < 10500)
	    {
	        error = 0;
	        Scanner train75 = new Scanner (new File("new data.txt"));
	        for(int i = 0; i < 3000; i ++)
	        {
	        	temp = train75.nextLine();
	        	strArray = temp.split("\t");
	        	height = Double.parseDouble(strArray[0]);
	        	weight = Double.parseDouble(strArray[1]);
	        	//gender is our desired output
	        	gender = Integer.parseInt(strArray[2]);
	
	         
	        	//hard activation
	        	if(((weight*x) + (height*y) + bias)<0)
	        	{
	        		out=0;
	        	}
	        	else
	        	{
	        		out=1;
	        	}
	        	
	        	
	        	//soft activation
	        	out=(1/(1+Math.exp(-1*((weight*x) + (height*y) + bias))));//k = 1
	         
	        	//gender being desired and out being the actual based on equation
	        	if (gender != out)
	        	{
	        		error+=(gender-out);
	        		//error++;
	        	}	
	         
	         
	        	weightChange=learnCof*(gender-out);
	        	
	
	        	x+=(weight*weightChange);
	        	y+=(height*weightChange);
	        	bias+=(weightChange);
	        	
	        	
	         
	        }
	        train75.close();
	        //error=Math.pow(error, 2);
	        error = error/3000;
	        n++;
    }
    System.out.println("Soft Activation with 75% training - error: "+error);
    System.out.println("Soft Activation with 75% training - equation: "+x+ "x "+y+"y + "+bias);
    
    return "" + x + "\t" + y + "\t" + bias;
    	
    }
    
    // this is the code for testing 
    
    
    public static String softActivation25() throws FileNotFoundException
    {	
    	double height, weight;
	    int gender;
	    double error=1;
	    double learnCof = 0.6;
	    double weightChange=0;
    
	    double x, y, bias;
	    Random random = new Random();
	    x = random.nextDouble();
	    y = random.nextDouble();
	    bias = random.nextDouble();
    
    
	    String[] strArray= new String[3];
	   
	    String temp;
	    
	    double out = 0.0;
	    int n = 0;
	    while (error>0.00001 && n < 10500)
	    {
	        error = 0;
	        Scanner train75 = new Scanner (new File("new data.txt"));
	        for(int i = 0; i < 1000; i ++)
	        {
	        	temp = train75.nextLine();
	        	strArray = temp.split("\t");
	        	height = Double.parseDouble(strArray[0]);
	        	weight = Double.parseDouble(strArray[1]);
	        	//gender is our desired output
	        	gender = Integer.parseInt(strArray[2]);
	
	         
	        	//hard activation
	        	if(((weight*x) + (height*y) + bias)<=0)
	        	{
	        		out=0;
	        	}
	        	else
	        	{
	        		out=1;
	        	}
	        	
	        	
	        	//soft activation
	        	out=(1/(1+Math.exp(-1*((weight*x) + (height*y) + bias))));//k = 1
	         
	        	//gender being desired and out being the actual based on equation
	        	if (gender != out)
	        	{
	        		error+=(gender-out);
	        		//error++;
	        	}	
	         
	         
	        	weightChange=learnCof*(gender-out);
	        	
	
	        	x+=(weight*weightChange);
	        	y+=(height*weightChange);
	        	bias+=(weightChange);
	        	
	        	
	         
	        }
	        train75.close();
	        //error=Math.pow(error, 2);
	        error = error/1000;
	        n++;
    }
	    System.out.println("Soft Activation with 25% training - error: "+error);
	    System.out.println("Soft Activation with 25% training - equation: "+x+ "x "+y+"y + "+bias);
            
    	 return "" + x + "\t" + y + "\t" + bias;
    }
    public static String hardActivation75() throws FileNotFoundException
    {
    	double height, weight;
	    int gender;
	    double error=1;
	    double learnCof = 0.6;
	    double weightChange=0;
    
	    double x, y, bias;
	    Random random = new Random();
	    x = random.nextDouble();
	    y = random.nextDouble();
	    bias = random.nextDouble();
    
    
	    String[] strArray= new String[3];
	   
	    String temp;
	    
	    double out = 0.0;
	    int n = 0;
	    while (error>0.00001 && n < 10500)
	    {
	        error = 0;
	        Scanner train75 = new Scanner (new File("new data.txt"));
	        for(int i = 0; i < 3000; i ++)
	        {
	        	temp = train75.nextLine();
	        	strArray = temp.split("\t");
	        	height = Double.parseDouble(strArray[0]);
	        	weight = Double.parseDouble(strArray[1]);
	        	//gender is our desired output
	        	gender = Integer.parseInt(strArray[2]);
	
	         
	        	//hard activation
	        	if(((weight*x) + (height*y) + bias)<=0)
	        	{
	        		out=0;
	        	}
	        	else
	        	{
	        		out=1;
	        	}
	        	
	        	
	        	//soft activation
	        	//out=(1/(1+Math.exp(-((weight*x) + (height*y) + bias))));
	         
	        	//gender being desired and out being the actual based on equation
	        	if (gender != out)
	        	{
	        		error+=(gender-out);
	        		//error++;
	        	}	
	         
	         
	        	weightChange=learnCof*(gender-out);
	        	
	
	        	x+=(weight*weightChange);
	        	y+=(height*weightChange);
	        	bias+=(weightChange);
	        	
	        	
	         
	        }
	        train75.close();
	        //error=Math.pow(error, 2);
	        error = error/3000;
	        n++;
    }
	    System.out.println("Hard Activation with 75% training - error: "+error);
	    System.out.println("Hard Activation with 75% training - equation: "+x+ "x "+y+"y + "+bias);
            
    	 return "" + x + "\t" + y + "\t" + bias;
    }
    public static String hardActivation25() throws FileNotFoundException
    {
    	double height, weight;
	    int gender;
	    double error=1;
	    double learnCof = 0.6;
	    double weightChange=0;
    
	    double x, y, bias;
	    Random random = new Random();
	    x = random.nextDouble();
	    y = random.nextDouble();
	    bias = random.nextDouble();
    
    
	    String[] strArray= new String[3];
	   
	    String temp;
	    
	    double out = 0.0;
	    int n = 0;
	    while (error>0.00001 && n < 10500)
	    {
	        error = 0;
	        Scanner train75 = new Scanner (new File("new data.txt"));
	        for(int i = 0; i < 1000; i ++)
	        {
	        	temp = train75.nextLine();
	        	strArray = temp.split("\t");
	        	height = Double.parseDouble(strArray[0]);
	        	weight = Double.parseDouble(strArray[1]);
	        	//gender is our desired output
	        	gender = Integer.parseInt(strArray[2]);
	
	         
	        	//hard activation
	        	if(((weight*x) + (height*y) + bias)<=0)
	        	{
	        		out=0;
	        	}
	        	else
	        	{
	        		out=1;
	        	}
	        	
	        	
	        	//soft activation
	        	//out=(1/(1+Math.exp(-((weight*x) + (height*y) + bias))));
	         
	        	//gender being desired and out being the actual based on equation
	        	if (gender != out)
	        	{
	        		error+=(gender-out);
	        		//error++;
	        	}	
	         
	         
	        	weightChange=learnCof*(gender-out);
	        	
	
	        	x+=(weight*weightChange);
	        	y+=(height*weightChange);
	        	bias+=(weightChange);
	        	
	        	
	         
	        }
	        train75.close();
	        //error=Math.pow(error, 2);
	        error = error/1000;
	        n++;
    }
	    System.out.println("Hard Activation with 25% training - error: "+error);
	    System.out.println("Hard Activation with 25% training - equation: "+x+ "x "+y+"y + "+bias);
    	
             return "" + x + "\t" + y + "\t" + bias;
    }
    
}


