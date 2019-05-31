
/** @PROGRAMMER:  APLOMB TR HUANG
*** @ORGANIZATION: VCU LIBRARY
*** @PURPOSE: This program will remove all the dashes "-" from isbn
**/
		
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ISBN_Filter 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("ISBN_DATA_IN.txt")); // This is where the original isbn is stored
		
		ArrayList <String> toString = new ArrayList<>(); // this array list will store out put after dashes are removed and prepare to print to file.
		
		while(input.hasNextLine()) //read all the lines from txt file
		{
			String in = input.nextLine(); //read each line to a temporary string 
			
			String[] tempArr = in.split("-", 6); // split the input string according to the dashes and store in a temporary array
			
			String temp = tempArr[0] + tempArr[1] + tempArr[2] + tempArr[3] + tempArr[4]; 
			//this is a temporary string to store different substrings of isbn and ready to add to output array.
			
			toString.add(temp); // add dash-free isbn to the toString array and ready for output to txt file. 
						
		} 
		
		input.close(); // close file
		
		try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("isbn_data_test2.txt", true))); // create or replace the output txt file
            
            for(String printStr : toString ) {out.println(printStr);} // print all output to txt file
           
            out.close(); // close file
        } catch (IOException e) {            //exception handling left as an exercise for the reader
        						}
		
	}
}
