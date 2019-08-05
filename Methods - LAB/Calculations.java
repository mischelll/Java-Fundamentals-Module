package JavaFundamnetalsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int result = 0;
        if (command.equals("add")){
            result = add(a,b);
        }else if (command.equals("subtract")){
           result = substract(a, b);
        }else if (command.equals("multiply")){
           result = multiply(a,b);
        }else if (command.equals("divide")){
           result = divide(a,b);
        }
        System.out.println(result);
    }

    static int add(int a , int b){

        return a + b;
    }

    static int substract(int a, int b){

        return Math.abs(a- b);
    }

    static int multiply(int a, int b){
        return a * b;
    }

    static int divide(int a, int b){
        return a / b;
    }
}
