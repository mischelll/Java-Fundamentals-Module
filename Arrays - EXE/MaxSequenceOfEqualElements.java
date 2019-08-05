package JavaFundamentalsExe;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }


        int check = 0;
        int start = 0;
        int stop = 0;
        for (int i = 0; i < arr.length; i++) {
            int check2 = 0;
            for (int k =i ; k < arr.length;k++){
                if (arr[i] == arr[k]){
                    check2++;
                    if (check2 > check){
                        check = check2;
                        start = i;
                        stop = k;
                    }
                }else {
                    break;
                }
            }


        }
        for (int i = start ; i <= stop;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
