package JavaFundamentalsExe;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);

        }
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < arr.length;i++){
            for (int k = i + 1; k < arr.length;k++){
                if (arr[i] + arr[k] == n){
                    System.out.print(arr[i] + " " + arr[k] + "\n");
                }
            }
        }
    }
}
