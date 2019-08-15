package JavaFundamentalsExe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> names = Arrays.stream(in.nextLine()
                .split("[, ]+"))
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        String regexHealth = "[^\\d\\.\\+\\-\\*\\/\\s\\,]";
        String regex = "(?<damage>\\-?\\d+\\.?\\d*)";
        String opeartions = "(\\*|\\/)";

        Pattern pattern = Pattern.compile(regexHealth);
        Pattern pattern1 = Pattern.compile(regex);
        Pattern opeartion = Pattern.compile(opeartions);


        for (String name : names) {
            Matcher matcher = pattern.matcher(name);

            int health = 0;

            while (matcher.find()) {
                health += matcher.group().charAt(0);
            }
            matcher = pattern1.matcher(name);

            double damage = 0;

            while (matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }

            matcher = opeartion.matcher(name);
            while (matcher.find()) {
                if (matcher.group().equals("*")) {
                    damage *= 2;
                }else if (matcher.group().equals("/")){
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage\n", name, health, damage);


        }


    }

  /*  static int calculateHealth(List<String> names, String name) {
        String demon = name;
        int health = 0;
        String regex = "[^\\d\\.\\+\\-\\*\\/\\s\\,]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        while (matcher.find()) {
            String matched = matcher.group();
            for (int j = 0; j < matched.length(); j++) {
                char c = matched.charAt(j);
                if (Character.isAlphabetic(c)) {
                    health += c;
                }
            }
        }
        return health;

    } */

  /*  static double calculateDamage(List<String> names, String name) {
        double damage = 0;
        int divide = 0;
        int multiply = 0;
        String regex = "(?<damage>\\-?\\d+\\.?\\d*)";

        String demon = name;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);

        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group("damage"));
        }

        for (int j = 0; j < demon.length(); j++) {
            char c = demon.charAt(j);
            if (c == '*') {
                damage *= 2;
            } else if (c == '/') {
                damage /= 2;
            }
        }

        return damage;
    } */
}
