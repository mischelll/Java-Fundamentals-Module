package JavaFundamentalsExe;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());



        for (int i = 0 ; i < n;i++){
            for (int j = 0; j < n;j++){
                for (int k = 0; k< n; k++){
                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j);
                    char third = (char) ('a' + k);
                    System.out.printf("%c%c%c\n",first,second,third);
                }
            }

        }
    }
}
