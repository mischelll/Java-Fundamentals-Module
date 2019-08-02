package JavaFundamnetalsLab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pound = Double.parseDouble(in.nextLine());
        double dollars = pound * 1.31;
        System.out.printf("%.3f",dollars);
    }
}
