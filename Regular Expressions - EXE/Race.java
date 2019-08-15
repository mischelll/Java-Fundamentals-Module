package JavaFundamentalsExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> playerKilometers = new LinkedHashMap<>();
        String[] names = in.nextLine().split(", ");

        for (String name : names) {
            playerKilometers.putIfAbsent(name, 0);
        }

        String regex = "[A-Za-z]";
        String regex1 = "\\d";
        String line = in.nextLine();
        while (!line.equals("end of race")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(line);
            int kilometersSum = 0;
            StringBuilder name = new StringBuilder();
            while (matcher.find()) {
                name.append(matcher.group());
            }

            while (matcher1.find()) {
                kilometersSum += Integer.parseInt(matcher1.group());
            }

            if (playerKilometers.containsKey(name.toString())) {
                playerKilometers.put(name.toString(), playerKilometers.get(name.toString()) + kilometersSum);
            }

            line = in.nextLine();
        }
        AtomicInteger num = new AtomicInteger(1);
        playerKilometers.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .limit(3).forEach(e -> {
            if (num.get() == 1) {
                System.out.printf("1st place: %s\n", e.getKey());
                num.incrementAndGet();
            } else if (num.get() == 2) {
                System.out.printf("2nd place: %s\n", e.getKey());
                num.incrementAndGet();
            } else if (num.get() == 3) {
                System.out.printf("3rd place: %s\n", e.getKey());
            }
        });


    }
}
