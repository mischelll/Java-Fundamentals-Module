package JavaFundamentalsExe;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] chars = in.nextLine().split(" ");

        Map<Character,Integer> charsCount = new LinkedHashMap<>();

        for (int i = 0; i <chars.length ; i++) {
            char[] toArr = chars[i].toCharArray();
            for (int k = 0; k < toArr.length;k++){
                charsCount.putIfAbsent(toArr[k],0);
                charsCount.put(toArr[k], charsCount.get(toArr[k]) + 1);

            }

        }

        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}
