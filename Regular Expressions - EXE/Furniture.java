package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d]+(.\\d+)?)!(?<quantity>\\d+)";



        List<String> items = new ArrayList<>();
        double sum = 0;

        while (!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);


            while(matcher.find()){

            String item = matcher.group("furniture");
            double price = Double.parseDouble(matcher.group("price"));
            int quantity = Integer.parseInt(matcher.group("quantity"));

            items.add(item);
            sum+= price*quantity;
            }

            input = in.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f",sum);


    }
}
