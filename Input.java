import java.util.Scanner;

public class Input
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		
		int age =scan.nextInt();
		System.out.println("My Name is "+name);
		System.out.println("age is "+age);
		scan.close();
	}
}