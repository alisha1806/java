import java.io.*;

public class FilehandleInBuild {
    public static void main(String[] args) {
        File file = new File("smceaids.txt");
        System.out.println(file.getName()); // gets name of the file
        System.out.println(file.getAbsolutePath()); // gets absolute path of the file
        System.out.println(file.exists()); // checks if file exists or not
        System.out.println(file.canRead()); // checks if file can be read
        System.out.println(file.canWrite()); // checks if file can be written
    }
}
