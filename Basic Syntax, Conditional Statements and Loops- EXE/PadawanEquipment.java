package JavaFundamentalsExe;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money = Double.parseDouble(in.nextLine());
        int students = Integer.parseInt(in.nextLine());
        double priceLightsabers = Double.parseDouble(in.nextLine());
        double priceRobes = Double.parseDouble(in.nextLine());
        double priceBelts = Double.parseDouble(in.nextLine());

        double lightsabers = Math.ceil(students * 0.1);
        double totalLightsabers = (students + lightsabers) * priceLightsabers;
        double totalRobes = students * priceRobes;
        double belts =Math.ceil(students /6);
        double totalBelts = (students - belts) * priceBelts ;

        double price = totalBelts + totalLightsabers + totalRobes;

        if (money >= price){
            System.out.printf("The money is enough - it would cost %.2flv.",price);
        }else {
            double needed = Math.abs(money - price);
            System.out.printf("Ivan Cho will need %.2flv more.",needed);
        }
    }
}
