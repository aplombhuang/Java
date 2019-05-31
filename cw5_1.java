import java.util.*;


public class cw5_1 {
	
	public static void main (String args[])
	{
		List <String> someList = new ArrayList<String>();
		
		someList.add("Barb");
		someList.add("Cal");
		someList.add("Abe");
		someList.add("Fred");
		someList.add("Dan");
		
		Collections.sort(someList ,
				(String s1, String s2)-> s1.compareTo(s2));
				for (String s:someList){System.out.println(s);}
	}

}
