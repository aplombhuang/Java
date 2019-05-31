
/** @PROGRAMMER:  APLOMB TR HUANG
*** @ORGANIZATION: VCU LIBRARY
*** @PURPOSE: This program will separate edition and publish year
**/
		
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Edition_Yr_Filter
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("ED_YR_DATA_IN.txt")); // This is where the orginal isbn is stored
		
		ArrayList <String> inStr = new ArrayList<>(); // this array list stores the lines taken from txt file
		
		ArrayList <String> toString = new ArrayList<>(); // this array list will store out put after dashes are removed and prepare to print to file.
		
		while(input.hasNextLine()) {inStr.add(input.nextLine());} //read all the lines from txt file and store in inStr array
		
		input.close(); // close file
		
		for(String str: inStr) // this for loop will scan through all isbns
		{
			int l = str.length(); // find the length of the isbn 
			
			String temp = ""; //this is a temporary string to store different sbustrings of isbn and ready to add to output array.
			
			String edition = "NULL";  // this is a string that stores edition information
			
			String year = "NULL"; // this is a string that stores the publishing year
			
			if(l==1)
			{
				if(isInt(str)) {year = "200"+str;} // if the string is an integer, meaning its in single digit year, so we add it up to 2000s
				else {} // if string is not an integer, we consider both info are null
			}
			else if(l == 2)
			{
				if(isInt(str)) // if the string is an integer, meaning its in double digits year,
				{ 
					int n = Integer.parseInt(str);
				    
					if(n<20) {year = "20"+str;} // since year is double digit, we add up to 2000s if the last digit is smaller than 20 (between 2000 and 2019)
					
					else {year = "19"+str;} // since year is bigger than 20, then we add up to 1900s (between 1920 and 1999) 					
				} 
				else {edition = str;} // if string is not an integer, we store it as edition information
			}
			else if(l == 3)
			{
				if(isInt(str.substring(2))) // if the last character of the string is an integer, meaning its a single digit year,
				{ 
					year = "200"+ str.substring(2); // since the year is single digit, we add up to 2000s
					
				} 
				else {edition = str;} // if string is not an integer, we store it as edition information
			}
			else if(l == 4)
			{
				if(isInt(str)) // if the last character of the string is an integer, meaning its full 4 digit year,
				{ 
					year = str; // since the year is single digit, we add up to 2000s					
				}
					else {edition = str;} // if string is not an integer, we store it as edition information
			}
			else if(l == 5)
			{
				System.out.println("there's a length of 5 : " + str); // since I never found a string of 8 in year, and edition, so  this becomes a notice
			}
			else if(l == 6)
			{
				if(isInt(str.substring(2))){year = str.substring(2); edition = str.substring(0,1); } // if the last 4 digit is year, store year and the rest as edition
				
			    else if(isInt(str.substring(4))) // if the last character of the string is an integer, meaning its a double digit year,
				{ 
					int n = Integer.parseInt(str.substring(4)); 
					
					if(n<20) {year = "20"+str.substring(4);} // since year is double digit, we add up to 2000s if the last digit is smaller than 20 (between 2000 and 2019)
					
					else {year = "19"+str.substring(4);} // since year is bigger than 20, then we add up to 1900s (between 1920 and 1999) 
					
					edition = str.substring(0,3); // store the first character of the string as edition since the middle character is an empty space " " .
				} 
				else {edition = str;} // if string is not an integer, we store it as edition information
			}
			else if(l == 7)
			{
				if(isInt(str.substring(5))) // if the last character of the string is an integer, meaning its a double digit year,
				{ 
					int n = Integer.parseInt(str.substring(5));
					
					if(n<20) {year = "20"+str.substring(5);} // since year is double digit, we add up to 2000s if the last digit is smaller than 20 (between 2000 and 2019)
					
					else {year = "19"+str.substring(5);} // since year is bigger than 20, then we add up to 1900s (between 1920 and 1999) 
					
					edition = str.substring(0,4); // store the first character of the string as edition since the middle character is an empty space " " .
				} 
				else {edition = str;} // if string is not an integer, we store it as edition information
				
			}
			else if(l == 8)
			{
				System.out.println("there's a length of 5 : " + str); // since I never found a string of 8 in year, and edition, so  this becomes a notice
			}
						
			temp = edition + ", " + year;
			
			toString.add(temp); // add dash-free isbn to the toString array and ready for output to txt file. 
		}
		
		try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ed_yr_data_out.txt", true))); // create or replace the output txt file
            
            for(String printStr : toString ) {out.println(printStr);} // print all output to txt file
           
            out.close(); // close file
        	} catch (IOException e) {            //exception handling left as an exercise for the reader
        						}
	
		
	}
	
	public static boolean isInt(String s)// static method to determin if the string is an integer
	{
	    try
	    {
	        Integer.parseInt(s); // try to parse the string into int 
	        return true; //if successful, return true
	    } catch (NumberFormatException ex)
	    {
	        return false; // if unsuccessful, return false
	    }
	}
}
