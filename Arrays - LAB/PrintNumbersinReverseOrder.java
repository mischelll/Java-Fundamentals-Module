package JavaFundamnetalsLab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length;i++){
            int num = Integer.parseInt(in.nextLine());
            numbers[i] = num;

        }
        for (int i = 0;i<numbers.length;i++){
            System.out.print(numbers[(n-1)- i] + " ");
        }

    }
}
