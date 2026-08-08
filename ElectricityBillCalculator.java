
        //DecimalFormat df = new DecimalFormat("0.00"); for adding extera 0s in the output

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int unitsConsumed = scanner.nextInt();

        // Calculate electricity bill
        double billAmount;

        if (unitsConsumed <= 200) {
            billAmount = unitsConsumed * 0.50;
        } 
        else if (unitsConsumed <= 400) {
            billAmount = (unitsConsumed * 0.65) + 100;
        } 
        else if (unitsConsumed <= 600) {
            billAmount = (unitsConsumed * 0.80) + 200;
        } 
        else {
            billAmount = (unitsConsumed * 1.25) + 425;
        }

        // Output
        System.out.printf("Electricity Bill: Rs. %.2f%n", billAmount);  // for adding 2 digits after decimal point

        scanner.close();
    }
}