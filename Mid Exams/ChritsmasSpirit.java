package MidExams;

import java.util.Scanner;

public class ChritsmasSpirit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantity = Integer.parseInt(in.nextLine());
        int days = Integer.parseInt(in.nextLine());
        int cost = 0;
        int spirit = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 11 == 0){
                quantity += 2;
            }

            if (i % 10 == 0){
                spirit -= 20;
                cost += 23;
                if (i == days && days % 10== 0){
                    spirit -= 30;
                }
            }

            if (i % 5 == 0){
                cost += 15 * quantity;
                spirit += 17;
                if (i % 3 == 0){
                    spirit += 30;
                }
            }

            if (i % 3 == 0) {
                cost += 5 * quantity + 3 * quantity;
                spirit += 13;
            }

            if (i % 2 == 0) {
                cost += 2 * quantity;
                spirit += 5;
            }
        }

        System.out.printf("Total cost: %d\nTotal spirit: %d",cost,spirit);
    }
}
