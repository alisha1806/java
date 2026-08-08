import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        int vow=0;
        int con=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch >='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vow++;
                }
                else{
                    con++;
                }
            }
        }
        System.out.println("No. of Vowels: "+vow);
        System.out.println("No. of Consonants: "+con);
        scanner.close();
    }
}
