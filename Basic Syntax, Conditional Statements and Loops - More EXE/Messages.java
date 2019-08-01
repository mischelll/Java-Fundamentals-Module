package JavaFundamentalsExe;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String message = "";

        for (int i = 0; i < n;i++){
            String digits = in.nextLine();
            int length = digits.length();
            char oneDigit= digits.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9){
                offset = (mainDigit - 2) * 3 + 1;
            }

            int letterIndex = (offset + length - 1);
            int ascii = letterIndex + 97;

            char letter = (char) ascii;
            if (mainDigit == 0){
                letter = (char) (mainDigit + 32);
            }
            message += letter;



        }
        System.out.println(message);
    }
}
