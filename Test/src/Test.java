import java.util.Scanner;

public class Test
{
	private static void printHeading()
	   {
	       System.out.println("My name is Aplomb TR Huang");
	         System.out.println("My student ID is 6856925");
	         System.out.println("My course is: CSC201-01PR, Spring 2016");
	         System.out.println("My instructor is Debra Duke");
	         System.out.println("This is lab 8 part 3");
	         System.out.println("Promp the user to enter 3 words, compare and display the one in the middle.");
	         System.out.println("");
	   }
	
public static void main(String[] args)
 {
	  printHeading();
	  
 Scanner input = new Scanner(System.in);
 
 String word_1st = ""; String word_2nd = ""; String word_3rd = "";
 
 System.out.println("Please enter 3 words with space in between.");
 
 word_1st = input.next();
   
 word_2nd = input.next();
                
 word_3rd = input.next();
    
 int num1 = word_1st.compareTo(word_2nd);
 
 int num2 = word_2nd.compareTo(word_3rd);
 
 int num3 = word_3rd.compareTo(word_1st);
 
 if(num1 <= 0)
 {
   if(num2 <=0)
   {
   System.out.println("The middle-value String is " + word_2nd);
   }
   else
   {
     if(num3 <= 0)
     {
       System.out.println("The middle-value String is " + word_1st);
     }
     else
     {
       System.out.println("The middle-value String is " + word_3rd);
     }
     
   }
   
 }
 else
 {
 	if(num2 >0)
     {
     System.out.println("The middle-value String is " + word_2nd);
     }
     else
     {
       if(num3 <= 0)
       {
         System.out.println("The middle-value String is " + word_3rd);
       }
       else
       {
         System.out.println("The middle-value String is " + word_1st);
       }
 }
     
        
}
 
 double f = 3.14;
 int n = (int)Math.round(f);
 
 System.out.println(factorial(5));
 
 System.out.println("Sub 5 = " + addsub(5, true) + ", Add 6 = " + addsub(6,false));
 
 String str = "Hello";
 //boolean flag = stringE(str);
 //System.out.println(flag );
 
}
public static int factorial(int num)
{
    if(num == 1)
    {
        return 1;
    }
    return num*factorial(num-1);
}

public static int addsub(int a, boolean isSub)
{
    return(isSub ? sub(a) : a+1);
}

public static int sub(int a)
{
    return a -1;
}

public boolean stringE(String str) {
  int count = 0; int times = 0; int length = str.length();
  
  do{
  
     if(str.charAt(times)=='e'){count++;}
     
     times++;
  
  }while(times <= length);
  
  if(count >=1 && count <=3){return true;}
  
  else return false;
  
}

}


