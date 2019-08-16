package MidExams;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double flourPrice = Double.parseDouble(in.nextLine());
        double eggPrice = Double.parseDouble(in.nextLine());
        double apronPrice = Double.parseDouble(in.nextLine());

        double calculatedMoney = 0;

        double moreAprons = Math.ceil((students*1.0*20) / 100) ;
        double freePackages = Math.floor(students / 5);

        calculatedMoney += flourPrice * (students - freePackages);
        calculatedMoney += students * eggPrice * 10;
        calculatedMoney += apronPrice * (students + moreAprons);

        if (calculatedMoney <= budget){
            System.out.printf("Items purchased for %.2f$.",calculatedMoney);
        }else {
            System.out.printf("%.2f$ more needed.",calculatedMoney - budget);
        }

    }
}
