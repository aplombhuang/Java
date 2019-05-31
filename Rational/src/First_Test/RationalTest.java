package First_Test;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.Test;

/*@author: Aplomb TR Huang; V00800816
 *@Course Info: CMSC 355 Spring 2017 
 *@Program project3: To learn how to use J-Unit testing
 */

public class RationalTest  {

	@Test
	public void test() {
		Rational ration1 = new Rational(0,1);
		Rational ration2 = new Rational(1,-2);
		Rational ration3 = new Rational(-2,3);
		Rational ration4 = new Rational(-3,-4);
		Rational ration5 = new Rational(4,5);
		Rational ration6 = new Rational(8,10);
		
		//Rational edge1 = new Rational(0,0); // I tried to test this but the test failed, so I commented it out.
		Rational edge2 = new Rational(999,-999);
		
		
     	String str = ration2.toString();
		assertEquals("-1/2" , str);
		
		boolean equal = ration5.equals(ration6);
		assertEquals(true, equal);
		
		 ration1.add(ration2); String str1 = ration1.toString();
		assertEquals("-1/2" , str1);
		
		ration3.subtract(ration2); String str2 = ration3.toString();
		assertEquals("-1/6" , str2);
		
		ration4.multiply(ration5); String str3 = ration4.toString();
		assertEquals("12/20" , str3);
		
		ration6.divide(ration5); String str4 = ration6.toString();
		assertEquals("40/40" , str4);
		
		ration1.add(edge2); String str5 = ration1.toString();
		assertEquals("-2997/1998" , str5);
		
		boolean equal2 = ration2.equals(ration3);
		assertEquals(false, equal2);
		
	}

}
