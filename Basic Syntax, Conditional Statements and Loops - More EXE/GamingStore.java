package JavaFundamentalsExe;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance = Double.parseDouble(in.nextLine());
        String game = in.nextLine();
        boolean noMoney = false;
        double spent = 0;
        double remaining = 0;


        while(!game.equals("Game Time")){
            double price = 0;
            String name = "";

            if(game.equals("OutFall 4")){
                name = "OutFall 4";
                price = 39.99;
            }else if(game.equals("CS: OG")){
                name = "CS: OG";
                price = 15.99;
            }else if (game.equals("Zplinter Zell")){
                name = "Zplinter Zell";
                price = 19.99;
            }else if (game.equals("Honored 2")){
                name = "Honored 2";
                price = 59.99;
            }else if(game.equals("RoverWatch")){
                name = "RoverWatch";
                price = 29.99;
            }else if (game.equals("RoverWatch Origins Edition")){
                name = "RoverWatch Origins Edition";
                price = 39.99;
            }else {
                System.out.println("Not Found");

            }

            if (price > balance){
                System.out.println("Too Expensive");

            }else {
                System.out.printf("Bought %s\n",name);
                balance -= price;
                spent += price;
            }

            if (balance == 0){
                noMoney = true;
                break;
            }
            game = in.nextLine();
        }
        if (noMoney){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent,balance);
        }


    }
}
