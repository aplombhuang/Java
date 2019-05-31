import java.util.Arrays;

/*@Programmer: Aplomb TR Huang
 *@Project # 2 : Stat
 *@Instructor: George Cardwell
 */


public class Stat {
	
	private int [] numbers = new int []{81,1,8,69,30,34,0,0,56,54,2,6,21,14,46,136,17,23,2,0,1,5,71,105,39,10,40,1,0,7,4,0,23,53,4,27,1,11,0,14,
			19,23,105,4,0,24,4,0,63,6};
	
	private int [] sorted;
	
	private double sum;
	
	private double mean;
	
	private double median;
	
	private double frst_quatile;
	
	private double thrd_quatile;
	
	private String Mode;
	
	private double variance;
	
	private double standardD;
	

	public static void main(String[] args) 
	{
		printHeading();
		
		Stat stat1 = new Stat();
		
		System.out.println("The original numbers are:\n" + stat1.printArray() + "\n");
		
		System.out.println("The sorted numbers are:\n" + stat1.printSorted() + "\n");
		
		System.out.println("The minimum of all numbers is: " + stat1.getsmallest() + "\n");
		
		System.out.println("The maximum of all numbers is: " + stat1.getbiggest() + "\n");
		
		System.out.println("The range is from " + stat1.getsmallest() +" to "+ stat1.getbiggest() + ".\n");
		
		System.out.println("The mean of all the numbers is: " + stat1.getMean()+ "\n");
		
		System.out.println("The median of all the numbers is: " + stat1.getMedian()+ "\n");
		
		System.out.println("The mode of all the numbers is: " + stat1.getMode()+ "\n");
		
		System.out.println("The first quatile of all the numbers is: " + stat1.get1st_quatile()+ "\n");
		
		System.out.println("The third quatile of all the numbers is: " + stat1.get3rd_quatile()+ "\n");
		
		System.out.println("The Variance of all the numbers is: " + stat1.getVariance()+ "\n");
		
		System.out.println("The Standard Deviation of all the numbers is: " + stat1.getSD() + "\n");
		

	}
 private static void printHeading()
 {
	 System.out.println("Student Name: Aplomb TR Huang. Student ID #: 6856925.");
	 System.out.println("CSC 202 Fall 2016");
	 System.out.println("This program would perform a series of statistical calculations.\n");
 }
 
 public Stat ()
 {
	printArray();  setSorted(); 
	printSorted(); setMean(); 
	setMedian(); setMode(); 
	set1st_quatile(); set3rd_quatile(); 
	setVariance(); setSD();
 }
 
 private String printArray()
 {	String str= ""; 
 
	 for(int numb: numbers){str = str + numb + " ";}
	 
	 return str;
 }
 
 private String printSorted()
 {
	 String str= ""; 
	 
	 for(int numb: sorted){str = str + numb + " ";}
	 
	 return str;
 }
 

 // The following are the setters:
 
 
 private void setSorted() // Sort method used is insertion sort
 {int [] temp= Arrays.copyOf(numbers, numbers.length);
  
 	int temp1 =0 ;
  
 	for( int i = 1 ; i < numbers.length; i++)
 	{
	   for(int k = i; k>=1 && temp[k]<temp[k-1] ; k--)
	   {
		   temp1 = temp[k-1]; temp[k-1]= temp[k]; temp[k]= temp1; 
	   }
	 }
 	
 	sorted = temp;
 }
 
 private void setMean()
 {
	 for (int number : numbers) { sum = sum + number; }
	 
	 mean = sum/numbers.length; 
 }
 
 private void setMedian()
 {	 int num1, num2, num3; num1 = sorted.length%2;// see if the total number count is even or odd
 
	 if(num1 == 0)
	 {num2 = sorted.length / 2; num3 = num2+1;
		 
	  median = (sorted[num2]+ sorted[num3])/2.0;
	 }
	 
	 else
	 { num2 = (sorted.length+1) / 2;
	 
	  median = sorted[num2];		 
	 }
 }
 
