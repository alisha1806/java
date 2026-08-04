import java.util.*;
public class table {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(int i=1;i<=15;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        s.close();
    }
    
}
