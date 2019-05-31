/*
 * @Programmer: Aplomb Tr Huang; ID#: 6856925
 *@Class: CSC 205 FALL 2016;
 *@Instructor: Diana Merkel;
 *Program Project # 1; 
 *The purpose of the program is to convert numbers between different bases, so it saves us trouble of doing them by hand.
 *The program will take integer input for base number; it will take the mixture of numeric or alphabet input for the number that needs conversion
 *The program will display the result of numeric conversion as a string with a mixture of numbers and alphabets.
 *
 */
 
import java.util.*;

public class NumericConversion {

	public static void main(String[] args) //Main method only prompts for input and display output.
	{ printHeading(); 
	int n = 0; int base1, base2; //integer stores input of base numbers
	
	long base10; // the intermediate product of the conversion is a number in base 10, the number is stored as long.
	
	String inNumb, outNumb;//String for input and output.
	
	String [] letters ={"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j", "k" , "l" , "m" , "n" , "o"};
	//array stores all the possible number or alphabet needed in increasing order.
	  do{	
			System.out.println("Please enter the base of the number to be converted. \n Pick an interger from 2 - 25. \n Enter 0 to exit the program.");
			
			base1 = intChecker(); n = base1;
			
			System.out.println("Please enter a positive number to be converted: ");
			
			inNumb = numCheck(base1, letters);
			
			base10 = StrToNumb(inNumb, base1);
		    
			System.out.println("Please enter the target base. \n Pick an interger from 2 - 25. \n Enter 0 and the program will quit.");
			
			base2 = intChecker(); n = base2;
				  	
			outNumb = NumbToStr(base10, base2, letters); 
			
			System.out.println(inNumb + " base "+ base1 + " equals " + outNumb + " base " + base2);
			
	  }while(n != 0);// when 0 is entered, program will stop.
		
	
	}

	private static void printHeading()
	 {
		 System.out.println("Student Name: Aplomb TR Huang. Student ID #: 6856925.");
		 System.out.println("CSC 205 Fall 2016");
		 System.out.println("Programming Project 1.");
		 System.out.println("This program would perform a series of Numeric Conversions.\n");
	 }
	
	public static int intChecker()// this method takes the base numeric input and checks for error.
	{int numb = 26;
	   while(numb >= 26){
		  
		   Scanner inPut = new Scanner(System.in);
	
		   if(inPut.hasNextInt()){ numb = inPut.nextInt();
			   
			   if(numb == 0){System.out.println("0 is entered, System will exit now."); numb = 0;System.exit(0);}
			   
			   else if(numb < 2){System.out.println("Input data error, please try again and pick an interger from 2 to 25, or press 0 to quit."); numb = 26;}
			   
			   else if(numb > 25){System.out.println("Input data error, please try again and pick an interger from 2 to 25, or press 0 to quit.");}
		   }
    	   else{System.out.println("Input data type error, please try again and pick an interger from 2 to 25, or press 0 to quit.");}
		  
	   }		return numb;
	  }
	
	public static String numCheck(int base, String [] letters)//this method takes the number that needs to be convert and checks for error
	{  boolean correct = false; boolean checks = false; String str = "";
		
	  while(correct == false){
		  Scanner inPut = new Scanner(System.in); str = inPut.next();  int letter = str.length();int numb = 0;
		  		  
		  if(letter > 0){
	     
			  do{ String str1 = str.substring(numb,numb+1);	checks = false;  int i = 0;
			  
				  while( checks == false && i< base)  {  if(str1.equalsIgnoreCase(letters[i])){checks = true;  } else{checks = false;} i++; }
					  
					 correct =  checks; numb ++;
					 
				 }while( numb < letter && checks == true);	 if(correct == false){ System.out.println("Input data type error, please try to enter the number again.");}
	     
	     }else{System.out.println("This is an empty input, please try to enter the number again.");}
	 }
	  	
	return str;	
	}
	
	 public static long StrToNumb(String str, int base) //this method converts number of any bases to a number in base 10.
	 {long numb = 0L; int value = 0; int j = 0;         
	 	for(int i = str.length(); i>0; i--)
	 	{ String str1 = str.substring(i-1, i);
	 		if(str1.equals("0")){value = 0;}
	 		else if(str1.equals("1")){value = 1;}
	 		else if(str1.equals("2")){value = 2;}
	 		else if(str1.equals("3")){value = 3;}
	 		else if(str1.equals("4")){value = 4;}
	 		else if(str1.equals("5")){value = 5;}
	 		else if(str1.equals("6")){value = 6;}
	 		else if(str1.equals("7")){value = 7;}
	 		else if(str1.equals("8")){value = 8;}
	 		else if(str1.equals("9")){value = 9;}
	 		else if(str1.equalsIgnoreCase("a")){value = 10;}
	 		else if(str1.equalsIgnoreCase("b")){value = 11;}
	 		else if(str1.equalsIgnoreCase("c")){value = 12;}
	 		else if(str1.equalsIgnoreCase("d")){value = 13;}
	 		else if(str1.equalsIgnoreCase("e")){value = 14;}
	 		else if(str1.equalsIgnoreCase("f")){value = 15;}
	 		else if(str1.equalsIgnoreCase("g")){value = 16;}
	 		else if(str1.equalsIgnoreCase("h")){value = 17;}
	 		else if(str1.equalsIgnoreCase("i")){value = 18;}
	 		else if(str1.equalsIgnoreCase("j")){value = 19;}
	 		else if(str1.equalsIgnoreCase("k")){value = 20;}
	 		else if(str1.equalsIgnoreCase("l")){value = 21;}
	 		else if(str1.equalsIgnoreCase("m")){value = 22;}
	 		else if(str1.equalsIgnoreCase("n")){value = 23;}
	 		else if(str1.equalsIgnoreCase("o")){value = 24;}
	 			 		
	 		numb = (long) (numb + (value*Math.pow(base,j))); // To do that I convert the face value of each digit and multiply it by the place value and take the sum.
	 		
	 		j++;
	 	}
	 
	 return numb;
	 }
	 
	 public static String NumbToStr(long numb, int base, String letters[]) // this method converts the intermediate base 10 number to the target base number and stores the result as a string.
	 {String str = ""; 	    long quot = numb; int remainder = 0;           // To do that I divided the number in base 10 by the target base, and take remainder. 
	  do{   remainder = (int) (quot%base);
		  
		  str = letters [remainder] + str;//the result is organized in the opposite order of right to the left
		  
	  		quot = quot/base;
	  		
	  }while(quot !=0);
	 
	 return str;	 
	 }
}
