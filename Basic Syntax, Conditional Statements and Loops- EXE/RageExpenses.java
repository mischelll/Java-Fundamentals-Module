package JavaFundamentalsExe;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lost = Integer.parseInt(in.nextLine());
        double headset = Double.parseDouble(in.nextLine());
        double mouse = Double.parseDouble(in.nextLine());
        double keyboard = Double.parseDouble(in.nextLine());
        double display = Double.parseDouble(in.nextLine());

        double headsetPrice = Math.floor(lost / 2) * headset;
        double mousePrice = Math.floor(lost/3) * mouse;
        double keyboardPrice = Math.floor(lost / 6) * keyboard;
        double displayPrice = Math.floor((lost/6)/ 2) * display;

        double totalPrice = headsetPrice + mousePrice + keyboardPrice + displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);

    }
}
