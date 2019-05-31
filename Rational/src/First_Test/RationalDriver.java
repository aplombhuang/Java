package First_Test;

import java.io.*;

public class RationalDriver
{

	public static void main(String[] args)  throws IllegalArgumentException
	{
		Rational ration1 = new Rational(0,1);
		Rational ration2 = new Rational(1,-2);
		Rational ration3 = new Rational(-2,3);
		Rational ration4 = new Rational(-3,-4);
		Rational ration5 = new Rational(4,5);
		Rational ration6 = new Rational(8,10);
		
		//Rational edge1 = new Rational(0,0);
		Rational edge2 = new Rational(999,-999);
		
		
     	String str = ration6.toString();
		
     	System.out.println(str);
		
        boolean equal = ration5.equals(ration6);


	}

}
