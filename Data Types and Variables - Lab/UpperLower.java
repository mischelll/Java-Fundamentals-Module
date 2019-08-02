package JavaFundamnetalsLab;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1 = in.next().charAt(0);

        if(c1 >= 65 && c1 <= 90){
            System.out.println("upper-case");
        }else if (c1 >= 97 && c1 <= 122){
            System.out.println("lower-case");
        }else {
            System.out.println("Neither upper- , nor lower-case");
        }
    }
}
