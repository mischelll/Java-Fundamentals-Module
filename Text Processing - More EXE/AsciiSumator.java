package JavaFundamentalsExe;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char from = in.nextLine().charAt(0);
        char to = in.nextLine().charAt(0);
        String randomStr = in.nextLine();
        int start = (int) Math.min(from,to);
        int end = (int) Math.max(from,to);

        int sum = 0;
        for (int i = 0; i < randomStr.length();i++){
            char c = randomStr.charAt(i);
            if (c > start && c < end){
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
