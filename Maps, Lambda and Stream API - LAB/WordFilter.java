package JavaFundamnetalsLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = Arrays.stream(in.nextLine().split(" ")).filter(a -> a.length() % 2 == 0).toArray(String[]::new);
        for (String word : words) {
            System.out.println(word);
        }

    }
}
