//id-21ce010,name-vedika
import java.io.IOException;
import java.nio.file.Files;  
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCreator2{
	public static void main(String... args) throws IOException{
System.out.println("Using FileOutputStream(String name, boolean append) constructor: ");
		try{
			String fileName = "newFile.txt";
			FileOutputStream fObj = new FileOutputStream(fileName, true);
			String text = "Just do it...";
			byte[] textDataInBytes = text.getBytes();
			fObj.write(textDataInBytes);
			fObj.close();
			System.out.println("File Saved: " + fileName);  
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
           }
}
