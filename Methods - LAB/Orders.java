package JavaFundamnetalsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String item = in.nextLine();
        int qunatity = Integer.parseInt(in.nextLine());
        System.out.printf("%.02f",returnPrice(item,qunatity));
    }

    static double returnPrice(String order, double n){
        double result = 0;
        switch (order){
            case "coffee":
                result = 1.50 * n;
                break;
            case "water":
                result = 1 * n;
                break;
            case "coke":
                result = 1.40 * n;
                break;
            case "snacks":
                result = 2 * n;
                break;
        }
        return result;
    }
}
