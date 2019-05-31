/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 12: CustomerListerArrayList
 * This program is to practice using ArrayList. Initiating, and modifying.
 * ********************************************************************
 */

/**Algorithms:
 * Part 1 is simply declaring and initiating ArrayList. Add some data to the ArrayList and print it using enhanced for loop.
 * Part 2 insert new data to arraylist index 3, 4 and print using the same enhanced for loop.
 * Part 3, using a normal for loop, it checks the existence of the word "Meg" in the arraylist, remove it and print the new ArrayList
 */


import java.util.*;

public class CustomerListerArrayList {
    
    public static void main(String[] args) 
    {        
    	printHeading();
    	
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
    
    private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 12 CustomerListerArrayList");
         System.out.println("To practice using arraylist");
         System.out.println("");
    }
    
}
