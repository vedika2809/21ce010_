//id-21ce010,name-vedika
import java.io.IOException;
import java.nio.file.Files;  
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCreator{
	public static void main(String... args) throws IOException{
		System.out.println("Using createFile() method: ");
		Path path = Paths.get("newFile.txt");
		try{
			Files.createFile(path);
			System.out.println("File Created: " + path);
		}
		catch(FileAlreadyExistsException e){
			System.out.println("File already exists at Path: " + path);
		}
    }
}

