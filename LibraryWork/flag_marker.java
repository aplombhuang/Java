/** @PROGRAMMER:  APLOMB TR HUANG
*** @ORGANIZATION: VCU LIBRARY
*** @PURPOSE: This program will mark all add on's in title 
***           that is separated by "w/"
**/
		
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class flag_marker 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("BOOK_TITLE_IN.txt")); // This is where the orginal isbn is stored
		
		String in = ""; String accFlag = "NULL"; String dskFlag = "NULL"; //string variable to store input string, 2 different flags
		
		ArrayList <String> toString = new ArrayList<>(); // this array list will store out put after dashes are removed and prepare to print to file.
		
		while(input.hasNextLine()) //read all the lines from txt file and store in inStr array
		{
			in = input.nextLine(); // store each line into the string variable in
			
			String[] temp = in.split("W/", 2); // try to split the string in to 2 part by using "W/" as marker
			
			if(temp.length>1) // if there are 2 strings after the split
			{
					String flag = temp[1]; // the flags are in the second part of the splitted string
					
					if(flag.length()>5) 
					{
						accFlag = "YES"; // since the flag string is longer than 4, which rules out dvd or cd, then access code must be there
								
						if(flag.contains("DVD") || flag.contains("CD")) {	dskFlag = "YES"; 	} // find out if there's cd or dvd
						else {dskFlag = "NULL";} // if not then disk is null
						
					}					
					else {   accFlag = "NULL"; dskFlag = "YES";  	} // since string lenght is smaller than 4 there must be dvd or cd so access flag is null, cd or dvd is yes
					
			}
			else 
			{  String flag = temp[0]; // the flags are in the second part of the splitted string
			
				dskFlag = "NULL";
				
				if(flag.contains("ACCESS")) {accFlag = "YES";}
				else {accFlag = "NULL";}
				
			} // there the input string cannot be splitted, there's no flag at all
			
			in = accFlag + ", " + dskFlag; // join the 2 flags 
			
			toString.add(in); // add the joint flags to output string
		
		} 
		
		input.close(); // close file
				
		try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("flag_data_out.txt", true))); // create or replace the output txt file
            
            for(String printStr : toString ) {out.println(printStr);} // print all output to txt file
           
            out.close(); // close file
        } catch (IOException e) {            //exception handling left as an exercise for the reader
        						}

	}
}
