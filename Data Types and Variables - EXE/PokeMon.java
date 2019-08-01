package JavaFundamentalsExe;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pokePower = Integer.parseInt(in.nextLine()); //N
        int distance = Integer.parseInt(in.nextLine());    //M
        int exhaustionFactor = Integer.parseInt(in.nextLine()); //Y
        int targets = 0;
        int originalPower = pokePower;


        while(pokePower >= distance){
            if(pokePower == (double) (originalPower / 2)){
                if(exhaustionFactor != 0){
                    pokePower /= exhaustionFactor;
                }
                if(pokePower >= distance){
                    pokePower -= distance;
                    targets++;
                }


            }else {
                pokePower -= distance;
                targets++;
            }
        }
        System.out.println(pokePower);
        System.out.println(targets);

    }
}
