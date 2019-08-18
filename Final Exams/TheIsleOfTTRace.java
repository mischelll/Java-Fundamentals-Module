package MidExams;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleOfTTRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String geohash = in.nextLine();
        boolean notFoundCoordinates = true;

        String regex = "(?<name>%[A-Za-z]+%|#[A-Za-z]+#|\\*[A-Za-z]+\\*|\\$[A-Za-z]+\\$|&[A-Za-z]+&)=(?<length>[\\d]+)!!(?<code>.+)";
        Pattern pattern = Pattern.compile(regex);


        Map<String, String> racerCode = new LinkedHashMap<>();

        while (notFoundCoordinates) {
            boolean found = false;
            Matcher matcher = pattern.matcher(geohash);
            while (matcher.find()) {
                found = true;
                String racer = matcher.group("name");
                int length = Integer.parseInt(matcher.group("length"));
                String code = matcher.group("code");

                if (length == code.length()) {
                    String encrypted = encryptedCode(code);
                    String racerUpdated = racerUpdated(racer);
                    racerCode.put(racerUpdated, encrypted);

                    racerCode
                            .entrySet()
                            .forEach(e -> System.out.printf("Coordinates found! %s -> %s", e.getKey(), e.getValue()));
                    notFoundCoordinates = false;


                } else {
                    System.out.println("Nothing found!");
                }
            }
            if (!found) {
                System.out.println("Nothing found!");
            }
            if (!notFoundCoordinates){
                break;
            }
            geohash = in.nextLine();

        }
    }

    static String encryptedCode(String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char c = (char) (code.charAt(i) + code.length());
            sb.append(c);
        }


        return sb.toString();
    }

    static String racerUpdated(String racer) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < racer.length(); i++) {
            char c = racer.charAt(i);
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
