package JavaFundamnetalsLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1 = in.next().charAt(0);
        char c2 = in.next().charAt(0);
        char c3 = in.next().charAt(0);
        String line = String.valueOf(c1);
        String line2 = String.valueOf(c2);
        String line3 = String.valueOf(c3);
        String string = line + line2 + line3;
        System.out.println(string);

    }
}
