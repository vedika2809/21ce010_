//id-21ce010,name-vedika
import java.io.*;
public class ByteStream {

    public static void main(String[] args)
        throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
         try {
            sourceStream = new FileInputStream(
                "/Users/mayanksolanki/Desktop/demo.rtf");
            targetStream = new FileOutputStream(
                "/Users/mayanksolanki/Desktop/democopy.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1)
 targetStream.write((byte)temp);
          System.out.print("Program successfully executed");
        }
        finally {
 
            if (sourceStream != null)
                sourceStream.close();
 
            if (targetStream != null)
                targetStream.close();
        }
    }
}
