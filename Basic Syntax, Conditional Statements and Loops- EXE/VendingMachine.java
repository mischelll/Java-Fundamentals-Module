package JavaFundamentalsExe;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstInput = in.nextLine();
        double sum = 0;

        while(!firstInput.equals("Start")){
            double coin = Double.parseDouble(firstInput);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                sum += coin;
            }else {
                System.out.printf("Cannot accept %.2f\n",coin);
            }
            firstInput = in.nextLine();
        }

        String secondInput ;

        while(true){
            secondInput = in.nextLine();
            double price = 0;
            if (secondInput.equals("End")){
                break;
            }
            boolean negative = false;
            boolean invalid = false;
            switch (secondInput){
                case "Nuts":
                    price = 2;
                    if(sum < price){
                        negative = true;
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if(sum < price){
                        negative = true;
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if(sum < price){
                        negative = true;
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if(sum < price){
                        negative = true;
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (sum < price){
                        negative = true;
                    }
                    break;
                default:

                    invalid = true;
                    break;
            }
            if (negative){
                System.out.println("Sorry, not enough money");
            }else {
                if(invalid){
                    System.out.println("Invalid product");
                }else {
                    System.out.printf("Purchased %s\n",secondInput);
                    sum -= price;
                }

            }
        }
        double change = sum;
        System.out.printf("Change: %.2f",change);


    }
}
