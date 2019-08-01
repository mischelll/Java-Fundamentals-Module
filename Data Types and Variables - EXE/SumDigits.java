package JavaFundamentalsExe;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());
        int sum = 0;

        while(number > 0){
           int digit =  number % 10;
           sum += digit;
           number /= 10;
        }

        System.out.println(sum);

    }
}
