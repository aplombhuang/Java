import java.util.*;
import java.util.stream.*;
public class LambdaTest {
   public static void main(String[] args){
      List<String> someList = new ArrayList<String>();
      
      someList.add("Jane");
      someList.add("Joe");
      someList.add("Mark");
      someList.add("Donna");
      
      // Traditional iterator through a list
      System.out.println("Traditional iterator:");
      for(String temp: someList)
         System.out.println(temp);
      
      System.out.println();
      // Iterating a list using Lambda 
      System.out.println("Lambda iterator:");
      someList.forEach(
            (String temp1) ->{System.out.println(temp1);}
            );
      
      System.out.println();      
      //Shorter Lambda version
      System.out.println("Shorter Lambda iterator:");
      someList.forEach(System.out::println);  
      
      System.out.println();      
      //Quick way to specify a map
      System.out.println("Map Uppercase to list and output:");
      someList.stream().map(
            (String s)->s.toUpperCase()
            ).forEach(System.out::println);
            
      System.out.println();      
      //Shorter version
      System.out.println("Shorter Map Uppercase to list and output:");
      someList.stream().map(String::toUpperCase).forEach(System.out::println);  
      
      System.out.println();      
      //Quick way to specify a filter
      System.out.println("Filter list list of length greater than 3:");
      someList.stream().filter(
            (String s)->s.length()>3
            ).forEach(System.out::println);
            
      System.out.println();      
      //Filter with a block of code
      System.out.println("Filter list to match ON in positions 1,2:");
      someList.stream().filter(
            (s)->{
                  String z=s.toUpperCase();
                  if(z.substring(1,3).compareTo("ON")==0)
                     return true;
                  else 
                     return false;
                  }
             ).forEach(System.out::println);  
      
      System.out.println();  
      //Specifying a fold - adding the lenghts of the strings in the list
      System.out.println("Fold list and output total size of all strings:");
      int totalLength = someList
            .stream()
            .map(s->s.length())
            .reduce(0,(a,b)-> a + b);
      System.out.println(totalLength);
      
      System.out.println();  
      //Specifying a fold - using mapToInt      
      System.out.println("Fold list with mapToInt:");
      totalLength = someList
            .stream()
            .mapToInt(String::length)
            .reduce(0,(a,b)-> a + b);
      System.out.println(totalLength);   
      
      System.out.println();  
      //Specifying a fold - Creating one string      
      System.out.println("Fold list and outputa total string with all names:");
      String total = someList
            .stream()
            .reduce("",(a,b)-> a + " " + b);
      System.out.println(total);  
      
      System.out.println();  
      //Specifying a comparator      
      System.out.println("Create a collection and sort:");
      Collections.sort(someList, (String s1, String s2)->s1.compareTo(s2));
      for(String s:someList){
         System.out.println(s);
      }
      
      System.out.println();  
      //Specifying a comparator - without declaring parameter type     
      System.out.println("Create a collection and sort without declaring parameter type:");
      Collections.sort(someList, (s1, s2)->s2.compareTo(s1));
      for(String s:someList){
         System.out.println(s);
      }
      
      System.out.println();      
      //Create a new collection
      System.out.println("Create a collection and make all uppercase:");
      List<String> collect = someList.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
      System.out.println(collect);

      System.out.println();      
      //Create a new String
      System.out.println("Create a collection and create a combined string:");
      total = someList.stream()
                  .collect(Collectors.joining(", "));
      System.out.println(total);
      
      System.out.println();      
      //Create a specific collection
      System.out.println("Create a collection and specify the collection:");
      collect = someList.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toCollection(ArrayList::new));
      System.out.println(collect);

      System.out.println();      
      //Create a specific collection
      System.out.println("Create a collection and utilize parallel() and sequential():");
      collect = someList.stream()
            .parallel()
            .filter((String s)-> s.length() > 3)
            .sequential()
            .map(String::toUpperCase)
            .collect(Collectors.toCollection(ArrayList::new));
      System.out.println(collect);               
               
   }
}