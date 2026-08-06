import java.io.*;
public class FileRead {
    public static void main(String[]args) throws IOException{
        try{
            FileReader fr=new FileReader("smceaids.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
