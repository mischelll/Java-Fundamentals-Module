package JavaFundamentalsExe;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int multiply = Integer.parseInt(in.nextLine());
        int hold = 0;
        StringBuilder sum = new StringBuilder();

        char c = number.charAt(0);
        if (c == 48) {
            if (number.length() == 1){
                System.out.println(0);
                return;
            }
            number = trimZeros(number);
        }

            if (multiply == 0) {
                System.out.println(0);
                return;
            }

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = (int) number.charAt(i) - 48;
            int currSum = digit * multiply;
            if (hold != 0) {
                currSum += hold;
                hold = 0;
            }
            String str = "" + currSum;
            if (str.length() == 2) {
                hold += str.charAt(0) - 48;
                sum.append(str.charAt(1) - 48);
            } else {
                sum.append(str);
            }


        }

        if (hold != 0) {
            sum.append(hold);
        }

        System.out.printf("%s", sum.reverse());


    }

    static String trimZeros(String str) {
        int lastZeroIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 48) {
                lastZeroIndex = i;
            } else {
                break;
            }
        }
        return str = str.substring(lastZeroIndex + 1);
    }
}
