package JavaFundamnetalsLab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] numbers = Arrays.stream(in.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> countReals = new TreeMap<>();

        for (double number : numbers) {
            countReals.putIfAbsent(number,0);
            countReals.put(number,countReals.get(number) + 1);
        }

        String pattern = "%.0f -> %d";
        for (Map.Entry<Double, Integer> kvp : countReals.entrySet()) {
            System.out.println(String.format(pattern,kvp.getKey(),kvp.getValue()));
        }

    }
}
