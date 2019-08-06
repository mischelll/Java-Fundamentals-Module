package JavaFundamentalsExe;

import java.util.Scanner;

public class AddSubstract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());
        int sum = sumFirstTwo(num1,num2);
        System.out.println(substractFromSum(sum,num3));
    }

    static int sumFirstTwo(int num1,int num2){
        return num1 + num2;
    }
    static int substractFromSum(int sum, int num3){
        return sum - num3;
    }
}
