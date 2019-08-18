package MidExams;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" \\| ");

        Map<String, List<String>> wordDef = new TreeMap<>();


        for (int i = 0; i < input.length; i++) {
            String data = input[i];
            String[] tokens = data.split(": ");
            String word = tokens[0];
            String def = tokens[1];

            wordDef.putIfAbsent(word, new ArrayList<>());
            wordDef.get(word).add(def);
        }


        String[] input2 = in.nextLine().split(" \\| ");


        for (int i = 0; i < input2.length; i++) {
            String toPrint = input2[i];
            if (wordDef.containsKey(toPrint)) {
                for (Map.Entry<String, List<String>> entry : wordDef.entrySet()) {
                    if (toPrint.equals(entry.getKey())) {

                        System.out.printf("%s\n", entry.getKey());
                        entry.getValue().stream().sorted((a, b) -> {
                            int sort = Integer.compare(b.length(), a.length());
                            return sort;
                        }).forEach(e -> System.out.printf(" -%s\n", e));
                        break;
                    }
                }
            }
        }

        String input3 = in.nextLine();
        if (input3.equals("List")){
            wordDef.entrySet().stream().forEach(e -> System.out.printf("%s ",e.getKey()));
        }else {
            return;
        }
    }
}

