package JavaFundamentalsExe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] arr = in.nextLine().split("\\|");
        String firstPart = arr[0];
        String secondPart = arr[1];
        String[] thirdPart = arr[2].split(" ");

        String regex1 = "(?<first>\\#[A-Z]+\\#|\\$[A-Z]+\\$|\\*[A-Z]+\\*|\\&[A-Z]+\\&|\\%[A-Z]+\\%)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher = pattern1.matcher(firstPart);

        Map<Character, Integer> letterLength = new LinkedHashMap<>();
        List<Character> capitalLetters = new ArrayList<>();
        while (matcher.find()) {
            String foundSequence = matcher.group("first");
            for (int i = 0; i < foundSequence.length(); i++) {
                char c = foundSequence.charAt(i);
                if (Character.isLetter(c)) {
                    letterLength.putIfAbsent(c, 0);
                }
            }
        }

        String regex2 = "(?<secondFirstPart>[\\d]+):(?<secondSecondPart>[\\d][\\d])";
        Pattern pattern2 = Pattern.compile(regex2);

        matcher = pattern2.matcher(secondPart);

        while (matcher.find()) {
            int asciiValue = Integer.parseInt(matcher.group("secondFirstPart"));
            int length = Integer.parseInt(matcher.group("secondSecondPart"));

            for (Map.Entry<Character, Integer> entry : letterLength.entrySet()) {
                int letter = (int) entry.getKey();
                if (asciiValue == letter) {
                    letterLength.put((char) letter, length + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letterLength.entrySet()) {
            char c = entry.getKey();
            int length = entry.getValue();
            for (int i = 0; i < thirdPart.length; i++) {
                char firstLetter = thirdPart[i].charAt(0);
                int lengthOfWord = thirdPart[i].length();
                if (c == firstLetter && length == lengthOfWord) {
                    sb.append(thirdPart[i] + "\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
