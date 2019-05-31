import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class cw5_2 {
	public static void main(String arg[])
	{
List <String> someList = new ArrayList<String>();
		
		someList.add("Barb");
		someList.add("Jack");
		someList.add("Cal");
		someList.add("James");
		someList.add("Abe");
		someList.add("Jimmy");
		someList.add("Fred");
		someList.add("John");
		someList.add("Dan");
		someList.add("Jane");
		someList.add("Jones");
		
		List<String> collect = someList.stream().filter(
				(s)->{
					String z = s.toUpperCase();
					if(z.substring(0, 1).compareTo("J")==0){return true;}
					else {return false;}
					
				}).collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(collect, (s1,s2)->s1.compareTo(s2));
		System.out.println(collect);
		
		
		
	}

}
