package JavaFundamnetalsLab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String town = in.nextLine();
        int population = Integer.parseInt(in.nextLine());
        double area = Double.parseDouble(in.nextLine());
        System.out.printf("Town %s has population of %d and area %.0f square km.",town,population,area);

    }
}
