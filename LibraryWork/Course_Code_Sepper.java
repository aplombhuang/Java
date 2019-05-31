
/** @PROGRAMMER:  APLOMB TR HUANG
*** @ORGANIZATION: VCU LIBRARY
*** @PURPOSE: This program will separate course code and course number
**/
		
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Course_Code_Sepper 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("COURSE_HCOUNT_IN.txt")); // This is where the orginal isbn is stored
		
		ArrayList <String> inStr = new ArrayList<>(); // this array list stores the lines taken from txt file
		
		ArrayList <String> toString = new ArrayList<>(); // this array list will store out put after dashes are removed and prepare to print to file.
		
		while(input.hasNextLine()) {inStr.add(input.nextLine());} //read all the lines from txt file and store in inStr array
		
		input.close(); // close file
		
		for(String str: inStr) // this for loop will scan through all isbns
		{
			String course = ""; //this is a temporary string to store different sbustrings of course name and ready to add to output array.
			
			String cNumber = ""; //this is a temporary string to store different sbustrings of course number and ready to add to output array.
			
			course = str.substring(0, 4); // pick the first 4 characters and store the sub string
			
			cNumber = str.substring(4);
			
			String temp = course + ", " + cNumber;
			
			toString.add(temp); // add dash-free isbn to the toString array and ready for output to txt file. 
		}
				
		try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("course_hcount_out.txt", true))); // create or replace the output txt file
            
            for(String printStr : toString ) {out.println(printStr);} // print all output to txt file
           
            out.close(); // close file
        } catch (IOException e) {            //exception handling left as an exercise for the reader
        						}
		

	}
}
