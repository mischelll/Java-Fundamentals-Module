package JavaFundamentalsExe;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String,Double> orders = new LinkedHashMap<>();
        Map<String,Integer> items = new LinkedHashMap<>();

        String input = in.nextLine();

        while (!input.equals("buy")){
            String[] data = input.split(" ");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!orders.containsKey(product)){
                orders.put(product,quantity * price);
                items.put(product,quantity);
            }else {
                items.put(product, items.get(product) + quantity);
                orders.put(product,items.get(product) * price);
            }


            input = in.nextLine();
        }

        orders.entrySet().stream().forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(),e.getValue()));
    }
}
