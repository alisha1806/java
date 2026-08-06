import java.io.*;
public class BufferwrteFile {
    public static void main(String[] args) throws IOException {
            BufferedWriter bw=new BufferedWriter(new FileWriter("smceaids.txt"));
            bw.write("This is a line written to the file");
            bw.newLine();
            bw.write("This is another line written to the file");
            bw.close();
            System.out.println("File written successfully using BufferedWriter");
    }
}
