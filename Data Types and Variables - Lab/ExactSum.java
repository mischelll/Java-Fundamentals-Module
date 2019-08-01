package JavaFundamnetalsLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        BigDecimal sum = new BigDecimal("0");

        for (int i = 0; i < n;i++){
            BigDecimal big = new BigDecimal(in.nextLine());

            sum = sum.add(big);
        }
        System.out.println(sum);
    }
}
