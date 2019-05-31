import java.util.Scanner;

public class Convert
{
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner (System.in);
    
    Convert tc = new Convert();
    
    System.out.println("I am the converter.");
    
    System.out.print("Input temp?");
    
    double itemp = scanner.nextDouble();
    
    System.out.print("input units?");
    
    String iu = scanner.next();
    
    System.out.print("Output units?");
    
    String ou = scanner.next();
    
    //
    double otemp = tc.converTemp(itemp, iu, ou);
    //
    System.out.println("The answer is "+ otemp);
    
    
      
  }// end main() method
}//end class

  