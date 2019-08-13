package JavaFundamentalsExe;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();


        StringBuilder noRepeated = new StringBuilder(noRepeatingChars(line));
        System.out.println(noRepeated);


    }

    static StringBuilder noRepeatingChars(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean noRepeat;
        for (int i = 0; i < arr.length; i++) {
            noRepeat = false;
            if (i == arr.length - 1){
                sb.append(arr[i]);
                break;
            }
            for (int k = i + 1; k < arr.length; k++){
                if (arr[i] != arr[k]){
                    noRepeat = true;
                    if (noRepeat){
                        sb.append(arr[i]);
                        i = k - 1;
                    }
                    break;
                }
            }

        }

        return sb;
    }
}
