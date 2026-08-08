import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=sc.nextLine();
        String reverse = new StringBuilder(word).reverse().toString();
        if(word.equals(reverse)){
            System.out.println(word+" is Palindrome");
        }
        else{
            System.out.println(word+ " not a palindrome");
        }
        sc.close();
    }
}
