package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = Arrays.stream(in.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] array2 = Arrays.stream(in.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean identical = true;

        for (int i = 0; i<array1.length;i++){
            if (array1[i] == array2[i]){
                sum += array1[i];
            }else {
                identical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
        if (identical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }


    }
}
