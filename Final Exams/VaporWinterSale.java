package MidExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] command = in.nextLine().split(", ");

        String regex = "(?<game>[A-Za-z\\d ]+)-(?<price>[\\d]+(\\.[\\d]+)*)";
        String regexDLC = "(?<game>[A-Za-z\\d ]+):(?<dlc>[A-Za-z\\d ]+)";
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regexDLC);

        Map<String, Double> gamePrice = new LinkedHashMap<>();
        Map<String, String> gameDLC = new LinkedHashMap<>();


        for (int i = 0; i < command.length; i++) {
            String data = command[i];
            Matcher matcher = pattern.matcher(data);
            Matcher matcher1 = pattern1.matcher(data);
            while (matcher.find()) {
                String game = matcher.group("game");
                double price = Double.parseDouble(matcher.group("price"));
                gamePrice.putIfAbsent(game, price);
            }

            while (matcher1.find()) {
                String game = matcher1.group("game");
                String dlc = matcher1.group("dlc");

                if (gamePrice.containsKey(game)) {
                    gameDLC.put(game, dlc);
                }
            }
        }
        Map<String, Map<String, Double>> gameDlcPrice = new LinkedHashMap<>();
        Map<String, Double> gameNoDlcPrice = new LinkedHashMap<>();

        gamePrice.entrySet().stream().sorted((a,b) -> Double.compare(a.getValue(),b.getValue())).forEach(e ->{
            String key = e.getKey();
            if (gameDLC.containsKey(key)) {
                double newPrice1 = (e.getValue()) + (e.getValue() * 0.2);
                e.setValue(newPrice1);

                double newPrice2 = (e.getValue()) - (e.getValue() * 0.5);
                e.setValue(newPrice2);
                gameDlcPrice.put(key, new LinkedHashMap<>());
                gameDlcPrice.get(key).put(gameDLC.get(key), newPrice2);
            } else {
                double newPrice = (e.getValue()) - (e.getValue() * 0.2);
                e.setValue(newPrice);
                gameNoDlcPrice.put(key, newPrice);
            }
        });

        gameDlcPrice.entrySet().stream().forEach(e -> {
            e.getValue().entrySet().stream().forEach(p -> System.out.printf("%s - %s - %.2f\n",e.getKey(),p.getKey(),p.getValue()));
        });

        gameNoDlcPrice.entrySet().stream().sorted((a,b) -> Double.compare(b.getValue(),a.getValue()))
                .forEach(e -> System.out.printf("%s - %.2f\n",e.getKey(),e.getValue()));

    }
}

