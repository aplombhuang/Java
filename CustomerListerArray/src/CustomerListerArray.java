/**********************************************************************
 * Aplomb TR Huang
 * CSC201-01PR
 * Spring 2016
 * Lab 11: CustomerListerArray
 * This program is to practice using array. Initiating, and modifying.
 * ********************************************************************
 */

/**Algorithms:
 * Part 1 is simply declaring and initiating array. and print it, using enhanced for loop.
 * Part 2 copies data from array index 3, 4 to 5,6 then modify index 3 and 4 and print using the same enhanced for loop.
 * Part 3, using a normal for loop, it checks the existence of the word "Meg" in the array,
 * the second loop removes it, and shift the contents forward. and then checks to see if "Meg is still there"
 */

public class CustomerListerArray {

    public static void main(String[] args) {
    	
    	printHeading();
       
        String customerName [] = new String[7];  
        
        customerName[0] = "Chris";
        
        customerName[1] = "Lois";
        
        customerName[2] = "Meg";
        
        customerName[3] = "Peter";
        
        customerName[4] = "Stewie";
                
        for(String elements : customerName )
        {
           System.out.println(elements);
        }
        
        System.out.println("\nThe following is part 2. \n");
        
        customerName[6] = customerName[4];
        
        customerName[5] = customerName[3];
        
        customerName[3] = "Meg";
        
        customerName[4] = "Brian";
        
         for(String elements : customerName )
        {
           System.out.println(elements);
        }
        
        System.out.println("\nThe following is part 3. \n");
        
        
         boolean found = false; 
        
                
        do{ int inDex = 0; int pos = 0;
                    
         while(inDex < customerName.length)
        {
           if(customerName[inDex].equals("Meg"))
           {  
               pos = inDex;
               
               int count = inDex; 
               
               do{
                    customerName[count] = customerName[count+1]; count++;
                                                    
               }while(count < customerName.length-1);
               
               
               if(customerName[count-1].equals(customerName[count]))
               {
                   customerName[count]="";
               }
               
               inDex ++; 
           }
            else{inDex++;}
                          
        }
                  
         if(customerName[pos].equals("Meg") ){found = true;}
            
            else { found = false;}  
        
         
    }while(found);
    
        for(String elements : customerName )
        {
           System.out.println(elements);
        }
        
}
   

    
    private static void printHeading()
    {
        System.out.println("My name is Aplomb TR Huang");
         System.out.println("My student ID is 6856925");
         System.out.println("My course is: CSC201-01PR, Spring 2016");
         System.out.println("My instructor is Debra Duke");
         System.out.println("Lab 11 CustomerListerArray");
         System.out.println("To practice using array");
         System.out.println("");
    }
   
}