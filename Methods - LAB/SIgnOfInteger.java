package JavaFundamnetalsLab;

import java.util.Scanner;

public class SIgnOfInteger {
    public static void main(String[] args) {

        printSign(new Scanner(System.in).nextInt());
    }

    static void printSign(int number){
        String sign = "";
        if (number > 0){
            sign  = "positive";
        }else if (number < 0){
            sign = "negative";
        }else {
            sign = "zero";
        }

        System.out.printf("The number %d is %s.",number,sign);
    }

}
