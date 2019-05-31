package package2;
import java.io.*;
import java.util.concurrent.*;

class SemaphoreBuffer {
   public static void main(String[] args) {
      Buffer buffer = new Buffer(5); //buffer has size 5
      Producer prod = new Producer(buffer);
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
   private final char[] buf;
   private int start = -1;
   private int end = -1;
   private int size = 0;
   private Semaphore nonFull, nonEmpty, mutEx;
   
   public Buffer(int length){
      buf = new char[length];
      nonFull = new Semaphore(length);
      nonEmpty = new Semaphore(0);
      mutEx = new Semaphore(1);
   }
   public boolean more()
   { return size > 0; }
   
   public void put(char ch)
   { try {
      nonFull.acquire();
      mutEx.acquire();
      end = (end+1) % buf.length;
      buf[end] = ch;
      size++;
      System.out.println("Add to buffer, size = " + size);
      mutEx.release();
      nonEmpty.release();
     }
     catch (InterruptedException e)
      { Thread.currentThread().interrupt(); }
   }
   
   public char get()
   { try {
      nonEmpty.acquire();
      mutEx.acquire();
      start = (start+1) % buf.length;
      char ch = buf[start];
      size--;
      System.out.println("Take from buffer, size = " + size);
      mutEx.release();
      nonFull.release();
      return ch;
     }
     catch (InterruptedException e)
      { Thread.currentThread().interrupt(); }
     return 0;
   }
}

class Consumer implements Runnable{
   private final Buffer buffer;
   
   public Consumer(Buffer b)
   { 
      buffer = b;
      System.out.println("Start consumer");

   }
   
   public void run() {
      while (!Thread.currentThread().isInterrupted())
      {  char c = buffer.get();
         System.out.println(c);
      }
      while(buffer.more()) // clean-up
      {  char c = buffer.get();
         System.out.print(c);
      }
   }
}

class Producer implements Runnable {
   private final Buffer buffer;
   private final InputStreamReader in = new InputStreamReader(System.in);
   
   public Producer(Buffer b) { 
      buffer = b; 
      System.out.println("Start producer");
   }
   
   public void run() {
      try {
         while (!Thread.currentThread().isInterrupted()) {
            int c = in.read();
            if (c == -1) break; // -1 is end of file
            buffer.put((char) c);
         }
      }
      catch (IOException e) {}
   }
}