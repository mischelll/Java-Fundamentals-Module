package JavaFundamnetalsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        while(num % 2 != 0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(in.nextLine());
        }
        System.out.println("The number is: "+Math.abs(num));
    }
}
