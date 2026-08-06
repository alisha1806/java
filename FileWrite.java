import java.io.*;

public class FileWrite {
    public static void main(String[]args){
        try{
            FileWriter fw=new FileWriter("smceaids.txt");
            fw.write("This is a file handling program\n");
            fw.write("This is an example for file writer");
            fw.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
