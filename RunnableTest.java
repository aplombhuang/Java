import java.util.*;
import java.util.stream.*;
public class RunnableTest {
   public static void main(String[] args){
      // Old way to implement runnable
      Runnable task1 = new Runnable() {
         @Override
         public void run() {
            System.out.println("Task #1 is running");
         }
      };
      
      Thread thread1 = new Thread(task1);
      thread1.start();
      
      // New way with Lambda expressions
      Runnable task2 = () -> {System.out.println("Task #2 is running");};
      
      new Thread(task2).start();
   }
}