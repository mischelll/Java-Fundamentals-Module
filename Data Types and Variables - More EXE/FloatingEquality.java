package JavaFundamentalsExe;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = Double.parseDouble(in.nextLine());
        double num2 = Double.parseDouble(in.nextLine());
        double eps = 0.000001;

        double diff = Math.abs(num1 - num2);

        if (diff > eps){
            System.out.println("False");
        }else if (diff < eps){
            System.out.println("True");
        }else if(eps == diff){
            System.out.println("False");
        }
    }
}
