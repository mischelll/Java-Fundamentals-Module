package MidExams;

import java.util.*;

public class PractiseSessions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Map<String,List<String>> roadRacers = new LinkedHashMap<>();

        while (!input.equals("END")){
            String[] data = input.split("->");
            String action = data[0];

            if (action.equals("Add")){
                String road = data[1];
                String racer = data[2];
                roadRacers.putIfAbsent(road,new ArrayList<>());
                roadRacers.get(road).add(racer);
            }else if (action.equals("Move")){
                String currRoad = data[1];
                String racer = data[2];
                String nextRoad = data[3];
                if (roadRacers.get(currRoad).contains(racer)){
                    roadRacers.get(currRoad).remove(racer);
                    roadRacers.get(nextRoad).add(racer);
                }
            }else if (action.equals("Close")){
                String road = data[1];
                if (roadRacers.containsKey(road)){
                    roadRacers.remove(road);
                }
            }

            input = in.nextLine();
        }

        System.out.println("Practice sessions:");
        roadRacers.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue().size(),a.getValue().size());
            if (sort == 0){
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%s\n",e.getKey());
            e.getValue().forEach(p -> System.out.printf("++%s\n",p));
        });
    }
}
