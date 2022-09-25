//id-21ce010,name-vedika
import java.lang.*;
class ThreadDemo extends Thread {
 
    public void run()
    {
        System.out.println("Inside run method");
    }

    public static void main(String[] args)
    {

        ThreadDemo FIRST = new ThreadDemo();
        ThreadDemo SECOND = new ThreadDemo();
        ThreadDemo THIRD = new ThreadDemo();
  
        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);
        
        System.out.println("First thread priority : "
                           + FIRST.getPriority());
  
        System.out.println("Second thread priority : "
                           + SECOND.getPriority());
  
        System.out.println("Third thread priority : "
                           + THIRD.getPriority());
  
    }
}
