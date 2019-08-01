package JavaFundamentalsExe;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());

        int biggest = 0;
        int middle = 0;
        int smallest = 0;

        if(num1 > num2 && num1 > num3){
            biggest = num1;
            if(num2 > num3){
                middle= num2;
                smallest = num3;
            }else {
                middle = num3;
                smallest = num2;
            }
        }else if(num2 > num1 && num2 > num3){
            biggest = num2;
            if(num1 > num3){
                middle= num1;
                smallest = num3;
            }else {
                middle = num3;
                smallest = num1;
            }
        }else if(num3 > num1 && num3 > num2){
            biggest = num3;
            if(num1 > num2){
                middle= num1;
                smallest = num2;
            }else {
                middle = num2;
                smallest = num1;
            }
        }
        System.out.printf("%d\n%d\n%d",biggest,middle,smallest);
    }
}
