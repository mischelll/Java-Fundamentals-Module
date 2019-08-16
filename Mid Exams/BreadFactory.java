package MidExams;

import java.util.Scanner;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] events = in.nextLine().split("\\|");
        int energy = 100;
        int coins = 100;
        boolean bankrupt = false;

        for (int i = 0; i < events.length; i++) {
            String[] currentEvent = events[i].split("-");
            String action = currentEvent[0];

            if (action.equals("order")) {
                energy -= 30;
                if (energy >= 0) {
                    System.out.printf("You earned %d coins.\n", Integer.parseInt(currentEvent[1]));
                    coins += Integer.parseInt(currentEvent[1]);
                } else {
                    energy += 80;
                    System.out.println("You had to rest!");
                }
            } else if (action.equals("rest")) {
                if (energy + Integer.parseInt(currentEvent[1]) > 100) {
                    int healthNeeded = 100 - energy;
                    energy += healthNeeded;
                    System.out.printf("You gained %d energy.\n",healthNeeded);

                } else {
                    energy += Integer.parseInt(currentEvent[1]);
                    System.out.printf("You gained %d energy.\n", Integer.parseInt(currentEvent[1]));
                }
                System.out.printf("Current energy: %d.\n", energy);
            } else {

                if (coins - Integer.parseInt(currentEvent[1]) <= 0) {
                    System.out.printf("Closed! Cannot afford %s.\n", action);
                    bankrupt = true;
                    break;

                } else {
                    coins -= Integer.parseInt(currentEvent[1]);
                    System.out.printf("You bought %s.\n",action);
                }
            }

        }
        if (!bankrupt) {
            System.out.printf("Day completed!\nCoins: %d\nEnergy: %d",coins,energy);
        }
    }
}