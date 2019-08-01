package JavaFundamentalsExe;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = Integer.parseInt(in.nextLine());
        int sum = 0;

        while(lines > 0){
            char c = in.nextLine().charAt(0);
            int values = (int) c;
            sum += values;
            lines--;
        }

        System.out.printf("The sum equals: %d",sum);
    }
}
