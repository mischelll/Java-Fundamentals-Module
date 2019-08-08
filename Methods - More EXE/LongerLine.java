package JavaFundamentalsExe;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X1 = Integer.parseInt(in.nextLine());
        int Y1 = Integer.parseInt(in.nextLine());

        int X2 = Integer.parseInt(in.nextLine());
        int Y2 = Integer.parseInt(in.nextLine());

        int X3 = Integer.parseInt(in.nextLine());
        int Y3 = Integer.parseInt(in.nextLine());

        int X4 = Integer.parseInt(in.nextLine());
        int Y4 = Integer.parseInt(in.nextLine());

        calcLongerLine(X1,Y1,X2,Y2,X3,Y3,X4,Y4);
    }

    static void printClosestPoint(int X1, int Y1, int X2, int Y2) {
        double sum1 = Math.sqrt(Math.pow(X1,2) + Math.pow(Y1,2));
        double sum2 = Math.sqrt(Math.pow(X2,2) + Math.pow(Y2,2));

        if (sum1 > sum2){
            System.out.printf("(%d, %d)(%d, %d)",X2,Y2,X1,Y1);
        }else if (sum1 < sum2){
            System.out.printf("(%d, %d)(%d, %d)",X1,Y1,X2,Y2);
        }else if (sum1 == sum2){
            System.out.printf("(%d, %d)(%d, %d)",X1,Y1,X2,Y2);
        }
    }

    static void calcLongerLine(int X1, int Y1, int X2, int Y2, int X3, int Y3, int X4, int Y4) {
        double distanceFirstLine = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));
        double distanceSecondLine = Math.sqrt(Math.pow((X4 - X3),2) + Math.pow((Y4 - Y3),2));

        if (distanceFirstLine > distanceSecondLine){
            printClosestPoint(X1, Y1, X2, Y2);

        }else if(distanceFirstLine < distanceSecondLine){
           printClosestPoint(X3,Y3,X4,Y4);

        }else if (distanceFirstLine == distanceSecondLine){
            printClosestPoint(X1, Y1, X2, Y2);
        }
    }
}
