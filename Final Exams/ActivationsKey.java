package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationsKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split("&");
        String regex = "([A-Za-z\\d]{25})|([A-Za-z\\d]{16})";
        Pattern pattern = Pattern.compile(regex);
        List<String> validKeys = new ArrayList<>();


        for (int i = 0; i < line.length; i++) {
            String key = line[i];
            Matcher matcher = pattern.matcher(key);
            while (matcher.find()) {
                validKeys.add(matcher.group());
            }
        }

        updateList(validKeys);
        subtractNine(validKeys);

        System.out.println(String.join(", ", validKeys));


    }

    static void updateList(List<String> validKeys) {
        for (int i = 0; i < validKeys.size(); i++) {
            validKeys.set(i, validKeys.get(i).toUpperCase());
            String validKey = validKeys.get(i);
            if (validKey.length() == 16) {
                int count = 1;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < validKey.length(); j++) {
                    char c = validKey.charAt(j);
                    sb.append(c);
                    count++;
                    if (count % 5 == 0 && j != validKey.length() - 1) {
                        sb.append('-');
                        count++;
                    }
                }
                validKeys.set(i, sb.toString());
            }
            if (validKey.length() == 25) {
                int count = 1;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < validKey.length(); j++) {
                    char c = validKey.charAt(j);
                    sb.append(c);
                    count++;
                    if (count % 6 == 0 && j != validKey.length() - 1) {
                        sb.append('-');
                        count++;
                    }
                }
                validKeys.set(i, sb.toString());
            }

        }
    }

    static void subtractNine(List<String> validKeys) {
        for (int i = 0; i < validKeys.size(); i++) {
            String key = validKeys.get(i);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < key.length(); j++) {
                char c = key.charAt(j);
                if (Character.isDigit(c)) {
                    char d = (char) Math.abs((c - '0') - 9);
                    c = (char) (d + '0');
                    sb.append(c);
                } else {
                    sb.append(c);
                }
            }
            validKeys.set(i, sb.toString());
        }
    }


}
