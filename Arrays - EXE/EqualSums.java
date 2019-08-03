package JavaFundamentalsExe;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");
        int[] arr = new int[input.length];
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int temp ;
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {
                right += arr[k];
            }
            if (left == right){
                check = true;
                System.out.println(i);
                break;
            }
        }
        if (!check){
            System.out.println("no");
        }

    }
}
