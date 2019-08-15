package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String regex = "[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[\\d]+)[^@\\-!:>]*!(?<type>[A]|[D])![^@\\-!:>]*->(?<count>[\\d]+)[^@\\-!:>]*";

        List<String> attack = new ArrayList<>();
        List<String> destroy = new ArrayList<>();
        while (n > 0) {
            String line = in.nextLine();
            int key = findKey(line);
            String decryptedLine = decryptLine(line, key);

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedLine);

            while (matcher.find()) {
                String planet = matcher.group("planet");
                String type = matcher.group("type");

                if (type.equals("A")) {
                    attack.add(planet);
                } else if (type.equals("D")) {
                    destroy.add(planet);
                }

            }

            n--;
        }

        System.out.printf("Attacked planets: %d\n", attack.size());
        attack.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(e -> System.out.printf("-> %s\n", e));

        System.out.printf("Destroyed planets: %d\n", destroy.size());
        destroy.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(e -> System.out.printf("-> %s\n", e));


    }

    static int findKey(String line) {
        char[] star = {'s', 't', 'a', 'r'};
        int key = 0;
        char[] lineToArr = line.toLowerCase().toCharArray();

        for (int i = 0; i < star.length; i++) {
            char c = star[i];
            for (int j = 0; j < lineToArr.length; j++) {
                char m = lineToArr[j];
                if (c == m) {
                    key++;
                }
            }
        }
        return key;
    }

    static String decryptLine(String line, int key) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = (char) (line.charAt(i) - key);
            sb.append(c);

        }
        return sb.toString();
    }


}
