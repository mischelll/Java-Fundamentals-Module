package JavaFundamentalsExe;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
        int rows = Integer.parseInt(in.nextLine());

        for (int i = 0; i < rows; i++) {
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();

        }

    }
}

