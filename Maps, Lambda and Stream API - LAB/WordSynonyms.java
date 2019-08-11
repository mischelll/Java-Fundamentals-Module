package JavaFundamnetalsLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String key = in.nextLine();
            String value = in.nextLine();

            wordSynonyms.putIfAbsent(key,new ArrayList<>());
            wordSynonyms.get(key).add(value);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> kvp : wordSynonyms.entrySet()) {
            String key = kvp.getKey();

            String value = String.join(", ",kvp.getValue());

            System.out.println(String.format(pattern,key,value));
        }
    }
}
