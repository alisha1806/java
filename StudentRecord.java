import java.io.*;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) throws IOException {
        File file = new File("Student_record.txt");
        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        System.out.print("Student Mark: ");
        int mark = sc.nextInt();
        sc.close();
        try {
            if (mark < 0 || mark > 100) {
                throw new ArithmeticException("Invalid Mark");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("Student_record.txt", true));
            bw.write(name);
            bw.newLine();
            bw.write(String.valueOf(mark));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        BufferedReader br = new BufferedReader(new FileReader("Student_record.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
