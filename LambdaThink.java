import java.util.*;
import java.util.stream.*;
public class LambdaThink {
   public static void main(String[] args){
      List<String> someList = new ArrayList<String>();
      
      someList.add("Barb");
      someList.add("Cal");
      someList.add("Abe");
      someList.add("Fred");
      someList.add("Dan");
            
      System.out.println();      
      //Filter with a block of code
      List<String> collect = someList.stream().filter(
            (s)->{
                  String z=s.toUpperCase();
                  if(z.substring(0,1).compareTo("D")<0)
                     return true;
                  else 
                     return false;
                  }
             ).collect(Collectors.toCollection(ArrayList::new));
      Collections.sort(collect, (s1, s2)->s1.compareTo(s2));
      System.out.println(collect);
                            
   }
}