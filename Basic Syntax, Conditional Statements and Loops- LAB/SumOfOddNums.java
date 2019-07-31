package JavaFundamnetalsLab;

import java.util.Scanner;

public class SumOfOddNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int oddSum = 0;
        for (int i  = 1; i <=100;i++){
            if (i % 2 != 0){
                oddSum += i;
                System.out.println(i);
                n--;
                if (n == 0){
                    break;
                }
            }
        }
        System.out.println("Sum: " + oddSum);

    }
}
