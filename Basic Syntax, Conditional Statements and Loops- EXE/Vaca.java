package JavaFundamentalsExe;

import java.util.Scanner;

public class Vaca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int peopleCount = Integer.parseInt(in.nextLine());
        String type = in.nextLine();
        String day = in.nextLine();
        double totalPrice = 0;

        switch (type){
            case "Students":
                if("Friday".equals(day)){
                    totalPrice = peopleCount * 8.45;
                }else if ("Saturday".equals(day)){
                    totalPrice = peopleCount * 9.80;
                }else if("Sunday".equals(day)){
                    totalPrice = peopleCount * 10.46;
                }

                if (peopleCount >= 30){
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Business":
                double price = 0;
                if("Friday".equals(day)){
                    price =  10.90;
                }else if ("Saturday".equals(day)){
                    price =  15.60;
                }else if("Sunday".equals(day)){
                    price =  16;
                }
                    totalPrice = peopleCount * price;

                if (peopleCount >= 100){
                   totalPrice -= (10 * price);
                }else {
                    totalPrice = peopleCount * price;
                }
                break;
            case "Regular":
                if("Friday".equals(day)){
                    totalPrice = peopleCount * 15;
                }else if ("Saturday".equals(day)){
                    totalPrice = peopleCount * 20;
                }else if("Sunday".equals(day)){
                    totalPrice = peopleCount * 22.50;
                }
                if (peopleCount >= 10 && peopleCount <= 20){
                    totalPrice *= 0.95;
                }
                break;
        }


        System.out.printf("Total price: %.2f",totalPrice);
    }
}
