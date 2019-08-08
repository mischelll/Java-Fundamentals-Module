package JavaFundamentalsExe;

import java.util.Scanner;

public class TribonacciSeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        printTribonacciSequnce(num);
    }

    static void printTribonacciSequnce(int num){
        int first = 1;
        int second = 1;
        int third = 2;
        if (num == 1){
            System.out.print(first);
        }else if(num <=2){
            System.out.printf(first + " " + second);
        }else {
            System.out.printf("%d %d %d ",first,second,third);
        }
        for (int i = 3; i < num;i++){
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
            System.out.print(next + " ");
        }

    }
}
