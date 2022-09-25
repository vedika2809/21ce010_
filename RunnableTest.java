//id-21ce010,name-vedika
import java.util.*;
class MyRunnable implements Runnable
{
  public void run( )
  {
     System.out.println("Hello world") ;
  }
}
public class RunnableTest
{
  public static void main( String[ ] args )
  {
    MyRunnable r = new MyRunnable( ) ;
    Thread t = new Thread( r ) ;
    System.out.println( t ) ; 
    t.start( ) ;
  } 
}
