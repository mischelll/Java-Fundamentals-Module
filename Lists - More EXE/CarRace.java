package JavaFundamentalsExe;

import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] times = new int[input.length];

        for (int i = 0; i < times.length; i++) {
            times[i] = Integer.parseInt(input[i]);
        }

        int finishLineIndex = times.length / 2;

        double leftRacerTime = 0;
        double rightRacerTime = 0;

        for (int i = 0; i < finishLineIndex; i++) {
            if (times[i] == 0) {
                leftRacerTime *= 0.8;
            } else {
                leftRacerTime += times[i];

            }
        }

        for (int i = times.length - 1; i > finishLineIndex;i--){
            if (times[i] == 0) {
                rightRacerTime *= 0.8;
            } else {
                rightRacerTime += times[i];

            }
        }

        int comparison = Double.compare(leftRacerTime,rightRacerTime);

        if (comparison > 0){
            System.out.printf("The winner is right with total time: %.1f",rightRacerTime);
        }else if (comparison < 0){
            System.out.printf("The winner is left with total time: %.1f",leftRacerTime);
        }


    }
}
