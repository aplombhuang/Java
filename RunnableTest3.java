import java.util.*;
import java.util.stream.*;
public class RunnableTest3 {
   public static void main(String[] args){
   
      Thread thread1 = new Thread(()-> {
         try {
            for (int i = 0; i<100; i++){
               System.out.println("Task #1 is running");
               Thread.sleep(200);
            }
         }
         catch (InterruptedException ex) {}
      });
      
      Thread thread2 = new Thread(()-> {
         try {
            for (int i = 0; i<100; i++){
               System.out.println("Task #2 is running");
               Thread.sleep(300);
            }
         }
         catch (InterruptedException ex) {}
      });
      thread1.start();      
      thread2.start();
      
      for(long i = 0; i< 100000000000L; i++);
      thread1.interrupt();
      thread2.interrupt();
   }
}