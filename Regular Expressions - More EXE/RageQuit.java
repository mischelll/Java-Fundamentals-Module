package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RageQuit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String charsRegex = "[\\D]+";
        String digitsRegex = "[\\d]+";

        Pattern pattern = Pattern.compile(charsRegex);
        Pattern pattern1 = Pattern.compile(digitsRegex);

        Matcher matcher = pattern.matcher(input);

        List<String> words = new ArrayList<>();
        List<Integer> digits = new ArrayList<>();

        while (matcher.find()){
            words.add(matcher.group());
        }

        matcher = pattern1.matcher(input);
        while (matcher.find()){
            digits.add(Integer.parseInt(matcher.group()));
        }

        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < words.size(); i++) {
            String toRepeat = words.get(i).toUpperCase();
            int timesToRepeat = digits.get(i);
            for (int j = 0; j < timesToRepeat; j++) {
                sb.append(toRepeat);
            }
        }

        String unique = sb.toString();
        int count = unique.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining()).length();

        //long count2 = unique.chars().distinct().count();

        System.out.printf("Unique symbols used: %d\n%s",count,unique);

    }
}
