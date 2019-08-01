package JavaFundamentalsExe;

import java.util.Scanner;

public class PrintPartOfASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int from = Integer.parseInt(in.nextLine());
        int to = Integer.parseInt(in.nextLine());

        for (int i = from ; i <= to;i++){
            System.out.print((char) i + " ");
        }
    }
}
