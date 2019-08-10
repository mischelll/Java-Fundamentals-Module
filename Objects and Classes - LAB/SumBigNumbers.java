package JavaFundamnetalsLab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger number1 = new BigInteger(in.nextLine());
        BigInteger number2 = new BigInteger(in.nextLine());

        BigInteger result = number1.add(number2);

        System.out.println(result);
    }
}
