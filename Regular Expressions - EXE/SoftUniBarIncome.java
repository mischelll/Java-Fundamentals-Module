package JavaFundamentalsExe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<item>[\\w]+)>[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+.*[\\d]*)[^|$%.]*\\$";

        String input = in.nextLine();
        double totalPrice = 0;

        while (!input.equals("end of shift")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                String name = matcher.group("name");
                String item = matcher.group("item");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalPrice += price* count;
                System.out.printf("%s: %s - %.2f\n",name,item,price*count);


            }

            input = in.nextLine();
        }


        System.out.printf("Total income: %.2f",totalPrice);

    }
}
