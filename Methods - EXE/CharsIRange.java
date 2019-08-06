package JavaFundamentalsExe;

import java.util.Scanner;

public class CharsIRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c1 = in.nextLine().charAt(0);
        char c2 = in.nextLine().charAt(0);
        printInRange(c1,c2);
    }

    static void printInRange(char c1, char c2){
        if (c1 < c2){
            for (int i  = c1 + 1; i <= c2 - 1;i++){
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = c2 + 1 ; i <= c1 - 1;i++){
                System.out.print((char) i + " ");
            }
        }

    }
}
