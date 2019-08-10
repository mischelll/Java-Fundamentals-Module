package JavaFundamnetalsLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        BigInteger factorial = new BigInteger("1");


        for (int i = 2 ; i <= num;i++){
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        System.out.println(factorial);
    }
}
