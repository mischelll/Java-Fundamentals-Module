package JavaFundamentalsExe;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());
        System.out.println(checkSign(num1,num2,num3));
    }


    static String checkSign(int num1, int num2, int num3) {
        String positive = "positive";
        String negative = "negative";
        String zero = "zero";
        boolean a = num1 < 0;
        boolean b = num2 < 0;
        boolean c = num3 < 0;

        if (num1 > 0 && num2 > 0 && num3 > 0){
            return positive;
        }
        if (num1 == 0 || num2 == 0 || num3 == 0){
            return zero;
        }
        if (num1 <0 && num2 < 0 && num3 < 0){
            return  negative;
        }

        if ((!a && b && c) || (a && !b && c) || (a && b && !c)){
            return positive;
        }else {
            return negative;
        }


    }

}
