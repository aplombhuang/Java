import java.util.Scanner;

public class MiddleInitial
{
  public static void main(String[] args)
  {
    System.out.println("What is your middle initial");
    Scanner inPut = new Scanner(System.in);
    String input = inPut.next();
    char letter = input.charAt(0);
    if(Character.isLetter(letter))
    {
      if(Character.isUpperCase(letter))
      {
        System.out.println("You entered" + letter);
      }
      else
      {
        System.out.println("Initials are usually upper case.");
      }
    }
    else
    {
      System.out.println("The initial should be letters.");
    }
    
  }
    

}