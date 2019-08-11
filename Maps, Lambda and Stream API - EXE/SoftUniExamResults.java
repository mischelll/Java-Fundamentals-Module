package JavaFundamentalsExe;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> users = new TreeMap<>();
        Map<String, Integer> languages = new TreeMap<>();

        String command = in.nextLine();

        while (!command.equals("exam finished")) {
            String[] data = command.split("-");
            String action = data[1];

            if (!action.equals("banned")) {
                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                users.putIfAbsent(name, points);
                if (users.get(name) < points) {
                    users.put(name, points);
                }

                languages.putIfAbsent(language, 0);
                languages.put(language, languages.get(language) + 1);


            } else {
                String name = data[0];
                users.remove(name);

            }

            command = in.nextLine();
        }

        System.out.println("Results:");
        users.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.printf("%s | %d\n", e.getKey(), e.getValue()));
        System.out.println("Submissions:");
        languages.entrySet().stream().forEach(e -> System.out.printf("%s - %d\n",e.getKey(),e.getValue()));


    }


}

