//id-21ce010,name-vedika
import java.io.*;
public class TestClass1{
  public static void main(String[] args) {
    FileReader reader = null;
    try {
      reader = new FileReader("in.txt");
      int fChar;
      while ((fChar = reader.read()) != -1) 
        System.out.println((char)fChar);          
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
