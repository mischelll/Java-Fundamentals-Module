package JavaFundamentalsExe;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());

        long fact1 = calcFact(num1);
        long fact2 = calcFact(num2);

        double divide = (double) fact1 / fact2;
        System.out.printf("%.2f",divide);
    }

    static long calcFact(int num){
        long fact = 1;
        for (int i = 2; i <= num;i++){
            fact *= i;
        }
        return fact;
    }
}
