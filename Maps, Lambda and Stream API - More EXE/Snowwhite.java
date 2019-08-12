package JavaFundamentalsExe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Map<String, Integer>> colorNamePhysics = new LinkedHashMap<>();

        String command = in.nextLine();
        while (!command.equals("Once upon a time")) {
            String[] data = command.split(" <:> ");
            String name = data[0];
            String color = data[1];
            int physics = Integer.parseInt(data[2]);

            colorNamePhysics.putIfAbsent(color, new LinkedHashMap<>());

            if (!colorNamePhysics.get(color).containsKey(name)) {
                colorNamePhysics.get(color).put(name, physics);
            } else {
                int currentPhy = colorNamePhysics.get(color).get(name);
                boolean isBigger = currentPhy < physics;
                if (isBigger) {
                    colorNamePhysics.get(color).put(name, physics);
                }
            }


            command = in.nextLine();
        }

        Map<String, Integer> print = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> entry : colorNamePhysics.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + entry2.getKey() + " " + entry.getValue().size(), entry2.getValue());
            }
        }

        print.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                String[] sort1 = a.getKey().split(" ");
                String[] sort2 = b.getKey().split(" ");
                sort = Integer.compare(Integer.parseInt(sort2[2]),Integer.parseInt(sort1[2]));
            }
            return sort;
        }).forEach(e ->{
            String[] printing = e.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d\n",printing[0],printing[1],e.getValue());
        });




    }
}
