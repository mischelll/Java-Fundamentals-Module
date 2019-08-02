package JavaFundamentalsExe;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = Integer.parseInt(in.nextLine());
        int lines = Integer.parseInt(in.nextLine());
        String message = "";

        for (int i = 0; i < lines;i++){
            char c = in.next().charAt(0);
            int newChar = c + key;
            char c2 = (char) newChar;
            message += c2;
        }
        System.out.println(message);
    }
}
