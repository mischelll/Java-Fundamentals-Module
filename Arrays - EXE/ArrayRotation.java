package JavaFundamentalsExe;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int rotations = Integer.parseInt(in.nextLine());
        String[] arrS = input.split(" ");
        int[] arr = new int[arrS.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrS[i]);
        }
        int temp;
        for (int i = 0;i < rotations;i++){
            temp = arr[0];
            for (int j = 0; j < arr.length-1;j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length-1] = temp;
        }
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
