package MidExams;

import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double budget = Double.parseDouble(in.nextLine());
        double flourPrice = Double.parseDouble(in.nextLine());

        double milk = (flourPrice + (flourPrice * 0.25)) / 4;
        double cozonac = flourPrice + (flourPrice * 0.75) + milk;

        int cozonacsCount = 0;
        int times = 1;
        int eggsReceived = 0;

        while (budget > 0) {
            if (budget - cozonac < 0){
                break;
            }else {
                budget -= cozonac;
                cozonacsCount++;
                eggsReceived += 3;

                if (times % 3 == 0) {
                    eggsReceived -= (cozonacsCount - 2);
                }
            }

            times++;
        }

        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",cozonacsCount,eggsReceived,budget);

    }
}
