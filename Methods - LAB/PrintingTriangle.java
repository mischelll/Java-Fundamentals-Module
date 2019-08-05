package JavaFundamnetalsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        printTri(new Scanner(System.in).nextInt());
    }

    static void printLine(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    static void printTri(int n){
        for (int i = 1; i <= n ; i++) {
                printLine(1, i);
        }

        for (int i = n -1; i >= 1 ; i--) {
            printLine(1,i);
        }

    }
}
