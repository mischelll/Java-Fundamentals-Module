package JavaFundamnetalsLab;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int multiplier = Integer.parseInt(in.nextLine());
        if (multiplier > 10){
            System.out.printf("%d X %d = %d\n",n,multiplier,n*multiplier);
        }else {

        }

        for (int i = multiplier; i <= 10;i++){

            System.out.printf("%d X %d = %d\n",n,i,n*i);


        }
    }
}
