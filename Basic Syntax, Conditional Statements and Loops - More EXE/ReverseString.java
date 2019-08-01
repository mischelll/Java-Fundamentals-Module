package JavaFundamentalsExe;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();


        for (int i = input.length()-1; i >= 0;i--){
            char c = input.charAt(i);
            System.out.print(c);
        }
    }
}
