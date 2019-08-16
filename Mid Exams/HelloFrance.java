package MidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String newLine = line.replaceAll("\\|","->");
        String[] itemPrices = newLine.split("->");
        double budget = Double.parseDouble(in.nextLine());
        double profit = 0;

        List<Double> newPrices = new ArrayList<>();

        for (int i = 0; i < itemPrices.length;i+= 2){
            String item = itemPrices[i];
            String price = itemPrices[i + 1];

            if (item.equals("Clothes")){
                double toDouble = Double.parseDouble(price);
                if (toDouble <= 50.00 && toDouble <= budget){

                    budget -= toDouble;
                    double increase = toDouble * 0.4;
                    profit += increase;
                    double itemToAdd = toDouble + increase;
                    newPrices.add(itemToAdd);
                }
            }else if (item.equals("Shoes")){
                double toDouble = Double.parseDouble(price);
                if (toDouble <= 35.00 && toDouble <= budget){

                    budget -= toDouble;
                    double increase = toDouble * 0.4;
                    profit += increase;
                    double itemToAdd = toDouble + increase;
                    newPrices.add(itemToAdd);
                }
            }else if (item.equals("Accessories")){
                double toDouble = Double.parseDouble(price);
                if (toDouble <= 20.50 && toDouble <= budget){

                    budget -= toDouble;
                    double increase = toDouble * 0.4;
                    profit += increase;
                    double itemToAdd = toDouble + increase;
                    newPrices.add(itemToAdd);
                }
            }
        }

        double newBudget = budget;

        for (double newPrice : newPrices) {
            System.out.printf("%.2f ",newPrice);
            newBudget += newPrice;
        }
        System.out.printf("\nProfit: %.2f\n",profit);

        if (newBudget >= 150){
            System.out.println("Hello, France!");
        }else {
            System.out.println("Time to go.");
        }



    }
}
