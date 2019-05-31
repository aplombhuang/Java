
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    System.out.println((a + b) / c);   
// 3 and 4 are added with sum 7       
// 7 is divided by 5 with quotient 2 
    
    System.out.println(a + b / c);       
// 4 is divided by 5 with quotient 0       
// 3 is added to 0 with sum 3
    
    System.out.println(a++); //3 is displaced  then 3+1 =4    
    System.out.println(a--); //3 is displaced  then 3 -1 =2    
    System.out.println(a + 1); //  3 + 1 =4, then 4 is displaced     
    System.out.println(d % c); //17 divided by 5, reminder 2, and 2 is displaced      
    System.out.println(d / c); // 17 divided by 5 = 3, 3 is displaced      
    System.out.println(d % b);//17 divided by 4, reminder 1, and 1 is displaced       
    System.out.println(d / b); // 17 divided by 4 = 4, and 4 is displaced       
    System.out.println(d + a / d + b); // 17 add the quotient of 3 divided by 17 which = 0, then add 4, the sum is 21, 21 is displaced     
    System.out.println((d + a) / (d + b));  // the sum of  17 add 3, divided by the sum of 17+4, which is 0, and 0 is displaced     
    System.out.println(Math.sqrt(b)); // the square root of 4, which is 2, and 2 is displaced      
    System.out.println(Math.pow(a, b));//3 to the power of 4,  which is 81, and 81 is displaced      
    System.out.println(Math.abs(-a));//absulute value of -3 ,which is 3, and 3 is displaced
    System.out.println(Math.max(a, b)); // the maximum number of 3 and 4, 4 is displaced    
  } 
} 
