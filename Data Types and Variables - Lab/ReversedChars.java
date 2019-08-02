package JavaFundamnetalsLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1 = in.next().charAt(0);
        char c2 = in.next().charAt(0);
        char c3 = in.next().charAt(0);
        System.out.printf("%c %c %c",c3,c2,c1);
    }
}
