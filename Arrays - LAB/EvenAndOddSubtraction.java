package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = Arrays.stream(in.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int even = 0;
        int odd = 0;
        int diff = 0;

        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] % 2 == 0){
                even += numbers[i];
            }
            if (numbers[i] % 2 != 0){
                odd += numbers[i];
            }
        }
        diff = even - odd;
        System.out.print(diff);

    }
}
