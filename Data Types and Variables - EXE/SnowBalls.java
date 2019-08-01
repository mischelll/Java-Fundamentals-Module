package JavaFundamentalsExe;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N  = Integer.parseInt(in.nextLine());
        double highest = 0;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 1; i <= N;i++){
            int snowballSnow = Integer.parseInt(in.nextLine());
            int snowballTime = Integer.parseInt(in.nextLine());
            int snowballQuality = Integer.parseInt(in.nextLine());

            double value = Math.pow((snowballSnow / snowballTime),snowballQuality);

            if (value > highest){
                highest = value;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snow,time,highest,quality);
    }
}
