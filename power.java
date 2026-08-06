import java.util.Scanner;
import java.lang.Math;
public class power {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Square root of "+n+" is "+Math.sqrt(n));
        scan.close();
    }
}
