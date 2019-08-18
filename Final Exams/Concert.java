package MidExams;

import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, List<String>> band = new LinkedHashMap<>();
        Map<String, Integer> bandTime = new LinkedHashMap<>();

        String command = in.nextLine();
        while (!command.equals("start of concert")) {
            String[] data = command.split("; ");
            String action = data[0];

            if (action.equals("Add")) {
                String bandName = data[1];
                band.putIfAbsent(bandName, new ArrayList<>());

                String[] artistNames = data[2].split(", ");
                for (int i = 0; i < artistNames.length; i++) {
                    String artist = artistNames[i];
                    if (!band.get(bandName).contains(artist)) {
                        band.get(bandName).add(artist);
                    }
                }
            }else if (action.equals("Play")){
                String bandName = data[1];
                int time = Integer.parseInt(data[2]);
                bandTime.putIfAbsent(bandName,0);
                band.putIfAbsent(bandName, new ArrayList<>());
                bandTime.put(bandName,bandTime.get(bandName) + time);

            }

            command = in.nextLine();
        }
        int totalTime = bandTime.values().stream().mapToInt(Integer::intValue).sum();
        System.out.printf("Total time: %d\n",totalTime);

        bandTime.entrySet().stream().sorted((a,b) -> {
            int sort = Integer.compare(b.getValue(),a.getValue());
            if (sort == 0){
                sort = a.getKey().compareTo(b.getKey());
            }
            return sort;
        }).forEach(e -> System.out.printf("%s -> %d\n",e.getKey(),e.getValue()));

        String bandToPrint = in.nextLine();
        band.entrySet().stream().forEach(e -> {
            if (e.getKey().equals(bandToPrint)){
                System.out.printf("%s\n",e.getKey());
                for (String s : e.getValue()) {
                    System.out.printf("=> %s\n",s);
                }
            }
        });




    }
}
