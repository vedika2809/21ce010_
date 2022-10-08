//id-21ce010,name-vedika
import java.io.*;
public class TestClass{
  public static void main(String[] args) {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      fis = new FileInputStream("in.txt");
      fos = new FileOutputStream ("out.txt");
      int temp;
      while ((temp = fis.read()) != -1) 
      fos.write((byte)temp);
      if (fis != null)
      fis.close();
      if (fos != null)
      fos.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
