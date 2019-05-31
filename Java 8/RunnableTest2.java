import java.util.*;
import java.util.stream.*;
public class RunnableTest2 {
   public static void main(String[] args){
   
      new Thread(()-> {
         try {
            while (true){
               System.out.println("Task #1 is running");
               Thread.sleep(200);
            }
         }
         catch (InterruptedException ex) {}
      }).start();
      
      new Thread(()-> {
         try {
            while (true){
               System.out.println("Task #2 is running");
               Thread.sleep(300);
            }
         }
         catch (InterruptedException ex) {}
      }).start();
      
   }
}