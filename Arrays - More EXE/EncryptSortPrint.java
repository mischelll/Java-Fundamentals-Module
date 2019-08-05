package JavaFundamentalsExe;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = Integer.parseInt(in.nextLine());
        char[] c = {'a', 'e', 'i', 'o', 'u',  'A', 'E', 'I', 'O', 'U'};

        int[] arr = new int[lines];

        for (int i = 0 ; i < arr.length;i++){
            String input = in.nextLine();
            int codeSum = 0;
            for (int j = 0; j < input.length(); j++) {
                boolean vowel = false;
                char check = input.charAt(j);
                for (int k =0 ; k < c.length;k++){
                    if (check == c[k]){
                        vowel = true;
                        break;
                    }else {

                    }

                }
                if (vowel){
                    codeSum += input.charAt(j) * input.length();
                }else {
                    codeSum += input.charAt(j) / input.length();
                }
            }
            arr[i] = codeSum;
        }
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
