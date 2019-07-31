package JavaFundamentalsExe;

import java.util.Scanner;

public class TriangleOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n;i++){

            for (int k = 1; k <= i; k++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
}
