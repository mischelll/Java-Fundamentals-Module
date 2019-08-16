package MidExams;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int days = Integer.parseInt(in.nextLine());
        int players = Integer.parseInt(in.nextLine());
        double energy = Double.parseDouble(in.nextLine());
        double waterPerPerson = Double.parseDouble(in.nextLine());
        double foodPerPerson = Double.parseDouble(in.nextLine());

        double water = waterPerPerson * players * days;
        double food = foodPerPerson * players * days;

        boolean noEnergy = false;

        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(in.nextLine());
            energy -= energyLoss;
            if (energy <= 0) {
                noEnergy = true;
                break;
            }

            if (i % 2 == 0) {
                energy += energy * 0.05;
                water -= water * 0.3;
            }
            if (i % 3 == 0) {
                food -= food / players;
                energy += energy * 0.1;

            }
        }

        if (noEnergy) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", food, water);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}