 private void set1st_quatile()
 {
	 int num1, num2, num3; num1 = sorted.length%2;
	 
	 if(num1 == 0)
	 {num2 = sorted.length%4;// see if the left half of number-count is an even number
	 	if(num2 == 0)
	 	{num2 = sorted.length / 4; num3 = num2+1;
		 
	     frst_quatile = (sorted[num2]+ sorted[num3])/2.0; }
	 
	 	else
	 	{ num2 = ((sorted.length/2)+1) / 2;
	 
	     frst_quatile = sorted[num2];}
	 
	 }
	 
	 else
	 { num2 = (sorted.length+1)%4;
	 	if(num2 == 0)
	 	{num2 = (sorted.length+1)/4; num3 = num2+1;
		 
	     frst_quatile = (sorted[num2]+ sorted[num3])/2.0;}
	 
	 	else
	 	{ num2 = (((sorted.length+1) / 2)+1)/2;
	 
	   frst_quatile = sorted[num2];	}	 
	 }
 }
 
 private void set3rd_quatile()//method is the same as first quatile, only thing change is to add the median to the quatile.
 {
	 int num1, num2, num3; num1 = sorted.length%2;
	 
	 if(num1 == 0)
	 {num2 = sorted.length%4;
	 	if(num2 == 0)
	 	{num2 = sorted.length*3/4; num3 = num2+1;
		 
	 	thrd_quatile = (sorted[num2]+ sorted[num3])/2.0; }
	 
	 	else
	 	{ num2 = (((sorted.length/2)+1) / 2) + sorted.length/2;
	 
	 	thrd_quatile = sorted[num2];}
	 
	 }
	 
	 else
	 { num2 = (sorted.length+1)%4;
	 	if(num2 == 0)
	 	{num2 = (sorted.length+1)*3/4; num3 = num2+1;
		 
	 	thrd_quatile = (sorted[num2]+ sorted[num3])/2.0;}
	 
	 	else
	 	{ num2 = ((((sorted.length+1) / 2)+1)/2)+ ((sorted.length+1) / 2);
	 
	   thrd_quatile = sorted[num2];	}	 
	 }
 }
 
 private void setMode()
 { int mode =0, temp =0, i= sorted[0], count = 0; String str = "";
 
	 for(int numb: sorted)//this loop finds the highest repeating times
	 {
		 if(numb == i){count++;}
		 
		 else
		 	{i = numb; temp = count; count = 1;
		 	  
		 	if(temp >= mode){mode = temp;}
		 	}
	 }
	 
	 i= sorted[0]; count = 0;
	 
	 for(int numb1: sorted)// this loop finds the number that repeated the most times.
	 {
		 if(numb1 == i){count++;}
		 
		 else
		 	{if(count == mode){str = str + i + " "; i = numb1; count =1;} 	
		 	else i = numb1; count = 1;}
	 }
	 
	 Mode = "Mode are the following numbers: " + str + ". They all occur " + mode + " times.";
	 
 }
  
 private void setVariance()
 { 
 for(int number: numbers){sum = sum + Math.pow((number - mean),2);}
 
 variance = sum/(numbers.length - 1);
 }
 
 private void setSD() {	 standardD = Math.sqrt(variance); }
 
 
 // the following are the getters:
 
 private int [] getArray() { return numbers; }
 
 private int [] getSorted(){return sorted;}
 
 private int getsmallest() { return sorted[0]; }
 
 private int getbiggest() { return sorted[sorted.length-1]; }
  
 private double getMean(){return mean;}
 
 private double getMedian(){return median;}
 
 private double get1st_quatile(){return frst_quatile;}
 
 private double get3rd_quatile(){return thrd_quatile;}
  
 private String getMode(){return Mode;}
 
 private double getVariance(){return variance;}
  
 private double getSD(){return standardD;}
  
}
