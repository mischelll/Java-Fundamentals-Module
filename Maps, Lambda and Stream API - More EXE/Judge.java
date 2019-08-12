package JavaFundamentalsExe;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Map<String, Integer>> contestUserPoints = new LinkedHashMap<>();
        Map<String, Integer> userTotalPoints = new LinkedHashMap<>();

        String command = in.nextLine();

        while (!command.equals("no more time")) {
            String[] data = command.split(" -> ");
            String username = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            contestUserPoints.putIfAbsent(contest, new LinkedHashMap<>());

            if (!contestUserPoints.get(contest).containsKey(username)) {
                contestUserPoints.get(contest).put(username, points);
                userTotalPoints.putIfAbsent(username, 0);
                userTotalPoints.put(username, userTotalPoints.get(username) + points);


            } else {
                int currentPoints = contestUserPoints.get(contest).get(username);
                boolean biggerPoints = currentPoints < points;
                int pointsToAdd = 0;
                if (biggerPoints) {
                    contestUserPoints.get(contest).put(username, points);
                    pointsToAdd = points - currentPoints;
                    userTotalPoints.put(username, userTotalPoints.get(username) + pointsToAdd);
                }
            }

            command = in.nextLine();
        }

        AtomicInteger num = new AtomicInteger();

        contestUserPoints.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s: %d participants\n", e.getKey(), e.getValue().size());
                    num.set(1);

                    e.getValue().entrySet().stream().sorted((a, b) -> {
                        int sort = Integer.compare(b.getValue(), a.getValue());
                        if (sort == 0) {
                            sort = a.getKey().compareTo(b.getKey());
                        }
                        return sort;
                    }).forEach(p -> {
                        System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), p.getKey(), p.getValue());
                    });

                });

        System.out.println("Individual standings: ");
        num.set(1);
        userTotalPoints.entrySet().stream().sorted((a, b) -> {
            int sort = Integer.compare(b.getValue(), a.getValue());
            if (sort == 0) {
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(p -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), p.getKey(), p.getValue());
        });


    }
}
