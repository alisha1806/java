import java.text.DecimalFormat;
import java.util.Scanner;

public class ElecticityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units;
        double bill;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter the number of units consumed: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4;
        }

        System.out.println("The electricity bill is: Rs. " + df.format(bill));
        sc.close();
    }
}