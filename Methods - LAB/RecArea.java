package JavaFundamnetalsLab;

import java.util.Scanner;

public class RecArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = Integer.parseInt(in.nextLine());
        int length = Integer.parseInt(in.nextLine());
        System.out.println(calculateArea(width,length));
    }

    static int calculateArea(int a, int b){
        return a * b;
    }
}
