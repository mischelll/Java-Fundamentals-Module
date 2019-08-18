package MidExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmojiSumator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<Integer> inputEmojiCode = Arrays.stream(in.nextLine().split(":"))
                .map(Integer::new)
                .collect(Collectors.toList());


        String regex = " :(?<emoji>[a-z]{4,}):(?=[\\s,.!?])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> validEmojis = new ArrayList<>();
        List<Integer> emojiCodes = new ArrayList<>();

        while (matcher.find()) {

            String emoji = matcher.group("emoji");
            validEmojis.add(emoji);
            int value = getAscii(emoji);
            emojiCodes.add(value);

        }
        int totalPower = emojiCodes.stream().mapToInt(Integer::intValue).sum();
        String emojiToCompare = getEmoji(inputEmojiCode);

        for (String emoji : validEmojis) {
            if (emoji.equals(emojiToCompare)){
                totalPower *= 2;
            }
        }


        if (validEmojis.size() > 0) {

            printList(validEmojis);
            System.out.println();
        }
        System.out.printf("Total Emoji Power: %d", totalPower);

    }

    static int getAscii(String str) {
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            value += c;
        }
        return value;
    }

    static void printList(List<String> list) {
        List<String> toPrint = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String word = ":"+list.get(i)+":";
            toPrint.add(word);
        }
        System.out.print("Emojis found: ");
        System.out.print(String.join(", ", toPrint));
    }
    static String getEmoji(List<Integer> list){
        StringBuilder emoji = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            char c = (char) ((int)list.get(i));
            emoji.append(c);
        }

        return emoji.toString();
    }

}
