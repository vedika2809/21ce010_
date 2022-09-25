//id-21ce010,name-vedika
import java.util.*;
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            System.out.println("Hello world");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
 
public class Multithread {
    public static void main(String[] args)
    {
        MultithreadingDemo object = new MultithreadingDemo();
        object.start();
    }
}