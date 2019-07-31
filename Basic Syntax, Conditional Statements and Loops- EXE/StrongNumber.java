package JavaFundamentalsExe;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        int toNumber = Integer.parseInt(num);

        int sum = 0;

        for (int i = 0; i < num.length();i++){
            int digit = num.charAt(i) - '0';
            int factorial = 1;
            for (int j = 2; j <= digit;j++){
                factorial = factorial * j;
            }
            sum += factorial;

        }
        if(sum == toNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
