
import java.util.*;

public class CustomerListerArrayList {
    
    public static void main(String[] args) 
    {        
        ArrayList <String> names = new ArrayList<String>();
        
        names.add("Lois"); names.add("Meg"); 
        
        names.add("Peter"); names.add("Stewie");
        
        for(String element: names)
            
        {System.out.println(element);}
        
        System.out.println("\n Above is part1, below is part 2.\n");
        
        names.add(2,"Brian"); names.add(2, "Meg");
        
        for(String element: names)
        {System.out.println(element);}
        
        System.out.println("\n Above is part2, below is part 3.\n");
        
        for(int i = 0; i < names.size(); i++)
        {
            String name = names.get(i);
            
            if(name.equals("Meg")){names.remove(i);} 
            
            else{System.out.println(name);}
            
        }
        
       
    }
    
}
