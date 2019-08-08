package JavaFundamentalsExe;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X1 = Integer.parseInt(in.nextLine());
        int Y1 = Integer.parseInt(in.nextLine());

        int X2 = Integer.parseInt(in.nextLine());
        int Y2 = Integer.parseInt(in.nextLine());

        printClosestPoint(X1,Y1,X2,Y2);

    }

    static void printClosestPoint(int X1, int Y1, int X2, int Y2){
        int sum1 = Math.abs(X1+Y1);
        int sum2 = Math.abs(X2+Y2);
        if (sum1 > sum2){
            System.out.printf("(%d, %d)",X2,Y2);
        }else if (sum1 < sum2){
            System.out.printf("(%d, %d)",X1,Y1);
        }else if (sum1 == sum2){
            System.out.printf("(%d, %d)",X1,Y1);
        }
    }
}
