package JavaFundamnetalsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = Double.parseDouble(in.nextLine());
        int power = Integer.parseInt(in.nextLine());
        System.out.println(new DecimalFormat("0.####").format(calculatePower(num,power)));
    }

    static double calculatePower(double num, int power){
        double result = 1;
        for (int i= 1; i <= power;i++){
            result *= num;
        }
        return result;
    }
}
