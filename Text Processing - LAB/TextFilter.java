package JavaFundamnetalsLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(", ");
        String text = in.nextLine();

        for (String word : words) {
            if (text.contains(word)) {
                String replace = repeatStr("*", word.length());
                text = text.replace(word, replace);
            }
        }
        System.out.println(text);

    }

    static String repeatStr(String sign, int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(sign);
        }
        return sb.toString();
    }
}
