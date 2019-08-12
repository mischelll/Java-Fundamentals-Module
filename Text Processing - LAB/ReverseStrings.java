package JavaFundamnetalsLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        while (!input.equals("end")) {

            String result = "";
            char[] arr = input.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                result += input.charAt(i);
            }
            System.out.printf("%s = %s\n",input,result);
            input = in.nextLine();
        }
    }
}
