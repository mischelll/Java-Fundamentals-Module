package JavaFundamentalsExe;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(in.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            for (int k = 0;k < input.length- 1;k++){
                arr1[i] = input[k];
                arr2[i] = input[k + 1];
            }
        }

        for (int i = 1; i<arr1.length;i += 2){
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        for (int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
