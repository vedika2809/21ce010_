//id-21ce010,name-vedika
import java.io.*;
class FileName implements FilenameFilter {
    String initials;
    public FileName(String initials)
    {
        this.initials = initials;
    }
    public boolean accept(File dir, String name)
    {
        return name.startsWith(initials);
    }
}
public class Mainn {   
    public static void main(String[] args)
    {
        File directory = new File("/home/user/");
        FileName filter = new FileName("file.cpp");
        String[] flist = directory.list(filter);
 
        if (flist == null) {
            System.out.println(
                "Empty directory or directory does not exists.");
        }
        else {
            for (int i = 0; i < flist.length; i++) {
                System.out.println(flist[i]+" found");
            }
        }
    }
}
