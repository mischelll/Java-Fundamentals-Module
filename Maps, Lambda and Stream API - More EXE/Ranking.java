package JavaFundamentalsExe;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> contestPasswords = new LinkedHashMap<>();
        Map<String, Integer> bestUserPoints = new TreeMap<>();
        Map<String, Map<String, Integer>> userContestsPoints = new TreeMap<>();

        String command1 = in.nextLine();
        while (!command1.equals("end of contests")) {
            String[] data = command1.split(":");
            String contest = data[0];
            String pass = data[1];

            contestPasswords.putIfAbsent(contest, pass);

            command1 = in.nextLine();
        }

        String command2 = in.nextLine();
        while (!command2.equals("end of submissions")) {
            String[] data = command2.split("=>");
            String contest = data[0];
            String conPass = data[1];
            String userName = data[2];
            int points = Integer.parseInt(data[3]);

            if (contestPasswords.containsKey(contest) && contestPasswords.get(contest).equals(conPass)) {
                userContestsPoints.putIfAbsent(userName, new TreeMap<>());

                bestUserPoints.putIfAbsent(userName,0);


                if (userContestsPoints.get(userName).containsKey(contest)) {
                    int pointsToAdd = 0;
                    int current = userContestsPoints.get(userName).get(contest);
                    boolean biggerPoints = current < points;
                    if (userContestsPoints.containsKey(userName) && biggerPoints) {
                        userContestsPoints.get(userName).put(contest, points);
                        pointsToAdd += points - current;
                        bestUserPoints.put(userName,bestUserPoints.get(userName) + pointsToAdd);
                    }
                } else {
                    userContestsPoints.get(userName).put(contest, points);
                    bestUserPoints.put(userName,bestUserPoints.get(userName) + points);

                }


            }


            command2 = in.nextLine();
        }

        int biggestPoints = Collections.max(bestUserPoints.values());
        for (Map.Entry<String, Integer> entry : bestUserPoints.entrySet()) {
            if (entry.getValue() == biggestPoints){
                System.out.printf("Best candidate is %s with total %d points.\n",entry.getKey(),entry.getValue());
            }
        }



        System.out.println("Ranking: ");
        userContestsPoints.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s\n", e.getKey());

                    e.getValue().entrySet().stream()
                            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(p -> System.out.printf("#  %s -> %d\n", p.getKey(), p.getValue()));
                });

    }
}