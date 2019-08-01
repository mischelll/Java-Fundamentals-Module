package JavaFundamentalsExe;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long startingYield = Integer.parseInt(in.nextLine());
        int days = 0;
        long totalAmount = 0;

        while (startingYield >= 100){
            totalAmount += startingYield;
            days++;
            if (totalAmount >= 26){
                totalAmount -= 26;
            }

            startingYield -= 10;

        }

        if (startingYield < 100 && totalAmount >= 26 ){
            totalAmount -= 26;
        }
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
