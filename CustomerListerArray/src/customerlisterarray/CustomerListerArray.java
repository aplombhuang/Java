
public class CustomerListerArray {

    public static void main(String[] args) {
       
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
        
         boolean found = false; int inDex1 = 0;
        
                
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
   
}