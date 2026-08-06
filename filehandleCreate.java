import java.io.*;
public class filehandleCreate {
    public static void main(String[]args){
        try{
             File file=new File("smceaids.txt");            // use this along with the commented code below
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
