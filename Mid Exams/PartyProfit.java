package MidExams;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int partySize = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());

        int maxCoins = 50 * days;

        for (int i = 1; i <= days; i++) {
            if (i % 15 == 0){
                partySize += 5;
            }
            if (i % 10 == 0){
                partySize -= 2;
            }



            if(i % 3 == 0){
                maxCoins -=  3 * partySize;
            }

            if (i % 5 == 0){
                maxCoins += 20 * partySize;
                if (i % 3 ==  0){
                    maxCoins -= 2 * partySize;
                }
            }
            maxCoins -= 2 * partySize;

        }
        int each = maxCoins / partySize;
        System.out.printf("%d companions received %d coins each." ,partySize, each);

    }
}
