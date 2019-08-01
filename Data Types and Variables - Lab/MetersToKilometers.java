package JavaFundamnetalsLab;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int meters = Integer.parseInt(in.nextLine());
        double kilometers =  ((double) meters) /  1000;
        System.out.printf("%.2f",kilometers);
    }
}
