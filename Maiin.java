//id-21ce010,name-vedika
import java.io.File;
public class Maiin {
    public static void main(String[] args) throws Exception
    {
        File directory = new File("/home/user/");
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase("file.cpp")) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("File Not Found");
        }
    }
}
