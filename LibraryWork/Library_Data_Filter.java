
/** @PROGRAMMER:  APLOMB TR HUANG
*** @ORGANIZATION: VCU LIBRARY
*** @PURPOSE: This program will filter all the different fields in the excel
**/
		
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library_Data_Filter 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ISBN_Filter("ISBN_DATA_IN.txt"); // this is where you put in the name of the txt file that stores the isbn information
		
		Flag_Maker("BOOK_TITLE_IN.txt"); // this is where you put in the name of the txt file that stores the title information
		
		Edition_Yr_Filter("ED_YR_DATA_IN.txt"); // this is where you put in the name of the txt file that stores the year/edition information
		
		Course_Code_Separator("COURSE_HCOUNT_IN.txt"); // this is where you put in the name of the txt file that stores the course code information
		
		Course_ID_Generator("COURSE_ID_GEN_IN.txt", "20172"); //this is where you put in the name of the txt file that stores the course number and professor information
		                                              // put in year following with a code , 2 for fall, 0 for spring, 1 for summer,
	}
	
	public static void ISBN_Filter(String fileName) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(fileName)); // This is where the original isbn is stored
		
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
	
	public static void Flag_Maker(String fileName) throws FileNotFoundException
	{
       Scanner input = new Scanner(new File(fileName)); // This is where the orginal isbn is stored
		
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

    public static void Edition_Yr_Filter(String fileName) throws FileNotFoundException
    {
    	Scanner input = new Scanner(new File(fileName)); // This is where the orginal year and edition is stored

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
				System.out.println("there's a length of 8 : " + str); // since I never found a string of 8 in year, and edition, so  this becomes a notice
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

    public static void Course_Code_Separator(String fileName) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File(fileName)); // This is where the orginal isbn is stored
		
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
    
    public static void Course_ID_Generator(String str1, String str2) throws FileNotFoundException
    {
    Scanner input = new Scanner(new File(str1)); // This is where the original isbn is stored
		
		ArrayList <String> toString = new ArrayList<>(); // this array list will store out put after dashes are removed and prepare to print to file.
		
		String deptTemp = "";  String cNumTemp = ""; String prfTemp = ""; 
		
		int deptCode = 0; int sesCode = 0; int courseCode = 0;
		
		while(input.hasNextLine()) //read all the lines from txt file
		{
			String in = input.nextLine(); //read each line to a temporary string 
			
			String[] tempArr = in.split("\t"); // split the input string according to the dashes and store in a temporary array
								
			if(!tempArr[0].equalsIgnoreCase(deptTemp)) {deptCode ++; deptTemp = tempArr[0];}
			
			if(!tempArr[1].equalsIgnoreCase(cNumTemp)) {courseCode = tryParse(tempArr[1]); cNumTemp = tempArr[1]; sesCode = 0;}
			
			if(!tempArr[2].equalsIgnoreCase(prfTemp)) {sesCode ++; prfTemp = tempArr[2];}
			else {if(sesCode==0) {sesCode = 1;}}
			
			String temp = ""; //this is a temporary string
			
			if(deptCode<10) {temp = "0"+ deptCode+"";}
			
			else {temp = temp + "" + deptCode + "";}
			
			if(courseCode<100) {temp = temp + "00" + courseCode + "";}
			else{temp = temp + "" + courseCode + "";}
			
			if(sesCode<10) {temp = temp + "0" + sesCode + "";}
			else{temp = temp + "" + sesCode + "";}
			
			temp = temp + str2; // attach year code to the end of course id show different year and semester
			                       //and ready to add to output array.
			
			toString.add(temp); // add the finished course id to the toString array and ready for output to txt file. 
						
		}
		
		input.close(); // close file
		
		try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("course_Id_out.txt", true))); // create or replace the output txt file
            
            for(String printStr : toString ) {out.println(printStr);} // print all output to txt file
           
            out.close(); // close file
        } catch (IOException e) {            //exception handling left as an exercise for the reader
        						}

    }
    
    public static int tryParse(String str)
	{
		int coursecode = 0;
		
		Scanner code = new Scanner(str); 
		
		if(code.hasNextInt()) {coursecode = Integer.parseInt(str);}
			
		
		return coursecode;
	}
}
