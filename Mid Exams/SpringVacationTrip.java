package MidExams;

import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = Integer.parseInt(in.nextLine());
        double budget = Double.parseDouble(in.nextLine());
        int people = Integer.parseInt(in.nextLine());
        double fuel = Double.parseDouble(in.nextLine());
        double food = Double.parseDouble(in.nextLine());
        double hotel = Double.parseDouble(in.nextLine());

        double foodExpenses = food * people * days;
        double hotelExpenses = hotel * people * days;


        if (people > 10){
            double hotelDiscount = hotelExpenses * 0.25;
            hotelExpenses -= hotelDiscount;
        }

        double expenses = foodExpenses + hotelExpenses;

        boolean broke = false;

        for (int i = 1; i <= days; i++) {
            double travelledDistance = Double.parseDouble(in.nextLine());
            expenses += travelledDistance * fuel;
            if (i % 3 == 0 || i % 5 == 0) {
                double additional  = expenses * 0.4;
                expenses += additional;
            }
            if (i % 7 == 0){
                double extraMoney = expenses / people;
                expenses -= extraMoney;
            }

            if (expenses > budget){
                broke = true;
                break;
            }
        }

        if (broke){
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.",expenses - budget);
        }else {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.",budget - expenses);
        }


    }
}
