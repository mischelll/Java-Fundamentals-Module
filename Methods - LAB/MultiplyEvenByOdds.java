package JavaFundamnetalsLab;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        char[] ch = number.toCharArray();
        int even = 0;
        int odds = 0;

        for (int i = 0; i < ch.length; i++) {
            int c = ch[i] - '0';
            if (c >= 0 && c <= 9) {

                if (c % 2 == 0) {
                    even += c;
                } else {
                    odds += c;
                }
            }
        }

        System.out.println(even * odds);
    }
}
