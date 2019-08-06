package JavaFundamentalsExe;

import java.util.Scanner;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());
        System.out.println(smallestOfThree(num1,num2,num3));
    }

    static int smallestOfThree(int a, int b, int c){
        if (a < b && a < c){
            return a;
        }else if (b < c && b < a){
            return b;
        }else {
            return c;
        }
    }
}
