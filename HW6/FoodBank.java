/*@ Aplomb Huang
**@ CMSC 403 HOMEWORK 6
**Most of the code is from sample code provided by professor
*/

import java.io.*;
import java.util.*;

class FoodBank {
   public static void main(String[] args) {
       
     System.out.println("Type in a random integer, such that the program doesn't run infinitely");
     
     Scanner sc = new Scanner(System.in);
     
     while(!sc.hasNextInt()){System.out.println("Enter an integer please."); sc = new Scanner(System.in);}
     
     int resCounter = sc.nextInt();
     
     if(resCounter <= 0){System.out.println("Food bank bankrupted. Sorry..."); System.exit(0);}
     
     
      Buffer buffer = new Buffer(); //buffer used to take arry of chars, now i changed to int
      Producer prod = new Producer(buffer, resCounter);
      Consumer cons = new Consumer(buffer);
      Thread read = new Thread(prod);
      Thread write = new Thread(cons);
      read.start();
      write.start();
      try {
         read.join();
         write.interrupt();
      }
      catch (InterruptedException e) {}               
   }
}

class Buffer {
   
   private int size = 0; //this is where the food is stored
   
   public Buffer(){ }// empty constructor
   
   public boolean more()
   { return size > 0; }
   
   public int randInt(int n) // random number generating method
   {
       Random rand = new Random();
       return rand.nextInt(n) + 1; }
   
   public synchronized void put(int c)// taking in a random int for food put in the bank
   { 
      size = size + c;
      System.out.println("Added " + c + " items to food bank." );
      
      System.out.println("Now the food bank has: " + size + " items.");
      notifyAll();
    
   }
   
   public synchronized void get(int d)
   { try {
      while (size == 0){wait(); System.out.println("Waiting for food bank to open");}
     
        
      if(d > size){ while(d > size){wait(); System.out.println("Tried to take "+ d + " items from food bank but waiting");} }
       
       size  = size - d;
          
      System.out.println("Take from food bank " + d + " items.");
      
      System.out.println("Now food bank has "+ size + " items.");
      
      notifyAll();
     
     }
     catch (InterruptedException e)
      { Thread.currentThread().interrupt(); }
     
   }
}

class Consumer implements Runnable{
   private final Buffer buffer;
   
   
   public Consumer(Buffer b)
   { buffer = b;  
   System.out.println("Start consumer");
   }
   
   public void run() {
       
       
      while (!Thread.currentThread().isInterrupted())
      {   
          int d = buffer.randInt(40);
          
          buffer.get(d);
         
      }
      while(buffer.more()) // clean-up
      {  
          int d = buffer.randInt(40);
          
         buffer.get(d);
      }
   }
}

class Producer implements Runnable {
   private final Buffer buffer;
   private int end;
   
   
   public Producer(Buffer b , int n) { 
      buffer = b; end = n;
      System.out.println("Start producer");
   }
   
   public void run() {
     
         while (!Thread.currentThread().isInterrupted()) {
            
        int  c = buffer.randInt(20);
           
            buffer.put(c);
            
            System.out.println("count down: " + end);
         
         if(end == 0){System.out.println("Food bank been robbed, so sad...");System.exit(0);}
         else {end = end -1;}
         }
      }
    
   }
