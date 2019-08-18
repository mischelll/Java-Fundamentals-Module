package MidExams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String regex = "^(?<peak>[A-Za-z\\d!@#$?]+)=(?<length>[\\d]+)<<(?<code>.+)$";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Last note")) {
            Matcher matcher = pattern.matcher(input);
            boolean found = false;
            while (matcher.find()) {
                found = true;
                String peak = matcher.group("peak");
                int length = Integer.parseInt(matcher.group("length"));
                String code = matcher.group("code");

                if (length == code.length()) {
                    String decryptPeak = decryptPeak(peak);
                    if (decryptPeak.equals("")){
                        System.out.println("Nothing found!");
                    }else {
                        System.out.printf("Coordinates found! %s -> %s\n",decryptPeak,code);
                    }
                }else {
                    System.out.println("Nothing found!");
                }
            }
            if (!found){
                System.out.println("Nothing found!");
            }

            input = in.nextLine();
        }
    }
    static String decryptPeak(String peak){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <peak.length() ; i++) {
            char c  = peak.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
