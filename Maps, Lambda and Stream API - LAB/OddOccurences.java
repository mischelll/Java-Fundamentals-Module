package JavaFundamnetalsLab;

import java.util.*;

public class OddOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(" ");

        Map<String,Integer> oddOcurrences = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            oddOcurrences.putIfAbsent(word,0);
            oddOcurrences.put(word,oddOcurrences.get(word) + 1);
        }

        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> kvp : oddOcurrences.entrySet()) {
            if (kvp.getValue() % 2 != 0){
                odds.add(kvp.getKey());
            }
        }
        System.out.println(String.join(", ",odds));

    }
}
