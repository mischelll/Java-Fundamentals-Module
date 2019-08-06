package JavaFundamentalsExe;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        topNumber(num);
        }



    static boolean sumDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        if (sum % 8 == 0){
            return true;
        }
        return false;
    }

    static boolean oddDigit(int num){
        boolean check = false;
        while (num > 0){
            int digit = num % 10;
            if (digit % 2 != 0){
                check = true;
                return check;
            }
            num /= 10;

        }
        return check;
    }

    static void topNumber(int num){
        for (int i = 1 ; i <= num; i ++){
            if (sumDigits(i) && oddDigit(i)){
                System.out.println(i);
            }
        }
    }
}
