package JavaFundamentalsExe;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int litersTotal = 255;
        int inputLiters = 0;

        while(n > 0){
            int liters = Integer.parseInt(in.nextLine());

            if(liters > litersTotal){
                System.out.println("Insufficient capacity!");
            }else {
                litersTotal -= liters;
                inputLiters  += liters;
            }
            n--;

        }
        System.out.println(inputLiters);
    }
}
