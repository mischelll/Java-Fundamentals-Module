package JavaFundamnetalsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int n = Integer.parseInt(in.nextLine());
        System.out.println(repeatString(line,n));
    }

    static String repeatString(String line, int n){
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = line;
        }

        return String.join("",s);
    }
}
