import java.io.*;
public class forthrows {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("power.java");
    }
    public static void main(String[]args){
        try{
            readFile();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}
