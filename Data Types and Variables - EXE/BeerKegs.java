package JavaFundamentalsExe;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String biggest = "";
        double volume = 0;

        for (int i = 0;i< n ;i++){
            String model = in.nextLine();
            double radius = Double.parseDouble(in.nextLine());
            int height = Integer.parseInt(in.nextLine());
            double volumeCurrent = Math.PI * Math.pow(radius,2) * height;

            if (volumeCurrent > volume){
                volume = volumeCurrent;
                biggest = model;
            }

        }

        System.out.println(biggest);
    }
}
