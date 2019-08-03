package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] letters = in.nextLine().split(" ");
        for (int i = letters.length-1;i >= 0;i--){
            System.out.print(letters[i] + " ");
        }


    }
}
