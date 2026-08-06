import java.io.*;
public class FileAppend {
    public static void main(String[]args) throws IOException{
            FileWriter fw=new FileWriter("smceaids.txt", true); // true for append mode
            fw.write("\nThis is an appended line");
            fw.close();
            System.out.println("File appended successfully");
    }
}
